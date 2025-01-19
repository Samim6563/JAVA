class Addition{
    int add(int a){
        return a;
    }
    
  int add(int a, int b){
      return a + b;
  }
    int add(int a, int b, int c){
        return a+b+c;
    }
    }
    public class main{
    public static void main(String[] args) {
        Addition ob=new Addition();
        System.out.println(ob.add(5));
        System.out.println(ob.add(5,10));
        System.out.println(ob.add(5,10,15));
    }
}