--Activity-8
--SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
select customer_id,max(purchase_amount) as max_purchase from Orders group by customer_id order by customer_id;

--Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
select salesman_id,order_date ,max(purchase_amount) as max_purchase from Orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

--Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000].
select customer_id,max(purchase_amount)as max_purchase,order_date from orders having max(purchase_amount) in(2030, 3450, 5760, 6000) group by customer_id,order_date;