# Example 1:

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

execution(public * *(..))

in this example 

```
 modifiers-pattern  -> public
 ret-type-pattern   -> *
 declaring-type-pattern  ->  (not given as it is optional)
 name-pattern  ->   *
 param-pattern  ->  ..
 throws-pattern  ->  (not given as it is optional)
```

##################################

# Example 2

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

execution(* com.xyz.service.AccountService.*(..))

in this example 
```
 modifiers-pattern  -> (not given as it is optional)
 ret-type-pattern   -> *
 declaring-type-pattern  ->  com.xyz.service.AccountService
 name-pattern  ->   *
 param-pattern  ->  ..
 throws-pattern  ->  (not given as it is optional)
```

####################################

# Example 3

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

execution(* com.xyz.service.*.*(..))

in this example 
```
 modifiers-pattern  -> (not given as it is optional)
 ret-type-pattern   -> *
 declaring-type-pattern  ->  com.xyz.service.*.
 name-pattern  ->   *
 param-pattern  ->  ..
 throws-pattern  ->  (not given as it is optional)
```
####################################

# Example 4

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

execution(* com.xyz.service..*.*(..))

in this example 
```
 modifiers-pattern  -> (not given as it is optional)
 ret-type-pattern   -> *
 declaring-type-pattern  ->  com.xyz.service..*.
 name-pattern  ->   *
 param-pattern  ->  ..
 throws-pattern  ->  (not given as it is optional)
```
####################################

# Example 5

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

execution(public String com.baeldung.pointcutadvice.dao.FooDao.findById(Long))

in this example 
```
 modifiers-pattern  -> public
 ret-type-pattern   -> String
 declaring-type-pattern  ->  com.baeldung.pointcutadvice.dao.FooDao.
 name-pattern  ->   findById
 param-pattern  ->  Long
 throws-pattern  ->  (not given as it is optional)
```

####################################

# Example 6

execution(modifiers-pattern? ret-type-pattern declaring-type-pattern?name-pattern(param-pattern) throws-pattern?)

execution(* set*(..))

in this example 
```
 modifiers-pattern  -> (not given as it is optional)
 ret-type-pattern   -> *
 declaring-type-pattern  ->  (not given as it is optional)
 name-pattern  ->   set*
 param-pattern  ->  ..
 throws-pattern  ->  (not given as it is optional)
```

