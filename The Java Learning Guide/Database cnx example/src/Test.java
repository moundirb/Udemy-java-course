import java.sql.*;

public class Test {
public static void connection(){
    try {
       Connection c = DriverManager.getConnection(
                "jdbc:mysql://localhost/student",
                "root",
                ""
        );
        
       System.out.println("OKey");

       Statement s= c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
       ResultSet r= s.executeQuery("SELECT `id`,`fname`,`lname`,`city`FROM`info` WHERE 1");
       //r.next(); r.previous();r.absolute();r.relative();r.previous();
        //r.first();r.last();r.BeforeFirst();r.AfterLast();
        //r.isFirst();r.isBeforeFirst();r.isLast();r.isAfterLast();
        ResultSetMetaData rm= r.getMetaData();
/*
        r.moveToInsertRow();
        r.updateInt("id",116); //always change this
        r.updateString("fname","inis");
        r.updateString("lname","ins");
        r.updateString("city","ins");
        r.insertRow();

        if(r.getRow()==5)
        {
         r.deleteRow();
        r.next();}

*/


        for (int i=1;i<=rm.getColumnCount();i++){
            System.out.print(String.format("%-15s ",rm.getColumnName(i)));
        }
        System.out.print("\n");

        for (int i=1;i<=rm.getColumnCount();i++){
            System.out.print(String.format("%-15s ",rm.getColumnTypeName(i)+" "+rm.getColumnType(i)));
        }
        System.out.print("\n");
int i=0;
        while (r.next()) {
            i=r.getRow();
           /* if(r.getRow()==2){
                r.updateInt("id",2);
                r.updateString("fname","upd");
                r.updateString("lname","pdu");
                r.updateString("city","udo");
                r.updateRow();
            }*/
           System.out.printf(String.format("%-15s %-15s %-15s %-15s\n",r.getInt("id"),r.getString("fname"),r.getString("lname"),r.getString("city")));
       }

        System.out.println("the number of columns is: "+rm.getColumnCount());
        System.out.println("the number of rows is: "+i);



    /*if (r.isAfterLast()){if (r.previous()){
        System.out.println(
                r.getInt("id")+
                r.getString("fname")+
                r.getString("lname")+
                r.getString("city")
        );
        System.out.println(r.getRow());

    } */

    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }

    }
}

