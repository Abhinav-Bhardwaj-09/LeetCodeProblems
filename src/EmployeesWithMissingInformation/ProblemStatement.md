# Table
    Employees:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | employee_id | int     |
                | name        | varchar |
                +-------------+---------+

    employee_id is the primary key for this table.
    Each row of this table indicates the name of the employee whose ID is employee_id.

    Salaries:
                +-------------+---------+
                | Column Name | Type    |
                +-------------+---------+
                | employee_id | int     |
                | salary      | int     |
                +-------------+---------+

    employee_id is the primary key for this table.
    Each row of this table indicates the salary of the employee whose ID is employee_id.
<br/>

    Write an SQL query to report the IDs of all the employees with missing information. The information of an employee is missing if:
-   The employee's name is missing, or
-   The employee's salary is missing.

Return the result table ordered by employee_id in ascending order.

    

## Example 1:

    Input: 

        Employees:
                +-------------+----------+
                | employee_id | name     |
                +-------------+----------+
                | 2           | Crew     |
                | 4           | Haven    |
                | 5           | Kristian |
                +-------------+----------+

        Salaries:
                +-------------+--------+
                | employee_id | salary |
                +-------------+--------+
                | 5           | 76071  |
                | 1           | 22517  |
                | 4           | 63539  |
                +-------------+--------+

    Output:
                +-------------+
                | employee_id |
                +-------------+
                | 1           |
                | 2           |
                +-------------+

    Explanation: Employees 1, 2, 4, and 5 are working at this company.
                 The name of employee 1 is missing.
                 The salary of employee 2 is missing.