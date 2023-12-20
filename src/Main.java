

public class Main {
    public static void main(String[] args) {

        CustomList customList =new CustomList(new int[]{8,2,6,3,1,7,11,5});

//        System.out.println(customList);
//        System.out.println(customList.indexOf(-8));
//        System.out.println(customList.lastIndexOf(3));
//        System.out.println( customList.get(3, 10));
//        System.out.println( customList.get(9));
//        customList.add(100);
//        System.out.println(customList);
//        int a= customList.pop();
//        System.out.println(a);
//        System.out.println(customList);
//                customList.remove(8);
//        System.out.println(customList);
//        customList.removeAll(3);
//        System.out.println(customList);
        customList.selectionSort();
System.out.println(customList);
//        customList.removeByIndex(2);
//        System.out.println(customList);
    }
}
