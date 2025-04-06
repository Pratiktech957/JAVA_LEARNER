public class err_05 {
    public static void main(String[] args) {
        try{
            int a=14,b=2,c;
            c=a/b;
            System.out.println(c);

            int e []={10,20,30};
            System.out.println(e[0]);

            String str =null;
            System.out.println(str.toUpperCase());


        }

        catch(ArithmeticException e){
            System.out.println("a  number cant be divuide by a zero");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("beyond limit should not be go");

        }

        catch(Exception e){
            System.out.println("super class of the exception ");
        }

        finally{
            System.out.println("its the final block at any condtion its will be  run ");
        }

        System.out.println("no error");

        
    }

}
