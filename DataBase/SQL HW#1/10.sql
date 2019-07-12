select NAME
from MOVIEEXEC
where NETWORTH > ( 
    select NETWORTH 
    from MOVIEEXEC 
    where lower(NAME)='merv griffin');