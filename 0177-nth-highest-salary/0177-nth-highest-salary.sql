CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    DECLARE M INT;
    SET M=N-1;
    RETURN (
        # Write your MySQL query statement below.
            SELECT Distinct Salary from employee
            order by salary desc
            LIMIT 1 offset M
    );
END