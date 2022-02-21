-- 21. For every person in the person table with the first name of "George", list the number of movies 
-- they've been in--include all Georges, even those that have not appeared in any movies. 
-- Display the names in alphabetical order. (59 rows)
-- Name the count column 'num_of_movies'
SELECT person.person_name, COUNT(movie.title) AS num_of_movies
FROM movie
INNER JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
INNER JOIN person ON person.person_id = movie_actor.actor_id AND person.person_id = movie.director_id
WHERE person.person_name LIKE 'George %'
GROUP BY person.person_name
ORDER BY person.person_name ASC;