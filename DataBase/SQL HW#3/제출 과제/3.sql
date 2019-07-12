SELECT directorNo, AVG(length), COUNT(title) MovieCount
FROM Movie
GROUP BY directorNo
ORDER BY MovieCount DESC;