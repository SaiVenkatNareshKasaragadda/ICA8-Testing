import java.io.*;
import java.util.ArrayList;

/*
@author Sai Venkat Naresh Kasaragadda, skasara1@asu.edu
 */
public class urinals {

        Boolean goodString( String str ) {  // checks to see if valid string
            char[] arr = str.toCharArray();
            for(char ch: arr){
                if(!Character.isDigit(ch)){
                    return false;
                }
            }
            return true;
        }
        public static int getUrinalsCount(String s){
        int[] intArray = new int[s.length()];
        int res =0;
        int n = s.length();
        String[] eachInt = s.split("");
        for(int i =0;i<n;i++) {
            intArray[i]= Integer.parseInt(eachInt[i]);
        }
        for(int i=0;i< n;i++) {
            if(intArray[i]==0){
                if(i==0){
                    if(intArray[i+1]==0 ){
                    res++;
                    intArray[i]=1;
                }}
                else if(i==n-1){
                    if(intArray[i-1]==0){
                    res++;
                    intArray[i]=1;
                }}
                else if(intArray[i-1]==0){
                    if(intArray[i+1]==0){
                    res++;
                    intArray[i]=1;
                }}
            }
        }
        for(int i=0;i< n-1;i++) {
            if(intArray[i]==1){
                if(intArray[i+1]==1){
                    res = -1;
                }
            }
        }
        return res;
    }

    public static ArrayList<Integer> readFromFile(String path) throws IOException {
        ArrayList<String> inputs = new ArrayList<>();
        File inputFile = new File(path);
        FileReader fis = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fis);
        String s;
        while((s=br.readLine())!=null) {
            inputs.add(s);
            System.out.print("Input : "+ s);
        }
        ArrayList<Integer> outputs = new ArrayList<>();
        for(String input : inputs){
            outputs.add(getUrinalsCount(input));
            System.out.print("Output : "+ outputs);
        }
        return outputs;
    }

    public static void writeToFile(ArrayList<Integer> outputs) throws IOException{
        
    }




    public static void main(String args[]) throws IOException {
        ArrayList<Integer> output = new ArrayList<>();
        try{
            output = readFromFile("input.txt");
            writeToFile(output);
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
