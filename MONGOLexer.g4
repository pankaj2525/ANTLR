lexer grammar MONGOLexer;

//@lexer::members {
//public static final int MYSQLCOMMENT = 1;
//public static final ERRORCHANNEL= 2;
//}


// SKIP


// SKIP

SPACE
:
	[ \t\r\n]+ -> channel ( HIDDEN )
;
//SPEC_MYSQL_COMMENT:                  '/*!' .+? '*/' -> channel(MYSQLCOMMENT);
//COMMENT_INPUT:                       '/*' .*? '*/' -> channel(HIDDEN);
//LINE_COMMENT:                        ('-- ' | '#') ~[\r\n]* ('\r'? '\n' | EOF) -> channel(HIDDEN);


// Keywords
// Common Keywords

DB
:
	D B
;

INSERT
:
	I N S E R T
;

INSERTONE
:
	I N S E R T O N E
;

INSERTMANY
:
	I N S E R T M A N Y
;

UPDATE
:
	U P D A T E
;

UPDATEMANY
:
	U P D A T E M A N Y
;

UPDATEONE
:
	U P D A T E O N E
;

DELETEONE
:
	D E L E T E O N E
;

DELETEMANY
:
	D E L E T E M A N Y
;
// Identifiers

ID
:
	ALPHA_LITERAL
;

// DOUBLE_QUOTE_ID:                  '"' ~'"'+ '"';

REVERSE_QUOTE_ID
:
	'`' ~'`'+ '`'
;

STRING_USER_NAME
:
	(
		SQUOTA_STRING
		| DQUOTA_STRING
		| BQUOTA_STRING
		| ID_LITERAL
	) '@'
	(
		SQUOTA_STRING
		| DQUOTA_STRING
		| BQUOTA_STRING
		| ID_LITERAL
	)
;

LOCAL_ID
:
	'@'
	(
		[a-zA-Z0-9._$]+
		| SQUOTA_STRING
		| DQUOTA_STRING
		| BQUOTA_STRING
	)
;

GLOBAL_ID
:
	'@' '@'
	(
		[a-zA-Z0-9._$]+
		| BQUOTA_STRING
	)
;

// DATA TYPE Keywords

TINYINT
:
	T I N Y I N T
;

SMALLINT
:
	S M A L L I N T
;

MEDIUMINT
:
	M E D I U M I N T
;

INT
:
	I N T
;

INTEGER
:
	I N T E G E R
;

BIGINT
:
	B I G I N T
;

REAL
:
	R E A L
;

DOUBLE
:
	D O U B L E
;

FLOAT
:
	F L O A T
;

DECIMAL
:
	D E C I M A L
;

NUMERIC
:
	N U M E R I C
;

DATE
:
	D A T E
;

TIME
:
	T I M E
;

TIMESTAMP
:
	T I M E S T A M P
;

DATETIME
:
	D A T E T I M E
;

YEAR
:
	Y E A R
;

CHAR
:
	C H A R
;

VARCHAR
:
	V A R C H A R
;

BINARY
:
	B I N A R Y
;

VARBINARY
:
	V A R B I N A R Y
;

TINYBLOB
:
	T I N Y B L O B
;

BLOB
:
	B L O B
;

MEDIUMBLOB
:
	M E D I U M B L O B
;

LONGBLOB
:
	L O N G B L O B
;

TINYTEXT
:
	T I N Y T E X T
;

TEXT
:
	T E X T
;

MEDIUMTEXT
:
	M E D I U M T E X T
;

LONGTEXT
:
	L O N G T E X T
;

ENUM
:
	E N U M
;

// Charsets

CHARSET_REVERSE_QOUTE_STRING
:
	'`' CHARSET_NAME '`'
;

// Charsets

ARMSCII8
:
	A R M S C I I '8'
;

ASCII
:
	A S C I I
;

BIG5
:
	B I G '5'
;

CP1250
:
	C P '1' '2' '5' '0'
;

CP1251
:
	C P '1' '2' '5' '1'
;

CP1256
:
	C P '1' '2' '5' '6'
;

CP1257
:
	C P '1' '2' '5' '7'
;

CP850
:
	C P '8' '5' '0'
;

CP852
:
	C P '8' '5' '2'
;

CP866
:
	C P '8' '6' '6'
;

CP932
:
	C P '9' '3' '2'
;

DEC8
:
	D E C '8'
;

EUCJPMS
:
	E U C J P M S
;

EUCKR
:
	E U C K R
;

GB2312
:
	G B '2' '3' '1' '2'
;

GBK
:
	G B K
;

GEOSTD8
:
	G E O S T D '8'
;

GREEK
:
	G R E E K
;

HEBREW
:
	H E B R E W
;

HP8
:
	H P '8'
;

KEYBCS2
:
	K E Y B C S '2'
;

KOI8R
:
	K O I '8' R
;

KOI8U
:
	K O I '8' U
;

LATIN1
:
	L A T I N '1'
;

LATIN2
:
	L A T I N '2'
;

LATIN5
:
	L A T I N '5'
;

LATIN7
:
	L A T I N '7'
;

MACCE
:
	M A C C E
;

MACROMAN
:
	M A C R O M A N
;

SJIS
:
	S J I S
;

SWE7
:
	S W E '7'
;

TIS620
:
	T I S '6' '2' '0'
;

UCS2
:
	U C S '2'
;

UJIS
:
	U J I S
;

UTF16
:
	U T F '1' '6'
;

UTF16LE
:
	U T F '1' '6' L E
;

