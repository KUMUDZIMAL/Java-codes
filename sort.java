import java.util.*;
class sort{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5];
		int n=0,temp=0;
		System.out.println("Enter 5 nos");
		for(int i=0;i<5;i++){
			num[i] = sc.nextInt();
		}
		System.out.println("Press 1 for ascending and 2 for descending");
		n=sc.nextInt();
		if(n==1){
			for(int i=0;i<5;i++){
				for(int j=0;j<4;j++){
					if(num[j]>num[j+1]){
						temp=num[j];
						num[j] = num[j+1];
						num[j+1] = temp;
					}
				}
			}
		}
		if(n==2) {
			for(int i=0;i<5;i++){
				for(int j=0;j<4;j++){
					if(num[j]<num[j+1]){
						temp=num[j];
						num[j] = num[j+1];
						num[j+1] = temp;
					}
				}
			}
		}
		for(int i=0;i<5;i++){
			System.out.println(num[i]);
		}
	}
}
