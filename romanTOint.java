import java.io.*;
class romanTOint {
    public static int romantoint(String s) {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int current = roman(s.charAt(i));
            if (i + 1 < s.length() && roman(s.charAt(i + 1)) > current) {
                res -= current;
            } else {
                res += current;
            }
        }
        return res;
    }
    public static int roman(char ch){
        int ans;
        switch(ch){
            case 'I':ans= 1;
            break;
            case 'V':ans= 5;
            break;
            case 'X':ans= 10;
            break;
            case 'L':ans= 50;
            break;
            case 'C':ans= 100;
            break;
            case 'D':ans= 500;
            break;
            case 'M':ans= 1000;
            break;
            default: ans= -1;
        }
        return ans;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Roman Numeral : ");
        String s=br.readLine();
        System.out.println(romantoint(s));
    }
}
