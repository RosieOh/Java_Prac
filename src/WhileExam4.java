// 1부터 10 사이에 있는 짝수만 출력하시오.

public class WhileExam4 {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if(i % 2 != 0)
                continue;
            System.out.println(i);
        }
    }
}
