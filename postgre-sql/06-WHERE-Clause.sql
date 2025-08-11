-- WHERE Clause: Used to filter records that meet a specific condition.
-- Syntax: SELECT column1, column2, ... FROM table_name WHERE condition;

-- Example 1: Filter by country
SELECT * FROM customers c WHERE country = 'Mexico';

-- Example 2: Filter by ID
SELECT * FROM customers c WHERE id = 72;

-- Example 3: Using comparison operators
SELECT * FROM customers c WHERE id <= 80; -- less than or equal to 80

-- Example 4: Not equal to
SELECT * FROM customers c WHERE id <> 72; -- returns all rows where ID is NOT 72

-- Example 5: Between range
SELECT * FROM customers c WHERE id BETWEEN 50 AND 80; -- ID between 50 and 80 (inclusive)

-- Example 6: Pattern matching with LIKE
SELECT * FROM customers c WHERE country LIKE 's%'; -- matches countries starting with 's'

-- Example 7: Using IN for multiple matches
SELECT * FROM customers c WHERE city IN ('Madrid', 'London'); -- city is Madrid or London
