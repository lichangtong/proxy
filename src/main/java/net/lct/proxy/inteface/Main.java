package net.lct.proxy.inteface;


import net.lct.proxy.inteface.impl.ACom;
import net.lct.proxy.inteface.impl.BCom;
import net.lct.proxy.inteface.impl.DCom;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<ICom> list =  initComList();
        for (ICom iCom:list){
            iCom.preCheck();
            iCom.sayHello();
        }
    }

    static List<ICom> initComList() {
        List<ICom> list = new ArrayList<ICom>();
        list.add(new DCom());
        list.add(new ACom());
        list.add(new BCom());
        return list;
    }
}
