/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 27 18:29:05 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScanWord_ESTest extends ScanWord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-3);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      int int0 = scanWord0.nextWord();
      assertEquals(6, byteArrayInputStream0.available());
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      int int0 = scanWord0.nextWord();
      assertEquals((-1), scanWord0.ttype);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      ScanWord scanWord0 = new ScanWord(pushbackInputStream0);
      scanWord0.addKeyWord("tw~kUeV.tt)E.", 0);
      int int0 = scanWord0.getKeyValue("tw~kUeV.tt)E.");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      int int0 = scanWord0.getKeyValue((String) null);
      assertEquals((-256), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)56;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      int int0 = scanWord0.nextWord();
      assertEquals(8.0, scanWord0.nval, 0.01);
      assertEquals((-2), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      scanWord0.closeStream();
      assertEquals((-258), ScanWord.STRING);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)47, 1754);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      scanWord0.resetKeyWords();
      assertEquals(0.0, scanWord0.nval, 0.01);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      scanWord0.setStringChar('}');
      assertEquals(0.0, scanWord0.nval, 0.01);
  }
}
