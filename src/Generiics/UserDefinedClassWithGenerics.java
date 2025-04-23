package Generiics;

public class UserDefinedClassWithGenerics
{
    public static void main(String[] args)
    {
        Eg<Integer> obj= new Eg<>();
        obj.setAge(3);
        System.out.println(obj);

        Graph g= new Graph("X",12344.3);
        Eg<Graph> ob=new Eg<>();
        ob.setAge(g);
        System.out.println(ob);

    }
}

class Eg<F>
{
    private F age;

    public void setAge(F age)
    {
        this.age =age;
    }

    public F getAge()
    {
        return age;
    }
    public String toString()
    {
        return ""+age;
    }
}


class Graph
{
    String axis;
    double coordinates;

    Graph(String axis, double coordinates)
    {
        this.axis=axis;
        this.coordinates=coordinates;
    }

    @Override
    public String toString()
    {
        return "Axis  :"+axis+"  coordinates :"+coordinates;
    }

}