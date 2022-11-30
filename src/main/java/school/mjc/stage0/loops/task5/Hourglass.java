package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        boolean reverse = false;
        int start = 0;
        int end = height-1;
        for (int i=0; i < height; i++){
            if (end - start >= 0) {
                for (int j = 0; j < height; j++) {
                    if (j >= start && j <= end) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                if (reverse) {
                    start--;
                    end++;
                    System.out.println();
                }else{
                    start++;
                    end--;
                    System.out.println();
                }
            }else {
                reverse = true;
                if (height % 2 == 0){
                    start--;
                    end++;
                }else{
                    start -= 2;
                    end += 2;
                }
                for (int j = 0; j < height; j++) {
                    if (j >= start && j <= end) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                start--;
                end++;
                System.out.println();
            }
        }
    }
}
