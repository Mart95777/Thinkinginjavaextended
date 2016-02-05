package reusing;
//Composition with public objects.

class Engine {
	  public void start() {}
	  public void rev() {}
	  public void stop() {}
	}

class Wheel {
	  public void inflate(int psi, int wh) {System.out.println("in inflate, wheel no.: "+wh);}
	}

class Window {
	  public void rollup() {System.out.println("in rolldown");}
	  public void rolldown() {}
	}

class Door {
	  public Window window = new Window();
	  public void open() {}
	  public void close() {}
	}

public class Car {
	  public Engine engine = new Engine();
	  public Wheel[] wheel = new Wheel[4];
	  public Door
	    left = new Door(),
	    right = new Door(); // 2-door
	  public Car() {
	    for(int i = 0; i < 4; i++)
	      wheel[i] = new Wheel();
	  }
	  public static void main(String[] args) {
	    Car car = new Car();
	    car.left.window.rollup();
	    car.wheel[2].inflate(72,2);
	  }
	}
