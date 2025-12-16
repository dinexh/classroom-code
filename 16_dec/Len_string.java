public class Len_string{
     static int stringLength(String str){
      if(str.equals("")) {
        return 0;
      }
      return 1 + stringLength(str.substring(1));
     }

     public static void main(String[] args)
     {
       String text = "dinesh";
       System.out.println("Length of the String : " + stringLength(text));
     }
}

