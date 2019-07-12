SELECT distinct s.name, e.name
FROM MovieStar s, MovieExec e, Movie
WHERE s.birthdate=e.birthdate AND certNo=producerNo AND s.name != e.name;
