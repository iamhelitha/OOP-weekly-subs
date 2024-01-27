package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Rider;

public class RiderService {
    private DatabaseConnection singleConn;
    public RiderService()
    {
        singleConn=DatabaseConnection.getSingleInstance();
    }
    public boolean addRider(Rider rider)
    {
        try
        {
            String query="insert into rider values('"+rider.Name+"','"+rider.Country+"',"+rider.Age+","+rider.Weight+","+rider.Height+")";
            boolean result=singleConn.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println("Cannot insert a rider");
          return false;
        }
    }
}
