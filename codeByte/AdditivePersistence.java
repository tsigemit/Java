public class AdditivePersistence {
    static int count=0;
    static int getAddPersistence(int num) {  
       int sum = 0;
       if(num>10)
          count++;
       while(num > 0){
          sum += num%10;
          num /= 10;
         }
         if(sum>9)
            getAddPersistence(sum);
    return count;
    }

    public static void main (String[] args) {
        // keep this function call here
        //Scanner s = new Scanner(System.in);
        System.out.println(getAddPersistence(2718));
        System.out.println(getAddPersistence(98));
    }
}