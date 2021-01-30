class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> asterL = new LinkedList<Integer>();
        for (int i = 0; i < asteroids.length; i++) {
            //if list is empty add an asteroid
            if (asterL.isEmpty()) {
                asterL.add(asteroids[i]);
            }
            else {
                if (asteroids[i] < 0) {
                    if (asterL.getLast() > 0) { //two on meeting path
                        if (asteroids[i] + asterL.getLast() == 0) { //if they are equal, single collision
                            asterL.removeLast();
                            //no continuing collisions, so no actions
                        }
                        else { //if unequal 
                            boolean broken = false;
                            while (!broken && ((!asterL.isEmpty()) && (asterL.getLast() > 0))) {
                                if ((0 - asteroids[i]) > asterL.getLast()) {
                                    asterL.removeLast();
                                }
                                else {
                                    broken = true;
                                    if (asteroids[i] + asterL.getLast() == 0) {
                                        asterL.removeLast();
                                        //no continuing collisions
                                    }
                                }
                            }
                            if (!broken) {
                                asterL.add(asteroids[i]); //it emptied the list before stopping
                            }
                        }
                    }
                    else { //no collision
                        asterL.add(asteroids[i]);
                    }
                }
                else { //no collision
                    asterL.add(asteroids[i]);
                }
            }
        }

        //return
        int[] result = new int[asterL.size()];
        //linked list iterator; use _.intValue()
        ListIterator listIter = asterL.listIterator(0);
        int aN = 0;
        while (listIter.hasNext()) {
            result[aN] = (int)listIter.next();
            aN++;
        }
        return result;
    }
}