package chapter9;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class NativeTest {
    @BeforeEach
    public void setUp(){
      Native amirah = new Native();
      amirah.setNativeId("123456");
      amirah.setLastname("wummi");
    }

    @Test
    public void countNative(){
        Native amirah = new Native();
        assertEquals(1,amirah.countNative());
    }
    @Test
    public void findNative(){
        Native amirah = new Native();
        Native wimps[];
        Native paragons[] = new Native[4];
    }
    @Test
        public void checkNative(){

    }


}