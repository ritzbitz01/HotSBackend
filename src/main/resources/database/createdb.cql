create keyspace if not exists hotsbackend WITH replication = { 'class' : 'SimpleStrategy', 'replication_factor' : 1};

CREATE TABLE IF NOT EXISTS hotsbackend.build (
	heroname text,
	buildname text,
	level1talent text,
	level4talent text,
	level7talent text,
	level10talent text,
	level13talent text,
	level16talent text,
	level20talent text,
	PRIMARY KEY (heroname, buildname)
);

CREATE TABLE IF NOT EXISTS hotsbackend.hero (
	name text,
	nickname text,
	description text,
	damage int,
	utility int,
	survivability int,
	complexity int,
	type text,
	attackType text,
	PRIMARY KEY (name)
);

CREATE TABLE IF NOT EXISTS hotsbackend.talent (
	talentname text,
	tier text,
	description text,
	type text,
	PRIMARY KEY (talentname)
);

CREATE TABLE IF NOT EXISTS hotsbackend.ability (
	heroid text,
	abilityid text,
	description text,
	hotkey text,
	abilitytype text, 
	PRIMARY KEY (heroid, abilityid)
);
