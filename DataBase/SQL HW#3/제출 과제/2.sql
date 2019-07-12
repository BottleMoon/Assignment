SELECT title,year
FROM Movie
WHERE directorNo IN (SELECT certNo FROM MovieExec WHERE netWorth IN (SELECT MAX(netWorth)FROM Movie, MovieExec WHERE certNo=directorNo))
AND 
studioName IN (SELECT s.name FROM Studio s,MovieExec e WHERE presNo=certNo AND netWorth IN (SELECT MIN(netWorth) FROM MovieExec e,Studio s WHERE certNo=presNo))
AND
producerNo IN (SELECT certNo FROM MovieExec WHERE netWorth IN (SELECT MIN(netWorth)FROM Movie, MovieExec WHERE certNo=producerNo));