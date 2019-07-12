SELECT address, AVG(length), MAX(year)
FROM MovieStar, StarsIn, Movie
WHERE movieTitle = title AND name = starName AND address IN (SELECT s1.address
                                                            FROM MovieStar s1, MovieStar s2
                                                            WHERE s1.address=s2.address and s1.name<s2.name)
                                                            GROUP BY address;