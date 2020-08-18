package db;

import dto.CustomerDTO;

import java.util.ArrayList;

public class Database {
    public static ArrayList<CustomerDTO> list =new ArrayList();

    static {
        list.add(new CustomerDTO("001","Nimal","Colombo",250000));
        list.add(new CustomerDTO("002","Kamal", "Panadura",250000));
        list.add(new CustomerDTO("003","Namal","Galle",250000));
    }
}
