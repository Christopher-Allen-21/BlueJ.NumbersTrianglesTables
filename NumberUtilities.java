import java.lang.Math;


public class NumberUtilities {

    public static String getRange(int stop) {
        String returnString = "";
        for(int i=0;i<stop;i++){
            returnString += i;
        }
        return returnString;
    
    }

    public static String getRange(int start, int stop) {
        String returnString = "";
        for(int i=start;i<stop;i++){
            returnString += i;
        }
        return returnString;
    
    }


    public static String getRange(int start, int stop, int step) {
        String returnString = "";
        for(int i=start;i<stop;i=i+step){
            returnString += i;
        }
        return returnString;
    
    }

    public static String getEvenNumbers(int start, int stop) {
         String returnString = "";
        for(int i=start;i<stop;i++){
            if(i%2==0){
                returnString += i;
            }
        }
        return returnString;
    
    }


    public static String getOddNumbers(int start, int stop) {
         String returnString = "";
        for(int i=start;i<stop;i++){
            if(i%2==1){
                returnString += i;
            }
        }
        return returnString;
    
    }


    public static String getExponentiations(int start, int stop, int exponent) {
         String returnString = "";
        for(int i=start;i<stop;i++){
            returnString += Math.pow(i,exponent);
        }
        return returnString;
    
    }
}
