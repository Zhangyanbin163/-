** public class T {
   
     _ public int add(int x,int y){
          return x+y;
      }
      public int divide(int x,int y){
          return x/y;
     }
     public static void main(String[] args) {
         int z=new T().add(3, 5);
         System.out.println(z);
     }
  
 }　
public class TTest {
   
      @Test
      public void testAdd() {
          fail("Not yet implemented");
     }
  
     @Test
     public void testDivide() {
         fail("Not yet implemented");
     }
  
 }　
public class TTest {
  
     @Test
     public void testAdd() {
         int z=new T().add(2, 4);
         //判断z==6,以往的assert
         assertEquals(6, z);
     }
  
    @Test
    public void testDivide() {
        //测试T类中的divide方法
        int z=new T().divide(8, 2);
        System.out.println(z);
    }
 
}
