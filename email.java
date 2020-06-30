public class email {

String EmailCheck;
public void setEmailId(String emailId){
    this.emailId=emailId;
}
public String getEmailId(){
    return emailId;
}
public static void main(String[] args) {
    EmailCheck em = new EmailCheck();
    em.setEmailId("CFDV@gm.a.il.com");
    String email = em.getEmailId();
    int length = email.length();
    boolean flag1 = false;
    boolean flag2 = false;
    boolean flag3 = false;
    boolean flag4 = false;
    boolean flag5 = false;
    boolean flag6 = false;
    boolean flag7 = false;
    int count = 0;


    //Condition 1 
    if((length>3 && length<20)== true)
        flag1 = true;
    else 
        flag1 = false;

    //Condition 2
        int temp = email.length();
        if(email.contains("@")){
            flag2=true;
            int a=email.indexOf("@");
             for(int i=a;i<temp;i++){
        if(email.charAt(i)=='.'){
        flag3=true; 
        count=count+1;
        }
        }
        if(count<1||count>2){
        flag4=false;
        }
        else{
        flag4=true;
        }
        }
        else{
        flag2 =false;
        System.out.println("No @ symbol present");
        }


    //Condition 3
    if(email.matches("[A-Z a-z _]+@.*")) //Unable to get the right RegEx here!
        flag5 = true;
    else
        flag5 = false;

    //Condition4
    if(Character.isUpperCase(email.charAt(0))==true)
            flag6 = true;
    else
        flag6=false;

    if(flag1==true && flag2==true && flag3==true && flag4==true && flag5==true &&flag6==true)
        System.out.println("Email ID is valid");
    else{
        if(flag1==false)
            System.out.println("Inavlid length of Email ID");
        if(flag2==false||flag3==false||flag4==false)
            System.out.println("Invalid Position of Special Characters");
        if(flag5==false)
            System.out.println("Invalid combination for username");
        if(flag6==false)
            System.out.println("Invalid case of first letter");
    }


}
}