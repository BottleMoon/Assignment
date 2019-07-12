SELECT distinct title
FROM Movie,StarsIn
WHERE title=movieTitle AND starName IN (SELECT starName
FROM StarsIn,Movie
WHERE movieTitle = title AND studioName='fox');
