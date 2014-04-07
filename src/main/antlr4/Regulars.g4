grammar Regulars;

start : regex ;


regex   : regex '|' simple_regex
        | simple_regex
        ;

simple_regex    : simple_regex basic_regex
                | basic_regex
                ;

basic_regex : star
            | plus
            | elementary_regex
            ;
star    : elementary_regex '*'
        ;

plus    : elementary_regex '+'
        ;

elementary_regex    : group
                    | any
                    | eos
                    | character
                    | set
                    ;

group   : '(' regex ')'
        ;

any : '.' ;

eos :   '$' ;

character   : anynonmetacharacter
            | '\'' metacharacter
            ;

set : positive_set
    | negative_set
    ;

positive_set    : '[' set_items ']'
                ;

negative_set    : '[^' set_items ']'
                ;

set_items   : set_item
            | set_item set_items
            ;

set_item    : range
            | character
            ;

range   : character '-' character
        ;

anynonmetacharacter : 'a'
                    ;

metacharacter   : 'w' | 'd'
                ;
