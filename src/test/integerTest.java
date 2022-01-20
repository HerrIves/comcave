package test;

public class integerTest {
  static int test01;

  public static void main(String[] args) {
    
    test01 = 32;
    System.out.println(test01);
    
    test01 = 0x123;
    System.out.println(test01);
    
    test01 = 0B010101;
    System.out.println(test01);
  }
  
}
