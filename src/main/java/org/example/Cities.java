package org.example;

import java.util.LinkedList;
import java.util.List;

public class Cities {
    LinkedList<String> list= new LinkedList<>();

    public  Cities(){
    };

    public LinkedList<String> getList(){
        list.add("NIECE");
        list.add("BERLIN");
        list.add("LONDON");
        list.add("PARIS");
        list.add("AMSTERDAM");
        list.add("ROMA");
        list.add("OSLO");
        list.add("STOCKHOLM");
        list.add("MAMBURG");
        list.add("HELSINKI");
        list.add("MADRID");
        list.add("BOLOGNA");

        return list;
    }


}
