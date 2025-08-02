import java.util.*;

class sort{

void asc{
Scanner sc=new Scanner(System.in);
int a[]= new int[5];
System.out.println("Enter 5 no");

for(i=0;i<5;i++){
a[i]=sc.nextInt();
}
int i,j,temp;
for(i=1;i<5;i++){
for(j=0;j<=i;j++){
if(a[j]>a[j+1]){
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;}
}
}
}
}
void desc{
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice");

int a[]= new int[5];
Scanner
int i,j,temp;
for(i=1;i<5;i++){
for(j=0;j<=i;j++){
if(a[j]<a[j+1]){
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;}
}
}
}
}

}

}
public class ascdesc{
public static void main(String args[]){
int a[]= new int[10];
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter choice");
x=sc.nextInt();

sort s =new sort();
switch(x){
case 1: {
s.asc();
break;
}
case 2:{
s.desc();
break;
}
default:{
System.out.println("INVALID CHOICE");
}
}
}

