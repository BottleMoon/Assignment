select NAME, ADDRESS
from MOVIESTAR
where GENDER='male' or lower(ADDRESS) LIKE lower('%Malibu%'); 