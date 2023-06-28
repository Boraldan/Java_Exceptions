public class Task6 {
    public static char pront(String str) throws java.io.IOException {
        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try{
            ch = pront("Введите символ");
        }catch (java.io.IOException e){
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }
        System.out.println("Вы нажали: " + ch);
    }
}
