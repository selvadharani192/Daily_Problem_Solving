# Write your MySQL query statement below

SELECT EMP.name as Employee from Employee as EMP join Employee as Managers on EMP.managerId=Managers.id where EMP.salary>Managers.salary;