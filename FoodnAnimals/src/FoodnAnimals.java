

public class FoodnAnimals {

  public static void main(String[] args) {
      Object[] objects = {new Cat(), new Cow(), new Pineapple()};
      for (int i = 0; i < objects.length; i++) {
        if (objects[i] instanceof Food)
          System.out.println(((Animal)objects[i]).howToEat());
        
        if (objects[i] instanceof Animal) {
          System.out.println(((Animal)objects[i]).sound());
          }
        }
      }
    }
  abstract class Animal { 
    private double weight;
    
    public double getWeight() {
      return weight;
      }
    
    public String howToEat() {
      return null;
    }

    public void setWeight(double weight) {
      this.weight = weight;
      }
    
    /** Return animal sound */
    public abstract String sound(); 
    }

  class Cow extends Animal implements Food { 
    @Override
    public String howToEat() { 
      return "Cow: Cook it";
      }
    
    @Override
    public String sound() { 
      return "Cow: Moo-mooo";
      }
    }

  class Cat extends Animal { 
    @Override
    public String sound() { 
      return "Cat: MEOW!";
      }
    }

  abstract class Fruit implements Food {

    public String howToEat() {
      return null;
      } 
    }

  class Pineapple extends Fruit { 
    @Override
    public String howToEat() { 
      return "Pinapple: Make Pinapple juice";
      }
    }

  class Grape extends Fruit { 
    @Override
    public String howToEat() { 
      return "Grape: Make Grape juice";

    }

  }
