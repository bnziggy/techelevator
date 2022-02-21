-- 9. The titles of movies directed by James Cameron (6 rows)
SELECT movie.title
FROM movie
INNER JOIN movie_actor ON movie_actor.actor_id = movie.director_id
INNER JOIN person ON person.person_id = movie_actor.actor_id
WHERE person.person_name LIKE 'James Cameron';
