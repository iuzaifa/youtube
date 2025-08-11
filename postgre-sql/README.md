Alright, Huzaifa — here’s the same doc but adapted for **PostgreSQL** instead of MySQL, with syntax and tool references updated.

---

## **Customer Table Creation & Data Insertion in PostgreSQL**

### **1. Open PostgreSQL Command Line**

```bash
psql -U postgres
```

* Enter your PostgreSQL password when prompted.

---

### **2. Create a Database**

```sql
CREATE DATABASE w3_db;
```

---

### **3. Connect to the Database**

```sql
\c w3_db;
```

---

### **4. Create the `customers` Table**

```sql
CREATE TABLE customers (
    id SERIAL PRIMARY KEY,               -- Auto-increment in PostgreSQL
    customer_name VARCHAR(150) NOT NULL, -- Customer's full name
    contact_name VARCHAR(250),           -- Contact person's name
    address VARCHAR(250) NOT NULL,       -- Street address
    city VARCHAR(150) NOT NULL,          -- City name
    pincode VARCHAR(6) NOT NULL,         -- Postal/Zip code
    country VARCHAR(150) NOT NULL        -- Country name
);
```

✅ *Table created successfully.*

---

### **5. View Table Structure**

```sql
\d customers;
```

---

### **6. Insert Records into Table**

```sql
INSERT INTO customers (customer_name, contact_name, address, city, pincode, country)
VALUES
('Alfreds Futterkiste', 'Maria Anders', 'Obere Str. 57', 'Berlin', '12209', 'Germany'),
('Ana Trujillo Emparedados y helados', 'Ana Trujillo', 'Avda. de la Constitución 2222', 'México D.F.', '05021', 'Mexico'),
('Antonio Moreno Taquería', 'Antonio Moreno', 'Mataderos 2312', 'México D.F.', '05023', 'Mexico'),
('Around the Horn', 'Thomas Hardy', '120 Hanover Sq.', 'London', 'WA1 1DP', 'UK'),
('Berglunds snabbköp', 'Christina Berglund', 'Berguvsvägen 8', 'Luleå', '95822', 'Sweden');
```

💡 You can insert multiple rows in one query like above.

---

### **7. View Table Data**

```sql
SELECT * FROM customers;
```

---

### **8. Delete Table (If Needed)**

```sql
DROP TABLE customers;
```

⚠️ This will permanently delete the table and its data.

---

### **9. Recreate Table**

Repeat **Step 4** to recreate the table after deletion.

---

### **10. Notes**

* In PostgreSQL, `SERIAL` is used for auto-increment integers (it automatically creates a sequence).
* `VARCHAR` is preferred over `STRING` because PostgreSQL supports `VARCHAR`/`TEXT` for variable-length strings.
* Tools like **DBeaver**, **pgAdmin**, or **DataGrip** make managing PostgreSQL easier.

---

