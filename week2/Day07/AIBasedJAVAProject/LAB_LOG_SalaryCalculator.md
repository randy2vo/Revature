# Lab Log - SalaryCalculator

## Prompt Used
"Split the calculations into simple methods, such as `calculateHRA`, `calculateDA`, `calculateGrossSalary`, and `calculateTax`. Keep the same business rules and output. Review the code for errors or weaknesses and verify suggestions. Include five test results with pass/fail and at least one weakness found."

## Code Update Summary
- Refactored salary math into simple methods:
  - `calculateHRA(double basicSalary)`
  - `calculateDA(double basicSalary)`
  - `calculateGrossSalary(double basicSalary, double hra, double da)`
  - `calculateTax(double grossSalary)`
  - `calculateNetSalary(double grossSalary, double professionalTax)`
- Kept business rules unchanged:
  - HRA = 20% of basic salary
  - DA = 10% of basic salary
  - Tax = Rs. 200 only when `grossSalary > 20000`
- Improved input safety by validating employee ID and basic salary.

## Test Results (Verified)

| Test # | Input (ID, Name, Basic Salary) | Expected Result | Actual Result | Pass/Fail |
|---|---|---|---|---|
| 1 | `101, Asha Sharma, 18000` | Gross = 23400, Tax = 200, Net = 23200 | Gross 23400.00, Tax 200.00, Net 23200.00 | Pass |
| 2 | `102, Ravi Kumar, 15000` | Gross = 19500, Tax = 0, Net = 19500 | Gross 19500.00, Tax 0.00, Net 19500.00 | Pass |
| 3 | `103, Meera Das, 20000` | Gross = 26000, Tax = 200, Net = 25800 | Gross 26000.00, Tax 200.00, Net 25800.00 | Pass |
| 4 | `104, Nina Roy, abc then 9000` | Reject text salary, then continue with 9000 | Program showed validation message, then calculated Gross 11700.00, Tax 0.00 | Pass |
| 5 | `abc then 105, Karan Singh, -5000 then 12000` | Reject invalid ID and negative salary, then continue | Program re-prompted both fields, then calculated Gross 15600.00, Tax 0.00 | Pass |

## Weaknesses Found
1. Employee name is not validated. The program accepts blank names (for example, if user presses Enter), which may produce incomplete records.
2. There is no upper-bound validation for salary or ID, so unrealistic values can still be accepted.

## Suggested Next Improvement
- Add a `readNonEmptyName` method to ensure the employee name is not blank.
