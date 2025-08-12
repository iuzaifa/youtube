
-- The SQL AND Operator

-- The WHERE clause can contain one or many AND operators.
-- The AND operator is used to filter records based on more than one condition, like if you want 
-- to return all customers from Spain that starts with the letter 'G':

-- Syntax:
-- SELECT column1, column2, ...
-- FROM table_name
-- WHERE condition1 AND condition2 AND condition3 ...;


-- Example 1: Filter customers from Germany with names starting with 'A'
SELECT * FROM customers c WHERE country = 'Germany' AND c.customer_name LIKE 'A%%';


-- AND vs OR
-- The AND operator displays a record if all the conditions are TRUE.
-- The OR operator displays a record if any of the conditions are TRUE.

-- All Conditions Must Be True
select * from customers c where Country  = 'Germany' and city ='Berlin' and id > 50;

-- Combining AND and OR 
SELECT * FROM customers c WHERE country = 'Germany' AND city = 'Berlin' AND (customer_name LIKE 'R%' OR customer_name LIKE 'G%');


