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
	intialQuerry
	(
		collection_methods
	)
	(
		DOT collection_methods
	)*
;

cursor_methods
:
	TEXT OPEN_ROUND_BRACKET CLOSE_ROUND_BRACKET
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

document
:
	OPEN_ROUND_BRACKET json_input CLOSE_ROUND_BRACKET
;

document_array
:
	OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET json_input CLOSE_SQUARE_BRACKET
	(
		COMMAR_CHAR OPEN_CURLY_BRACKET json_input CLOSE_CURLY_BRACKET
	)* CLOSE_ROUND_BRACKET
;

collection_methods
:
	| single_doc_input_method document
	| multiple_doc_input_method document_array
	| single_or_multiple_doc_input_method
	(
		document
		| document_array
	)
	| aggregate_statement parameter
	| query_statements (
		document
		| document_array
		| parameter
	) (
		DOT cursor_methods
	)*
	| operations_input_method operations_input_method_input
	| other_methods parameter
;

operations_input_method_input
:
	OPEN_ROUND_BRACKET OPEN_SQUARE_BRACKET
	OPEN_CURLY_BRACKET
		(
			INSERTONE
			| UPDATEONE
			| UPDATEMANY
			| REPLACEONE
			| DELETEONE
			| DELETEMANY
		) ISTO_CHAR value CLOSE_CURLY_BRACKET
	(
		COMMAR_CHAR OPEN_CURLY_BRACKET
		(
			INSERTONE
			| UPDATEONE
			| UPDATEMANY
			| REPLACEONE
			| DELETEONE
			| DELETEMANY
		) ISTO_CHAR value CLOSE_CURLY_BRACKET
	)* CLOSE_SQUARE_BRACKET CLOSE_ROUND_BRACKET
	| OPEN_ROUND_BRACKET
	(
		OPEN_CURLY_BRACKET
		(
			INSERTONE
			| UPDATEONE
			| UPDATEMANY
			| REPLACEONE
			| DELETEONE
			| DELETEMANY
		) ISTO_CHAR value CLOSE_CURLY_BRACKET
	) CLOSE_ROUND_BRACKET
;

operations_input_method
:
	BULKWRITE
;

parameter
:
	OPEN_ROUND_BRACKET
	(
		value
		| json_input
		| OPEN_SQUARE_BRACKET json_input CLOSE_SQUARE_BRACKET
		(
			COMMAR_CHAR OPEN_CURLY_BRACKET json_input CLOSE_CURLY_BRACKET
		)*
	)* CLOSE_ROUND_BRACKET
;

other_methods
:
	TEXT
;

single_doc_input_method
:
	INSERTONE
	| UPDATEONE
	| DELETEONE
;

multiple_doc_input_method
:
	INSERTMANY
	| UPDATEMANY
	| DELETEMANY
;

single_or_multiple_doc_input_method
:
	INSERT
	| UPDATE
;

query_statements
:
	FIND
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
	TEXT
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
		| TEXT
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
	| TEXT
	| DATE
;






