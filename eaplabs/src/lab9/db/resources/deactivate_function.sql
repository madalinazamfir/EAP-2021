DELIMITER $$
CREATE FUNCTION deactivate_user (i_email varchar(20))
    RETURNS int
    DETERMINISTIC
BEGIN
update user_entitlement.users
set is_active = 0
where email = i_email;
RETURN row_count();
END$$
DELIMITER ;

-- call function
SELECT * FROM laborator9_exemplu.contact;
