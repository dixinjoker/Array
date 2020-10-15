public class Main {

    public static void main(String[] args) {

        Array arr = new Array(20);
        for (int i=0 ; i<10 ;i++) {
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.addLast(3);
        arr.addLast(2);
        arr.addLast(3);
        arr.add(0,777);
        System.out.println(arr);

        arr.addFirst(-9);
        System.out.println(arr);

        int a = arr.get(1);
        System.out.println(a);

        System.out.println(arr.contains(777));

        System.out.println(arr.find(9));

        System.out.println(arr.remove(6));
        System.out.println(arr);

        System.out.println(arr.removeFirst());
        System.out.println(arr);

        System.out.println(arr.removeElement(3));
        System.out.println(arr);
    }
}
