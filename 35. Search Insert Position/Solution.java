class Solution {
    public int searchInsert(int[] nums, int target) {

        ArrayList<Integer> numArr = new ArrayList<>();

        for(int a: nums){
            numArr.add(a);
        }
        numArr.add(target);

        Collections.sort(numArr);
        int answer = numArr.indexOf(target);
        return answer;
        
    }
}