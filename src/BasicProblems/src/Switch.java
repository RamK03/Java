package BasicProblems.src;
class Switch
{
    void weekDays()
    {
        int  m=2;
        switch(m)
        {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("only 7 days in a week");
        }
    }
    void multipleCondition() {
        int m=40;
        switch(m)
        {
            case int n when (n==100) ->System.out.println("O");
            case int n when (n>=90&&n<100) ->System.out.println("A");
            case int n when (n>=80&&n<90)->System.out.println("B");
            case int n when (n>=70&&n<80)->System.out.println("C");
            case int n when (n>=60&&n<50)->System.out.println("D");

            default ->System.out.println("F");
        }
    }

     void pattern1()
    {
        for (int i=1;i<=5;i++)
        {
            for(int j=1;j<=6;j++)
            {
                switch (i)
                {
                    case 1,5:
                        switch (j)
                        {
                            case 1,2,3,4,5:
                                System.out.print("* ");
                                break;
                        }
                        break;
                    case 2,3,4:
                        switch (j)
                        {
                            case 1,4:
                                System.out.print("* ");
                            case 2,3:
                                System.out.print("  ");
                                break;
                        }
                        break;
                }
            }System.out.println();
        }
    }


    public static void main(String args[])
    {
        Switch sc= new Switch();
        sc.pattern1();

    }
}
