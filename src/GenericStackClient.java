public class GenericStackClient {
    public static void stackOfInteger() {
        MyGenericStack<Integer> stackInt = new MyGenericStack<>();
        stackInt.push(10);
        stackInt.push(20);
        stackInt.push(30);

        System.out.println("Size before Pop : "+stackInt.size());
        System.out.println("Pop :");
        while(!stackInt.isEmpty()){
            System.out.println(stackInt.pop());
        }
        System.out.println("Size after Pop : "+stackInt.size());
    }

    public static void stackOfString(){
        MyGenericStack<String> stackStr = new MyGenericStack<>();
        stackStr.push("one");
        stackStr.push("two");
        stackStr.push("three");

        System.out.println("Size before Pop : "+stackStr.size());
        System.out.println("Pop :");
        while(!stackStr.isEmpty()){
            System.out.println(stackStr.pop());
        }
        System.out.println("Size after Pop : "+stackStr.size());
    }

    public static void main(String[] args) {
        System.out.println("1.Stack of Integer : ");
        stackOfInteger();

        System.out.println("2.Stack of String : ");
        stackOfString();
    }
}
