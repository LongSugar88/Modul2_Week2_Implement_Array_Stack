public class MyStack {
    private int capacity;
    private int myArray[];
    private int currentSize;

    public MyStack(int size){
        myArray = new int[size];
        this.capacity = size;
    }

    public void push(int element){
        if(currentSize == capacity){
            throw new StackOverflowError("Array is full");
        } else{
            myArray[currentSize] = element;
            System.out.println("Element : " + element + " added");
            currentSize++;
        }
    }
    public int pop() throws Exception{
        if(currentSize == 0){
            throw new Exception("Array is empty");
        }
        System.out.println("Remove element: "+ myArray[currentSize-1]);
        currentSize--;
        return myArray[currentSize];
    }
    public int size(){
        return currentSize;
    }
    public boolean isFull(){
        if( currentSize == capacity){
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if( currentSize == 0){
            return true;
        } else {
            return false;
        }
    }



}
