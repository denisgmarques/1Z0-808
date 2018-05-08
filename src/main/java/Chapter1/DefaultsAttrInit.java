public class DefaultsAttrInit {
   private double db;
   private int it;
   private String st;
   private boolean bl;
   private float fl;
   private Object ob;
   private char ch;

   public static void main(String[] args) {
      DefaultsAttrInit d = new DefaultsAttrInit();

      System.out.println("double default is " + d.db);
      System.out.println("int default is " + d.it);
      System.out.println("String default is " + d.st);
      System.out.println("boolean default is " + d.bl);
      System.out.println("float default is " + d.fl);
      System.out.println("Object default is " + d.ob);
      System.out.println("char default is " + d.ch);
      System.out.println("char code of default char is " + (int) d.ch);
   }
}
