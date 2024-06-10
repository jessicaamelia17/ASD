package PRAKTIKUM07;

public class PostfixDemo {
    public static void main(String[] args) {
        String infix = "5*4^(1+2)%3";
        System.out.println("Infix: " + infix);
        String postfix = konversi(infix);
        System.out.println("Postfix: " + postfix);
        int hasil = hitungPostfix(postfix);
        System.out.println("Hasil: " + hasil);
    }

    public static boolean isOperand(char c){
        return ((c >= 'A' && c <='Z') || (c >= 'a' && c <= 'z')
        || (c >= '0' && c<= '9') || (c== ' ' && c== '.'));
    }

    public static boolean isOperator(char c){
        return (c == '^' || c =='%' || c == '/' || c=='*' || c=='-'|| c=='+');
    }
    public static int getDerajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }
    public static String konversi (String infix){
        Stack2 oprators = new Stack2 (infix.length());
        String postfix = "";
        char c;
        
        for (int i=0; i < infix.length(); i++){
            c = infix.charAt(i);
            
            if(isOperand(c)){
                postfix = postfix + c;
            } else if (c == '('){
                oprators.push(c);
            } else if ( c == ')'){
                while (oprators.peek() != '('){
                    postfix = postfix + oprators.pop();
                }

                oprators.pop();
            } else if (isOperator(c)){
                while (getDerajat(oprators.peek()) >= getDerajat(c)){
                    postfix = postfix + oprators.pop();
                }

                oprators.push(c);
            }
        }
        while (!oprators.isEmpty()){
            postfix += oprators.pop();        
        } 
        return postfix;
    }

    public static int hitungPostfix(String postfix) {
        Stack2 operands = new Stack2(postfix.length());
    
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (isOperand(c)) {
                operands.push((char) (c - '0'));
            } else if (isOperator(c)) {
                int operand1 = operands.pop();
                int operand2 = operands.pop();
                int result = 0;
                switch (c) {
                    case '+':
                        result = operand2 + operand1;
                        break;
                    case '-':
                        result = operand2 - operand1;
                        break;
                    case '*':
                        result = operand2 * operand1;
                        break;
                    case '/':
                        result = operand2 / operand1;
                        break;
                    case '%':
                        result = operand2 % operand1;
                        break;
                    case '^':
                        result = (int) Math.pow(operand2, operand1);
                        break;
                }
                operands.push((char) result);
            }
        }
        return operands.pop();
    }
    
}
