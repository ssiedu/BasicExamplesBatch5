
public class ForEachExampleThree {

    public static void add(int ar[]){
        int sum=0;
        
        for(int num:ar){
            sum=sum+num;
        }
        
        System.out.println(sum);
    }
    
    
    public static void main(String[] args) {

        int x[]={10,20,30,40,50};
        int y[]={1,2,3,4,5,6,7,8,9,10};
        int z[]={11,12,13};
        
        add(x);
        add(y);
        add(z);
        
    }
}
