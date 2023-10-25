package arrays;

public class ReplaceWhiteSpace {
    public static void main(String[] args) {
        System.out.println(transformString("Mr Jonh Smith   "));
    }
    public static String transformString(String text){
        StringBuilder newText = new StringBuilder();

        for(char c : text.toCharArray()){
            if(c == ' '){
                newText.append("%20");
            } else {
                newText.append(c);
            }
        }

        return newText.toString();
    }

    public static String replaceWhiteSpaceWithRegex(String text){
        return text.replaceAll(" +", "%20");
    }
}
