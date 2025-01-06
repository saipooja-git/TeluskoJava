public class Strings{
    public static void main(String[] args) {
        String name = "Sai Pooja";
        System.out.println("concat: "+name.concat(" Reddy"));
        System.out.println("charAt: "+name.charAt(2));
System.out.println("StringBuffer");
        StringBuffer sb = new StringBuffer(name);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" Reddy "));
        System.out.println(sb.insert(0, "Palle "));

System.out.println("StringBuilder");
        StringBuilder sb1 = new StringBuilder(name);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.append(" Reddy "));
        System.out.println(sb.insert(0, "Palle "));
    }
}