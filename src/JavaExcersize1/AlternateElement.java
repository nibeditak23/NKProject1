package JavaExcersize1;

public class AlternateElement {
    public static void main(String[] args) {
        String[] altElement = new String[6];
        altElement[0] = "Pune";
        altElement[1] = "BBSR";
        altElement[2] = "CTC";
        altElement[3] = "Mumbai";
        altElement[4] = "Toronto";
        altElement[5] = "London";

        for (int i=0;i<altElement.length;i++) {
            System.out.println(altElement[i]);
            i++;
        }
    }
}
