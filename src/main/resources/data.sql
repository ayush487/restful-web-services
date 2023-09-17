INSERT INTO user_details (id, birth_date, name)
VALUES (10001, current_date(), 'Ranga');

INSERT INTO user_details (id, birth_date, name)
VALUES (10002, current_date(), 'Ravi');

INSERT INTO user_details (id, birth_date, name)
VALUES (10003, current_date(), 'Satish');

INSERT INTO user_details (id, birth_date, name)
VALUES (10004, current_date(), 'Ayush');

INSERT INTO post (id , DESCRIPTION, user_id)
VALUES (20001, 'I want to Learn AWS', 10001);

INSERT INTO post (id , DESCRIPTION, user_id)
VALUES (20002, 'I am visiting Goa Next Weak', 10003);
INSERT INTO post (id , DESCRIPTION, user_id)
VALUES (20003, 'I hate this Lgbt thing', 10004);

INSERT INTO post (id , DESCRIPTION, user_id)
VALUES (20004, 'Just met the person of my life <3', 10003);
INSERT INTO post (id , DESCRIPTION, user_id)
VALUES (20005, 'Why this rainbow capitalism so dense!', 10004);
