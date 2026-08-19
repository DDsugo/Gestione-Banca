# Command-Line Banking System in Java

A simple, robust, interactive command-line Java application designed to manage basic banking operations. This project demonstrates core Java OOP concepts, input validation, structured error handling, and standard I/O processing without external dependencies.

---

## 📌 Project Overview

The **Command-Line Banking System** simulates essential banking operations through an intuitive terminal interface. Users can create accounts, perform secure deposits and withdrawals, and inspect real-time account balances.

### Key Features
- **Account Management:** Create and maintain multiple bank accounts with auto-generated or custom account IDs.
- **Financial Transactions:**
  - **Deposits:** Add funds safely with positive-amount checks.
  - **Withdrawals:** Withdraw funds with built-in overdraft/insufficient balance protections.
  - **Balance Checks:** Instantly view current balances and account details.
- **Robust Error Handling:** Graciously handles invalid user inputs (e.g., non-numeric data, negative amounts, non-existent account IDs) without crashing the application.
- **Zero External Dependencies:** Built entirely using standard Java libraries (`java.util`, `java.io`).

---

## 🛠️ Requirements & Technical Prerequisites

- **Java Development Kit (JDK):** Version 8 or higher (JDK 11+ recommended).
- **Terminal / Command Prompt / PowerShell**

---

## 🚀 How to run the Project

- **Compile the Java Source Code:** `javac src/*.java`
- **Run the Application:** `java src.Main`

---

## 💡 Example workflow

- **Create an Account:** Select option `1`, enter the Owner Name.
- **Deposit Money:** Select option `2`, enter your Account ID and the deposit amount.
- **Withdraw Money:** Select option `3`, enter your Account ID and the withdrawal amount (validated against your current balance).
- **Check Balance:** Select option `4` to view the updated account balance.
- **Exit:** Select option `5` to exit the application.
