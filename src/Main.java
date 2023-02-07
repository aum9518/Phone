public class Main {
    public static void main(String[] args) {
        //TODO charachteristic of phone
        Phone phone = new Phone("Iphone","IOS 16",8.7);
        phone.setPrice(30000);
        phone.setMemory(32);
      //  System.out.println("Brand: "+phone.brand+"\nVersion: "+phone.version+"\nScreen: "+phone.screen+"\nPrice: "+phone.getPrice()+"\nMemory: "+phone.getMemory());
        System.out.println();

        Phone phone1 = new Phone("Samsung","Android 16",7.7);
        phone1.setPrice(5000);
        phone1.setMemory(64);
       // System.out.println("Brand: "+phone1.brand+"\nVersion: "+phone1.version+"\nScreen: "+phone1.screen+"\nPrice: "+phone1.getPrice()+"\nMemory: "+phone1.getMemory());

        Phone phone2 = new Phone("Samsung","Android 16",7.7);
        phone2.setPrice(80000);
        phone2.setMemory(64);
      //  System.out.println("Brand: "+phone1.brand+"\nVersion: "+phone1.version+"\nScreen: "+phone1.screen+"\nPrice: "+phone1.getPrice()+"\nMemory: "+phone1.getMemory());
        Phone phone3 = new Phone("Samsung","Android 16",7.7);
        phone3.setPrice(70000);
        phone3.setMemory(64);
     //   System.out.println("Brand: "+phone1.brand+"\nVersion: "+phone1.version+"\nScreen: "+phone1.screen+"\nPrice: "+phone1.getPrice()+"\nMemory: "+phone1.getMemory());
        Phone phone4 = new Phone("Samsung","Android 16",7.7);
        phone4.setPrice(10000);
        phone4.setMemory(64);
    //    System.out.println("Brand: "+phone1.brand+"\nVersion: "+phone1.version+"\nScreen: "+phone1.screen+"\nPrice: "+phone1.getPrice()+"\nMemory: "+phone1.getMemory());

        //TODO Employment
        Person person = new Person("Manas",28,"development",50000,phone);
        Person person1 = new Person("Erjigit",28,"development",40000,phone1);
        Person person2 = new Person("Abdymomun",28,"development",60000,phone2);
        Person person3 = new Person("Matmusa",28,"development",70000,phone3);
        Person person4 = new Person("Ruslan",28,"development",30000,phone4);

        Person[] person5=new Person[]{person,person1,person2,person3,person4};
        int min=person4.salary;
        int max = person4.salary;
        int expensive = person5.length;
        for (Person s:person5) {
            System.out.println();
            System.out.println("Name: "+s.name+"\nAge: "+s.age+"\nWork: "+s.work+"\nSalary: "+s.salary+"\nPhone: "+s.phone.brand+"\nPrice of phone: "+s.phone.getPrice());
        }
        for (int i = 0; i < person5.length; i++) {

            if (min>person5[i].salary){
                min=person5[i].salary;
            } else if (max<person5[i].salary) {
                max=person5[i].salary;
            }
            if (expensive<person5[i].phone.getPrice()){
                expensive=person5[i].phone.getPrice();
            }
        }

        System.out.println("Min salary: "+min+"\nMax salary: "+max+"\nMost expensive phone: "+expensive);
    }
}