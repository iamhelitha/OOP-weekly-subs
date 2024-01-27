package Controllers;

import Models.Rider;
import ServiceLayer.RiderService;

public class RiderController
{
    Rider riderobj;
    Rider.Record recordObj;
    RiderService service;
    public RiderController()
    {
        service=new RiderService();
    }
    public  Rider addRider(String name,String country,int age,double weight,double height)
    {
        riderobj=new Rider(name,country,age,weight,height);
        return  riderobj;
    }
    public Rider.Record addRecord(int olympic,int national,double topSpeed)
    {
        recordObj=riderobj.new Record(olympic,topSpeed,national);
        return  recordObj;
    }
    public Rider searchRider(Rider[] riderArray,String searchText)
    {
        Rider found=null;
        for(Rider r:riderArray)
        {
            if(r.Name.equals(searchText))
            {
                found=r;
                break;
            }
        }
        return found;
    }
    public boolean addRiderToDatabase()
    {
        return service.addRider(riderobj);
    }
}







