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
        
        }

    public static ArrayList<Integer> readFromFile(String path) throws IOException {
        ArrayList<String> inputs = new ArrayList<>();
        File inputFile = new File(path);
        FileReader fis = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fis);
        String s;
        System.out.println(br.readLine());
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
