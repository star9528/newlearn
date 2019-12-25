public class PrimeNumber{
    public static void main(String[] args) {
        System.out.println("打印1-100之间的素数：");
        int i=1,j=1;
        while(i<101){
            for(j=2;j<=i;j++){
                if(i%j==0){
                break;
                }
           }
           if(j==i)
            System.out.println(i);
           i++;
        }
    }
}