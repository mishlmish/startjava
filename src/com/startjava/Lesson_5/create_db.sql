CREATE DATABASE jaegers;

\c jaegers;

CREATE TABLE jaegers (
	id 				int,
	modelName		varchar(30),
	mark			varchar(30),
	height			real,
	weight			real,
	status			varchar(30),
	origin			varchar(30),
	launch			date,
	kaijuKill		int
);