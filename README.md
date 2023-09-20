# Java-Strings
replace, select, selectReversed
## Project Description
There are three functions in this project. 
1. Function named **replace** takes a string s and two characters, c1 and c2, as input. The function aims to produce a fresh string where each instance of c1 within the original string s is substituted with c2. The resulting modified string should be returned as the output."
2. The **select** function is a static method designed to retrieve the i-th interval of characters from a given input string s. It operates with a 0-based indexing system, where i=0 corresponds to the first interval, i=1 to the second, and so on. This function also ensures that it works correctly even if the specified interval extends beyond the length of the input string.
3. The **selectReversed** function is a static method designed to retrieve the i-th interval of characters from a given input string s. Unlike the previous function, this function indexes the intervals starting from the end of the string s. Example: selectReversed("qwertyuiop", 3, 1) = "tyu" (the intervals are iop-tyu-wer-q and we want the second).

