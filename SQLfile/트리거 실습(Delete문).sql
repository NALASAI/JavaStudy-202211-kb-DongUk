BEGIN
	DELETE
	FROM
		user_dtl
	WHERE
		id = OLD.id;
END