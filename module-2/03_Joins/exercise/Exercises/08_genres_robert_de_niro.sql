-- 8. The genres of movies that Robert De Niro has appeared in that were released in 2010 or later (6 rows)
SELECT DISTINCT genre.genre_name
FROM genre
INNER JOIN movie_genre ON movie_genre.genre_id = genre.genre_id
INNER JOIN movie ON movie.movie_id = movie_genre.movie_id
INNER JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
INNER JOIN person ON person.person_id = movie_actor.actor_id
WHERE person.person_name LIKE 'Robert De Niro' AND movie.release_date >= '2010-01-01';

