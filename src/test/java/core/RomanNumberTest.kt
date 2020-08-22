package core

import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals


class RomanNumberTest{

    @Test(expected = IllegalArgumentException::class)
    fun invalid(){
        RomanNumber.parse("RRRR")
    }

    @Test
    fun zero(){
        assertEquals(0, RomanNumber.parse(""))
    }

    @Test
    fun one(){
        assertEquals(1, RomanNumber.parse("i"))
    }


    @Test
    fun caseInsensitive(){
        assertEquals(1, RomanNumber.parse("I"))
    }

    @Test
    fun five(){
        assertEquals(5, RomanNumber.parse("v"))
    }

    @Test
    fun ten(){
        assertEquals(10, RomanNumber.parse("x"))
    }

    @Test
    fun fifty(){
        assertEquals(50, RomanNumber.parse("l"))
    }

    @Test
    fun undred(){
        assertEquals(100, RomanNumber.parse("c"))
    }

    @Test
    fun fiveundred(){
        assertEquals(500, RomanNumber.parse("d"))
    }

    @Test
    fun thousand(){
        assertEquals(1000, RomanNumber.parse("m"))
    }

    @Test
    fun four(){
        assertEquals(4, RomanNumber.parse("iv"))
    }

    @Test
    fun eight(){
        assertEquals(8, RomanNumber.parse("viii"))
    }

    @Test
    fun nineteen(){
        assertEquals(19, RomanNumber.parse("xix"))
    }

    @Test
    fun thirteen(){
        assertEquals(13, RomanNumber.parse("xiii"))
    }


    @Test
    fun ninetinine(){
        assertEquals(99, RomanNumber.parse("xcix"))
    }

    @Test
    fun eightieight(){
        assertEquals(88, RomanNumber.parse("lxxxviii"))
    }

    @Test
    fun nineundredninetinine(){
        assertEquals(999, RomanNumber.parse("cmxcix"))
    }
}