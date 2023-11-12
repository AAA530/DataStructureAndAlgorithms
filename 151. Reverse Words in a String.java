class Solution {
    public String reverseWords(String s) {

        List<String> words = new ArrayList<>();

        StringBuilder strBuild = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c==' '){
                if(strBuild.length() != 0){
                    words.add(strBuild.toString());
                    strBuild.setLength(0);
                }
                
            }else{
                strBuild.append(c);
            }
        }
        if(strBuild.length() != 0){
            words.add(strBuild.toString());
            strBuild.setLength(0);
        }


        StringBuilder answerString = new StringBuilder();
        for (int i = words.size() - 1; i >= 0; i--) {
            String word = words.get(i);
            answerString.append(word);
            answerString.append(" ");
        }    
        answerString.deleteCharAt(answerString.length() - 1);
        return answerString.toString();    
    }
}