-- 18. The average length of movies in the "Science Fiction" genre. Name the column 'average_length'.
-- (1 row, expected result around 110-120)
SELECT AVG(movie.length_minutes) AS average_length
FROM movie
INNER JOIN movie_genre ON movie_genre.movie_id = movie.movie_id
INNER JOIN genre ON genre.genre_id = movie_genre.genre_id
WHERE genre.genre_name LIKE 'Science Fiction';