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

}
//Задание 1: Реализация метода removeByIndex для удаления элемента по индексу в пользовательском списке.
//
//        Описание задания: Вам необходимо разработать метод removeByIndex для
//        пользовательского списка (CustomList), который будет осуществлять удаление
//        элемента по указанному индексу.
//
//        Убедитесь, что метод обрабатывает ситуации с корректными и некорректными
//        индексами, а также что он корректно сдвигает и обновляет элементы списка после удаления.
//
//        Задание 2: Реализация метода removeAllByIndex для удаления всех элементов по индексу
//        в пользовательском списке.
//
//        Описание задания: Вам необходимо разработать метод removeAllByIndex для пользовательского
//        списка (CustomList), который будет осуществлять удаление всех элементов по указанному индексу.
//        Метод по указанному индексу находит значение и удаляет все вхождения данного значения.
//
//        Убедитесь, что метод обрабатывает ситуации с корректными и некорректными индексами, а также
//        что он корректно сортирует и обновляет элементы списка после удаления.