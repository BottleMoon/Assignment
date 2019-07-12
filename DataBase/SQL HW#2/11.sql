SELECT COUNT(title),length
FROM Movie
WHERE length IN (SELECT distinct m2.length
FROM movie m1,movie m2
WHERE m1.length = m2.length AND m1.year < m2.year)
GROUP BY length
ORDER BY length DESC;