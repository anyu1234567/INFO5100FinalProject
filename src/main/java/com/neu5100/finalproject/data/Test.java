/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject.data;

import com.neu5100.finalproject.model.AssignWorkRequest;
import com.neu5100.finalproject.model.Emergency;
import com.neu5100.finalproject.model.IncidentOps;
import com.neu5100.finalproject.model.OrganizationAdmin;
import com.neu5100.finalproject.model.Population;
import com.neu5100.finalproject.model.Receiver;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author An
 */
public class Test {
    public static void main(String[] args)  {
        Data instance = Data.getInstance();
        IncidentOps opser = new IncidentOps(2, "testname", "0");
        //instance.insert(opser);
        //instance.delete(opser);
        IncidentOps result = instance.select(2);
        System.out.println(result.getOps_id()+" "+result.getOps_name()+" "+result.getOps_pw());
        OrganizationAdmin oa = new OrganizationAdmin(0, "1", "1", 0);
        
        ArrayList<Receiver> receivers = oa.getReceiver(0);
        for(Receiver r: receivers){
            System.out.println(r.getReceiver_id()+" "+r.getReceiver_name()+" "+r.getReceiver_pw());
        }
        ArrayList<AssignWorkRequest> queryWorkRequestByRole = oa.queryWorkRequestByRole();
        for(AssignWorkRequest wr : queryWorkRequestByRole){
            System.out.println(wr);
        }
        
    }
}
