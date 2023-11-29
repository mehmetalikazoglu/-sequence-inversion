import java.util.Stack;

public class main {

        public static Stack<Integer> DiziTersYap(int dizi[]){
            Stack<Integer> stack =new Stack<>();
            Stack<Integer> stack2 =new Stack<>();
            for (int i=0; i<dizi.length ; i++){
                stack.push(dizi[i]);
            }
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            return stack2;

        }
        public static void main(String[] args) {
            int [] dizi={2,6,9,8,1,10};
            System.out.println(DiziTersYap(dizi));

        }
    }

