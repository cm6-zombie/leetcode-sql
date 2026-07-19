# Write your MySQL query statement below
DELETE P1 from Person as P1, Person as P2
where P1.email = P2.email AND P1.ID > P2.ID