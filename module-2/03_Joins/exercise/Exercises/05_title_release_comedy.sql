-- 5. The titles and release dates of all the movies that are in the Comedy genre. 
--Order the results by release date, earliest to latest. (220 rows)
SELECT movie.title, movie.release_date
FROM movie
INNER JOIN movie_genre ON movie_genre.movie_id = movie.movie_id
INNER JOIN genre ON genre.genre_id = movie_genre.genre_id
WHERE genre.genre_name LIKE 'Comedy'
ORDER BY movie.release_date ASC;

