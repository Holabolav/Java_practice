public class Min_Heap_practice {

    static class MinHeap {
        int[] arr;
        int size;
        int capacity;

        MinHeap(int c) {
            capacity = c;
            arr = new int[c];
            size = 0;
        }

        int parent(int i) {
            return (i - 1) / 2;
        }

        int left(int i) {
            return 2 * i + 1;
        }

        int right(int i) {
            return 2 * i + 2;
        }

        void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        void insert(int val) {

            if (size == capacity) {
                System.out.println("Heap Full");
                return;
            }

            int i = size;
            arr[size++] = val;

            while (i != 0 && arr[parent(i)] > arr[i]) {
                swap(i, parent(i));
                i = parent(i);
            }
        }

        int peek() {
            if (size == 0) {
                System.out.println("Heap Empty");
                return -1;
            }
            return arr[0];
        }

        int delete() {

            if (size == 0) {
                System.out.println("Heap Empty");
                return -1;
            }

            int min = arr[0];
            arr[0] = arr[size - 1];
            size--;

            heapifyDown(0);

            return min;
        }

        void heapifyDown(int i) {

            int smallest = i;
            int l = left(i);
            int r = right(i);

            if (l < size && arr[l] < arr[smallest]) {
                smallest = l;
            }

            if (r < size && arr[r] < arr[smallest]) {
                smallest = r;
            }

            if (smallest != i) {
                swap(i, smallest);
                heapifyDown(smallest);
            }
        }

        void printHeap() {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        MinHeap h = new MinHeap(10);

        h.insert(20);
        h.insert(10);
        h.insert(30);
        h.insert(5);
        h.insert(15);

        System.out.print("Heap: ");
        h.printHeap();

        System.out.println("Peek: " + h.peek());

        System.out.println("Deleted: " + h.delete());

        System.out.print("Heap After Deletion: ");
        h.printHeap();
    }
}