package controller;

import Model.Rider;
public class RiderController {
    public  Rider addRider(String name, String country, int age, double weight, double height) {
        Rider rider = new Rider(name, country, age, weight, height);
        return rider;
    }

    public Rider.Records addRecords (Rider rider, int noOfOlympicMedals, double topSpeed, int noOfNationalRecords){
        Rider.Records records=rider.new Records(noOfOlympicMedals, topSpeed, noOfNationalRecords);
        return records;
    }
    public Rider searchRider(Rider[] riderArray,String searchText)
    {
        Rider found = null;
        for(Rider r:riderArray){
            if(r.name.contains(searchText)){
                found = r;
                break;
            }
        }
        return  found;
    }
}
