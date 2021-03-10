 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String returnString = "";
        for(int i=0;i<numberOfStars;i++){
             returnString += "*";   
        }
        return returnString;
    }
    
    public static String getTriangle(int numberOfRows) {
        String returnString = "";
        for(int i=0;i<numberOfRows;i++){
             returnString += "*\n";   
        }
        return returnString;
    }


    public static String getSmallTriangle() {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                str = str.append("*");
            }
            str = str.append("\n");
        }
        return str.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder str = new StringBuilder();
        for(int i=0;i<9;i++){
            for(int j=0;j<=i;j++){
                str = str.append("*");
            }
            str = str.append("\n");
        }
        return str.toString();
    }
}
