class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       
        int nums2Traversor=0;
        int nums1Traversor=0;
        List<Integer> result = new ArrayList<Integer>();
        while(nums1Traversor<nums1.length&&nums2Traversor<nums2.length){
            if(nums1[nums1Traversor]==nums2[nums2Traversor]){
                result.add(nums1[nums1Traversor]);
               nums2Traversor++;
                nums1Traversor++;
            }
            else if(nums1[nums1Traversor]<nums2[nums2Traversor]){
             nums1Traversor++;
            }
            else{
                nums2Traversor++;
            }
        }
int[] result1 = result.stream()
                      .mapToInt(Integer::intValue)
                      .toArray();
        
       return result1;
    }
}