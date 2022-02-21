-- 4. The titles and taglines of all the movies that are in the Fantasy genre. 
--Order the results by title (A-Z) (81 rows)
SELECT movie.title, movie.tagline
FROM movie
INNER JOIN movie_genre ON movie_genre.movie_id = movie.movie_id
INNER JOIN genre ON genre.genre_id = movie_genre.genre_id 
WHERE genre_name LIKE 'Fantasy'
ORDER BY movie.title ASC;


