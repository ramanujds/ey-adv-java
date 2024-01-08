# Introduction to Relational Database and SQL Commands:

A relational database is a structured collection of data organized in tables, where each table consists of rows and columns. 

SQL (Structured Query Language) is a standard language used to interact with relational databases. It offers a set of powerful commands to perform various operations on the data within the database.

SQL Commands:

1. **DDL (Data Definition Language):**
   - **CREATE:** Used to create a new table, view, index, or other database objects.
   - **ALTER:** Enables modification of the structure of an existing database object, such as adding or deleting columns in a table.
   - **DROP:** Deletes an existing database object, such as a table or view.
   - **TRUNCATE:** Removes all records from a table, but retains the table structure for future use.

2. **DML (Data Manipulation Language):**
   - **INSERT:** Adds new records into a table.
   - **UPDATE:** Modifies existing records in a table based on specified conditions.
   - **DELETE:** Removes records from a table based on specified conditions.

3. **DQL (Data Query Language):**
   - **SELECT:** Retrieves data from one or more tables. It is used to query the database and extract information based on specified criteria.

4. **DCL (Data Control Language):**
   - **GRANT:** Provides specific privileges to users or roles for a particular database object.
   - **REVOKE:** Removes specific privileges previously granted to users or roles.

5. **TCL (Transaction Control Language):**
   - **COMMIT:** Permanently saves changes made during the current transaction to the database.
   - **ROLLBACK:** Undoes changes made during the current transaction, reverting the database to its state before the transaction started.
   - **SAVEPOINT:** Sets a point within a transaction to which you can later roll back, allowing for partial rollback of a transaction.
  
```sql

# Create and use a database
CREATE DATABASE ey_db;
USE ey_db;

# Show tables and databases
SHOW TABLES;
SHOW DATABASES;

# Create a table "Persons"
CREATE TABLE Persons(
    PersonID INT,
    LastName VARCHAR(50),
    FirstName VARCHAR(50),
    Address VARCHAR(255),
    City VARCHAR(50)
);

# Insert data into the "Persons" table
INSERT INTO Persons VALUES (1, 'Sharma', 'Prakash', 'Netajinagar', 'Delhi');
INSERT INTO Persons VALUES (2, 'Reddy', 'Karan', 'Jayanagar', 'Bangalore');
INSERT INTO Persons VALUES (3, 'Das', 'Mahesh', 'BTM Layout', 'Bangalore', '1998-02-15');
INSERT INTO Persons VALUES (4, 'Md.', 'Javed', 'Saltlake', 'Kolkata');

# Display the contents of the "Persons" table
SELECT * FROM Persons;

# Alter table to add a new column "dob" and set it as primary key
ALTER TABLE Persons ADD dob DATE;
ALTER TABLE Persons ADD PRIMARY KEY(PersonID);

# Update the "dob" column for a specific record
UPDATE Persons SET dob='2002-10-10' WHERE PersonID=1;

# Delete a record from the "Persons" table
DELETE FROM Persons WHERE PersonID=3;

# Truncate and delete all records from the "Persons" table
TRUNCATE TABLE Persons;
DELETE FROM Persons;

# Drop the "Persons" table
DROP TABLE Persons;

# Create a new table "Orders"
CREATE TABLE Orders(
    id INT AUTO_INCREMENT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    PersonID INT
);

# Add a foreign key constraint to the "Orders" table
ALTER TABLE Orders ADD FOREIGN KEY(PersonID) REFERENCES Persons(PersonId);

# Insert data into the "Orders" table
INSERT INTO Orders(item_name, PersonID) VALUES ('iPHONE 15', 2);
INSERT INTO Orders(item_name, PersonID) VALUES ('Macbook', 3);

# Truncate and drop the "Orders" table
TRUNCATE TABLE Orders;
DROP TABLE Orders;

# Select all records from the "Orders" table
SELECT * FROM Orders;

# Describe the structure of the "Persons" table
DESC Persons;

# Additional queries
SELECT FirstName, LastName, Address FROM Persons;
SELECT * FROM Persons WHERE City = 'Bangalore';
SELECT * FROM Persons WHERE EXTRACT(YEAR FROM dob) <= 2000;
SELECT * FROM Persons ORDER BY City DESC;
SELECT COUNT(DISTINCT City) FROM Persons;

# Show order details along with person name using JOINs
SELECT ods.*, ps.* FROM Orders ods JOIN Persons ps ON ods.PersonID = ps.PersonID;
SELECT ods.*, ps.* FROM Orders ods RIGHT JOIN Persons ps ON ods.PersonID = ps.PersonID;
SELECT ods.*, ps.* FROM Orders ods LEFT JOIN Persons ps ON ods.PersonID = ps.PersonID;

## More Queries to write

-- List the persons who have not placed any orders.

-- Find the total number of orders placed by each person. Include the person's name and the order count.

-- List the cities where persons have placed orders and the total number of orders for each city.

-- Retrieve the details of persons who have placed orders for 'iPHONE 15'. 

-- List the persons who have placed more than 2 orders.


```
