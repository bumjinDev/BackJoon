package StackQueueDeque.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {

    static int [] stack = new int[1_000_001];

    static int stackPointer = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = null;

        int operationCount = Integer.parseInt(br.readLine());
        String [] operations = new String[2];

        for(int i = 0; i < operationCount; i++) {

            st = new StringTokenizer(br.readLine());
            operations[0] = st.nextToken();

            if(operations[0].equals("1")) {
                operations[1] = st.nextToken();
            }

            switch (operations[0]) {

                case "1":
                    push(Integer.parseInt(operations[1]));
                    break;

                case "2":
                    System.out.println(pop());
                    break;

                case "3":
                    System.out.println(checkCount());
                    break;

                case "4":
                    System.out.println(isEmpty());
                    break;

                case "5":
                    System.out.println(peek());
                    break;
            }
        }
    }

    private static void push(int value) {

        if(stackPointer < stack.length - 1) {

            stackPointer += 1;
            stack[stackPointer] = value;
        }
    }

    private static int pop(){

        int returnValue = -1;

        if(stackPointer == -1) { return returnValue; }

        returnValue = stack[stackPointer];
        stackPointer -= 1;

        return returnValue;
    }

    private static int checkCount(){
        return (stackPointer + 1);
    }

    private static int isEmpty(){

        if(stackPointer == -1) { return 1; }
        return 0;
    }

    private static int peek(){

        if(stackPointer >= 0) { return stack[stackPointer]; }
        return -1;
    }
}