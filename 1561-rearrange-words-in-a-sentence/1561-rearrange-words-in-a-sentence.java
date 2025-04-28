class Solution {
    public String arrangeWords(String text) {
        
        List<String> words = new ArrayList<>(Arrays.asList(text.toLowerCase().split(" ")));
        
        Collections.sort(words, (a , b) ->{

            // if(a.length() == b.length()){

            // }

            return a.length() - b.length();
        });

        words.set(0,Character.toUpperCase(words.get(0).charAt(0)) + words.get(0).substring(1));



        return String.join(" ", words);

    }
}