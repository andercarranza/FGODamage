/*
 a now defunct class, originally was seperate from servant.java, all these methods now contained in servant.java
 */
package fgodamage;

/**
 *
 * @author Ander
 */
public class ServantType {
    private String className;
   

    public ServantType(String className) {
        this.className = className;
    }

    public double getClassMultiplier() {
        if(className.equals("Saber"))
            return 1.0;
        if(className.equals("Archer"))
            return .95;
        if(className.equals("Lancer"))
            return 1.05;
        if(className.equals("Rider"))
            return 1.0;
        if(className.equals("Caster"))
            return 0.9;
        if(className.equals("Assassin"))
            return 0.9;
        if(className.equals("Berserker"))
            return 1.1;
        if(className.equals("Shielder"))
            return 1.0;
        if(className.equals("Ruler"))
            return 1.1;
        if(className.equals("AlterEgo"))
            return 1.0;
        if(className.equals("Avenger"))
            return 1.1;
        return -1.0;
    }
    
    public double getClassAdv(ServantType enemy){
        if(this.className.equals("Saber")){
            if(enemy.getClassName().equals("Archer") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Lancer") || enemy.getClassName().equals("AlterEgo") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Archer")){
            if(enemy.getClassName().equals("Lancer") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Saber") || enemy.getClassName().equals("AlterEgo") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Lancer")){
            if(enemy.getClassName().equals("Saber") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Archer") || enemy.getClassName().equals("AlterEgo") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Rider")){
            if(enemy.getClassName().equals("Assassin") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Caster") || enemy.getClassName().equals("Beast") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Caster")){
            if(enemy.getClassName().equals("Rider") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Assassin") || enemy.getClassName().equals("Beast") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Assassin")){
            if(enemy.getClassName().equals("Caster") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Rider") || enemy.getClassName().equals("Beast") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Berserker")){
            if(enemy.getClassName().equals("Shielder"))
                return 1.5;
            else
                return 1.0;
        }
        if(this.className.equals("Shielder")){
            return 1.0;
        }
        if(this.className.equals("Ruler")){
            if(enemy.getClassName().equals("Avenger"))
                return .5;
            if(enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("AlterEgo")){
            if(enemy.getClassName().equals("Assassin") || enemy.getClassName().equals("Rider") 
                    || enemy.getClassName().equals("Caster")|| enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Avenger")){
            if(enemy.getClassName().equals("Berserker") || enemy.getClassName().equals("Ruler"))
                return 2.0;
            else
                return 1.0;
        }
        return -1;
    }

    public String getClassName() {
        return className;
    }
    
    
}
