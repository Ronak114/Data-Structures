public class a79M_duplicates {
    public static void dupStr(String s,int idx,StringBuilder sb,boolean[] map){
        // base case
        if(idx == s.length()){
            System.out.println(sb);
            return;
        }
        //kaam
        char currchar = s.charAt(idx);
        if(map[currchar - 'a']==true){
            //dupliacte
            dupStr(s, idx+1, sb, map);
        }else{
            map[currchar - 'a'] = true;
            dupStr(s, idx+1, sb.append(currchar), map);
        }       
    }
    public static void main(String[] args) {
        dupStr("appnnacollege",0,new StringBuilder(""),new boolean[26]);
    }
}
