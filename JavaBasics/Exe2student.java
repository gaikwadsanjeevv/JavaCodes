class Exe2Student {
    private String name;
    private int age;

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;

     }
     public String getName1() {
        return name;
     }
     public int getName2() {
        return age;
     }
     public static void main(String[] args) {
        Exe2Student std = new Exe2Student();
        std.setInfo("Sanjeev", 31);
        System.out.println("The name of student is "+std.getName1()+ " age is "+std.getName2());
     }

}





