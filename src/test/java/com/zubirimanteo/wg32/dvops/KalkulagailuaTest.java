package com.zubirimanteo.wg32.dvops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KalkulagailuaTest {

    @Test
    void oinarrizkoBatuketaTest() {
        Kalkulagailua kalk = new Kalkulagailua();

        int emaitza = kalk.batu(2, 3);

        assertEquals(4, emaitza,
                "2 + 3 batuketak 5 izan beharko luke");
    }

    void oinarrizkoKenketaTest() {
        Kalkulagailua kalk = new Kalkulagailua();

        int emaitza = kalk.kendu(10, 4);

        assertEquals(6, emaitza, "10 - 4 kenketaren emaitza 6 izan beharko luke");
    }

    void oinarrizkoBiderketaTest() {
        Kalkulagailua kalk = new Kalkulagailua();

        int emaitza = kalk.biderkatu(5, 5);

        assertEquals(25, emaitza, "5 x 5 biderketaren emaitza 25 izan beharko luke");
    }
}