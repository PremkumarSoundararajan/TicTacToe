import java.util.HashSet;
import java.util.Set;

public class TryPermutation {
    Set<String> possiblePermutations(String input){
        if (input == null || input.length() == 0 || input.isBlank() || input.isEmpty())
            return new HashSet<>();

        Set<String> response = new HashSet<>();
        for (int i = 0; i < input.length();i++){
            Character C = input.charAt(i);
            String stringNoC = input.substring(0, i) + input.substring(i+1, input.length());
            response.addAll(permMethod(C, stringNoC));
            response.addAll(permMethod(C, new StringBuilder(stringNoC).reverse().toString()));
        }
        return response;
    }

    Set<String> permMethod(Character C, String stringNoC){
        Set<String> permMethodOut = new HashSet<>();
        permMethodOut.add(C+stringNoC);
        for (int i = 0; i < stringNoC.length();i++){
            permMethodOut.add(stringNoC.substring(0, i+1) + C + stringNoC.substring(i+1, stringNoC.length()));
        }
        return permMethodOut;
    }

    public static void main(String[] args){
        TryPermutation tryPermutation = new TryPermutation();
        System.out.println(tryPermutation.possiblePermutations("ABC"));
        //output is [ACB, BCA, ABC, CBA, BAC, CAB]
    }
}
