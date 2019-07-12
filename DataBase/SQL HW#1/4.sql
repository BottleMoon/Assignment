select distinct NAME,BIRTHDATE
from MOVIESTAR,STARSIN
where lower(STARNAME)=lower(NAME) and (MOVIEYEAR=1980 or lower(MOVIETITLE) LIKE lower('%and%')orlower(MOVIETITLE) LIKE lower('%or%'))
ORDER BY BIRTHDATE DESC;
