package homework1;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class FigurePainter3 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
