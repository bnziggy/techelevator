-- 10. The names of directors who have directed a movie over 3 hours [180 minutes] (15 rows)
SELECT person.person_name
FROM person
INNER JOIN movie_actor ON movie_actor.actor_id = person.person_id
INNER JOIN movie ON movie.director_id = person.person_id
WHERE movie.length_minutes > '180';
