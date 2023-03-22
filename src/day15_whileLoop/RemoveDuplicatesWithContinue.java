package day15_whileLoop;

public class RemoveDuplicatesWithContinue {
    public static void main(String[] args) {
        //        ------------first way------------------
/*
        String str = "aabbccccdddeeeeezzzzzzzz";
        for (int i = 0; i < str.length() ; i++) {
            str = str.substring(0,i+1) + str.substring(i+1).replace(""+str.charAt(i),"");
        }
        System.out.println(str);
*/
//        ------------second way------------------
        String str1 = "aabbccccdddeeeeezzzzzzzz";
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            if (result.contains(""+str1.charAt(i))) {
                continue;
            } else {
                result += str1.charAt(i);
            }

        }

        System.out.println(result);
    }
}

