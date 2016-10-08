import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;	

public class Main {
	static List<String> l=new ArrayList<String>();
	// public static DB db = new DB();

	public static void main(String[] args) throws SQLException, IOException {
		// db.runSql2("TRUNCATE Record;");
		processPage("http://mail-archives.apache.org/mod_mbox/maven-users/");
		
		mailExtract(l);
	}

	public static void processPage(String URL) throws SQLException, IOException {
		
		Document doc = Jsoup.connect("http://mail-archives.apache.org/mod_mbox/maven-users/").get();

		if (doc.text().contains("Year 2014")) {
			//System.out.println(URL);
		}

		// get all links and recursively call the processPage method
		Elements questions = doc.select("a[href]");
		for (Element link : questions) {
			if (link.attr("href").startsWith("2014")&&link.attr("href").endsWith("date")){
				
				
				String text=link.toString().replace("<a href=", "").replace("/date\">Date</a>", "/ajax/thread?0").replace("\"", "/");
				
				System.out.println("Link "+text);
				l.add(text);
				//System.out.println("the list "+l);
				
				//processPage(link.attr("abs:href"));
			}
		}
	}
	
	
	public static void mailExtract(List list) throws IOException{
		List mailList=new ArrayList();
		String url="http://mail-archives.apache.org/mod_mbox/maven-users";
	//	Document doc=null;
		
		for(int i=0;i<list.size();i++){
			String a=(String) list.get(i);
			String mailExtract=url+a;
			System.out.println("the mail browse url"+mailExtract);
		
			Document doc = Jsoup.connect(mailExtract).get();
			
			Elements questions = doc.select("message");
			for (Element link : questions) {
				if (!link.attr("id").isEmpty()){
					
					String id =link.attr("id");
					
					String contentUrl=mailExtract.replace("thread?0",id);
				
					mailList.add(contentUrl);
					
					
					//processPage(link.attr("abs:href"));
				}
			
			
			
		}
		
	
		
		
	}
		System.out.println("maillll++++++"+mailList);
		System.out.println("the size "+mailList.size());
}
}
