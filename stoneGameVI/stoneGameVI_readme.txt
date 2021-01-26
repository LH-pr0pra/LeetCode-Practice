Two people (Alice, Bob) play a game.

There is a pile of stones [n] before the two of them.
Alice goes first, taking a stone.
Bob then takes his turn, and that continues until the pile is empty.
Each stone has a point value assigned to it for each person;
i.e., Alice and Bob may have different point values for a single stone.

The program is passed aliceValues[n] and bobValues[n].
Assume both people play optimally.
Determine who ends up with more points under these conditions.
Return 1 for Alice > Bob, -1 for Bob > Alice, 0 for a draw.

1 <= n <= 100000
1 <= aliceValues[i],bobValues[i] <= 100

Notes on _inefficient
The stoneGameVI_inefficient.java file has a method that goes as follows:
1. Take turns between Alice and Bob
    a. Find the index of the largest sum of aliceValues[i] and bobValues[i]
    b. Using the above index, add their points to their sum
    c. Dynamic Programming step: change aliceValues[i] to zero
    d. DP step: change bobValues[i] to zero
2. Repeat the above until the pile is empty
3. Return the winner/draw
This method is inefficient due to the massive search-log and nested comparisons
 of sums from the input arrays

Notes on _stilltooslow
stoneGameVI_stilltooslow.java functions as follows:
1. Create a val2[n] array where each value [i] = aliceValues[i] + bobValues[i]
2. Create a order[n] array with values equal to their index.
3. Sort val2[] in descending order, while also making the same sort changes to
the values in order[]
4. Iterate along order, adding aliceValues[i] and bobValues[i] along order
5. Return the winner/draw
This method failed because with large input arrays the sorting algorithm
 becomes bogged down and takes too long

Notes on _
.java functions as follows:
1. Creates val2[n] array where each value [i] = aliceValues[i] + bobValues[i]
2. Takes turns from Alice to Bob
    a. with each step, find the largest value in val2[]
    b. at that index, take the sum for Alice or Bob with their own points
    c. set that index in val2[] to 0
3. Return the winner/draw