package BasicProblems;

public class EvenIndex
{
    void evenIndex()
    {
        int [] orgArray={1,2,3,4,2,45,4};

        for(int i=0;i<orgArray.length;i=i+3)
        {
                System.out.println(orgArray[i]);
        }
    }
    public static void main(String[] args)
    {

        EvenIndex ev=new EvenIndex();
        ev.evenIndex();
    }
}
