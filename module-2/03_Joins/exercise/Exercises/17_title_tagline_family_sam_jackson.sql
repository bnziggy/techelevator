-- 17. The titles and taglines of movies that are in the "Family" genre and Samuel L. Jackson has acted in (4 rows)
SELECT movie.title, movie.tagline
FROM movie
INNER JOIN movie_genre ON movie_genre.movie_id = movie.movie_id
INNER JOIN genre ON genre.genre_id = movie_genre.genre_id 
INNER JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
INNER JOIN person ON person.person_id = movie_actor.actor_id
WHERE genre_name LIKE 'Family' AND person.person_name LIKE 'Samuel L. Jackson';

