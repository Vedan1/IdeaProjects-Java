    class dimagChala extends Exception{

    public  dimagChala(String s){
        super(s);
    }
}


public class ExceptionTest {
    public static void main(String[] args) {


        int i = 10;
        int j = 110;
        int sum;
        try {
            sum = i / j;
            if (sum==0)
                throw new dimagChala("dimagChala Please");
        }catch (dimagChala e){
            System.out.println("Exception Detected: "+e);
        }catch (Exception f){
            System.out.println("Anomaly Detected "+f);
        }
    }
}