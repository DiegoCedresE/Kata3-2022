package kata3.entrega;


public class Kata3Entrega {

    
    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "Histogram Display...");
        histogramDisplay.execute();
    }
    
}
