package Model;

public class Rider {
    public String name;
    String country;
    int age;
    public double weight;
    public double height;

    public Rider(String name, String country, int age, double weight, double height) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public class Records{
        int noOfOlympicMedals;
        double topSpeed;
        int noOfNationalRecords;

        public Records(int noOfOlympicMedals, double topSpeed, int noOfNationalRecords) {
            this.noOfOlympicMedals = noOfOlympicMedals;
            this.topSpeed = topSpeed;
            this.noOfNationalRecords = noOfNationalRecords;
        }

        public String displayRecords(){
            return "No of Olympic medals:" + this.noOfOlympicMedals + "Top speed" + this.topSpeed + "No of national level Records" + this.noOfNationalRecords;
        }
    }

    public double calBMI(double weight, double height){
        class BMI{
           double weightMetric;
           double heightMetric;

            public BMI(double weightMetric, double heightMetric) {
                this.weightMetric = weightMetric;
                this.heightMetric = heightMetric;
            }

            double BMIMetric(){
               double bmi=weightMetric/(heightMetric*heightMetric);
               return bmi;
           }

        }

        BMI bmi=new BMI(weight,height);
        return bmi.BMIMetric();
    }
}
