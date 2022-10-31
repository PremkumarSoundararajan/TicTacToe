import java.util.*;

public class TicTacToe {

    Character ticTacToeWinner(char[][] input) {

        Set<Character> valueByRows = new HashSet<>();
        Set<Character> valueByCols = new HashSet<>();
        Set<Character> valueByDiag1 = new HashSet<>();
        Set<Character> valueByDiag2 = new HashSet<>();

        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[i].length; j++){

                valueByRows.add(input[i][j]);

                valueByCols.add(input[j][i]);

                if (i ==j)  valueByDiag1.add(input[i][i]);

                if (i +  j  == input.length - 1) valueByDiag2.add(input[i][j]);
            }
            if (valueByRows.size() == 1) return valueByRows.iterator().next();
            valueByRows.clear();
            if (valueByCols.size() == 1) return valueByCols.iterator().next();
            valueByCols.clear();
        }
        if (valueByDiag1.size() == 1) return valueByDiag1.iterator().next();
        if (valueByDiag2.size() == 1) return valueByDiag2.iterator().next();

        return  null;
    }

    public static void main(String[] args){
        TicTacToe ticTacToe = new TicTacToe();
        char[][] row1WinnerX = new char[][]{
                {'X','X','X'},
                {'X','O','X'},
                {'O','X','O'}
        };
        System.out.println(ticTacToe.ticTacToeWinner(row1WinnerX));
    }

}
