SELECT starName
FROM StarsIn,MovieStar
where gender='female' and lower(starName)=lower(name)
MINUS
SELECT starName
FROM StarsIn
WHERE lower(movieTitle)=lower('Sting')
ORDER BY starname ASC;