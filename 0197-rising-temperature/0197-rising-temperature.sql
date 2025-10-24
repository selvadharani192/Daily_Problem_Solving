# Write your MySQL query statement below

SELECT w1.id from Weather as w1 join Weather as w2 ON w1.temperature>w2.temperature where datediff(w1.recordDate,w2.recordDate)=1;