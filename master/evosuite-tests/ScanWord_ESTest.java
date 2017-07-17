/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 17 10:25:51 GMT 2017
 */


import org.junit.Test;
import static org.junit.Assert.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScanWord_ESTest extends ScanWord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)70;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      ScanWord scanWord0 = new ScanWord(bufferedInputStream0);
      int int0 = scanWord0.nextWord();
      assertEquals((-3), scanWord0.ttype);
      assertEquals((-3), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      ScanWord scanWord0 = new ScanWord(bufferedInputStream0);
      int int0 = scanWord0.nextWord();
      assertEquals((-1), scanWord0.ttype);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      ScanWord scanWord0 = new ScanWord(bufferedInputStream0);
      scanWord0.addKeyWord("", 48);
      int int0 = scanWord0.getKeyValue("");
      assertEquals(48, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)34);
      ScanWord scanWord0 = new ScanWord(bufferedInputStream0);
      int int0 = scanWord0.getKeyValue((String) null);
      assertEquals((-256), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      scanWord0.addKeyWord((String) null, 35);
      assertEquals(1, scanWord0.lineno());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)34);
      ScanWord scanWord0 = new ScanWord(bufferedInputStream0);
      scanWord0.closeStream();
      assertEquals(0.0, scanWord0.nval, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ScanWord scanWord0 = new ScanWord(byteArrayInputStream0);
      scanWord0.resetKeyWords();
      assertEquals((-257), ScanWord.ERROR);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ScanWord scanWord0 = new ScanWord(pipedInputStream0);
      scanWord0.setStringChar('M');
      assertEquals((-257), ScanWord.ERROR);
  }
}