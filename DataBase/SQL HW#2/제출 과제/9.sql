SELECT studioName, COUNT(distinct producerNo)
FROM Movie, MovieExec
WHERE certNo=producerNo
GROUP BY studioName
Having AVG(netWorth)>1000000;