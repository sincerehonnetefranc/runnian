package run;

public class year {
	public static void main(String[]args){	
		for(int i=1;i<=2019;i++){
			if((i%4==0&&i%100!=0)||i%400==0){
				System.out.println("闰年"+i);
			}else{
				System.out.println("平年"+i);
				}
			
			}
		//20的阶乘
		long result=1;
		for(int i=2;i<=20;i++){
		result=result*i;
		}
		System.out.println(result);
		
		//100以内质数和
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
