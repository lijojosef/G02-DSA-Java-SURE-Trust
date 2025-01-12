public class CountOccurance {
    public static void main(String[] args){
        String str="Hello";
        str=str.toLowerCase();

        for(char ch='a';ch<='z';ch++){
            int count=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch){
                    count=count+1;
                }
            }
            if(count>0){
                System.out.println(ch+" "+count);
            }

        }
    }
}
