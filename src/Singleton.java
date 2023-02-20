class Single {
    static Single n=null;  //static function can call static variable
    private Single()//no class other than current class can call the constructor as it is private
    {

    }
    static Single creatObject()
    {
        if(n==null) {
            n = new Single();
        }
        return n;

    }
}
class Singleton {
    public static void main(String[] args) {
        System.out.println(Single.creatObject());//same object is calling irrespective of number time you are making obj
        System.out.println(Single.creatObject());

    }

}




