SELECT title,year
FROM Movie
WHERE producerNo IN (SELECT certNo FROM MovieExec WHERE netWorth IN (SELECT MAX(netWorth)FROM Movie, MovieExec WHERE certNo=producerNo))
AND 
studioName IN (SELECT s.name FROM Studio s,MovieExec e WHERE presNo=certNo AND netWorth IN (SELECT MIN(netWorth) FROM MovieExec e,Studio s WHERE certNo=presNo));