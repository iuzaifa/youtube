-- 1. Login to PostgreSQL
--    psql -U postgres -W

-- 2. Create database
CREATE DATABASE w3_db;

-- 3. Connect to database
-- \c w3_db;

-- 4. Create table Customers
CREATE TABLE customers (
    id SERIAL PRIMARY KEY,  -- Auto-increment in PostgreSQL
    customer_name VARCHAR(150) NOT NULL,
    contact_name VARCHAR(250),
    address VARCHAR(250) NOT NULL,
    city VARCHAR(150) NOT NULL,
    pincode VARCHAR(6) NOT NULL,
    country VARCHAR(150) NOT NULL
);

-- 5. View table
SELECT * FROM customers;

-- 6. Insert values
INSERT INTO customers (customer_name, contact_name, address, city, pincode, country)
VALUES ('Antonio Moreno Taquería', 'Antonio Moreno', 'Mataderos 2312', 'México D.F.', '05023', 'Mexico');





-- * `SERIAL` (older, simpler)
-- * `GENERATED ... AS IDENTITY` (modern SQL standard)

-- So:

-- **In MySQL**

-- ```sql
-- id INT AUTO_INCREMENT PRIMARY KEY
-- ```

-- **In PostgreSQL** (common way)

-- ```sql
-- id SERIAL PRIMARY KEY
-- ```

-- **Modern PostgreSQL way**

-- ```sql
-- id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY
-- ```

-- If you want MySQL and PostgreSQL scripts to work differently but look clean, we should make **two separate `.sql` files**.

-- Do you want me to give **both MySQL and PostgreSQL versions** of your customers table script side-by-side so you can quickly switch?
