import java.util.Arrays;

class BinarySearch {
 
    public int binarySearch(int[] inputArray, int search) {
         
        int start = 0;
        int end = inputArray.length - 1;
        int middle;
        while (start <= end) {
            middle = (start + end) / 2;
            if (search == inputArray[middle]) {
                return middle;
            }
             else if (search < inputArray[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }
}


class SearchDemo{
    public static void main(String[] args) {
         
        BinarySearch bsearch = new BinarySearch();
        int[] arrayInt = {2, 4, 6, 8, 10, 12, 14, 16,95,39,20,50,40};
        Arrays.sort(arrayInt);
        System.out.println("95 location: "+bsearch.binarySearch(arrayInt, 95));
        System.out.println("2 location: "+bsearch.binarySearch(arrayInt, 2));
        System.out.println("12 location: "+bsearch.binarySearch(arrayInt, 12));
    }
}
