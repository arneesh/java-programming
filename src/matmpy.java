
public class matmpy
{
public static void main(String[] args){
       
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,2,3},{4,5,6},{7,8,9}};
int c[][]=new int[3][3];


System.out.println("The product of the matrices is:");
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        for(int k=0;k<3;k++)
            c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
    }
}
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        System.out.print(c[i][j]+" ");
    }
    System.out.println(" ");  
}
    
}
    

}
