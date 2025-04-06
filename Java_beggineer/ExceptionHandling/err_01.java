// Exception handling in Java is a mechanism to handle runtime errors and maintain normal program flow. Java provides the try, catch, finally, throw, and throws keywords for handling exceptions


class err_01 {
    public static void main(String[] args) {
         int a=10,b=0;

         try{
           int c=a/b;


         }
         catch(ArithmeticException e){
            System.out.println("this line shows you error " + e.getMessage());

         }

         System.out.println("all done");
        
    }

}
