package ArrayElementAverage;

public class Main {

    public static void main(String[] args) {

        int[] arr = {15,7,5};
        double sumHarmonic = 0.0;

        for (int i : arr){
            sumHarmonic += (1.0 / i);
        }

        double avarage = arr.length / sumHarmonic  ;
        System.out.println(avarage);

    }
}
