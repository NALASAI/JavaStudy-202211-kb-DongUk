BEGIN
	INSERT INTO
		user_dtl(id, create_date, update_date)
	values
		(NEW.id, NOW(), NOW());
END