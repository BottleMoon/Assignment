SELECT DISTINCT name,spouseName
FROM MovieExec,StarsIn,Movie
WHERE certNo=directorNo AND spouseName=starName AND movieTitle IN(SELECT title FROM Movie, movieExec,StarsIn WHERE directorNo = certNo AND spousename = starname);