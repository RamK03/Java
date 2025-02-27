package BasicProblems;

public class PascalPattern {
    public static void main(String [] args){
        for(int i=1;i<=8;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }


            System.out.println();
        }
        for(int k=7;k>=1;k--){
            for(int m=1;m<=k;m++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
