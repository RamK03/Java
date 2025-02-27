package BasicProblems;

public class LeftPascal {
    public static void main(String []args){
        int i,j,k,m,n,l;
        for(i=1;i<=10;i++){
            for(j=10;j>=i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();

        }
        for(m=1;m<=10;m++){
            for(l=0;l<=m;l++){
                System.out.print(" ");
            }
            for(n=9;n>=m;n--){
                System.out.print(" *");
            }

          System.out.println();

        }
    }
}
