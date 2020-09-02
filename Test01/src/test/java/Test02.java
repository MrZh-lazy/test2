import com.okbo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test02 {
    private static int total;
    public static void main(String[] args) {
        System.out.println(Factorial(6));
        System.out.println(total(3));
    }
    static long Factorial(int a) // 定义阶乘方法
    {
      /*  if (a == 0)
            return 1;
        else
            return a * Factorial(a - 1);*/
        if(a != 1){
            return a*Factorial(a-1);
        }
        else{
         return 1;
        }
    }

    static long total(int num) // 定义阶乘方法
    {
         total = num;
        if (num !=0 && num>2){
            total += num/2;
        }else {
            return num;
        }
        if (num>4){
            total += num/4;
        }

        return total+ total(total-num);
    }

}
