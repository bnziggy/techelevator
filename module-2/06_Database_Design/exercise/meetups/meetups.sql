--DROP TABLE IF EXISTS event_attendees;
--DROP TABLE IF EXISTS group_members;
--DROP TABLE IF EXISTS events;
--DROP TABLE IF EXISTS members;
--DROP TABLE IF EXISTS interest_groups;


CREATE TABLE members (
	memberid SERIAL NOT NULL PRIMARY KEY,
	lastname VARCHAR(64) NOT NULL,
	firstname VARCHAR(64) NOT NULL,
	email VARCHAR(64) NOT NULL,
	phone VARCHAR(12) NOT NULL,
	birthday DATE NOT NULL,
	wants_reminders BOOL NOT NULL
);

CREATE TABLE interest_groups (
	groupid SERIAL NOT NULL PRIMARY KEY,
	group_name VARCHAR(64) NOT NULL
);

CREATE TABLE events (
	eventid SERIAL NOT NULL PRIMARY KEY,
	name VARCHAR(64) NOT NULL,
	description VARCHAR(900) NOT NULL,
	startdate DATE NOT NULL,
	starttime TIME NOT NULL,
	duration INT NOT NULL CONSTRAINT duration_minimum CHECK ( duration >= 30 ),
	grouprunningevent INT NOT NULL CONSTRAINT fk_group REFERENCES interest_groups(groupid)
);

CREATE TABLE group_members (
	groupid INT NOT NULL CONSTRAINT fk_group REFERENCES interest_groups(groupid),
	memberid INT NOT NULL CONSTRAINT fk_member REFERENCES members(memberid)
);

CREATE TABLE event_attendees (
	eventid INT NOT NULL CONSTRAINT fk_event REFERENCES events(eventid),
	memberid INT NOT NULL CONSTRAINT fk_member REFERENCES members(memberid)
);