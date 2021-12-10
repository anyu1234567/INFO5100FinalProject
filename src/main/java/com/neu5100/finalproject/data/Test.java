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
        IncidentOps opser = new IncidentOps("testname", "1");
        System.out.println(opser.login());
        
    }
}
