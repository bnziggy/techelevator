-- 13. The directors of the movies in the "Harry Potter Collection" (4 rows)
SELECT DISTINCT person.person_name
FROM movie
INNER JOIN collection ON collection.collection_id = movie.collection_id
INNER JOIN person ON person.person_id = movie.director_id
WHERE (collection.collection_name LIKE '%Harry Potter%');
