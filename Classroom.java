package java_quete_06;

public class Classroom {
    public static void main(String[] args) {

        Wilder member1 = new Wilder("Jean-Claude", true);
        Wilder member2 = new Wilder( "Henri", false);

        System.out.println(member1.whoAmI());
        System.out.println(member2.whoAmI());
    }
}
