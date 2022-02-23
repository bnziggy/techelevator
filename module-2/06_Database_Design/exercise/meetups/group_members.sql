-- 1st group members
INSERT INTO group_members (
	groupid
	, memberid
)
VALUES (1, 1);

INSERT INTO group_members (
	groupid
	, memberid
)
VALUES (1, 2);

-- 2nd group members
INSERT INTO group_members (
	groupid
	, memberid
)
VALUES (2, 3);

INSERT INTO group_members (
	groupid
	, memberid
)
VALUES (2, 4);

-- 3rd group members
INSERT INTO group_members (
	groupid
	, memberid
)
VALUES (3, 5);

INSERT INTO group_members (
	groupid
	, memberid
)
VALUES (3, 6);

SELECT *
FROM group_members;