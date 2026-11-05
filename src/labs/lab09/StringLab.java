
package labs.lab09;

public class StringLab {
    public static void main(String[] args) {

        String name = "Stephen";

        
        System.out.println(name.charAt(2));

        
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        
        for (char letter : name.toCharArray()) {
            System.out.print(letter + "\t");
        }
        System.out.println();

        
        System.out.println(name.startsWith("Ste"));
        System.out.println(name.endsWith("hen"));
        
        System.out.println(name.indexOf('e'));
        System.out.println(name.indexOf('z'));
        
        String fullname = name + " Pritt";
        System.out.println(fullname);
    
        StringBuilder sb = new StringBuilder("Bruce Springsteen ");
        sb.append("is the artist ever");
        int position = sb.indexOf("artist");        
        sb.insert(position, "mildest ");
        position = sb.indexOf("artist");
        sb.replace(position, position + "artist".length(), "rock singer");

        System.out.println(sb.toString());
        
    }
}
