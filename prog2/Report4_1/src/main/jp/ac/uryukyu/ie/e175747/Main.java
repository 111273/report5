package jp.ac.uryukyu.ie.e175747;

public class Main {
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerExceptionが報告されました");
            System.out.println(e.getMessage());
        }
    }
}