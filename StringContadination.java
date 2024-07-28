 
public class StringContadination {
    public static void main(String[] args){ 
        String firstname="Sumant";
        String secondName="Yadav";
        String fullName=firstname+secondName;
        System.out.println(fullName);
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
}
