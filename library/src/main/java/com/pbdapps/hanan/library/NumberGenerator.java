package com.pbdapps.hanan.library;

import java.util.ArrayList;

/**
 * Created by hanan on 11/08/2015.
 */
public class NumberGenerator {
    private int initalOrganCount = 10;
    private ArrayList<Integer> organList = new ArrayList<>();

    public NumberGenerator() {
        for (int i = 0; i < initalOrganCount; i++) {
            organList.add(i, i + 1);
        }
    }

    public void setInitialOrganCount(int count) {
        organList.clear();
        initalOrganCount = count;
        for (int i = 0; i < initalOrganCount; i++) {
            organList.add(i, i + 1);
        }
    }

    public int getRandomNonReoccurringNumber() {
        int result;
        if (!organList.isEmpty() && organList != null) {
            int randomIndex = (int) (organList.size() * Math.random());
            result = organList.get(randomIndex);
            organList.remove(randomIndex);
        } else {
            result = -1;
        }
        return result;
    }

    public int getRandomNumber() {
        int result;
        if (!organList.isEmpty() && organList != null) {
            int randomIndex = (int) (organList.size() * Math.random());
            result = organList.get(randomIndex);

        } else {
            result = -1;
        }
        return result;
    }
}
