package Tharani_Dharan.LeetCode;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(char i : s.toCharArray()){
            arr1[i-97]++;
        }
        for(char j : t.toCharArray()){
            arr2[j-97]++;
        }
        for(int i =0;i<26;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        String string1 =  "anagram";
        String string2 = "nagaram";

        System.out.println(isAnagram(string1,string2) ? "The given strings are Anagram" : "The given strings are not Anagram");

    }
}
