-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985 (20 rows)
SELECT DISTINCT person.person_name, person.birthday
FROM person
INNER JOIN movie_actor ON movie_actor.actor_id = person.person_id
INNER JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE (movie.release_date BETWEEN '1985-01-01' AND '1985-12-31') AND (person.birthday BETWEEN '1950-01-01' AND '1959-12-31');
