REM   Script: Activity 6 and 8
REM   activity 6 and 8

-- Activity 6
-- Create a table named orders

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Select * from orders;

-- Get all salesman ids without any repeated values
select distinct SALESMAN_ID from orders ;


-- Display the order number ordered by date in ascending order
select ORDER_NO,ORDER_DATE from orders order by ORDER_DATE asc;


-- Display the order number ordered by purchase amount in descending order
select ORDER_NO,purchase_amount from orders order by purchase_amount desc;

-- Display the full data of orders that have purchase amount less than 500.
select * from orders where purchase_amount < 500

-- Display the full data of orders that have purchase amount between 1000 and 2000.
select * from orders where purchase_amount between 1000 and 2000



-- Activity 8
-- Write an SQL statement to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
Select customer_id, max(purchase_amount) as highest_p_amt from orders group by customer_id, purchase_amount;


-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
Select salesman_id,order_date, max(purchase_amount) as highest_p_amt from orders where order_date = TO_DATE('2012/08/17', 'YYYY/MM/DD') group by salesman_id,order_date;

-- Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount 	within the list [2030, 3450, 5760, 6000].
Select customer_id,order_date, max(purchase_amount) as highest_amt from orders having max(purchase_amount) in (2030, 3450, 5760, 6000) group by customer_id,order_date;



