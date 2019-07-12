select MOVIETITLE, LENGTH, e.NAME
from MOVIESTAR s,STARSIN,MOVIE, MOVIEEXEC e
where (s.BIRTHDATE < '1970-1-1' and lower(s.ADDRESS) LIKE lower('%California%') and GENDER ='female') and
    lower(s.NAME)=lower(STARNAME) and lower(MOVIETITLE)=lower(TITLE) and
    PRODUCERNO=CERTNO
    ORDER BY length DESC, movietitle ASC;
