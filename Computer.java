public class Computer {
    String marca;
    String processore;
    double capacitaRam;
    
    public Computer(String marca, String processore, double capacitaRam) {
        this.marca = marca;
        this.processore = processore;
        this.capacitaRam = capacitaRam;
    }

    // Getter
    public String getMarca() {
        return marca;
    }

    public String getProcessore() {
        return processore;
    }

    public double getCapacitaRam() {
        return capacitaRam;
    }

    // Setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public void setCapacitaRam(double capacitaRam) {
        this.capacitaRam = capacitaRam;
    }

    public int compareTo(Computer c1) {
       if(c1.capacitaRam>this.capacitaRam){
       return -1;
       }
       if(c1.capacitaRam<this.capacitaRam){
        return 1;
       }
       return 0;
    }

     public static void main(String[] args){
        Computer c= new Computer("Apple", "I5", 128);
        Computer d = new Computer("Apple", "I9", 128);

        int confronto = c.compareTo(d);
        System.out.println(confronto);
    }
}