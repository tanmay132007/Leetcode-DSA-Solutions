import java.util.*;

class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                int totalLights = countOnes(hour) + countOnes(minute);

                if (totalLights == turnedOn) {
                    String minuteText;
                    if (minute < 10) {
                        minuteText = "0" + minute;   
                    } else {
                        minuteText = "" + minute;
                    }
                    result.add(hour + ":" + minuteText);
                }
            }
        }
        return result;
    }

 
    private int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num = num / 2;
        }
        return count;
    }
}