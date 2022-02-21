-- 14. The names of actors who've appeared in the movies in the "Back to the Future Collection" (28 rows)
SELECT person.person_name
FROM movie
INNER JOIN collection ON collection.collection_id = movie.collection_id
INNER JOIN person ON person.person_id = movie_actor.actor_id
INNER JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
WHERE (collection.collection_name LIKE '%Back to the Future%');
