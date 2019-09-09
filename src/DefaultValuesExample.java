
public class DefaultValuesExample {
    
    int v1;
    double v2;
    static boolean v3;
    static String v4;
    
    void show(){
        System.out.println(v1); //instance
        System.out.println(v2); //instance
        System.out.println(v3); //class
        System.out.println(v4); //class

    }
    
    public static void main(String[] args) {
        
        int i=1;
        System.out.println(i);
        
        
        System.out.println("Print Default Values: ");
        DefaultValuesExample ob=new DefaultValuesExample();
        ob.show();
    }
}
