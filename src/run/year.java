package run;

public class year {
	public static void main(String[]args){	
		for(int i=1;i<=2019;i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				System.out.println("����"+i);
			}else{
				System.out.println("ƽ��"+i);
				}
			
			}
		//20�Ľ׳�
		long result=1;
		for(int i=2;i<=20;i++){
		result=result*i;
		}
		System.out.println(result);
		
		//100����������
		int a=0;
		for(int n=1;n<=100;n++){
			boolean b=true;
			if(n!=1){
				for(int i=2;i<n;i++){
					if(n%i==0){
						b=false;
					}
				}
				if(b){
					a=a+n;
				}
			}
		}
		System.out.println(a);
		}
	
}
