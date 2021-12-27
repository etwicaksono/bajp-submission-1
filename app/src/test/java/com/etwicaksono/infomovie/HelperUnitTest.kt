package com.etwicaksono.infomovie

import com.etwicaksono.infomovie.utils.getRuntime
import org.junit.Test

import org.junit.Assert.*


class HelperUnitTest {

    @Test
    fun getRuntime(){
        assertEquals("2h 5m",getRuntime(125))
    }

}