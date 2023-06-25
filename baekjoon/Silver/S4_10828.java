import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        MyStack stack = new MyStack(n);

        for(int i = 0; i < n; i++){
            String input = br.readLine();
            String[] command = input.split(" ");

            switch (command[0]) {
                case "push":
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "pop":
                    bw.write(String.valueOf(stack.pop()) + "\n");
                    break;
                case "size":
                    bw.write(String.valueOf(stack.size()) + "\n");
                    break;
                case "empty":
                    bw.write(String.valueOf(stack.isEmpty()) + "\n");
                    break;
                case "top":
                    bw.write(String.valueOf(stack.top()) + "\n");
                    break;
            }
        }

        br.close();
        bw.close();
    }

    private static class MyStack{
        int top = -1;
        int[] stack;

        private MyStack(int n){
            stack = new int[n];
        }

        public void push(int value){
            stack[++top] = value;
        }

        public int pop(){
            if(isEmpty() == 1){
                return -1;
            }
            return stack[top--];
        }

        public int size(){
            return this.top + 1;
        }

        public int isEmpty(){
            return top < 0 ? 1 : 0;
        }

        public int top(){
            if(isEmpty() == 1){
                return -1;
            }
            return stack[top];
        }
    }
}
