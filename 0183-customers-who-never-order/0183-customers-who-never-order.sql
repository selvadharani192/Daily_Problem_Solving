# Write your MySQL query statement below

select CUST.name AS Customers from Customers AS CUST left join Orders as Orders on CUST.id=Orders.customerId where Orders.id is null;