package BasicProblems;

public class SandGlassStar
{
    public static void main (String [] args){
        int i,j,k,l;
        for(i=1;i<=7;i++){
            for(k=1;k<=i;k++){
                System.out.print("  ");
            }
            for(j=6;j>=i;j--){
                System.out.print(" *");
            }
            for(l=5;l>=i;l--){
                System.out.print(" *");
            }
             System.out.println();
        }
        int q,w,e,r;
        for(q=1;q<=6;q++){
            for(w=6;w>=q;w--){
                System.out.print("  ");
            }
            for(e=1;e<=q;e++){
                System.out.print(" *");
            }
            for(r=2;r<=q;r++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
