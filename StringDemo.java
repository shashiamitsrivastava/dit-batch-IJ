public class StringDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        synchronized(sb){
        sb.append("Amit");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        }
        System.out.println(sb.length());
        sb.append("jhlfkdjhjfglkfjlkgkljlkfjfdlgjdflkgjldfjglkjfd");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // String sql = "select * from users";
        // sql = sql + " where name = 'Amit'";

        // String name = "amit"; // String Literal
        // System.out.println(name.toUpperCase());
        // System.out.println(name);
        // // 1 object or 0 object
        // String name2 = "Amit".intern();
        // System.out.println(name == name2);
        // String name3 = new String("Amit").intern();
        // // 2 or 1 object
        // System.out.println(name == name3);
        //String name2 = new String("Amit");
    }
}
