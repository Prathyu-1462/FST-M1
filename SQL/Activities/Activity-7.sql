--Activity-7
--Write an SQL statement to find the total purchase amount of all orders.
select sum(purchase_amount) as Total_purchase_Amount from Orders;

--Write an SQL statement to find the average purchase amount of all orders.
select avg(purchase_amount) as average_purchse_amount from orders;

--Write an SQL statement to get the maximum purchase amount of all the orders.
select max(purchase_amount) as max_purchse_amount from orders;

--Write an SQL statement to get the minimum purchase amount of all the orders.
select min(purchase_amount) as min_purchse_amount from orders;

--Write an SQL statement to find the number of salesmen listed in the table.
select count(distinct salesman_id) as Total_count from orders;