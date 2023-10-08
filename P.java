public class P {
    public static int count( int c){
        int a=31;
             while(c>0){
                if(((c>>a)&1)!=0||a==3){
                    break ;
                }
                a--;
             }
             return a;
    }
      public static void binary(int n){
        int a=P.count(n);
            for(int i=a; i>=0; i--){
                System.out.print(n>>i&1);
            }
        }
    public static void main (String []args){
            binary(5);
    }
}
