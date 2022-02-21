-- 15. The title of the movie and the name of director for movies where the director was 
--also an actor in the same movie (73 rows)
SELECT movie.title, person.person_name
FROM movie
INNER JOIN person ON person.person_id = movie.director_id
INNER JOIN movie_actor ON movie_actor.actor_id = person.person_id;

