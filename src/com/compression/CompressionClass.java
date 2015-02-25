/**
 * Created by Spconway on 12/3/14.
 */
public class CompressionClass {
    public String compress(String st){
        String temp = "";
        int count = 1;
        char ch;

        for(int i = 0; i < st.length() -1; i++){

            ch = st.charAt(i);

            if((i+1)==st.length()-1 && ch == st.charAt(i + 1)){
                count++;
                temp += count + "" + Character.toString(ch);
            } else if((i+1)==st.length()-1 && ch != st.charAt(i + 1)){
                temp += count + "" + Character.toString(ch);
                count = 1;
                temp += count + "" + Character.toString(st.charAt(i+1));
            }
            else if(st.charAt(i) == st.charAt(i+1)){
                count++;
            }else{
                temp += count + "" + Character.toString(ch);
                count = 1;
            }



//            if(st.charAt(i + 1) == '\n'){
//                temp += count + ch;
//                return temp;
//            }


        }
        return temp;
    }
}
