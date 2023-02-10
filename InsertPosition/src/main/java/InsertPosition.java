

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
         // Traverse an array
        while( start <= end ) {
            
            int mid = (start + end) / 2;
            
            //if target value found.
            if(nums[mid] == target) {
                return mid;
            }
            
            // If target value is greater then mid elements's value
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            
            //otherwise target value is less, 
             else {
                end = mid - 1;
            }
        }
        // Return the insertion position
        return end + 1;
    }
}
