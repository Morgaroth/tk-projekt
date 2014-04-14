grammar Regulars;

start : simple_regex;



regex   : regex '|' simple_regex
        | simple_regex
        ;

simple_regex    : basic_regex simple_regex
                | basic_regex
                ;


basic_regex : star
            | plus
            | elementary_regex
            | one_or_none ;

star    : elementary_regex '*' ;

plus    : elementary_regex '+' ;

one_or_none : elementary_regex '?' ;



elementary_regex    : group
                    | any
                    | eos
                    | character
                    | set ;

group   : '(' regex ')' ;

any : '.' ;

eos :   '$' ;


set : positive_set
    | negative_set
    ;

positive_set    : '[' set_items ']'
                ;

negative_set    : '[^' set_items ']'
                ;

set_items   : set_items set_item
            | set_item
            ;

set_item    : range
            | character
            ;

range   : character '-' character
        ;


character   : ANONMETACHARACTER
            | '\'' METACHARACTER
            ;


ANONMETACHARACTER : '0' .. '9'
                  | 'a' .. 'z'
                  | 'A' .. 'Z'
                  ;

METACHARACTER   : '[' | ']'
                | '(' | ')'
                | '*' | '+'
                | '$' | '.'
                | '?' | '|'
                ;