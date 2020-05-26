
class Cadena {

    private int length;


    public Cadena(String c){

    }

    /**
     * Method thar convert a variable (String) to a variable (Integer)
     * Integer.parseInt (método la clase Objeto Integer)
     * */

    public int convertInt(String number){
        if(number == " "){
            throw new IllegalArgumentException();
        }
            return Integer.parseInt(number);
    }

    /***
    public int divInt(String a, String b){
        int aInt = convertInt(a);
        int bInt = convertInt(b);

        try{
            bInt = 0;

        }catch (Exception msg){
            System.err.println("Division por cero");
        }
        int c = aInt/bInt;

        return c;
    }
    **/

    public static int divInt(int a, int b) {
        int c = 0;

        if(b == 0){
            throw new ArithmeticException();
        }
        return c = a/b;

    }


}
