package stringmanipulation;

public class StringManipulation {
    public String everyEvenCharacter(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<s.length();i+=2){
            builder.append(s.substring(i,i+1));
        }
        return builder.toString();
    }
}
