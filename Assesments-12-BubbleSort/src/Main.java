public class Main {
    public static void main(String[] args) {
        // bubble sort bir sıralama algoritmasıdır .
        //listedeki elemanları sıralamak için kullanılır
        // öncelikle sırası gelen cifler karşılaştırılır ve yerleri değiştirilir en büyük sol tarafa doğru hareket eder

        int[] arr = {5,1,4,2,8};
        int n = arr.length;
        int temp = 0;

        for (int i = 0;i<n;i++){
            for(int j = 1 ; j < (n-1) ; j++){
                if(arr[j-1]>arr[j]){
                    // yer degistirme islemi
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}