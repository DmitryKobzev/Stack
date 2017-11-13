public class Stack<Item>{
    private Node<Item> first;
    private  int n;
    private  static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }

    public Stack(){
        first = null;
        n = 0;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public Item peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        return first.item;
    }

    public int size(){
        return n;
    }

    public void push(Item item){
        Node<Item> oldfirst=first;
        first=new Node<Item>();
        first.item=item;
        first.next=oldfirst;
        n++;
    }
    public Item pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
        }
        Item item;
        item=first.item;
        first=first.next;
        n--;
        return item;
    }

    public static void main(String[] args) {
        Stack<Double> stack=new Stack<>();
        stack.push(5.1);
        System.out.println(stack.peek());
        stack.push(3.6);
        System.out.println(stack.peek());
        stack.push(7.8);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }
}
