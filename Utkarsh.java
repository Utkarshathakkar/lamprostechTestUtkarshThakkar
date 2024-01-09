/**
 * Utkarsh
 */
public class Utkarsh {
       public static int max(int a,int b){
            return (a>b)?a:b;
       }
       public static int problem(int w,int weight[],int value[],int n){
           if(n==0|| w==0){
            return 0;
           }
            if(weight[n-1]>w){
                  return problem(w, weight, value, n-1);
            }
            else{
                  return max(value[n-1]+problem(w-weight[n - 1], weight,value, n - 1), problem(w, weight, value, n - 1)); 
            }
       }
    public static void main(String[] args){
        int[] value={3,1,4};
        int[] weight={4,5,7};
        int w=5;
        int n=weight.length;
        int maxvalue=problem(w,weight,value,n);
        System.out.println(maxvalue);
    }
}