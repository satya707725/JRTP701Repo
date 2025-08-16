class FirstProgram {
   public static void main(String[] args){
      System.out.println("First Program");
      FirstProgram.m1();
   }

   public static void m1(){
      System.out.println("M1 method");
   }

   public static void printCube(int num){
      int cube = num * num * num;
      System.out.println(cube);
   }
   public void printSquare(int num){
      int square = num * num;
      System.out.println(square);
   }
}