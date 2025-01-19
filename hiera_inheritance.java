class car{
    void model(){
        System.out.println("Bugatti Chiron");
    }
}
 class car1 extends car{
    void model(){
        System.out.println("Ferrari LaFerrari");
    }
}
 class car2 extends car{
    void model(){
        System.out.println("Lamborghini Sian");
    }
}
public class hiera_inheritance {
    public static void main(String[] args) {
        car c=new car();
        car1 c1=new car1();
        car2 c2=new car2();
        c.model();
        c1.model();
        c2.model();
    }
    
}