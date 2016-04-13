'''

This file is written for Python3

TO RUN THE PARSER: Once cd'd to the PLP5_2 folder, run
cat coffeeshops.txt | grep -v '^\s*$' | python PLYstarter.py


'''

tokens = ('HTMLTAGS', 'BODYTAGS', 'HEADTAGS', 'PARATAGS', 'TITLE', 'HEADING1', 'HEADING3', 'SITES', 'BREAKS', 'PHONE')
literals = [' ',]

# Tokens
t_HTMLTAGS  = r'(<html>|</html>|<HTML>|</HTML>)'
t_BODYTAGS  = r'(<body>|</body>|<BODY>|</BODY>)'
t_HEADTAGS  = r'(<head>|</head>|<HEAD>|</HEAD>)'
t_PARATAGS = r'(<p>|</\p>)'
t_TITLE = r'^<title>.*<\/title>$'
t_HEADING1 = r'^<h1>.*<\/h1>$'
t_HEADING3 = r'^<h3>.*<\/h3>$'
t_SITES = r'<a\shref.*'
t_BREAKS = r'<br>'

def t_PHONE(t):
    r'\d{3}\-\d{3}\-\d{4}'
    return t

def t_error(t):
    print("Illegal character '%s'" % t.value[0])
    t.lexer.skip(1)

# Build the lexer
import ply.lex as lex   # ply.lex comes from the ply folder in the PLY download.
lexer = lex.lex()

# Parsing rules

global time_step
time_step = 0

def p_start(t):
    '''start : HTMLTAGS
             | BODYTAGS
             | HEADTAGS
             | PARATAGS
             | TITLE
             | HEADING1
             | SITES
             | BREAKS
             | phone
             | name
    '''

    if t[1]:
        if t[1][0:7] == "<title>":
            print("The title of this HTML page is", t[1][7:-8], "\n")

def p_phone(t):
    'phone : PHONE'
    print("The phone number is", t[1], "\n")


def p_name(t):
    'name : HEADING3'
    t[0] = t[1][4:-5]
    print("The name of the coffee shop is", t[0])


def p_error(t):
    if t == None:
        print("Syntax error at '%s'" % t)
    else:
        print("Syntax error at '%s'" % t.value)

import ply.yacc as yacc   # ply.yacc comes from the ply folder in the PLY download.
parser = yacc.yacc()

while True:
    try:
        s = input('')
    except EOFError:
        break
    parser.parse(s)

# To run the parser do the following in a terminal window: echo "First Name : John~Last Name : Doe~Address : 123 Testing Way~City : Austin~State : TX~Zip Code : 78751~Email Address : john.doe@test.com~Phone Number : 512-784-7474" | tr "~" "\n" | grep -v '^\s*$' | python PLYstarter.py | sed "s/_~_/ test./"
