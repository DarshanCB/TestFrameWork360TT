package com.fx.telephonecomparator;

import org.apache.commons.lang.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.LinkedList;

public class TelephoneDialPadTest
{
    TelephoneDialPad utils = new TelephoneDialPad();

    @Test(priority = TestPriority.HIGH)
    public void testZeroDial() throws IOException
    {
        LinkedList<String> list = utils.retrieveCombinations("000");
        Assert.assertEquals(list.toString(), "[000]");
    }

    @Test(priority = TestPriority.HIGH)
    public void testZeroOneDial() throws IOException
    {
        LinkedList<String> list = utils.retrieveCombinations("01010101011");

        Assert.assertEquals(list.toString(), "[01010101011]");
    }

    //Test for the numbers between 2 to 9 having with single input
    @Test(priority = TestPriority.LOW)
    public void testSingleDigitDial() throws IOException
    {
        LinkedList<String> two = utils.retrieveCombinations("2");

        Assert.assertEquals(two.toString(), "[A, B, C]");

        LinkedList<String> three = utils.retrieveCombinations("3");

        Assert.assertEquals(three.toString(), "[D, E, F]");

        LinkedList<String> four = utils.retrieveCombinations("4");

        Assert.assertEquals(four.toString(), "[G, H, I]");

        LinkedList<String> five = utils.retrieveCombinations("5");

        Assert.assertEquals(five.toString(), "[J, K, L]");

        LinkedList<String> six = utils.retrieveCombinations("6");

        Assert.assertEquals(six.toString(), "[M, N, O]");

        LinkedList<String> seven = utils.retrieveCombinations("7");

        Assert.assertEquals(seven.toString(), "[P, Q, R, S]");

        LinkedList<String> eight = utils.retrieveCombinations("8");

        Assert.assertEquals(eight.toString(), "[T, U, V]");

        LinkedList<String> nine = utils.retrieveCombinations("9");

        Assert.assertEquals(nine.toString(), "[W, X, Y, Z]");
    }

    @Test(priority = TestPriority.LOW)
    public void test2DigitDial() throws IOException
    {
        LinkedList<String> list = utils.retrieveCombinations("23");

        Assert.assertEquals(list.toString(), "[AD, AE, AF, BD, BE, BF, CD, CE, CF]");
    }

    @Test(priority = TestPriority.LOW)
    public void test3DigitDial() throws IOException
    {
        LinkedList<String> list = utils.retrieveCombinations("234");

        Assert.assertEquals(list.toString(), "[ADG, ADH, ADI, AEG, AEH, AEI, AFG, AFH, AFI, BDG, BDH, BDI, BEG, " +
                "BEH, BEI, BFG, BFH, BFI, CDG, CDH, CDI, CEG, CEH, CEI, " +
                "CFG, CFH, CFI]");
    }

    @Test(priority = TestPriority.MEDIUM)
    public void test4DigitDial() throws IOException
    {
        LinkedList<String> list = utils.retrieveCombinations("5678");

        Assert.assertEquals(list.toString(), "[JMPT, JMPU, JMPV, JMQT, JMQU, JMQV, " +
                "JMRT, JMRU, JMRV, JMST, JMSU, JMSV, JNPT, JNPU, JNPV, JNQT, JNQU, JNQV, JNRT, JNRU, " +
                "JNRV, JNST, JNSU, JNSV, JOPT, JOPU, JOPV, JOQT, JOQU, JOQV, JORT, JORU, JORV, JOST, JOSU, " +
                "JOSV, KMPT, KMPU, KMPV, KMQT, KMQU, KMQV, KMRT, KMRU, KMRV, KMST, KMSU, KMSV, KNPT, KNPU, KNPV, " +
                "KNQT, KNQU, KNQV, KNRT, KNRU, KNRV, KNST, KNSU, KNSV, KOPT, KOPU, KOPV, KOQT, KOQU, KOQV, KORT, KORU, " +
                "KORV, KOST, KOSU, KOSV, LMPT, LMPU, LMPV, LMQT, LMQU, LMQV, LMRT, LMRU, LMRV, LMST, LMSU, LMSV, LNPT, " +
                "LNPU, LNPV, LNQT, LNQU, LNQV, LNRT, LNRU, LNRV, LNST, LNSU, LNSV, LOPT, LOPU, LOPV, LOQT, LOQU, LOQV, " +
                "LORT, LORU, LORV, LOST, LOSU, LOSV]");
    }

    @Test(priority = TestPriority.HIGH)
    public void testDigitWithZeroOneDial() throws IOException
    {
        LinkedList<String> list = utils.retrieveCombinations("15467011");

        Assert.assertEquals(list.toString(), "[1JGMP011, 1JGMQ011, 1JGMR011, 1JGMS011, 1JGNP011, 1JGNQ011, " +
                "1JGNR011, 1JGNS011, 1JGOP011, 1JGOQ011, 1JGOR011, 1JGOS011, 1JHMP011, 1JHMQ011, 1JHMR011, 1JHMS011, " +
                "1JHNP011, 1JHNQ011, 1JHNR011, 1JHNS011, 1JHOP011, 1JHOQ011, 1JHOR011, 1JHOS011, 1JIMP011, 1JIMQ011, " +
                "1JIMR011, 1JIMS011, 1JINP011, 1JINQ011, 1JINR011, 1JINS011, 1JIOP011, 1JIOQ011, 1JIOR011, 1JIOS011, " +
                "1KGMP011, 1KGMQ011, 1KGMR011, 1KGMS011, 1KGNP011, 1KGNQ011, 1KGNR011, 1KGNS011, 1KGOP011, 1KGOQ011, " +
                "1KGOR011, 1KGOS011, 1KHMP011, 1KHMQ011, 1KHMR011, 1KHMS011, 1KHNP011, 1KHNQ011, 1KHNR011, 1KHNS011, " +
                "1KHOP011, 1KHOQ011, 1KHOR011, 1KHOS011, 1KIMP011, 1KIMQ011, 1KIMR011, 1KIMS011, 1KINP011, 1KINQ011, " +
                "1KINR011, 1KINS011, 1KIOP011, 1KIOQ011, 1KIOR011, 1KIOS011, 1LGMP011, 1LGMQ011, 1LGMR011, 1LGMS011, " +
                "1LGNP011, 1LGNQ011, 1LGNR011, 1LGNS011, 1LGOP011, 1LGOQ011, 1LGOR011, 1LGOS011, 1LHMP011, 1LHMQ011, " +
                "1LHMR011, 1LHMS011, 1LHNP011, 1LHNQ011, 1LHNR011, 1LHNS011, 1LHOP011, 1LHOQ011, 1LHOR011, 1LHOS011, " +
                "1LIMP011, 1LIMQ011, 1LIMR011, 1LIMS011, 1LINP011, 1LINQ011, 1LINR011, 1LINS011, 1LIOP011, 1LIOQ011, " +
                "1LIOR011, 1LIOS011]");
    }




}
