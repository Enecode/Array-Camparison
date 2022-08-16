public class array {
    public static void main(String[] args) {
        String[] word1 = {"God", "is", "love", "Love"};
        String[] word2 = {"God", "is", "love", "Love"};
        boolean value = arrayEqual(word1, word2);
        System.out.println(value);
    }

    public static boolean arrayEqual(String[] arr1, String[] arr2){
        int count = 0;
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] == arr2[i]){
                    count++;
                }else{
                    break;
                }
            }
        }else{
            return false;
        }

        if (count == arr1.length)
            return true;
        else
            return false;
    }
}