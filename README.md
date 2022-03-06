# DailyCodingProblem514

## 題目描述

給定一個未排序的整數陣列，找出最長連續數列的長度。

舉例來說， 給定 [100, 4, 200, 1, 3, 2] ， 最長連續數列是 [1, 2, 3, 4] ， 所以最長長度是 4 。

實作的演算法需要符合時間複雜度為 O(n) 。

## 我的解法

要找出最長連續數列長度

先設定最長連續數列長度為 longestAccum = 0

利用 HashSet 先把所有數值先存入

接著把 HashSet 內部所有元素

找出不具有該元素值 - 1的元素(也就是最小值元素)

然後紀錄目前找到的值為 currentNum ， 目前累計長度為 currentAccum = 1

然後檢查 HashSet 中有沒有 currentNum + 1 ，如果有則把 currentNum 與 currentAccum 都各加 1

如果 HashSet 沒有 currentNum + 1 ， 則將 longestAccum 設定為 longestAccum 與 currentAccum 的最大值

當走訪完所有 HashSet 中元素

longestAccum 則為最長連續長度

## 程式碼

```kotlin
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
```