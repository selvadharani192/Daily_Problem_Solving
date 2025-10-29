# Write your MySQL query statement below


SELECT c.name from Customer as c left join Customer as r on c.referee_id=r.id where c.referee_id is null or c.referee_id!=2;