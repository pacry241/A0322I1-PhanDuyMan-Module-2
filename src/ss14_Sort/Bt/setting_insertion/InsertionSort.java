package ss14_Sort.Bt.setting_insertion;

public class InsertionSort {
    public static void insertionSort(int[] list){
        int n = list.length;
        for (int i = 1; i<n; i++){
            int key = list[i];
            int j = i -1;

            while (j>=0 && list[j]>key){
                list[j+1]= list[j];
                j-=1;
            }
            list[j+1]= key;
        }
    }

    public static void main(String[] args) {
        int myArr[] = {5,7,12,10,3,4,11};
        insertionSort(myArr);
        for (int i = 0; i<myArr.length;i++){
            System.out.print(myArr[i]+" ");
        }
    }
}
