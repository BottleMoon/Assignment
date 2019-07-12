SELECT studioName, AVG(length), MIN(year), COUNT(title) MovieCount
FROM Movie
GROUP BY studioName
ORDER BY MovieCount DESC;