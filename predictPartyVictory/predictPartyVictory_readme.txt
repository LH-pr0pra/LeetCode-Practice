Assume that there are two parties, each represented by a single character.
You are given a string with the frequency of each character representing how
 many senators each party has.

Each turn, follow the string from left to right and have a senator choose:
1. Ban a senator from the opposite party. That senator is removed from play.
2. Call victory if only senators from one's own party remain.

Output the winning party's name.

1 <= senate.length <= 10000 

The LeetCode problem uses "Radiant" and "Dire" for examples;
this problem can be adapted for any two names given consistent rules.
Further optimization for more than two parties requires different
 decision-making.