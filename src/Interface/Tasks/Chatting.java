package Interface.Tasks;
interface Medium
{
    void text(String text);
}

class WhatsApp implements Medium
{
    public void text(String text)
    {
        System.out.println(text+"  from WhatsApp");
    }
}

class Facebook implements Medium
{
    public void text(String text)
    {
        System.out.println(text+" from Facebook");
    }
}

class Chatting
{
    public static void main(String args[])
    {
        Medium obj=new WhatsApp();
        obj.text("Good Morning");

        obj=new Facebook();
        obj.text("Good Morning");
    }
}