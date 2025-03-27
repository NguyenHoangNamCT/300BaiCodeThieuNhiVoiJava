package code300BaiThieuNhi;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_2ChuoiCoChuaCungCacKyTu {

	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("hello", "ollhe"));     // true
        System.out.println(isAnagram("aabbcc", "abcabc"));   // true
        System.out.println(isAnagram("abcd", "abcde"));      // false
        System.out.println(isAnagram("xyz", "yxz"));        // true
        System.out.println(isAnagram("apple", "pale"));     // false
	}
	
	
	public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        int sizeS = s.length(), sizeT = t.length();
        
        if(sizeS != sizeT)
            return false;
        
        //thêm các ký tự vào map, nếu đã tồn tại thì tăng số lượng lên
        for(int i = 0; i < sizeS; i++){
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < sizeT; i++) {
        	//nếu không tìm thấy ký tự trong map hoặc số lượng ký tự đã hết mà
        	//trong chuổi t vẫn còn thì coi như không thỏa isAnagram
        	if(!map.containsKey(t.charAt(i)) || map.get(t.charAt(i))==0)
        		return false;
        	map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        return true;
    }

//	public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> mapS = new HashMap<>();
//        HashMap<Character, Integer> mapT = new HashMap<>();
//        int sizeS = s.length(), sizeT = t.length();
//        
//        if(sizeS != sizeT)
//            return false;
//        
//        for(int i = 0; i < sizeS; i++){
//        	mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0) + 1);
//        	mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
//        }
//        
//        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
//            if(entry.getValue() != mapT.get(entry.getKey()))
//        		return false;
//        }
//        return true;
//    }
	
	
//	public static boolean isAnagram(String s, String t) {
//        HashMap<Character, Integer> mapS = new HashMap<>();
//        HashMap<Character, Integer> mapT = new HashMap<>();
//        int sizeS = s.length(), sizeT = t.length();
//        
//        if(sizeS != sizeT)
//            return false;
//        
//        for(int i = 0; i < sizeS; i++){
//            if(mapS.containsKey(s.charAt(i))) {
//            	mapS.replace(s.charAt(i), mapS.get(s.charAt(i)) + 1);
//            }
//            else {
//            	mapS.put(s.charAt(i), 1);
//            }
//            
//            if(mapT.containsKey(t.charAt(i))) {
//            	mapT.replace(t.charAt(i), mapT.get(t.charAt(i)) + 1);
//            }
//            else {
//            	mapT.put(t.charAt(i), 1);
//            }
//        }
//        
//        for (Map.Entry<Character, Integer> entry : mapS.entrySet()) {
//            if(entry.getValue() != mapT.get(entry.getKey()))
//        		return false;
//        }
//        return true;
//    }

}
