SELECT title,year
FROM Movie,starsIn
WHERE year=movieYear AND title=movieTitle AND (starName, length) IN 
(SELECT starName, MAX(length)                                                                    
FROM MovieStar,StarsIn,Movie
WHERE year=movieYear AND title=movieTitle AND name=starName AND gender='female' AND birthDate>(SELECT birthDate
                                                                                                FROM MovieStar
                                                                                                WHERE lower(name)=lower('Danny DeVito'))
GROUP BY starName)
ORDER BY LOWER(title), year;