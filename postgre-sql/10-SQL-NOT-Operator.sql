-- The NOT Operator
-- NOTE: The NOT operator is used to negate (exclude from the output) a condition in SQL.
-- The NOT operator is used to filter records that do not meet a specified condition.
-- The NOT operator is used in combination with other operators to give the opposite result, also called the negative result.
-- In the select statement below we want to return all ?table-name that are NOT from ?column1-name:
-- -- Example 1:
SELECT * FROM Customers c WHERE NOT Country = 'USA';
-- Example 2:
SELECT * FROM Customers c WHERE NOT (Country = 'USA' OR Country = 'Ireland');

-- Example 3: Using NOT with LIKE
SELECT * FROM Customers c WHERE NOT customer_name LIKE 'A%';