package Interface;
import java.util.Arrays;
import java.util.function.Consumer;

public class Consumer_Interface
{
    Integer [] arr={2,3,4,4,};

    void accept()
    {
        Integer Consumer;
        Consumer<Integer[]> con=(arr)-> {
            for(int i=0;i< arr.length;i++)
            {
                arr[i]=arr[i]+6;
            }
        };
        con.accept(arr);
        System.out.println(Arrays.toString(arr));
    }

    void andThen1()
    {
      Consumer<Integer[]> nac=(a)->
      {
          for(int i=0;i<a.length;i++)
          {
              a[i]=i+3*5+1;
          }
      };
      Consumer<Integer[]> mac=(a)-> System.out.println(Arrays.toString(a));
      nac.andThen(mac).accept(arr);
    }

    public static void main(String[] args)
    {
        Consumer_Interface mn=new Consumer_Interface();
           mn.andThen1();
    }
}
