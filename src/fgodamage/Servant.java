/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fgodamage;

/**
 *
 * @author Ander
 */
public class Servant {
    private int ATK;
    public ServantType servInfo;
    private String attribute;

    public Servant(int ATK, String name, String className) {
        this.ATK = ATK;
        this.servInfo = new ServantType(className);
        this.attribute = FGODamage.servantsMap.get(name + "4");
    }
    
    public double getAtrributeAdv(Servant o)
    {
        if(this.attribute.equals("Man"))
        {
            if(o.getAttribute().equals("Sky"))
                return 1.1;
            if(o.getAttribute().equals("Earth"))
                return 0.9;
            else
                return 1.0;
        }
        if(this.attribute.equals("Sky"))
        {
            if(o.getAttribute().equals("Earth"))
                return 1.1;
            if(o.getAttribute().equals("Man"))
                return 0.9;
            else
                return 1.0;
        }
        if(this.attribute.equals("Earth"))
        {
            if(o.getAttribute().equals("Man"))
                return 1.1;
            if(o.getAttribute().equals("Sky"))
                return 0.9;
            else
                return 1.0;
        }
        if(this.attribute.equals("Star"))
        {
            if(o.getAttribute().equals("Beast"))
                return 1.1;
            else
                return 1.0;
        }
        if(this.attribute.equals("Beast"))
        {
            if(o.getAttribute().equals("Beast"))
                return 0.0;
            if(o.getAttribute().equals("Star"))
                return 1.1;
            else
                return 1.0;
        }
        return -1;
    }

    public String getAttribute() {
        return attribute;
    }
    
}
