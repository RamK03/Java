package BasicProblems;

public class NewPattern {
    public static void main(String [] args){
        int n=6;
       char c='A';

        for(int j=1;j<=n;j++){
            for(int k=1;k<=n-j;k++){
                System.out.print(" ");

            }
            for(int l=1;l<=(2*j)-1;l++){
                if(l==1||l==((2*j)-1)||j==n) {
                    System.out.print(c);
                    c++;
                }else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
