CREATE TABLE sahibzaade(
   id int PRIMARY KEY  NOT NULL,
   name TEXT NOT NULL,
   birthDate TEXT NOT NULL,
   birthYear INT NOT NULL,
   birthLocation TEXT NOT NULL,
   martyredLocation TEXT NOT NULL,
   martyredYear INT NOT NULL,
   martyredAge INT NOT NULL
);

INSERT INTO sahibzaade (id, name, birthDate, birthYear, birthLocation,  martyredLocation, martyredYear, martyredAge)
VALUES (1, 'Baba Ajit Singh Ji','11th February', 1687, 'Poanta Sahib', 'Gurdwara Katalgarh Sahib in Chamkaur Sahiib', 1705, 18 );

INSERT INTO sahibzaade (id, name, birthDate, birthYear, birthLocation,  martyredLocation, martyredYear, martyredAge)
VALUES (2, 'Baba Jujhar Singh Ji','27th September', 1691, 'Anandpur Sahib', 'Gurdwara Katalgarh Sahib in Chamkaur Sahib', 1705, 15 );

INSERT INTO sahibzaade (id, name, birthDate, birthYear, birthLocation,  martyredLocation, martyredYear, martyredAge)
VALUES (3, 'Baba Zorawar Singh Ji','28th November', 1696, 'Anandpur Sahib', 'Fatehgarh Sahib in Sirhand', 1705, 9 );

INSERT INTO sahibzaade (id, name, birthDate, birthYear, birthLocation,  martyredLocation, martyredYear, martyredAge)
VALUES (4, 'Baba Fateh Singh Ji','12th December', 1699, 'Anandpur Sahib', 'Fatehgarh Sahib in Sirhand', 1705, 6 );