UTF32
:
	U T F '3' '2'
;

UTF8
:
	U T F '8'
;

UTF8MB3
:
	U T F '8' M B '3'
;

UTF8MB4
:
	U T F '8' M B '4'
;

UNDERSCORE
:
	'_'
;

DOT
:
	'.'
;

OPEN_ROUND_BRACKET
:
	'('
;

CLOSE_ROUND_BRACKET
:
	')'
;

OPEN_SQUARE_BRACKET
:
	'['
;

CLOSE_SQUARE_BRACKET
:
	']'
;

OPEN_CURLY_BRACKET
:
	'{'
;

CLOSE_CURLY_BRACKET
:
	'}'
;

ISTO_CHAR
:
	':'
;

COMMAR_CHAR
:
	','
;

TRUE
:
	'true'
;

FALSE
:
	'false'
;

NULL
:
	'null'
;

STRING
:
	'"'
	(
		ESC
		| ~["\\]
	)* '"'
;

NUMBER
:
	'-'? INT_NO '.' [0-9]+ EXP?
	| '-'? INT_NO EXP
	| '-'? INT_NO
;

KEYWORDS
:
	[$_]? [a-zA-Z] [a-zA-Z]*
;

FORMATEDDATE
:
	DATETYPE '(' CustomDate? ')'
;

DATETYPE
:
	(
		'new '
	)?
	(
		'ISO'
	)? 'Date'
;

CustomDate
:
	'"' YYYY '-' MM '-' DD T HH ':' MIN ':' SEC MILLISEC Z '"'
;

MILLISEC
:
	(
		'.' [0-9] [0-9] [0-9]
	)?
;

YYYY
:
	[0-9] [0-9] [0-9] [0-9]
;

MM
:
	[0-9] [0-9]
;

DD
:
	[0-9] [0-9]
;

HH
:
	[0-9] [0-9]
;

MIN
:
	[0-9] [0-9]
;

SEC
:
	[0-9] [0-9]
;

// Fragments for Literal primitives

fragment
CHARSET_NAME
:
	ARMSCII8
	| ASCII
	| BIG5
	| BINARY
	| CP1250
	| CP1251
	| CP1256
	| CP1257
	| CP850
	| CP852
	| CP866
	| CP932
	| DEC8
	| EUCJPMS
	| EUCKR
	| GB2312
	| GBK
	| GEOSTD8
	| GREEK
	| HEBREW
	| HP8
	| KEYBCS2
	| KOI8R
	| KOI8U
	| LATIN1
	| LATIN2
	| LATIN5
	| LATIN7
	| MACCE
	| MACROMAN
	| SJIS
	| SWE7
	| TIS620
	| UCS2
	| UJIS
	| UTF16
	| UTF16LE
	| UTF32
	| UTF8
	| UTF8MB4
;

fragment
EXPONENT_NUM_PART
:
	E '-'? DEC_DIGIT+
;

fragment
ID_LITERAL
:
	[a-zA-Z_$0-9]*? [a-zA-Z_$]+? [a-zA-Z_$0-9]*
;

fragment
KEY_LITERAL
:
;

fragment
ALPHA_LITERAL
:
	(
		[a-zA-Z_] [a-zA-Z_0-9]*
	)
	|
	(
		[a-zA-Z_] ~[$]
	)
;
fragment 
ALPHABETS
: [a-zA-z]
;
fragment
DQUOTA_STRING
:
	'"'
	(
		'\\' .
		| '""'
		| ~( '"' | '\\' )
	)* '"'
;

fragment
SQUOTA_STRING
:
	'\''
	(
		'\\' .
		| '\'\''
		| ~( '\'' | '\\' )
	)* '\''
;

fragment
BQUOTA_STRING
:
	'`'
	(
		'\\' .
		| '``'
		| ~( '`' | '\\' )
	)* '`'
;

fragment
HEX_DIGIT
:
	[0-9A-Fa-f]
;

fragment
DEC_DIGIT
:
	[0-9]
;

fragment
BIT_STRING_L
:
	'b' '\'' [01]+ '\''
;

// Letters

fragment
A
:
	[aA]
;

fragment
B
:
	[bB]
;

fragment
C
:
	[cC]
;

fragment
D
:
	[dD]
;

fragment
E
:
	[eE]
;

fragment
F
:
	[fF]
;

fragment
G
:
	[gG]
;

fragment
H
:
	[hH]
;

fragment
I
:
	[iI]
;

fragment
J
:
	[jJ]
;

fragment
K
:
	[kK]
;

fragment
L
:
	[lL]
;

fragment
M
:
	[mM]
;

fragment
N
:
	[nN]
;

fragment
O
:
	[oO]
;

fragment
P
:
	[pP]
;

fragment
Q
:
	[qQ]
;

fragment
R
:
	[rR]
;

fragment
S
:
	[sS]
;

fragment
T
:
	[tT]
;

fragment
U
:
	[uU]
;

fragment
V
:
	[vV]
;

fragment
W
:
	[wW]
;

fragment
X
:
	[xX]
;

fragment
Y
:
	[yY]
;

fragment
Z
:
	[zZ]
;

fragment
ESC
:
	'\\'
	(
		["\\/bfnrt]
		| UNICODE
	)
;

fragment
UNICODE
:
	'u' HEX HEX HEX HEX
;

fragment
HEX
:
	[0-9a-fA-F]
;

fragment
INT_NO
:
	'0'
	| [1-9] [0-9]*
;

// no leading zeros

fragment
EXP
:
	[Ee] [+\-]? INT_NO
;