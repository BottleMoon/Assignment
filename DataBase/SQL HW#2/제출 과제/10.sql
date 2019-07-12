SELECT AVG(netWorth)
FROM MovieExec 
WHERE name IN (SELECT distinct e.name
FROM MovieStar s, MovieExec e, Movie,StarsIn
WHERE producerNo=certNo AND lower(starName)=lower(e.name));