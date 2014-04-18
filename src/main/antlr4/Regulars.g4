grammar Regulars;

start : regex;

regex   : simple_regex ('|' simple_regex)*
        ;

simple_regex    : basic_regex*
                ;

basic_regex : star
            | plus
            | elementary_regex
            | one_or_none ;

one_or_none : elementary_regex '?' ;

star    : elementary_regex '*'+ ;

plus    : elementary_regex '+'+ ;

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

set_items   : set_item*
            ;

set_item    : (range | character)
            ;

character   : nonmetacharacter
            | metacharacter
            ;

range   : nonmetacharacter '-' nonmetacharacter
        ;

metacharacter   : '\'' METACHARACTER
                ;

nonmetacharacter    : ANONMETACHARACTER
                    ;

ANONMETACHARACTER : '0' .. '9'
                  | 'a' .. 'z'
                  | 'A' .. 'Z'
                  ;

METACHARACTER   : '[' | ']'
                | '(' | ')'
                | '*' | '+'
                | '?' | '|'
                ;