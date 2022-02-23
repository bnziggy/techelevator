-- 1 event
INSERT INTO event (
	name
	, description
	, startdate
	, starttime
	, duration
	, grouprunningevent
)
VALUES ('Smash Bros Tourney', 'Who is the best at Smash Bros?', '2022-02-22', '12:00', '45', 1);

-- 2 event
INSERT INTO event (
	name
	, description
	, startdate
	, starttime
	, duration
	, grouprunningevent
)
VALUES ('LoL Tourney', 'Who is the best at League of Legends?', '2022-02-22', '12:00', '90', 1);

-- 3 event
INSERT INTO event (
	name
	, description
	, startdate
	, starttime
	, duration
	, grouprunningevent
)
VALUES ('AoT Watch Party', 'Watching the episodes of Attack on Titan', '2022-02-22', '12:00', '35', 2);

-- 4 event
INSERT INTO event (
	name
	, description
	, startdate
	, starttime
	, duration
	, grouprunningevent
)
VALUES ('Soccer Tourney', 'Tournement to see who is best at soccer', '2022-02-22', '12:00', '90', 3);

SELECT *
FROM event;