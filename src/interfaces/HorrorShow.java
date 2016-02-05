package interfaces;
//Extending an interface with inheritance.

interface Monster {
	  void menace();
	}

interface DangerousMonster extends Monster {
	  void destroy();
	}

interface Lethal {
	  void kill();
	}

class DragonZilla implements DangerousMonster {
	  public void menace() {System.out.println("DragonZilla menace");}
	  public void destroy() {System.out.println("DragonZilla destroy");}
	}	

interface Vampire extends DangerousMonster, Lethal {
	  void drinkBlood();
	}

class VeryBadVampire implements Vampire {
	  public void menace() {System.out.println("VeryBadVampire menace");}
	  public void destroy() {System.out.println("VeryBadVampire destroy");}
	  public void kill() {System.out.println("VeryBadVampire kill");}
	  public void drinkBlood() {System.out.println("VeryBadVampire drinkBlood");}
	}	

public class HorrorShow {
	  static void u(Monster b) { b.menace(); }
	  static void v(DangerousMonster d) {
	    d.menace();
	    d.destroy();
	  }
	  static void w(Lethal l) { l.kill(); }
	  public static void main(String[] args) {
	    DangerousMonster barney = new DragonZilla();
	    u(barney);
	    v(barney);
	    Vampire vlad = new VeryBadVampire();
	    u(vlad);
	    v(vlad);
	    w(vlad);
	  }
}
