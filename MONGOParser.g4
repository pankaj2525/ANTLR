parser grammar MONGOParser;

options {
	tokenVocab = MONGOLexer;
}

root
:
	mongo_statements? EOF
;

mongo_statements
:
	mongo_statement
;

mongo_statement
:
	db_name DOT collection_name (OPEN_ROUND_BRACKET STRING CLOSE_ROUND_BRACKET)? DOT (INSERT  |ID) tYPE1
	| db_name DOT collection_name(OPEN_ROUND_BRACKET STRING CLOSE_ROUND_BRACKET)? DOT ID tYPE2
;
tYPE1: OPEN_ROUND_BRACKET  json_input  CLOSE_ROUND_BRACKET 
;
tYPE2:OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET array_input CLOSE_SQUARE_BRACKET CLOSE_ROUND_BRACKET
;
dml_statement
:
	insert_statements
	| update_statements
	| delete_statements
	| 
;

insert_statements
:
	insert_one_statement
	| insert_many_statement
	| insert_statement
;

update_statements
:
	update_one_statement
	| update_many_statement
	| update_statement
;

delete_statements
:
	delete_one_statement
	| delete_many_statement
;

insert_one_statement
:
	INSERTONE OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
;

insert_many_statement
:
	INSERTMANY OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET array_input
	CLOSE_SQUARE_BRACKET CLOSE_ROUND_BRACKET
;

insert_statement
:
	INSERT OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
	| OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET array_input CLOSE_SQUARE_BRACKET
	CLOSE_ROUND_BRACKET
;

update_one_statement
:
	UPDATEONE OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
;

update_many_statement
:
	UPDATEMANY OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET array_input
	CLOSE_SQUARE_BRACKET CLOSE_ROUND_BRACKET
;

update_statement
:
	UPDATE OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
	| OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET array_input CLOSE_SQUARE_BRACKET
	CLOSE_ROUND_BRACKET
;

delete_one_statement
:
	DELETEONE OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
;

delete_many_statement
:
	DELETEMANY OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
;

array_input
:
	object
	(
		COMMAR_CHAR object
	)*?
;

json_input
:
	object
	(
		COMMAR_CHAR object
	)?
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
	(STRING | ID ) ISTO_CHAR value
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
	| FORMATEDDATE
;






