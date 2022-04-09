import java.util.List;


import java.util.*;
import java.lang.*;
import java.io.*;

public class Anagrams {
    public static String sortString(String s){
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        String sorted = "";
        for (Character character : set) {
            sorted += character;
        }
        return sorted;
    }

    public static List<List<String>>groupAnagrams(List<String> list){
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hashMap =  new HashMap<>();
        for(String s:list){
            String sorted = sortString(s);

            if(hashMap.containsKey(sorted)){
                hashMap.get(sorted).add(s);
            }
            else{
                List<String> ls = new ArrayList<>();
                ls.add(s);

                hashMap.put(sorted,ls);
            }
        }

        for(Map.Entry<String,List<String>> entry : hashMap.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        while(sc.hasNext()){
            list.add(sc.next());
        }

        List<List<String>> ans  = groupAnagrams(list);
        System.out.println(ans);
    }
}
