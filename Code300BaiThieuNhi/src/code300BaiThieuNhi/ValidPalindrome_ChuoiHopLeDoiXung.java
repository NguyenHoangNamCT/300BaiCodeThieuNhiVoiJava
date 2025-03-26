package code300BaiThieuNhi;

public class ValidPalindrome_ChuoiHopLeDoiXung {

	public static void main(String[] args) {
		// Các test case để kiểm tra hàm isPalindrome
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
        System.out.println(isPalindrome(" ")); // true (chuỗi rỗng sau khi làm sạch)
        System.out.println(isPalindrome("madam")); // true
        System.out.println(isPalindrome("hello")); // false
        System.out.println(isPalindrome("Was it a car or a cat I saw?")); // true
	}
	
	public static boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		int size = s.length();
		for(int i = 0; i < size; i++) {
			if(s.charAt(i) != s.charAt(size - i - 1))
				return false;
		}
		return true;
	}

}
