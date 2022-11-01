import java.util.*;

public class PhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        Map<Character, List<Character>> numberMap = new HashMap<>();
        numberMap.put('2', Arrays.asList('a','b','c'));
        numberMap.put('3', Arrays.asList('d','e','f'));
        numberMap.put('4', Arrays.asList('g','h','i'));
        numberMap.put('5', Arrays.asList('j','k','l'));
        numberMap.put('6', Arrays.asList('m','n','o'));
        numberMap.put('7', Arrays.asList('p','q','r','s'));
        numberMap.put('8', Arrays.asList('t','u','v'));
        numberMap.put('9', Arrays.asList('w','x','y','z'));

        for (int i = 0; i < digits.length();i++){
            if (i==0){
                for (Character C : numberMap.get(digits.charAt(i))){
                    output.add(C.toString());
                }
            } else {
                output = PhoneNumber.makeCombinations(output, numberMap.get(digits.charAt(i)));
            }
        }
        return output;
    }

     static List<String> makeCombinations(List<String> combinedNo, List<Character> newNo){
        List<String> response = new ArrayList<>();
        for (String accumulator :  combinedNo){
            for (Character newCh : newNo){
                response.add(accumulator+newCh);
            }
        }
        return response;
    }

    public static void main(String[] args){
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.letterCombinations("23"));
    }
}
