package ss03_Array_and_Method_Java.BaiTap.Connect_element_array;

public class MainConnectElement {
    public static void main(String[] args) {
        //khai báo và khởi tạo giá trị cho các phần tử của hai mảng array1 và array2
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        //biến length sẽ bằng độ dài của hai mảng cộng lại
        int length = array1.length + array2.length;
        // khai báo thêm một mảng mới result để lưu trữ hai mảng cần nối, với độ dài bằng length
        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }
        for (int element : array2) {
            result[pos] = element;
            pos++;
        }
        for(int element2 : result){
            System.out.print(element2 + " ");
        }
    }
}
