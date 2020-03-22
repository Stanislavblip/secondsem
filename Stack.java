import java.util.Stack;

public class stack {
    Stack<Integer> st = new Stack<>();
    static void PUSH (Stack st) {
        int i= 1;
        int j = 2;
        int k = 3;
        int z = 4;
        int x = Math.abs(i)+ Math.abs(j) + Math.abs(k) + Math.abs(z);
        st.push(i);
        st.push(j);
        st.push(k);
        st.push(z);
        st.push(x);
        System.out.println("Stack:" +st);
    }
}
