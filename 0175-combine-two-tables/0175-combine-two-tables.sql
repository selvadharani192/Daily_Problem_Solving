# Write your MySQL query statement below
Select Person.firstName,Person.lastName,Address.city,Address.state from Person As Person left join Address as Address ON Person.personId=Address.personId;