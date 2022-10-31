
public class Zigzag {
    //PAYPALISHIRING
    String convertString(String s, int numRows){
        int col = 0;
        int chars = 0;
        int row =-1;
        char[][] formZigzag = new char[numRows][7];
        Boolean startFromTop = true;
        while (chars < s.length()){
            if (startFromTop == true){
                for (int i = 0 ; i < numRows && chars < s.length(); i++){
                    row++;
                    formZigzag[i][col] = s.charAt(chars);
                    chars++;
                }
                startFromTop = false;
            } else {
                while (row > 0) {
                    col++;
                    row--;
                    if (row != 0){
                        formZigzag [row][col] = s.charAt(chars);
                        chars++;
                    }
                }
                startFromTop = true;
                row =-1;
            }

        }
        StringBuilder SB = new StringBuilder();
        for (int i = 0; i < formZigzag.length; i++){
            for (int j = 0; j < formZigzag[i].length;j++){
                if (Character.isAlphabetic(formZigzag[i][j])){
                    SB.append(formZigzag[i][j]);
                }
            }
        }
        return  SB.toString();
    }

    public static void main(String[] args){
        Zigzag zigzag = new Zigzag();
        System.out.println(zigzag.convertString("A", 1));
    }


}
