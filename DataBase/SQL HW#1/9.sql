select TITLE
from MOVIE
where LENGTH > ( 
    select LENGTH 
    from MOVIE 
    where lower(title)=lower('Gone with the wind'));