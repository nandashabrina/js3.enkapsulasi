public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");     
        System.out.println("Name : " + encap.getName());
        encap.setAge(20);
        System.out.println("Age  : " + encap.getAge());

        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Johnny");
        System.out.println("Name : " + encap2.getName());
        encap2.setAge(35);
        System.out.println("Age  : " + encap2.getAge());
    }
}
