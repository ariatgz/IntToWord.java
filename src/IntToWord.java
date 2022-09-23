import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IntToWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your positive integer number: ");
        int num = sc.nextInt();
        System.out.println(numberToWords(num));
    }

    public static String numberToWords(int num) {
        String result = "";
        String[] numwords = { "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] seconddigit = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String strnum = Integer.toString(num);
        LinkedList<Character> nums=new LinkedList<Character>();
        List<String> sections=new ArrayList<String>();
        for (Character ch : strnum.toCharArray()) {
            nums.add(ch);
        }

        while(nums.size()%3!=0){
            nums.addFirst('0');
        }



        for(int h=nums.size()/3;h>0;h--){
            sections.add(StringThreedigitdiv(nums.get(nums.size()-3),nums.get(nums.size()-2),nums.get(nums.size()-1)));
            nums.remove(nums.size()-3);
            nums.remove(nums.size()-2);
            nums.remove(nums.size()-1);


        }
        if(sections.size()==4 && !sections.get(1).equals("") && !sections.get(2).equals("") && !sections.get(0).equals("")){
            result= sections.get(sections.size()-1)+" Billion"+sections.get(sections.size()-2)+" Million"+sections.get(sections.size()-3)+" Thousand"+sections.get(sections.size()-4);
        } else if (sections.size()==3 && !sections.get(1).equals("")  && !sections.get(0).equals("")) {
            result= sections.get(sections.size()-1)+" Million"+sections.get(sections.size()-2)+" Thousand"+sections.get(sections.size()-3);

        } else if (sections.size()==2 && !sections.get(0).equals("")) {

            result= sections.get(sections.size()-1)+" Thousand"+sections.get(sections.size()-2);


        }else if(sections.size()==4 && sections.get(1).equals("") && sections.get(2).equals("") && sections.get(0).equals("")) {
            result = sections.get(sections.size()-1)+" Billion";
        }else if(sections.size()==3 && sections.get(0).equals("") && sections.get(1).equals("")) {
            result = sections.get(sections.size()-1)+" Million";
        }else if(sections.size()==2 && sections.get(0).equals("")) {
            result = sections.get(sections.size()-1)+" Thousands";
        }else if (sections.size()==4 && sections.get(1).equals("") && sections.get(2).equals("") && !sections.get(0).equals("")){
            result = sections.get(sections.size()-1)+" Billion"+ sections.get(sections.size()-4);

        }else if (sections.size()==4 && sections.get(2).equals("") && sections.get(0).equals("") && !sections.get(1).equals("")){
            result = sections.get(sections.size()-1)+" Billion"+ sections.get(sections.size()-3)+" Thousand";

        }else if (sections.size()==4 && !sections.get(2).equals("") && sections.get(0).equals("") && sections.get(1).equals("")){
            result = sections.get(sections.size()-1)+" Billion"+ sections.get(sections.size()-2)+" Million";

        }else if(sections.size()==3 && sections.get(0).equals("") && !sections.get(1).equals("")) {
            result = sections.get(sections.size()-1)+" Million"+sections.get(sections.size()-2)+" Thousand";
        }else if(sections.size()==3 && !sections.get(0).equals("") && sections.get(1).equals("")) {
            result = sections.get(sections.size()-1)+" Million"+sections.get(sections.size()-3);
        }

        else{
            result= sections.get(sections.size()-1);
        }


        return result.trim();
    }

    public static String StringThreedigitdiv(Character firstd,Character secondd,Character thirdd) {
        String firstdig=Character.toString(firstd);
        int firdigi=Integer.parseInt(firstdig);

        String seconddig=Character.toString(secondd);
        int seconddigi=Integer.parseInt(seconddig);
        String thirddig=Character.toString(thirdd);
        int thirddigi=Integer.parseInt(thirddig);
        String twodigits1=seconddig+thirddig;
        int twodigits=Integer.parseInt(twodigits1);
        String result="";
        String[] numwords = {" One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine"};



                if(firstdig.equals("0") == false){
                    result=result+numwords[Integer.parseInt(firstdig)-1]+" Hundred ";
                }else result=result;

                if(twodigits==10){
                    result+= " Ten";
                    return result;

                } else if (twodigits==11) {
                    result+= " Eleven";
                    return result;
                }else if (twodigits==12) {
                    result+= " Twelve";
                    return result;
                }else if (twodigits==13) {
                    result+= " Thirteen";
                    return result;
                }else if (twodigits==14) {
                    result+= " Fourteen";
                    return result;
                }else if (twodigits==15) {
                    result+= " Fifteen";
                    return result;
                }else if (twodigits==16) {
                    result+= " Sixteen";
                    return result;
                }else if (twodigits==17) {
                    result+= " Seventeen";
                    return result;
                }else if (twodigits==18) {
                    result+= " Eighteen";
                    return result;
                }else if (twodigits==19) {
                    result+= " Nineteen";
                    return result;
                }else if (twodigits==20) {
                    result+= " Twenty";
                    return result;
                }else if (twodigits==30) {
                    result+= " Thirty";
                    return result;
                }else if (twodigits==40) {
                    result+= " Forty";
                    return result;
                }else if (twodigits==50) {
                    result+= " Fifty";
                    return result;
                }else if (twodigits==60) {
                    result+= " Sixty";
                    return result;
                }else if (twodigits==70) {
                    result+= " Seventy";
                    return result;
                }else if (twodigits==80) {
                    result+= " Eighty";
                    return result;
                }else if (twodigits==90) {
                    result+= " Ninety";
                    return result;
                }
                else if(twodigits==00)
                {
                    return result;
                }

                if(seconddigi==2){
                    result+=" Twenty";
                }else if(seconddigi==3) result+=" Thirty";
                else if(seconddigi==4) result+=" Forty";
                else if(seconddigi==5) result+=" Fifty";
                else if(seconddigi==6) result+=" Sixty";
                else if(seconddigi==7) result+=" Seventy";
                else if(seconddigi==8) result+=" Eighty";
                else if(seconddigi==9) result+=" Ninety";

                if(thirddigi== 0)result=result;
                else if(thirddigi== 1) result += " One";
                else if(thirddigi== 2) result += " Two";
                else if(thirddigi== 3) result += " Three";
                else if(thirddigi== 4) result += " Four";
                else if(thirddigi== 5) result += " Five";
                else if(thirddigi== 6) result += " Six";
                else if(thirddigi== 7) result += " Seven";
                else if(thirddigi== 8) result += " Eight";
                else if(thirddigi== 9) result += " Nine";






        return  result  ;
    }

}
