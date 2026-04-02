package String;


/*
WAJP for below requirements:
i/p: mohan and sohan are here.
o/p: here are sohan and mohan

i/p: Hello Java
o/p: Java Hello
*/
public class Q56 {
    public static void printString(String str) {
        String[] arr=str.trim().split("\\s+");
        
        for(int i=0; i<arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(String.join(" ", arr));
    }
    public static void main(String[] args) {
        printString("mohan and sohan are here");
        printString("Hello Java");
    }
}
