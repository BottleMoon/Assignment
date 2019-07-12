SELECT e.name, e.networth
FROM MovieExec e,Studio s
WHERE certNo = presNO AND e.name IN 
    (SELECT STARNAME
     FROM StarsIn
     GROUP BY STARNAME
     HAVING COUNT(movieTitle)>=3);