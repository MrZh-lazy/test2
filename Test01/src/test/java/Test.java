import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2, 5);

        Map<String, String> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();

        //Collections.sort(list);
        //Collections.reverse(list);
        int[] arr = new int[]{1,2,5,7,3};

        for(int i = 0 ;i<arr.length-1;i++){
            //第i趟比较
            for(int j = 0 ;j<arr.length-i-1;j++){
                //开始进行比较，如果arr[j]比arr[j+1]的值大，那就交换位置
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int i : arr) {
            System.out.println(i);
        }

        Collections.sort(list,(o1,o2)-> o2-o1);
        System.out.println(list);

        String cc = "1";

        int i = Integer.parseInt(cc);
        System.out.println(i);

        String a = "a";
        String b = "a";

        String s = new String("a");

        System.out.println(a.equals(s));

        System.out.println(IntStream.rangeClosed(1, 7).reduce((a1, b1) -> a1 * b1));
        System.out.println(IntStream.range(1, 7).reduce((a1, b1) -> a1 * b1));


    }
}
