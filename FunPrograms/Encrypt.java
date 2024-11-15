package FunPrograms;

public class Encrypt {
    public static void main(String args[]){
        //INSERT TEXT
        String text = "";
        System.out.println(text);

        char[] chars = text.toCharArray();

        for(char c : chars){
            c -= 1;
            System.out.print(c);
        }
    }
}




