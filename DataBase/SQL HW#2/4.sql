SELECT DISTINCT e.name
FROM MovieExec e, Studio s, Movie, MovieStar m
WHERE certNo=presNo AND certNo=producerNo AND m.name=e.name;