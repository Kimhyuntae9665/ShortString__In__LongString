package �乮�ڿ�����__ª�����ڿ�ã��;

public class �乮�ڿ�����__ª�����ڿ�ã�� {

	public static int count(String src,String target) {
		int count=0;
		int pos=0;
		
		//src�� ��ġ���� ã�´�.
		//String.indexOf(String str,int pos) : String���� str���ڿ��� �ִ� ���� pos index���� ���� ã�´�.
		
		
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
