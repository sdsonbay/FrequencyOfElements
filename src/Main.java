import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        List<Integer> doubledElements = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            if(doubledElements.contains(array[i])){
                continue;
            }else{
                doubledElements.add(array[i]);
            }
        }

        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları");

        for(int i = 0; i < doubledElements.size(); i++){
            int counter = 0;

            for(int j = 0; j < array.length; j++){
                if(doubledElements.get(i) == array[j]){
                    counter++;
                }
            }

            System.out.println(doubledElements.get(i) + " sayısı " + counter + " kere tekrar edildi.");
        }

    }
}
