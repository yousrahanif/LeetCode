# Write your MySQL query statement below
SELECT unique_id, name
FROM Employees
left JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id;