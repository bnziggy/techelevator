-- 2. The names and birthdays of actors in "The Fifth Element" (15 rows)
SELECT person.person_name, person.birthday
FROM person
INNER JOIN movie_actor ON movie_actor.actor_id = person.person_id
INNER JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE movie.title LIKE 'The Fifth Element';

