import java.util.Scanner;
class stringbuffer123{
    
    public static void main(String args[])
    {
System.out.println("Enter the String:");
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
StringBuffer s = new StringBuffer(str);



int count[] = new int[5];
int i=0;
for(i=0;i<str.length();i++){
    switch(s.charAt(i)){
        
        case 'a': s.replace(i,i+1,""+(count[0]+1));
        count[0] = count[0]+1;
        break;
        
        case 'A': s.replace(i,i+1,""+(count[0]+1));
        count[0] = count[0]+1;
        break;
        
        case 'e': s.replace(i,i+1,""+(count[1]+1));
        count[1] = count[1]+1;
        break;
        
        case 'E': s.replace(i,i+1,""+(count[1]+1));
        count[1] = count[1]+1;
        break;
        
        case 'i': s.replace(i,i+1,""+(count[2]+1));
        count[2] = count[2]+1;
        break;
        
        case 'I': s.replace(i,i+1,""+(count[2]+1));
        count[2] = count[2]+1;
        break;
        
        case 'o': s.replace(i,i+1,""+(count[3]+1));
        count[3] = count[3]+1;
        break;
        
        case 'O': s.replace(i,i+1,""+(count[3]+1));
        count[3] = count[3]+1;
        break;
        
        case 'u': s.replace(i,i+1,""+(count[4]+1));
        count[4] = count[4]+1;
        break;
        
        case 'U': s.replace(i,i+1,""+(count[4]+1));
        count[4] = count[4]+1;
        break;
        
        
        
    }
}
System.out.println("Final String is:"+s);
sc.close();
}
}