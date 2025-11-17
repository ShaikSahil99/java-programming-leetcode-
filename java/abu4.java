class A{
     boolean m1(float d, String s){
     System.out.println(d);
     System.out.println(s);
     return true;
     
      }
     
     static void m2(boolean b,long g){
     System.out.println(b);
     System.out.println(g);
      }
     void m3(char c, int i){
     System.out.println(c);
     System.out.println(i);
     
      }
    public static void main(String[]args){
      A obj = new A();
      float A=12.5f;
      String S="Hi BRO";
      System.out.println(obj.m1(A,S));
      boolean N=true;
      long M=999l;
      m2(N,M);
      char C='+';
      int K=10;
      obj.m3(C,K);
      
      
      
      
}}
      
      