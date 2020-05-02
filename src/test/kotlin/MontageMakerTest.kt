import junit.framework.Assert.assertEquals
import org.junit.Test

class MontageMakerTest {

    @Test
    fun createsAMontage(){
        val pictures = listOf(
            Picture(5, 2),
            Picture(5, 3)
        )
        val maker = MontageMaker(pictures, 10, 10)

        assertEquals(1, maker.montages.size)
        val montage = maker.montages.first()

        assertEquals(2, montage.pictures.size)
        assertEquals(10, montage.width)
        assertEquals(3, montage.height)

    }
}