package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String T = String.valueOf(Math.abs(t));
        int sum = 0;
        for (int i = 0; i < T.length(); i++) {
             sum = Integer.parseInt(T.substring(i,i+1)) + sum;
        }
        System.out.println(sum);
    }
}
