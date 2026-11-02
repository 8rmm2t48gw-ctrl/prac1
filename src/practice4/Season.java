package practice4;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25){
        @Override
        public String getDescription(){
            return "теплое время года";
        }
    },
    AUTUMN(8);
    private final double temperature;
    Season(double temperature){
        this.temperature=temperature;
    }
    public double getTemperature(){
        return temperature;
    }
    public String getDescription(){
        return "холодное время года";
    }
}
