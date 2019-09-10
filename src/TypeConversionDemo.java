
public class TypeConversionDemo {
    public static void main(String[] args) {

        //case-1 (types are same- no conversion required)
        int v1=10;
        double v2=22.15;
        //case-2-a(types are diff but no error)(implicit conversion)
        double v3=15;   //int->double
        long v4=5;      //int->long
        //case-2-b (types are diff but error-> possible loss of preicisions)
        //you can convert force fully (explicit conversion)
        //using cast operator
        int v5=(int)23.6;
        float v6=(float)21.45;
        //case-2-c (conversion not possible
        //double v7=(double)true;
        //boolean v8=1;
        
        
        //long v9=2.5f;
        
                                              
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
