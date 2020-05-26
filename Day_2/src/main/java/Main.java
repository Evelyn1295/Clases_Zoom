class Main {

    public static void main (String args[]){

        int a = 5;
        int b = 0;
        int d = 5;

        System.out.println("Primera prueba a / 0");
        try{
            System.out.println(divInt(a,b));
        }catch (ArithmeticException e){

        }
        /***
        System.out.println("Segunda prueba prueba a / d");

        try{
            System.out.println(divInt(a,d));
        }catch (ArithmeticException e){

        }

         **/
    }


    public static int divInt(int a, int b) {
        int c = 0;

        if(b == 0){
            throw new ArithmeticException();
        }
        return c = a/b;



    }
}
