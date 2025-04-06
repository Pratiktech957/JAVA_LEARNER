public class err_04 {
    public static void main(String[] args) {
        
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println("the number cant be divided by zero");

        }

        try{
            int arr[] = {10,20,30,40};
            arr[4]=45;
            System.out.println(arr[4]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index ke bahar mat jao");

        }
        System.out.println("Everything is ok");
    }
    
}
