import java.io.*;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class creates a web spider and visits 100 different websites
 * @author mgalle19
 * @version 1.0, 23 January 2017
 */
public class InetDisplay {
	 static Map<String,Boolean> y= new HashMap<String,Boolean>();
    public static void main(String[] args) {
    
        try {
            String nfl = "http://www.nfl.com/" ;  
            y.put(nfl, false);
            String z = next();
            while(z!= null){
            URL url = new URL(nfl);
            BufferedReader rdr = new BufferedReader(new InputStreamReader(url.openStream()));          
            String line;
            
            while ((line = rdr.readLine()) != null) {
                Pattern x = Pattern.compile("href=\"(http:.*?)\"");
                Matcher matcher = x.matcher(line);
                if(matcher.find()&& !y.containsKey(matcher.group(1))){
                	y.put(matcher.group(1), false);
                	System.out.printf("%s\n",matcher.group(1));
                }
            }
            z= next();
        }    
        }
        catch (Exception ex) {
            System.out.printf("Oops: %s", ex.getMessage());
        }
    }
    /**
     * Returns the web site in the HashMap
     * @return the next web site
     */
    private static String next(){
    	for(Map.Entry<String, Boolean> e: y.entrySet()){
    		if(e.getValue()==false){
    			y.put(e.getKey(),true);
    			return e.getKey();
    		}
    	}
    	return null;
    }
}

