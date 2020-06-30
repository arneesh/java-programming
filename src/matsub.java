
public class matsub
{
public static void main(String[] args)
{
int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,2,3},{4,5,6},{7,8,9}};
int c[][]=new int[3][3];
int i,j;

System.out.println("The subtraction of 2 matrices is:");

for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        c[i][j]=(b[i][j])-(a[i][j]);
    }
}
for(i=0;i<3;i++)
{
    for(j=0;j<3;j++)
    {
        System.out.print(c[i][j]+" ");
    }System.out.println();
}


}

}