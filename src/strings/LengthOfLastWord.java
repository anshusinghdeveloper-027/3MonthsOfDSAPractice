package strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println("Length Of last Word : "+lenOfLastWord(str));

    }

    //Using split method
    public static Integer lenOfLastWord(String str){
        String [] strArr=str.split(" ");
        return strArr[strArr.length-1].length();

    }

    //optimized way
    public static Integer lengthCount(String s){
        Integer length=0;
        int i=s.length()-1;
        while(i>=0&&s.charAt(i)==' '){
            i--;
        }
        while(i>=0&&s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length;

    }
}
