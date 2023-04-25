import io.mockk.every
import io.mockk.mockk
import org.junit.Test
import java.time.LocalDateTime
import kotlin.test.assertEquals

class DDDTest {

    @Test
    fun `it should start ddd's kata right now 🤓`(){
        val ddd = mockk<DDD>()

        every { ddd.start(any()) } returns "we're starting 🚀"

        val whenx = ddd.start(LocalDateTime.now())

        assertEquals(whenx, "we're starting 🚀")
    }

}

class DDD {
    fun start(whenx: LocalDateTime): String {
        return "better tomorrow?"
    }
}
