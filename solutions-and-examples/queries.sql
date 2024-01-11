
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


