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

