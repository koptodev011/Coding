public class largest_number {
    public static void main(String[] args) {
       int max=0;
       int a[]={12,34,89,90};
       fun(a,max);
    }
    public static void fun(int a[],int max){
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
