-- 6. The genres of "The Wizard of Oz" (3 rows)
SELECT genre.genre_name
FROM genre
INNER JOIN movie_genre ON movie_genre.genre_id = genre.genre_id
INNER JOIN movie ON movie.movie_id = movie_genre.movie_id
WHERE movie.title LIKE 'The Wizard of Oz';


