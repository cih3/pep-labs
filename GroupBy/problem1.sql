--SELECT COUNT(song) album, FROM song GROUP BY artist;

/*SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;*/

--SELECT Shippers.ShipperName, COUNT(song) FROM Orders GROUP BY ShipperName;



--SELECT COUNT(artist) song FROM song GROUP BY artist;
SELECT COUNT() FROM song GROUP BY artist;