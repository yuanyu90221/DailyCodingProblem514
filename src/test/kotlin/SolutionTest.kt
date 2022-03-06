import kotlin.test.Test
import kotlin.test.assertEquals

internal class SolutionTest {
    private val sol: Solution = Solution()
    @Test
    fun longestConsectiveExample1() {
        assertEquals(4, sol.longestConsective(intArrayOf(100, 4, 200, 1, 3, 2)))
    }
    @Test
    fun longestConsectiveExample2() {
        assertEquals(9, sol.longestConsective(intArrayOf(0, 3, 7, 2, 5, 8, 4, 6, 0, 1)))
    }
}