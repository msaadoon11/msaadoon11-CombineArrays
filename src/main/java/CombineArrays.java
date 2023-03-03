
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        // int a1 = arr1.length;
        // int a2 = arr2.length;
        // int res = a1+a2;        // you can use these variables assignment to make it easier writing the for loops, but not necessary. 
        int arrs = (arr1.length + arr2.length);
        int[] res = new int[arrs];
        
        for(int i=0; i<arr1.length; i++){
            res[i] = arr1[i];
        }
        for(int i=0; i<arr2.length; i++){
            res[arr1.length + i] = arr2[i];
        }
        return res;
    }
}
