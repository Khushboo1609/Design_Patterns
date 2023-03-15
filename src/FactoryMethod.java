class Bus extends Vehicle{
     String color;
     int capacity;
}
class Scooter extends Vehicle{
    String color;
    int capacity;

}
class Vehicle {

}
class factory
{
    static Vehicle createObject(String type)
    {
        switch(type)
        {
            case "Bus":
                return new Bus();
            case "Scooter":
                return new Scooter();

        }
        return null;
    }
}
class Factor{
    public static void main(String[] args) {
       Vehicle v=factory.createObject("Scooter");
        System.out.println(v);

    }
}







