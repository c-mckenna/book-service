INSERT INTO PERSON (NAME, PHONE, EMAIL_ADDRESS) VALUES ('John Smith', '02 1234 4321', 'john@example.com');
INSERT INTO PERSON (NAME, PHONE, EMAIL_ADDRESS) VALUES ('Jane Smith', '0412 567 890', 'john@example.com');

INSERT INTO BOOK VALUES (1, 'The Pragmatic Programmer', '978-0201616224', 'Andrew Hunt, Dave Thomas');
INSERT INTO BOOK VALUES (2, 'Clean Code', '978-0132350884', 'Robert "Uncle Bob" Martin');
INSERT INTO BOOK VALUES (3, 'Test Driven Development: By Example', '978-0321146533', 'Kent Beck');

INSERT INTO PERSON_BOOKS VALUES (1, 1, 1);
INSERT INTO PERSON_BOOKS VALUES (2, 1, 2);
INSERT INTO PERSON_BOOKS VALUES (3, 2, 2);
INSERT INTO PERSON_BOOKS VALUES (4, 2, 3);