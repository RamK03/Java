package Interface;


abstract class Example
{
    Example(){ System.out.println("I came");}
    void come()
    {
      
    }
    public static void main(String args[]){
         System.out.println("hi");
         Example obj=new Example(){};
        obj.come();



     }
}


//
//interface Pull
//{
//    default void pull()
//    {
//        System.out.println("Carrot");
//    }
//  //   void push();
//    default void pop()
//    {
//        System.out.println("Pine apple");
//    }
//
//}
//
//interface Push extends Pull
//{
//    int a=9;
//   default void pop()
//    {
//
//        System.out.println("guava");
//    }
//     default void push()
//     {
//         System.out.println("Apple");
//     }
//}
//////
//class Remove implements Pull
//{
//
//    public void pop()
//    {
//      //Pull.super.pop();
//        System.out.println("pomegranate");
//    }
//    public static void main(String[] args)
//    {
//        Pull obj=new Pull(){
//           public void push(){
//                System.out.println("Grapes");
//            }
//        };
//        Remove obj1=new Remove(){} ;
//        obj1.pop();
//        //obj.push();
//
//        obj.pull();
//     //   Pull.pop();
//
//    }
//
//
//
//}
