package r;
public class y {
	public static void main(String[] args) {
		int i=2349;
		int a=i/1000+(i%1000)/100*10+(i%100)/10*100+(i%10)*1000;
		System.out.println(a);
		
		
		for(int j=100;j<1000;j++){
			if(j==Math.pow(j/100,3)+Math.pow(j%100/10,3)+Math.pow(j%10,3)){
				System.out.println(j);
			}
		}
		
		int m=120;
		int n=350;
		int k=m<n?m:n;
		for(int b=k;b<=k;b--){
			if(m%b==0&&n%b==0){
				System.out.println("最大公约数"+b);
				break;
		}
		
		}
		
		
		
		int c=25;
		int s=36;
		int o=c>s?c:s;
		for(int p=o;p>=o;p++){
			if(p%c==0&&p%s==0){
				System.out.println("最小公倍数"+p);
				break;
			}
		}
		
		
		
		}

}
