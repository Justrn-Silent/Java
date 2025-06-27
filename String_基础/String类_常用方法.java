package String_基础;
/*
char charAt(int index) 	 返回字符串中第index个字符

boolean equals(String other)  	如果字符串与 other 相等，返回 true;否则，返回 false。

boolean equalslgnoreCase(String other)  	如果字符串与 other 相等(忽略大小写),则返回 true;否则,返回false。

int indexOf(String str)  	返回从头开始查找第一个子字符串 str 在字符串中的索引位置。如果未找到子字符串 str，则返回-1。

lastindexOf()  	返回从未尾开始查找第一个子字符串 str在字符串中的索引位置。如果未找到子字符串 str，则返回-1。

int length()  	返回字符串的长度。

String replace(char oldChar,char newChar)  	返回一个新串,它是通过用 newChar 替换此字符串中出现的所有 oldChar 而生成的。

boolean startsWith(String prefix) 	 如果字符串以 prefix开始，则返回 true。

boolean endsWith(String prefix) 	 	如果字符串以 prefix结尾，则返回 true。

String substring(int beginindex) 	 	返回一个新字符串，该串包含从原始字符串 beginIndex 到串尾。

String substring(int beginindex,int endindex)  	返回一个新字符串，该串包含从原始字符串 beqinIndex 到串尾或endIndex-1的所有字符。

String toLowerCase()  	返回一个新字符串，该串将原始字符串中的所有大写字母改成小写字母。

String toUpperCase()   	返回一个新字符串，该串将原始字符串中的所有小写字母改成大写字母。

String trim()   	返回一个新字符串，该串删除了原始字符串头部和尾随空格。

*/	
public class String类_常用方法 {
	public static void main(String[] args) {
		String s ="abcd"; //0（a）1（b）2（c）3（d）
		System.out.println(s.charAt(0));  //a
	s.indexOf(0);
	}
	
}
