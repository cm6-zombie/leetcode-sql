# Write your MySQL query statement below

select e.name, b.Bonus from Employee E
left join Bonus b
ON e.empID = b.empID where b.Bonus <1000
OR b.Bonus IS NULL
