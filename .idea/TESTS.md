# Manual Tests — Library Management System

## Test 1 — Book not found
- Action: Create loan with Book ID 999 (non-existent)
- Expected: "Book not found!"
- Result: SUCCESSFULLY

## Test 2 — Book unavailable
- Action: Register book → Register user → Create loan → Try to loan same book again
- Expected: "Book is not available!"
- Result: SUCCESSFULLY

## Test 3 — Loan not found
- Action: Return book with Loan ID 999 (non-existent)
- Expected: "Loan not found!"
- Result: SUCCESSFULLY

## Test 4 — Invalid menu option
- Action: Type option 9 in the menu
- Expected: "Invalid option! Try again."
- Result: SUCCESSFULLY

## Test 5 — Full flow
- Action: Register book → Register user → Create loan → List books (available=false) → Return book → List books (available=true)
- Result: SUCCESSFULLY