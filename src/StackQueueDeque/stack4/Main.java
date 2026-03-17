package StackQueueDeque.stack4;

import java.io.BufferedReader;
import java.io.IOException;

class StackObject {

    char [] stack = new char[101];
    int stackPointer = -1;

    public void push(char value) {
        if(stackPointer < stack.length - 1) {
            stackPointer += 1;
            stack[stackPointer] = value;
        }
    }

    public char pop(){
        char returnValue = 'n';
        if(stackPointer == -1) { return returnValue; }
        returnValue = stack[stackPointer];
        stackPointer -= 1;
        return returnValue;
    }

    public int checkCount(){
        return (stackPointer + 1);
    }

    public int isEmpty(){
        if(stackPointer == -1) { return 1; }
        return 0;
    }

    public char peek(){
        if(stackPointer >= 0) { return stack[stackPointer]; }
        return 'n';
    }
}

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        while (true) {

            String readLine = br.readLine();

            if (readLine.equals(".")) break;

            StackObject stack = new StackObject();
            boolean valid = true;

            for (int j = 0; true; j++) {

                char c = readLine.charAt(j);

                if (c == '.') break;

                if (c == '(' || c == ')' || c == '[' || c == ']') {

                    if (c == '(' || c == '[') {
                        stack.push(c);
                    } else {

                        if (stack.isEmpty() == 1) {
                            valid = false;
                            break;
                        }

                        if (c == ')' && stack.peek() == '(') {
                            stack.pop();
                        } else if (c == ']' && stack.peek() == '[') {
                            stack.pop();
                        } else {
                            valid = false;
                            break;
                        }
                    }
                }
            }

            if (valid && stack.checkCount() == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}