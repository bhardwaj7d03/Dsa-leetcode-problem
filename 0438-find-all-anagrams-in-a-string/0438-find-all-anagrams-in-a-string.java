class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>result=new ArrayList<>();
        HashMap<Character, Integer>pmap=new HashMap<>();
        for(char ch:p.toCharArray()) {
            pmap.put(ch,pmap.getOrDefault(ch,0)+1);//p=a1b1c1
        }
        HashMap<Character,Integer>smap=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            smap.put(ch,smap.getOrDefault(ch,0)+1);//s=given string-abbacaccaccaac
            if(i>=p.length()) {//agar s window size pattern=abc se bada ho to
                char leftchar=s.charAt(i-p.length());
                smap.put(leftchar,smap.get(leftchar)-1);//ek a2-a=a


                if(smap.get(leftchar)==0) {
                    smap.remove(leftchar);//because{a=0, b=1, c=1} != {b=1, c=1}

                }
            }
            if(smap.equals(pmap)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}




























                
            



            



