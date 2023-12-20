import java.util.Arrays;

public class CustomList {
    private int[] list;

    public CustomList(int[] list) {
        this.list = list;
    }

    public CustomList() {
        this.list = new int[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }

    public int indexOf(int num) {
        for (int i = 0; i < this.list.length; i++) {
            if (num == this.list[i]) return i;
        }
        return -1;
    }

    public int lastIndexOf(int num) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (num == this.list[i]) return i;
        }
        return -1;
    }

    public int get(int index, int examp) {
        return (this.list.length - 1 < index || index < 0) ? examp : this.list[index];
    }

    public int get(int index) {
        return this.get(index, 0);
    }

    public void add(int num) {
        int[] arr = new int[this.list.length + 1];

        copyArray(this.list, arr);
        arr[arr.length - 1] = num;
        this.list = arr;
    }

    public int getMax() {
        int res = this.list[0];
        for (int elem : this.list) {
            if (elem > res) res = elem;
        }
        return res;
    }

    public int pop() {
        int[] arr = new int[this.list.length - 1];

        copyArray(this.list, arr);
        int res = this.list[this.list.length - 1];
        this.list = arr;
        return res;
    }

    private void copyArray(int[] init, int[] result) {
        int shorter = (init.length > result.length) ? result.length : init.length;

        for (int i = 0; i < shorter; i++) {
            result[i] = init[i];
        }
    }

    public void remove(int elem) {
        int index = indexOf(elem);
        removeByIndex(index);

    }

    private void shiftByIndex(int index) {
        for (int j = index; j < this.list.length - 1; j++) {
            this.list[j] = this.list[j + 1];
        }
    }

    public void removeRight(int elem) {
        int index = lastIndexOf(elem);
        removeByIndex(index);
    }

    public void removeAll(int elem) {
        int i = 0;
        while (i < this.list.length) {
            if (this.list[i] == elem) {
                shiftByIndex(i);
                this.pop();
            } else i++;
        }

    }

    public void removeByIndex(int index) {
        if (index >= 0 && index < this.list.length) {
            shiftByIndex(index);
            this.pop();
        }
    }

    public void removeAllByIndex(int index) {
        if (index >= 0 && index < this.list.length) {
            removeAll(this.list[index]);
        }
    }

    public void reverse() {

        for (int i = 0; i < this.list.length / 2; i++) {
            swap(i, this.list.length - 1 - i);
        }

    }

    public void bubleSort() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - i - 1; j++) {
                if (this.list[j] > this.list[j + 1]) swap(j, j + 1);

            }
        }
    }

    public void bubleSort(boolean desc) {
        // VARIANT 1 -проще написать)
//        bubleSort();
//        if(desc) reverse();
        //---------------------
        // VARIANT 2- более рационально на один for меньше
        if (desc) {
            for (int i = 0; i < this.list.length; i++) {
                for (int j = 0; j < this.list.length - i - 1; j++) {
                    if (this.list[j] < this.list[j + 1]) swap(j, j + 1);
                }
            }
        } else bubleSort();
    }

    public void selectionSort() {
        for (int i = 0; i < this.list.length; i++) {
            int max = this.list[0];
            int inMax = 0;

            for (int j = 0; j < this.list.length - i; j++) {
                if (max < this.list[j]) {
                    max = this.list[j];
                    inMax = j;
                }
            }
            swap(inMax, this.list.length - i - 1);
       }
    }

    public void selectionSort(boolean desc) {
        // VARIANT 1 -проще написать)
//        selectionSort();
//        if(desc) reverse();
        //---------------------
        // VARIANT 2- более рационально на один for меньше

        for (int i = 0; i < this.list.length; i++) {
            int min = this.list[0];
            int inMin = 0;

            for (int j = 0; j < this.list.length - i; j++) {
                if (min > this.list[j]) {
                    min = this.list[j];
                    inMin = j;
                }
            }
            swap(inMin, this.list.length - i - 1);
        }
    }

    private void swap(int index1, int index2) {
        int temp = this.list[index1];
        this.list[index1] = this.list[index2];
        this.list[index2] = temp;
    }
}
