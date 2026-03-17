package StackQueueDeque.stack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int [] stack = new int[1_000_001];

    static int stackPointer = -1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = null;

        int operationCount = Integer.parseInt(br.readLine());
        int inputValue = 0;

        for(int i = 0; i < operationCount; i++) {

            st = new StringTokenizer(br.readLine());
            inputValue = Integer.parseInt(st.nextToken());

            switch (inputValue) {

                case 0:     // 0 이라면 이전 수 pop
                    pop();
                    break;

                default:
                    push(inputValue);
            }
        }

        int sum = 0;

        for(int i = stackPointer; i >= 0; i--) {
            sum += stack[i];
        }

        System.out.println(sum);
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