-- The SQL OR Operator
-- The WHERE clause can contain one or more OR operators.

-- The OR operator is used to filter records based on more than one condition, like if you want to return all 
-- customers from Germany but also those from Spain:

-- Syntax:
-- SELECT column1, column2, ... 
-- FROM table_name
-- WHERE condition1 OR condition2 OR condition3 ...;

-- Example 1: Filter customers from Germany or Spain
SELECT * FROM customers c WHERE country = 'Germany' OR country = 'Spain';

-- Example 2: Filter customers from Germany or Spain with names starting with 'A'
SELECT * FROM customers c WHERE (country = 'Germany' OR country = 'Spain') AND c.customer_name LIKE 'A%';

-- Example 3: Filter customers from Germany or Spain with IDs less than 100
SELECT * FROM customers c WHERE (country = 'Germany' OR country = 'Spain') AND c.id < 100;
-- Example 4: Filter customers from Germany or Spain with IDs between 50 and 100
SELECT * FROM customers c WHERE (country = 'Germany' OR country = 'Spain') AND  c.id BETWEEN 50 AND 100;
-- Example 5: Filter customers from Germany or Spain with names starting with 'A' or 'B'
SELECT * FROM customers c WHERE (country = 'Germany' OR country = 'Spain') AND (c.customer_name LIKE 'A%' OR c.customer_name LIKE 'B%');


