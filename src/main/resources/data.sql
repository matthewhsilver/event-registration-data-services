insert into CUSTOMERS (NAME, EMAIL, PASSWORD) VALUES ('jsmith', 'jsmith@gmail.com', 'jsmith');
insert into CUSTOMERS (NAME, EMAIL, PASSWORD) VALUES ('lhamilton', 'lhamilton@gmail.com', 'lhamilton');
insert into CUSTOMERS (NAME, EMAIL, PASSWORD) VALUES ('bjones', 'bjones@gmail.com', 'bjones');

insert into EVENTS (CODE, TITLE, DESCRIPTION) VALUES ('JAVA14', 'New Features in Java 14', 'This webinar will cover new features in Java 14, such as records.');
insert into EVENTS (CODE, TITLE, DESCRIPTION) VALUES ('ANG10', 'Upgrading to Angular 10', 'This webinar will cover how to upgrade from Angular 6 and above to Angular 10 using a real world project.');
insert into EVENTS (CODE, TITLE, DESCRIPTION) VALUES ('DEVOPS', 'Introduction to DevOps', 'This webinar will cover what DevOps is and some technolgoies, such as Git, Jenkins, Docker and Kubernetes.');

insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES) VALUES (1, 1, '2020-06-05', 'Thanks for registering');
insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES) VALUES (2, 2, '2020-07-10', 'Thanks for registering');
insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES) VALUES (3, 3, '2020-07-21', 'Thanks for registering');
insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES) VALUES (2, 1, '2020-07-23', 'Thanks for registering');
insert into REGISTRATIONS (EVENT_ID, CUSTOMER_ID, REGISTRATION_DATE, NOTES) VALUES (3, 2, '2020-07-24', 'Thanks for registering');