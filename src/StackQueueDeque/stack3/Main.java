package StackQueueDeque.stack3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class StackObject {

    char [] stack = new char[1_000_001];
    int stackPointer = -1;

    /* Stack 구현 메소드 */
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

        int operationCount = Integer.parseInt(br.readLine());
        StackObject [] stacks = new StackObject[operationCount];

        for(int i = 0; i < operationCount; i++) {

            // 가로 입력 요청을 받아낼 객체를 선언.
            StackObject stack = new StackObject();
            
            // 실제 가로 요청 입력
            String readLine = br.readLine();

            // 응답 메시지 반환 명세 설정
            boolean valid = true;

            for(int j = 0; j < readLine.length(); j++) {
                
                char c = readLine.charAt(j);

                if(c == '('){
                    stack.push(c);
                } else {
                    if(stack.isEmpty() == 1) {
                        valid = false;
                        break;
                    }
                    stack.pop();
                }
            }

            // 순회 후 스택에 '('가 남아있으면 닫히지 않은 괄호 존재
            if (valid && stack.checkCount() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}