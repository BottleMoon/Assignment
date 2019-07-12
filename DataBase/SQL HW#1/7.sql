select STARNAME
from MOVIE, STARSIN
where YEAR=1995 and lower(STUDIONAME)=lower('MGM') and lower(TITLE)=lower(MOVIETITLE); 