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
            int elem = this.list[i];
            this.list[i] = this.list[this.list.length - 1 - i];
            this.list[this.list.length - 1 - i] = elem;
        }

    }

    public void bubleSort() {
        for (int i = 0; i < this.list.length; i++) {
            for (int j = 0; j < this.list.length - i - 1; j++) {

                if (this.list[j] > this.list[j + 1]) {
                    int temp = this.list[j];
                    this.list[j] = this.list[j + 1];
                    this.list[j + 1] = temp;
                }
            }
        }
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
            int temp = this.list[this.list.length - i - 1];
            this.list[this.list.length - i - 1] = max;
            this.list[inMax] = temp;
        }

    }
}
//    Доделать метод selectionSort Реализовать замену местами максимального элемента и
//    последнего в обрабатываемом наборе.
//
//        Реализовать приватный метод swap Данный метод должен получить два целый
//        числа в качестве аргументов и заменить местами значения с этими индексами в списке list.
//
//        Примените этот метод в методах сортировки и в методе reverse.
//
//        Перегрузить метод bubbleSort Данный метод должен получить булевый пргумент desc.
//        Если true, то сортировка от большего к меньшему, если false, то от меньшего к большему
//
//        Перегрузить метод selectionSort Данный метод должен получить булевый пргумент desc.
//        Если true, то сортировка от большего к меньшему, если false, то от меньшего к большему