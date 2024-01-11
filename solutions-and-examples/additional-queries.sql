
-- List the persons who have not placed any orders.

SELECT p.*
FROM Persons p
LEFT JOIN Orders o ON p.PersonID = o.PersonID
WHERE o.PersonID IS NULL;

-- Find the total number of orders placed by each person. Include the person's name and the order count.

SELECT p.PersonID, p.FirstName, p.LastName, COUNT(o.id) AS OrderCount
FROM Persons p
LEFT JOIN Orders o ON p.PersonID = o.PersonID
GROUP BY p.PersonID, p.FirstName, p.LastName;


-- List the cities where persons have placed orders and the total number of orders for each city.

SELECT p.City, COUNT(o.id) AS OrderCount
FROM Persons p
JOIN Orders o ON p.PersonID = o.PersonID
GROUP BY p.City;


-- Retrieve the details of persons who have placed orders for 'iPHONE 15'. 

SELECT p.*, o.*
FROM Persons p
JOIN Orders o ON p.PersonID = o.PersonID
WHERE o.item_name = 'iPHONE 15';


-- List the persons who have placed more than 2 orders.

SELECT p.*
FROM Persons p
JOIN (SELECT PersonID, COUNT(id) AS OrderCount
      FROM Orders
      GROUP BY PersonID
      HAVING OrderCount > 2) AS Subquery ON p.PersonID = Subquery.PersonID;
      


