        int aSum = 0;
        int bSum = 0;
        //boolean aTurn = true;
        
        //rewrite the calculation section
        int[] val2 = new int[aliceValues.length];
        int[] order = new int[aliceValues.length];
        for (int i = 0; i < aliceValues.length; i++) {
            order[i] = i;
            val2[i] = aliceValues[i] + bobValues[i];
        }
        //sort val2, reordering order[] to match
        int switchSort;
        int key;
        for (int i = 1; i < aliceValues.length; i++) {
            switchSort = val2[i];
            key = order[i];
            int j = i-1;
            while ((j >= 0) && (val2[j] > switchSort)) {
                val2[j+1] = val2[j];
                order[j+1] = order[j];
                j--;
            }
            val2[j+1] = switchSort;
            order[j+1] = key;
        }
        //iterate along order with Alice and Bob choosing points.
        for (int i = 0; i < order.length; i++) {
            //iterate along order, selecting values from the original
            if (i % 2 == 0) {
                //alice turn
                aSum += aliceValues[order[order.length - i - 1]];
            }
            else {
                //bob turn
                bSum += bobValues[order[order.length - i - 1]];
            }
        }
        
        //final return section
        if (aSum > bSum) {
            return 1;
        }
        else if (bSum > aSum) {
            return -1;
        }
        else {
            return 0;
        }