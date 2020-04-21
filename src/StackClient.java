public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stackList = new MyStack(5);
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        System.out.println("Array size: " +         stackList.size());
        stackList.push(5);
        while (!stackList.isEmpty()){
            System.out.println(stackList.pop());
        }
        stackList.push(6);
    }
}
