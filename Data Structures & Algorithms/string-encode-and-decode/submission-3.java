class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs) {
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }
    // hello world this is ibrahim 
    // encoding 
    // 5#hello5#world3#this2#is7#ibrahim
    public List<String> decode(String str) {
    List<String> ls = new ArrayList<>();

    for (int i = 0; i < str.length();) {

        int j = str.indexOf('#', i);

        int c = Integer.parseInt(str.substring(i, j));

        String word = str.substring(j + 1, j + 1 + c);

        ls.add(word);

        i = j + 1 + c;
    }

        return ls;
    }
}
