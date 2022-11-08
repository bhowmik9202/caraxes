# caraxes

#### branch : phase-01

model established.\
prepared for java based configuration for hibernate with maven.

org.hibernate\
Interface Session\
https://docs.jboss.org/hibernate/orm/3.5/javadocs/org/hibernate/Session.html

What exactly is a session in hibernate?\
https://stackoverflow.com/a/65462280

Object States in Hibernate’s Session\
https://www.baeldung.com/hibernate-session-object-states#:~:text=The%20Session%20interface%20is%20the,operations%2C%20and%20then%20close%20it
.

https://docs.jboss.org/hibernate/core/3.3/reference/en/html/session-configuration.html

https://stackoverflow.com/a/37975218

https://docs.jboss.org/hibernate/annotations/3.4/reference/en/html/ch01.html

#### branch : phase-02

added a particular dependency.\
https://stackoverflow.com/a/47412779

save() is done in this phase.

How to properly close and open a Hibernate session?\
https://stackoverflow.com/a/16594319

#### branch : phase-03

first level of explaining hibernate level 1 cache

Spring Boot - Caching Data - Introduction | Part 1 | Simple Programming\
https://www.youtube.com/watch?v=TiEpi92Whtg&ab_channel=SimpleProgramming

Spring Boot - Caching Data - EhCache | CacheManager | Part 2 | Simple Programming\
https://www.youtube.com/watch?v=BhhJ11p86zM&ab_channel=SimpleProgramming

````
query about to get fired....
16:18:11.243 [main] DEBUG org.hibernate.SQL - select movie0_.id as id1_0_0_, movie0_.imdb_rating as imdb_rat2_0_0_, movie0_.title as title3_0_0_, movie0_.year_of_release as year_of_4_0_0_ from movie movie0_ where movie0_.id=?
Hibernate: select movie0_.id as id1_0_0_, movie0_.imdb_rating as imdb_rat2_0_0_, movie0_.title as title3_0_0_, movie0_.year_of_release as year_of_4_0_0_ from movie movie0_ where movie0_.id=?

query about to get fired....
16:18:11.275 [main] DEBUG org.hibernate.SQL - select movie0_.id as id1_0_0_, movie0_.imdb_rating as imdb_rat2_0_0_, movie0_.title as title3_0_0_, movie0_.year_of_release as year_of_4_0_0_ from movie movie0_ where movie0_.id=?
Hibernate: select movie0_.id as id1_0_0_, movie0_.imdb_rating as imdb_rat2_0_0_, movie0_.title as title3_0_0_, movie0_.year_of_release as year_of_4_0_0_ from movie movie0_ where movie0_.id=?
````

here, query got fired twice, because two different id used as parameters.\
but if a single id has been used as parameter, then query would be fired once, because of default first level cache of
hibernate.

#### branch : phase-04

last level of explaining hibernate level 1 cache

````
query about to get fired....
17:16:30.740 [main] DEBUG org.hibernate.SQL - select movie0_.id as id1_0_0_, movie0_.imdb_rating as imdb_rat2_0_0_, movie0_.title as title3_0_0_, movie0_.year_of_release as year_of_4_0_0_ from movie movie0_ where movie0_.id=?
Hibernate: select movie0_.id as id1_0_0_, movie0_.imdb_rating as imdb_rat2_0_0_, movie0_.title as title3_0_0_, movie0_.year_of_release as year_of_4_0_0_ from movie movie0_ where movie0_.id=?

query about to get fired....
````

here, query got fired once, because single id has been used as parameter.\
here, hibernate L1 cache has been used by default.


















