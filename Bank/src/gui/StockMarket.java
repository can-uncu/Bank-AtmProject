

package gui;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class StockMarket {
    
      public static String DolarKuru ()throws Exception {
        // Web sayfasını belirtiyoruz.
        final Document document = Jsoup.connect("https://www.bloomberght.com/borsa").get();

        // Döviz kuru bilgisi için CSS selector'ü belirliyoruz.
        Element rateElement = document.select("small.value.LastPrice[data-secid=USDTRY Curncy]").first();
        String dolar = rateElement.text();
         return  dolar;
    }
      
            public static String EuroKuru()throws Exception {
        // Web sayfasını belirtiyoruz.
        final Document document = Jsoup.connect("https://www.bloomberght.com/borsa").get();

        // Döviz kuru bilgisi için CSS selector'ü belirliyoruz.
        Element rateElement = document.select("small.value.LastPrice[data-secid=EURTRY Curncy]").first();
        String euro = rateElement.text();
         return  euro;
    }
            
                    public static String AltınKuru()throws Exception {
        // Web sayfasını belirtiyoruz.
        final Document document = Jsoup.connect("https://www.bloomberght.com/borsa").get();

        // Döviz kuru bilgisi için CSS selector'ü belirliyoruz.
        Element rateElement = document.select("small[data-secid=XAU Curncy]").first();
        String altın = rateElement.text();
         return  altın;
    }
      
                    
                    
                    
                    
                    

                    
    public static void main(String[] args) throws Exception {
        String a=AltınKuru();
        System.out.println("euro kuru : : "+a);
    }
  
  
}


