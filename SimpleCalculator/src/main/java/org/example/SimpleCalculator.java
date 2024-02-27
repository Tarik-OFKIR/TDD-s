package org.example;

public class SimpleCalculator {

    public  int  add(String s) {
        if(s.isEmpty()) return 0;
        int sum = 0;
        int sum2 = 0;
        String[] nums = s.split(",");
        for (String i:nums) {
            if(i.contains("\n")){
                String[] num2 = i.split("\n");
                for (String j:num2
                     ) {
                    if (j.isEmpty() | s.endsWith(",")) throw new IllegalArgumentException("Separator at the end not allowed: ");
                    sum2+=Integer.parseInt(j);
                }
            }else {
                sum+=Integer.parseInt(i);
            }
        }
        return sum+sum2;
    }


}
