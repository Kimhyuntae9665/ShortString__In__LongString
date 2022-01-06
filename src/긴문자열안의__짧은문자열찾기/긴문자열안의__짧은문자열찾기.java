package 긴문자열안의__짧은문자열찾기;

public class 긴문자열안의__짧은문자열찾기 {

	public static int count(String src,String target) {
		int count=0;
		int pos=0;
		
		//src의 위치부터 찾는다.
		//String.indexOf(String str,int pos) : String에서 str문자열이 있는 곳을 pos index에서 부터 찾는다.
		
		
		while(true) {
			pos = src.indexOf(target,pos);
			
			if(pos!=-1) {
				count++;
				pos+=target.length();
			}
			
			else {
				break;
			}
			 
		}
		
		return count;
		
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","AB"));
		System.out.println(count("12345","AB"));
		
	}

}
