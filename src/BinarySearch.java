public class BinarySearch {

    int searchInteger(int[] input, int target){
        int left = 0;
        int right = input.length - 1;
        int middle = 0;

        if (input[left] == target) return left;
        if (input[right] == target) return right;
        
        while (right > left){
            middle = (left+ right)/2;
            if (input[middle] == target) return middle;
            if (target > middle) left = middle;
            else right = middle;
        }
        return -1;
    }
    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.searchInteger(new int[]{-1,0,1}, 0));
    }
}
