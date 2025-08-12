-- SQL ORDER BY Keyword

-- create categories table  
CREATE TABLE categories(
    categories_id INT PRIMARY KEY NOT NULL,
    categories_name VARCHAR(100),
    categories_description VARCHAR(250)
);

-- add data in categories table 
INSERT INTO categories (categories_id, categories_name, categories_description) VALUES 
(1, 'Toys', 'Toys for children of all ages'),
(2, 'Sports Equipment', 'Balls, bats, gym equipment, and sportswear');
-- You can add 20 categories here...

-- see data
SELECT * FROM categories;

-- create suppliers table
CREATE TABLE suppliers (
    suppliers_id INT PRIMARY KEY NOT NULL,
    supplier_name VARCHAR(250) NOT NULL,
    contact_name VARCHAR(250),
    address VARCHAR(250),
    city VARCHAR(100),
    postal_code VARCHAR(20),
    country VARCHAR(100),
    phone VARCHAR(20)
);

-- create products table mapped with categories & suppliers
CREATE TABLE products (
    id INT PRIMARY KEY NOT NULL,
    product_name VARCHAR(250) NOT NULL,
    supplier_id INT NOT NULL,
    category_id INT,
    unit INT NOT NULL,
    price DOUBLE NOT NULL,
    FOREIGN KEY (category_id) REFERENCES categories(categories_id),
    FOREIGN KEY (supplier_id) REFERENCES suppliers(suppliers_id)
);

-- insert suppliers data
INSERT INTO suppliers (suppliers_id, supplier_name, contact_name, address, city, postal_code, country, phone) VALUES
(1, 'TechWorld Electronics', 'John Smith', '123 Silicon Ave', 'San Jose', '95112', 'USA', '+1-408-555-1001'),
(2, 'Global Dairy Co.', 'Sarah Lee', '45 Milk Street', 'Dublin', 'D02F624', 'Ireland', '+353-1-555-2001');

-- insert products data
INSERT INTO products (id, product_name, supplier_id, category_id, unit, price) VALUES
(1, 'Smartphone X', 1, 1, 50, 699.99);

-- Customers table
CREATE TABLE customers (
    customer_id INT PRIMARY KEY NOT NULL,
    customer_name VARCHAR(250) NOT NULL,
    contact_name VARCHAR(250),
    address VARCHAR(250),
    city VARCHAR(100),
    postal_code VARCHAR(20),
    country VARCHAR(100)
);

-- insert 1000 customers (sample)
INSERT INTO customers (customer_id, customer_name, contact_name, address, city, postal_code, country) VALUES
(1, 'John Doe', 'Jane Smith', '123 Main St', 'New York', '10001', 'USA'),
(2, 'Alice Johnson', 'Mark Lee', '45 Oak St', 'Chicago', '60601', 'USA'),
(3, 'Michael Brown', 'Sara Parker', '78 Pine St', 'Los Angeles', '90001', 'USA'),
-- keep adding until 1000 rows...

-- Example of generating large inserts programmatically (if using MySQL Workbench with script)
-- You can use a loop in a stored procedure or external script to insert dummy data for testing.



-- View products & suppliers
SELECT * FROM products;
SELECT * FROM suppliers;

-- ORDER BY examples
SELECT * FROM products ORDER BY price; 
SELECT unit, price FROM products ORDER BY unit, price;

SELECT * FROM products ORDER BY price ASC; 
SELECT * FROM products ORDER BY price DESC; 

SELECT * FROM products ORDER BY product_name; 
SELECT * FROM products ORDER BY product_name ASC; 
SELECT * FROM products ORDER BY product_name DESC;

-- Multiple column sorting
SELECT * FROM customers c ORDER BY c.country, c.customer_name;
SELECT * FROM customers c ORDER BY c.country ASC, c.customer_name DESC;