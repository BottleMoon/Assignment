SELECT distinct e.name, e.spouseName
FROM MovieExec e , MovieStar s, Movie
WHERE e.gender='male' AND e.spouseName = s.name AND certNo=producerNo;¿ÀÈÄ 11:36 2018-06-16