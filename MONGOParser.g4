parser grammar MONGOParser;

options {
	tokenVocab = MONGOLexer;
}

mongo_statements
:
	mongo_statement
;

mongo_statement
:
	intialQuerry dml_statement
	(
		type1
		| type2
	)
	| intialQuerry aggregate_statement
	(
		type1
		| type2
	)
	| intialQuerry ID
	(
		type1
		| type2
	)
	
;

aggregate_statement
:
	AGGREGATE
;

intialQuerry
:
	db_name DOT collection_name
	(
		OPEN_ROUND_BRACKET STRING CLOSE_ROUND_BRACKET
	)? DOT
;

type1
:
	OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
;

type2
:
	OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET json_input CLOSE_SQUARE_BRACKET
	(
		COMMAR_CHAR OPEN_CURLY_BRACKET json_input CLOSE_CURLY_BRACKET
	)* CLOSE_ROUND_BRACKET
;

dml_statement
:
	insert_statements
	| update_statements
	| delete_statements
	| find_statements
;

find_statements
:
	FIND
;

insert_statements
:
	INSERT
	| INSERTMANY
	| INSERTONE
;

update_statements
:
	UPDATEONE
	| UPDATEMANY
	| UPDATE
;

delete_statements
:
	DELETEONE
	| DELETEMANY
;

json_input
:
	object
	(
		COMMAR_CHAR object
	)*?
;

db_name
:
	DB
;
//Restriction on Collection Names
//Collection names should begin with an underscore or a letter character, and cannot:

//contain the $.
//be an empty string (e.g. "").
//contain the null character.
//begin with the system. prefix. (Reserved for internal use.)

collection_name
:
	ID
;

json
:
	value
;

object
:
	OPEN_CURLY_BRACKET pair
	(
		COMMAR_CHAR pair
	)* CLOSE_CURLY_BRACKET
	| OPEN_CURLY_BRACKET CLOSE_CURLY_BRACKET
;

pair
:
	(
		STRING
		| ID
	) ISTO_CHAR value
;

array
:
	OPEN_SQUARE_BRACKET value
	(
		COMMAR_CHAR value
	)* CLOSE_SQUARE_BRACKET
	| OPEN_SQUARE_BRACKET CLOSE_SQUARE_BRACKET
;

value
:
	STRING
	| NUMBER
	| object
	| array
	| TRUE
	| FALSE
	| NULL
	| DATE
;






