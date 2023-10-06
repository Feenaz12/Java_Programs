package Feenaz;
interface Searchable {
    boolean Search(String keyword);
}


 class Document implements Searchable {
    public String data;

    public Document(String data) {
        this.data = data;
    }

    
    public boolean Search(String keyword) {
        
        if(data.contains(keyword)) {
        	return true;
        };
		return false;
    }
}


class WebPage implements Searchable {
    public String url;
    public String page;

    public WebPage(String url, String page) {
        this.url = url;
        this.page = page;
    }

    
    public boolean Search(String keyword) {
        
        if (url.contains(keyword)) {
        	return true;
        };
		return false;
    }


	


		
}

public class InterfaceExample2 {
    public static void main(String[] args) {
       
        Document d = new Document("This is a sample document containing some text.");
        
       
        WebPage w = new WebPage("https://www.example.com", "This is a sample web page with some content.");
        
        
        System.out.println("Search result "+d.Search("dog"));
        System.out.println("Search result "+w.Search("www"));
        
        
    }
}
