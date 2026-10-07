# Write your MySQL query statement belowSELECT MAX(salary) AS SecondHighestS
SELECT MAX(salary) AS SecondHighestSalary
FROM Employee
WHERE salary < (SELECT MAX(salary) FROM Employee);