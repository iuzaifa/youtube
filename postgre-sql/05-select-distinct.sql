
/*
In PostgreSQL, the DISTINCT keyword is used in a SELECT statement to return 
only unique rows for the specified columns, eliminating duplicate values from 
the result set.

- When used with one column, it returns unique values of that column.
- When used with multiple columns, it returns unique combinations of those columns.
- The COUNT(DISTINCT column_name) function counts the total number of different 
  (unique) values in a column.
- You can also use DISTINCT inside a subquery to further process unique values, 
  such as counting them separately.

This is especially useful for tasks like finding:
    • Unique customers
    • Unique countries
    • Counting how many distinct items exist in a dataset
*/



-- Syntax for selecting distinct values
-- SELECT DISTINCT column1, column2, ... FROM table_name;

-- Example 1: Distinct countries from the Customers table
SELECT DISTINCT country FROM customers;

-- Example 2: Distinct combinations of customer_name and country
SELECT DISTINCT customer_name, country FROM customers;

-- Syntax for counting distinct values
-- SELECT COUNT(DISTINCT column_name) AS alias_name FROM table_name;
-- Example 3: Count how many unique countries exist
SELECT COUNT(DISTINCT country) AS distinct_countries FROM customers;


