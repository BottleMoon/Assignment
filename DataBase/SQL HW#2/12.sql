SELECT COUNT(*),AVG(length)
FROM StarsIn, Movie
WHERE lower(starname)=lower('Harrison Ford') AND lower(title)=lower(MovieTitle) AND year=movieYear;