package Models;

public class Rider {
    public String Name;
    public String Country;
    public int Age;
    public double Weight;
    public double Height;
    public class Record
    {
        int No_Of_Olympic_Medals;
        double TopSpeed;
        int No_National_Level_Records;

        public Record(int no_Of_Olympic_Medals, double topSpeed, int no_National_Level_Records) {
            No_Of_Olympic_Medals = no_Of_Olympic_Medals;
            TopSpeed = topSpeed;
            No_National_Level_Records = no_National_Level_Records;
        }

        @Override
        public String toString() {
            return "Record{" +
                    "No_Of_Olympic_Medals=" + No_Of_Olympic_Medals +
                    ", TopSpeed=" + TopSpeed +
                    ", No_National_Level_Records=" + No_National_Level_Records +
                    '}';
        }
    }

    public Rider(String name, String country, int age, double weight, double height) {
        Name = name;
        Country = country;
        Age = age;
        Weight = weight;
        Height = height;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "Name='" + Name + '\'' +
                ", Country='" + Country + '\'' +
                ", Age=" + Age +
                ", Weight=" + Weight +
                ", Height=" + Height +
                '}';
    }
    public double calBMI()
    {
        class BMI
        {
            double WeightMetric;
            double HeightMetric;
            double bmiMetric()
            {
                return  WeightMetric/HeightMetric*HeightMetric;
            }
        }
        BMI b1=new BMI();
        b1.WeightMetric=Weight;
        b1.HeightMetric=Height;
        return b1.bmiMetric();
    }
}
