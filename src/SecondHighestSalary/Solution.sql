SELECT (SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC limit 1 offset 1) AS SecondHighestSalary;