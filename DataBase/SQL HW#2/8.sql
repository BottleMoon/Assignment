SELECT title
FROM StarsIn, Movie
WHERE title = movieTitle AND (starName,length)=(SELECT name, MAX(length)
                                                FROM MovieStar,StarsIn,Movie
                                                WHERE title=movieTitle AND starName=name AND birthdate=(SELECT MIN(birthdate) FROM  MovieStar)
GROUP BY name);

