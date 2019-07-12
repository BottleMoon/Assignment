select e.NAME
from MOVIEEXEC e,STUDIO s
where CERTNO=PRESNO and lower(s.NAME)=lower('Fox');