class Solution {
    fun longestConsective(nums: IntArray): Int {
        var hashSet = HashSet<Int>(nums.size)
        for (num in nums) {
           hashSet.add(num)
        }
        var longestAccum: Int = 0
        for (num in hashSet) {
            if (!hashSet.contains(num-1)) {
                var currentNum = num
                var currentAccum = 1
                while (hashSet.contains(currentNum+1)) {
                    currentNum += 1
                    currentAccum += 1
                }
                longestAccum = Math.max(longestAccum, currentAccum)
            }
        }
        return longestAccum
    }
}