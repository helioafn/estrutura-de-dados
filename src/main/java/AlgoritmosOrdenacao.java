public class AlgoritmosOrdenacao {
    public static void bubbleSort(int[] arr) {
        for (int contadorL = 0; contadorL < arr.length; contadorL++) {
            for (int contadorC = contadorL + 1; contadorC < arr.length; contadorC++) {
                if (arr[contadorL] > arr[contadorC]) {
                    int aux = arr[contadorL];
                    arr[contadorL] = arr[contadorC];
                    arr[contadorC] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 9, -1, 4, 10, 15, 9};
        for (int num : nums) {
            System.out.print(num + ", ");
        }

        bubbleSort(nums);
    }
}
