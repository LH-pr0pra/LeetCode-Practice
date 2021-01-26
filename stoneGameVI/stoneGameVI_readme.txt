Two people (Alice, Bob) play a game.

There is a pile of stones [n] before the two of them.
Alice goes first, taking a stone.
Bob then takes his turn, and that continues until the pile is empty.
Each stone has a point value assigned to it for each person;
i.e., Alice and Bob may have different point values for a single stone.

The program is passed aliceValues[n] and bobValues[n]. Assume both people play optimally.
Determine who ends up with more points under these conditions.
Return 1 for Alice > Bob, -1 for Bob > Alice, 0 for a draw.

1 <= n <= 100000
1 <= aliceValues[i],bobValues[i] <= 100