drop table StarsIn cascade constraints;
drop table MovieStar cascade constraints;
drop table Movie cascade constraints;
drop table Studio cascade constraints;
drop table MovieExec cascade constraints;
drop table cartoon cascade constraints;


  CREATE TABLE "MOVIEEXEC" 
   (	"NAME" VARCHAR2(30) constraint me_name UNIQUE, 
	"ADDRESS" VARCHAR2(255), 
	"CERTNO" NUMBER(*,0) constraint me_key Primary Key, 
	"NETWORTH" NUMBER(*,0),
	"SPOUSENAME" VARCHAR2(30) ,
	"BIRTHDATE" DATE,
	"GENDER" CHAR(6),
    CONSTRAINT "SEX_CHK" CHECK (gender in ('male', 'female'))
   )
/
REM INSERTING into MOVIEEXEC
SET DEFINE OFF;
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('sharky','hollywood',1,1000000,'carrie fisher',to_date('1945-03-15','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('walt disney','california',2,258000000,'harrison ford',to_date('1965-02-13','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('harry conick jr.','hollywood',3,12000,'harrison ford',to_date('1965-12-19','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('seok hee hong','daeyun-dong nam-gu, pusan',4,158000000,'carrie fisher',to_date('1985-01-13','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('john picolo','washington',5,248000000,'carrie henn',to_date('1985-02-13','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('malcom mac','seattle',6,258000000,'rutger hauer',to_date('1941-03-03','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('fernando buttanda','canada',7,342001,'robert redford',to_date('1957-02-27','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('john alan simon','chicago, illnois',8,258000000,'winona ryder',to_date('1944-03-17','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('george lucas','modesto, california',9,4300020,'sandra bullock',to_date('1982-05-23','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('ian bryce','hollywood',10,5400020,'kim basinger',to_date('1945-10-13','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('robert redford','santa monica, california',11,92100000,'debra winger',to_date('1937-08-18','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('mike meyers','malibu, california',12,2000000,'sigourney weaver',to_date('1951-03-02','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('james l. brooks','north bergen, new jersey',13,3000000,'alec baldwin',to_date('1940-11-20','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('dan kolsrud','trollhuset, norway',14,4000000,NULL,to_date('1945-06-23','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('danny devito','neptune nj',15,500000,'vivien leigh',to_date('1944-11-17','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('alfred molina','london, england, uk',16,640000,'danny devito',to_date('1953-05-24','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('merv griffin','san mateo, california',17,3000000,'alfred molina',to_date('1938-04-29','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('jack smith','santa babara, california',18,368000000,'sean connery',to_date('1941-06-28','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('smile kang','neptune newyork',19,12340000,'julia roberts',to_date('1968-08-13','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('albert t. viola','stone ridge mall rd., california',20,340000,'sean connery',to_date('1945-03-23','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('clark gable','cadiz, ohio',21,1234560,'audrey campbell',to_date('1901-02-01','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('michael mann','buzz, florida, USA',22,9231234560,'johnny depp',to_date('1975-12-25','RRRR-MM-DD'),'female');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('rechard jung','banff, new york, usa',23,20000060,'rebecca hall',to_date('1965-07-15','RRRR-MM-DD'),'male  ');
Insert into MOVIEEXEC (NAME,ADDRESS,CERTNO,NETWORTH,SPOUSENAME,BIRTHDATE,GENDER) values ('seok hee park','caemroon, texas, usa',24,560000,'morgan freeman',to_date('1970-06-16','RRRR-MM-DD'),'male  ');

--------------------------------------------------------
--  Ref Constraints for Table MOVIEEXEC
--------------------------------------------------------
  ALTER TABLE "MOVIEEXEC" ADD constraint me_fk FOREIGN KEY ("SPOUSENAME")
	  REFERENCES "MOVIESTAR" ("NAME") ON DELETE CASCADE ENABLE
/
--------------------------------------------------------
--  DDL for Table MOVIESTAR
--------------------------------------------------------

  CREATE TABLE "MOVIESTAR" 
   (	"NAME" VARCHAR2(30) constraint st_key primary key, 
	"ADDRESS" VARCHAR2(255), 
	"GENDER" CHAR(6), 
	"BIRTHDATE" DATE,
	"SPOUSENAME" VARCHAR2(30),
    CONSTRAINT "SEX_CHK2" CHECK (gender in ('male', 'female'))
   )
/
REM INSERTING into MOVIESTAR
SET DEFINE OFF;
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('mark hamill','456 oak rd. brentwood','male  ',to_date('1945-09-13','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('harrison ford','wilson road jackson hole, wy','male  ',to_date('1942-06-13','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('박중훈','서울시 충무로 2가','male  ',to_date('1961-08-21','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('emilio estevez','450 malibu, new york','male  ',to_date('1962-01-03','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('dana carvey','부산시 남구 대연동','male  ',to_date('1965-11-09','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('mike meyers','Malibu, california','male  ',to_date('1951-03-02','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('carrie fisher','123 maple st., hollywood','female',to_date('1954-05-01','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('sigourney weaver','8942 w. b. beverly hills','female',to_date('1949-10-08','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('carrie henn','new york','male  ',to_date('1942-01-12','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('karen allen','1776 broadway, ny','female',to_date('1951-10-05','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('rutger hauer','22-32 west cromwell road london, sw5 9qj','male  ',to_date('1944-01-23','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('sean young','louisville, kentucky','female',to_date('1959-11-20','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('meryl streep','summit st., malibu, new jersey','female',to_date('1949-06-22','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('robert redford','santa monica, California','male  ',to_date('1937-08-18','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('winona ryder','winona, minnesota','female',to_date('1971-10-29','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('ethan hawke','austin, texas','male  ',to_date('1970-11-06','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('paul newman','cleveland, ohio','male  ',to_date('1925-01-25','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('ryan o''neal','los angeles, california','male  ',to_date('1941-04-20','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('sandra bullock','washington st., California','female',to_date('1965-07-26','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('tommy lee jones','san saba, texas','male  ',to_date('1946-09-15','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('alec baldwin','massapequa, new york','male  ',to_date('1958-04-03','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('kim basinger','massapequa, new york','female',to_date('1953-12-08','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('debra winger','cleveland, ohio','female',to_date('1955-05-16','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('jack nicholson','neptune, new jersey','male  ',to_date('1937-04-22','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('danny devito','neptune nj','male  ',to_date('1944-11-17','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('john travolta','englewood, new jersey, usa','male  ',to_date('1954-02-18','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('gene hackman','san bernadino, california','male  ',to_date('1930-01-30','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('rene russo','burbank, california','female',to_date('1954-02-17','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('ben kingsley','scarborough, england, uk','male  ',to_date('1943-12-31','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('alfred molina','london, england, uk','female',to_date('1953-05-24','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('vivien leigh','darjeeling, india','female',to_date('1913-11-05','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('clark gable','cadiz, ohio','male  ',to_date('1901-02-01','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('richard gere','philadelphia, pennsylvania, usa','male  ',to_date('1949-08-31','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('julia roberts','smyrna, georgia, usa','female',to_date('1967-10-28','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('catherine zeta-jones','swansea, west glamorgan, wales, uk','female',to_date('1969-09-25','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('queen latifah','newark, new jersey, usa','female',to_date('1970-03-18','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('kate capshaw','792 fort worth bl., california, usa','female',to_date('1953-11-03','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('sean connery','edinburgh, midlothian, scotland, uk','male  ',to_date('1930-08-25','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('eileen brennan','1293, bay street, los angeles, california, USA','female',to_date('1932-09-03','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('audrey campbell','new york city, New York, USA','female',to_date('1929-08-05','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('melynda albrecht','grand circle bd, ohio, USA','male  ',to_date('1922-12-25','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('vera allik','paris, france','female',to_date('1935-01-20','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('johnny depp','Owensboro, Kentucky, USA','male',to_date('1963-06-09','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('rebecca hall','London, England, UK','female',to_date('1982-05-03','RRRR-MM-DD'));
Insert into MOVIESTAR (NAME,ADDRESS,GENDER,BIRTHDATE) values ('morgan freeman','Memphis, Tennessee, USA','male',to_date('1937-06-01','RRRR-MM-DD'));
--------------------------------------------------------
--  Ref Constraints for Table MOVIESTAR
--------------------------------------------------------

  ALTER TABLE "MOVIESTAR" ADD  constraint st_fk FOREIGN KEY ("SPOUSENAME")
	  REFERENCES "MOVIEEXEC" ("NAME") ON DELETE CASCADE ENABLE
      /
--------------------------------------------------------
--  DDL for Table STUDIO
--------------------------------------------------------

  CREATE TABLE "STUDIO" 
   (	"NAME" VARCHAR2(30) constraint std_key primary key, 
	"ADDRESS" VARCHAR2(255), 
	"PRESNO" NUMBER(*,0),
	"EMPNO" NUMBER(*,0)
   )
/
REM INSERTING into STUDIO
SET DEFINE OFF;
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('fox','edinburgh, midlothian, scotland, uk',1,1000);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('paramount','4101 nw urbandale drive, urbandale, ia 50322',2,250);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('disney','9750 airport blvd. los angeles, ca 90045',3,530);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('warner bros','8585 santa monica blvd. west hollywood, ca 90069',4,2000);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('mgm','30 east 30th street new york, ny 10016',5,100);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('neue const film','167 rue de rome paris,  75017',17,50);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('touchstone pictures','22-32 west cromwell road london, sw5 9qj',7,16);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('dream box','부산시 남구 용호1동',11,60);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('new york film','catsle rock rd., california, usa',2,390);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('Cold spring','부산시 남구 대연3동',21,493);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('new cinema','경상북도 포항시 북구',18,250);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('wild character','stoneridge rd., pleasanton, ca, usa',16,30);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('columbia','Anchorage, Alaska, USA',6,5);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('starbucks','Leverty city, USA',8,53);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('pycho','부산시 동래구 거제1동',22,100);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('smoke','Lacooncity, ThailLand',7,30);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('younggu','서울특별시 , 대한민국',23,12);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('hobby','Baghdad, Iraque',23,12);
Insert into STUDIO (NAME,ADDRESS,PRESNO,EMPNO) values ('simsons','New York, USA',15,500);
--------------------------------------------------------
--  Ref Constraints for Table STUDIO
--------------------------------------------------------

  ALTER TABLE "STUDIO" ADD  constraint studio_fk FOREIGN KEY ("PRESNO")
	  REFERENCES "MOVIEEXEC" ("CERTNO") ON DELETE CASCADE ENABLE
/

--------------------------------------------------------
--  DDL for Table MOVIE
--------------------------------------------------------

  CREATE TABLE "MOVIE" 
   (	"TITLE" VARCHAR2(255), 
	"YEAR" NUMBER(*,0), 
	"LENGTH" NUMBER(*,0), 
	"INCOLOR" CHAR(1), 
	"STUDIONAME" VARCHAR2(30), 
	"PRODUCERNO" NUMBER(*,0),
	"DIRECTORNO" NUMBER(6),
	"SOUNDSTUDIO" VARCHAR2(30),

    constraint mv_key primary key(title,year),
    constraint mv_chk CHECK (length > 50 and year > 1900 and year <= 2019)
   )
/
REM INSERTING into MOVIE
SET DEFINE OFF;
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('mighty ducks',1991,274,'t','disney',2,20,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('pretty woman',1990,119,'t','disney',8,5,'smoke');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('wayne''s world',1992,95,'t','paramount',3,14,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('star wars',1977,124,'t','fox',9,2,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('aliens',1986,137,'t','fox',1,2,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('raiders of the lost ark',1981,115,'t','paramount',9,14,'smoke');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('blade runner',1982,117,'t','warner bros',4,24,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('out of africa',1985,150,'t','mgm',11,22,'smoke');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('house of the spirits',1993,140,'t','neue const film',6,23,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('reality bites',1994,99,'t','mgm',5,17,'simsons');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('butch cassidy and the sundance kid',1969,110,'t','fox',1,20,'younggu');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('sting',1973,129,'t','mgm',12,7,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('up close and personal',1996,124,'t','touchstone pictures',7,23,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('love story',1970,99,'t','paramount',3,17,'simsons');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('a woman in Love',1970,88,'t','new york film',20,5,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('speed',1994,115,'t','fox',10,6,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('coal miner''s daughter',1980,222,'t','mgm',5,6,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('getaway',1994,115,'t','fox',8,6,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('terms of endearment',1983,232,'t','paramount',13,23,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('l.a. confidential',1997,136,'t','warner bros',14,11,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('get shorty',1995,105,'t','mgm',15,2,'hobby');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('species',1995,108,'t','mgm',16,5,'younggu');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('gone with the wind',1939,222,'t','fox',2,6,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('aliens',1996,137,'t','fox',3,17,'simsons');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('fool''s running',2000,107,'t','mgm',11,24,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('Chicago',2002,113,'t','disney',5,14,'hobby');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('indiana jones and the temple of doom',1984,118,'t','paramount',9,23,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('indiana jones and the last crusade',1989,127,'t','paramount',9,14,'smoke');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('The Amazing Spider-Man 2',2014,142,'t','columbia',3,7,'hobby');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('Captain America: The Winter Soldier',2014,136,'t','mgm',1,20,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('Little Mermaid',1970,120,'t','disney',3,7,'pycho');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('santa',1980,132,'t','disney',3,7,'smoke');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('ghost warrior',1973,120,'t','disney',7,23,'starbucks');
Insert into MOVIE (TITLE,YEAR,LENGTH,INCOLOR,STUDIONAME,PRODUCERNO,DIRECTORNO,SOUNDSTUDIO) values ('computerScience',1966,90,'t','fox',3,7,'pycho');
--------------------------------------------------------
--  Ref Constraints for Table MOVIE
--------------------------------------------------------

  ALTER TABLE "MOVIE" ADD constraint mv_prod FOREIGN KEY ("PRODUCERNO")
	  REFERENCES "MOVIEEXEC" ("CERTNO") ON DELETE CASCADE ENABLE
 /
  ALTER TABLE "MOVIE" ADD constraint mv_studio FOREIGN KEY ("STUDIONAME")
	  REFERENCES "STUDIO" ("NAME") ON DELETE CASCADE ENABLE
/
  ALTER TABLE "MOVIE" ADD  constraint mv_dirt FOREIGN KEY ("DIRECTORNO")
	  REFERENCES "MOVIEEXEC" ("CERTNO") ON DELETE CASCADE ENABLE
/
  ALTER TABLE "MOVIE" ADD  constraint mv_sstudio FOREIGN KEY ("SOUNDSTUDIO")
	  REFERENCES "STUDIO" ("NAME") ON DELETE CASCADE ENABLE
/
--------------------------------------------------------
--  DDL for Table STARSIN
--------------------------------------------------------

  CREATE TABLE "STARSIN" 
   (	"MOVIETITLE" VARCHAR2(255), 
	"MOVIEYEAR" NUMBER(*,0), 
	"STARNAME" VARCHAR2(30),
	"GURANTEE" NUMBER(38),
    constraint stin_key primary key(movietitle,movieyear, starname)
   )
/
REM INSERTING into STARSIN
SET DEFINE OFF;
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('Chicago',2002,'catherine zeta-jones',285190);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('Chicago',2002,'queen latifah',90000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('Chicago',2002,'richard gere',1200000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('a woman in Love',1970,'audrey campbell',190100);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('a woman in Love',1970,'melynda albrecht',100000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('a woman in Love',1970,'vera allik',9999999);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('aliens',1986,'carrie henn',2904203);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('aliens',1986,'sigourney weaver',20000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('aliens',1996,'sigourney weaver',3500000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('blade runner',1982,'harrison ford',205000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('blade runner',1982,'rutger hauer',10000000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('blade runner',1982,'sean young',5902000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('butch cassidy and the sundance kid',1969,'clark gable',10230);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('butch cassidy and the sundance kid',1969,'paul newman',300000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('butch cassidy and the sundance kid',1969,'robert redford',543000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('coal miner''s daughter',1980,'eileen brennan',2030000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('coal miner''s daughter',1980,'tommy lee jones',1000000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('fool''s running',2000,'gene hackman',680000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('fool''s running',2000,'robert redford',290600);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('fool''s running',2000,'tommy lee jones',4200000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('get shorty',1995,'danny devito',3000000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('get shorty',1995,'gene hackman',502000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('get shorty',1995,'john travolta',2500000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('get shorty',1995,'rene russo',30500000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('getaway',1994,'alec baldwin',439890);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('getaway',1994,'kim basinger',10000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('gone with the wind',1939,'clark gable',250000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('gone with the wind',1939,'vivien leigh',50300);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('house of the spirits',1993,'meryl streep',999900);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('house of the spirits',1993,'winona ryder',9999999);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('indiana jones and the last crusade',1989,'harrison ford',5209000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('indiana jones and the last crusade',1989,'sean connery',210000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('indiana jones and the temple of doom',1984,'harrison ford',4200000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('indiana jones and the temple of doom',1984,'kate capshaw',291000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('l.a. confidential',1997,'danny devito',5003000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('l.a. confidential',1997,'kim basinger',887600);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('love story',1970,'ryan o''neal',897000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('love story',1970,'tommy lee jones',5230000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('mighty ducks',1991,'emilio estevez',555555);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('out of africa',1985,'meryl streep',3319300);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('out of africa',1985,'robert redford',540000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('pretty woman',1990,'julia roberts',96536);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('pretty woman',1990,'richard gere',4209000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('raiders of the lost ark',1981,'harrison ford',203900);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('raiders of the lost ark',1981,'karen allen',5020000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('reality bites',1994,'ethan hawke',5020100);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('reality bites',1994,'winona ryder',52001000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('species',1995,'alfred molina',8050000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('species',1995,'ben kingsley',94820);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('speed',1994,'sandra bullock',52000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('star wars',1977,'carrie fisher',9100000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('star wars',1977,'harrison ford',25900000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('star wars',1977,'mark hamill',5100000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('sting',1973,'eileen brennan',8766493);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('sting',1973,'paul newman',20030000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('sting',1973,'robert redford',32400);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('terms of endearment',1983,'danny devito',324000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('terms of endearment',1983,'debra winger',6340000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('terms of endearment',1983,'jack nicholson',4930000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('up close and personal',1996,'clark gable',2000000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('up close and personal',1996,'robert redford',1900000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('wayne''s world',1992,'dana carvey',520000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('wayne''s world',1992,'mike meyers',5200000);
Insert into STARSIN (MOVIETITLE,MOVIEYEAR,STARNAME,GURANTEE) values ('The Amazing Spider-Man 2', 2014, 'rebecca hall',340000);
--------------------------------------------------------

  ALTER TABLE "STARSIN" ADD constraint stin_fk1 FOREIGN KEY ("MOVIETITLE", "MOVIEYEAR")
	  REFERENCES "MOVIE" ("TITLE", "YEAR") ON DELETE CASCADE ENABLE
 /
  ALTER TABLE "STARSIN" ADD constraint stin_fk2 FOREIGN KEY ("STARNAME")
	  REFERENCES "MOVIESTAR" ("NAME") ON DELETE CASCADE ENABLE
/
  ALTER TABLE "STARSIN" ADD CHECK (gurantee >= 10000);
/
--------------------------------------------------
 CREATE TABLE "CARTOON"
  (	"TITLE" VARCHAR2(255),
	"YEAR" NUMBER(4),
	"VOICE" VARCHAR2(30),
	FOREIGN KEY ("TITLE", "YEAR")
	  REFERENCES "MOVIE" ("TITLE", "YEAR") ON DELETE CASCADE ENABLE
)
/
REM INSERTING into CARTOON
SET DEFINE OFF;
Insert into CARTOON (TITLE,YEAR,VOICE) values ('Little Mermaid',1970,'harrison ford');
Insert into CARTOON (TITLE,YEAR,VOICE) values ('Little Mermaid',1970,'dana carvey');
Insert into CARTOON (TITLE,YEAR,VOICE) values ('Little Mermaid',1970,'john travolta');
Insert into CARTOON (TITLE,YEAR,VOICE) values ('santa',1980,'carry');
Insert into CARTOON (TITLE,YEAR,VOICE) values ('ghost warrior',1973,'speaker');
Insert into CARTOON (TITLE,YEAR,VOICE) values ('computerScience',1966,'kakaotalk');

commit;
quit;
