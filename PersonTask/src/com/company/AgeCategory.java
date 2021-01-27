package com.company;

public class AgeCategory {
    public String Category(int age) {
        if (age>0 && age<=14)
            return "Children";
        else if (age>14 && age<=24)
            return "Youth";
        else if (age>24 && age<64)
            return "Adult";
        else if (age>=65)
            return "Senior";
        return null;
    }
}
