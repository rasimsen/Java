import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution, as per the sample code below.
 *
 *** Background ***
 *
 * - This test is just to understand your ability to code in Java and understand a typical Jira ticket.
 *
 * - Treat this exactly as you would a normal coding task.
 * 
 * - As with any typical development environment this is an open book task, so please feel free to use Google or StackOverflow 
 * 
 * - this task should take 40-80 mins
 * 
 * - Bonus marks for suitable comments in your code
 *
 *** Task ***
 *
 * 1/ Write a function that when run, calls out to the following wikipedia page “https://en.wikipedia.org/wiki/Special:Random”.
 * 
 * 2/ On the html text returned find the title value and display this value.
 * 
 * 3/ Find and display the URL for the first link after the table of contents.
 * 
 * 4/ Generalise the earlier function to take in ANY Wikipedia page URL, and return a Pair<String, String> containing the title in the first element and the first-link URL in the second element.
 * 
 * 5/ Call this generalised function with “https://en.wikipedia.org/wiki/Special:Random”. Take the output URL and use it to call the function again. Keep doing this till we either reach a chain of 100 pages that all link to the next one, or till we reach a page we've already visited. Display all the page links in the order they occurred.
 * 
 * 6/ Stretch task: output an unformatted HTML page displaying each page title as a clickable link to that page.
 *
 */

class Solution {
  protected static final String urlEnd = "\"/>";
  protected static final String urlStart = "<link rel=\"canonical\" href=\"";
  protected static final String titleEnd = "</title>";
  protected static final String titleStart = "<title>";
  protected static Map<String, String> map = new LinkedHashMap<String,String>();
  final static String WEBSITE_URL = "https://en.wikipedia.org/wiki/Special:Random";
    protected static int pageVisitedCounter = 0;

  public static void main(String[] args) {
    try {
      getContent();
      
          for (Map.Entry<String, String> entry : map.entrySet()) {
              System.out.println(entry.getValue()+" : "+entry.getKey());
          }

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static URL getURL() throws MalformedURLException {
    return new URL(WEBSITE_URL);

  }

  private static void getContent() throws Exception {

    URL url = getURL();
    String urlStr = "";
    String title = "";
    try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()))) {

      String line = null;
      while (null != (line = br.readLine())) {
        line = line.trim();
        if (line.startsWith(titleStart) && line.endsWith(titleEnd)) {
          title = line.replace(titleStart, "").replace(titleEnd, "");
        }

        if (line.startsWith(urlStart) && line.endsWith(urlEnd)) {
          urlStr = line.replace(urlStart, "").replace(urlEnd, "");
        }
      }
    }
    
     if (map.containsKey(urlStr) || pageVisitedCounter>100) {
          return;
        }

    pageVisitedCounter ++;
    map.put(urlStr, title);
    getContent();
    
  }
  
}
