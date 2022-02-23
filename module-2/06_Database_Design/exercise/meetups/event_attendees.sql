-- 1 event for member
INSERT INTO event_attendees (
	eventid
	, memberid
)
VALUES (1,1);

-- 2nd event for member
INSERT INTO event_attendees (
	eventid
	, memberid
)
VALUES (2,1);

--3rd event for member
INSERT INTO event_attendees (
	eventid
	, memberid
)
VALUES (4,1);

--4th event for member
INSERT INTO event_attendees (
	eventid
	, memberid
)
VALUES (5,1);

SELECT *
FROM event_attendees;