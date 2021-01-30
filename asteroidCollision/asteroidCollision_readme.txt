Given an array of integers where the magnitudes represent size and the
 positive/negative represent direction of movement, return an array under the
 following rules:
1. Positive = move right, Negative = move left.
2. All speeds are equivalent.
3. If an asteroid moving right is left of one moving left (and vice versa)
    determine which (if either) survive the collision.
    a. larger mass survives.
    b. if mass equal, neither survive.
4. Two asteroids moving in the same direction never meet.