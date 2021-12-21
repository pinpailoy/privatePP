import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class countVowel {
	public static void main(String[] args) throws Exception {
        File file = new File("/Users/pinpailoy/Documents/INPUT.txt");
        Scanner sc = new Scanner(file);
        ArrayList<String> result2= new ArrayList<String>(10);
        char[] tt = {};
        while(sc.hasNextLine()){
            String x=sc.nextLine();
            //split the words => cut off white space and any special character
            String[] z=x.split("[^a-zA-Z]+");
            //get the word from file
            for ( String ss : z) {
                System.out.println("word: "+ss);
                int len=ss.length();
                tt=sentVW(ss);// send vowel back
                int count=countVW(ss);//Count vowel
                double avg=((double)len/count); //calculate avg
                String vowel=Arrays.toString(tt);
                String txt= "** Word "+ss+" has vowels "+vowel+" and word length "+len+" => total vowel count=> " +count+" average per word=> "+avg+" ";         
                result2.add(txt);
               writeFile(result2);
               //for checking all text in array
               for(String s:result2) {
               	System.out.println(s);}
               } 
            }
            
        }
            
	
	//get word and count vowel
	 public static int countVW(String ss)
	    {	char tt = 0;
	        int num = 0;
	       for(int i=0;i<ss.length();i++)
            {	
            	char t=ss.charAt(i);
            	if(t=='A'||t=='E'||t=='I'||t=='O'||t=='U'||t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
            	 num++;	
            	 tt=t;
            	}
       
            }
	        return num;
	    }
	 
	 //return vowel of each word
	 public static char[] sentVW(String ss)
	    {	
		 	char[] tt = new char[ss.length()];
	        for(int i=0;i<ss.length();i++)
         {	
         	char t=ss.charAt(i);
         	if(t=='A'||t=='E'||t=='I'||t=='O'||t=='U'||t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
         	tt[i] = t;
         	}
         }
	        return tt;
	    }

	 //write file in specific path
	 public static void writeFile(ArrayList<String> result) throws IOException {
		 BufferedWriter out = null;

	        try {
	        	File file = new File("/Users/pinpailoy/Documents/OUTPUT.txt"); //change path name
	            out = new BufferedWriter(new FileWriter(file));
	        	
	        		for(String s:result) {
	        			
	        				out.write(s);
	
	        				out.newLine();

	        		}
	            
	        } catch ( IOException e ) {
	            e.printStackTrace();
	        }
	        finally {
	          if ( out != null ) {
	            out.close();
	            }
	        };
		 
	 }
	 
}

