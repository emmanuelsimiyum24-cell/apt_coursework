import re
accounts = {
    "A": 7000,
    "B": 2000,
    "C": 500
}
# Parser
def parse_command(command):
    """
    Example DSL:
    TRANSFER 5000 FROM A TO B IF BALANCE > 1000
    """

    pattern = r"TRANSFER (\d+) FROM (\w+) TO (\w+) IF BALANCE > (\d+)"
    match = re.match(pattern, command)

    if not match:
        raise ValueError("Invalid command syntax")

    amount = int(match.group(1))
    sender = match.group(2)
    receiver = match.group(3)
    condition_balance = int(match.group(4))

    return {
        "amount": amount,
        "sender": sender,
        "receiver": receiver,
        "condition": condition_balance
    }

# Interpreter
def execute_transaction(parsed_data):
    amount = parsed_data["amount"]
    sender = parsed_data["sender"]
    receiver = parsed_data["receiver"]
    condition = parsed_data["condition"]

    # Check if accounts exist
    if sender not in accounts or receiver not in accounts:
        print("Transaction failed: Invalid account.")
        return

    # Validate balance condition
    if accounts[sender] <= condition:
        print("Transaction failed: Balance condition not met.")
        return

    # Check sufficient funds
    if accounts[sender] < amount:
        print("Transaction failed: Insufficient funds.")
        return

    # Execute transfer
    accounts[sender] -= amount
    accounts[receiver] += amount

    print("Transaction successful!")
    print(f"{sender} new balance: {accounts[sender]}")
    print(f"{receiver} new balance: {accounts[receiver]}")

# Main Execution
def main():
    print("Mini DSL for Mobile Money Rules")
    print("Example: TRANSFER 5000 FROM A TO B IF BALANCE > 1000")

    command = input("\nEnter DSL command:\n")

    try:
        parsed = parse_command(command)
        execute_transaction(parsed)
    except Exception as e:
        print("Error:", e)


if __name__ == "__main__":
    main()
