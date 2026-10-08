import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Paragraph p1 = new Paragraph("hello my name is musptah");
        Paragraph p2 = new Paragraph("hello my name is Ahmed");
        Paragraph p3 = new Paragraph("I love the sunset");
        Elements button = new ButtonAdapter();   

        
        Div content = new Div(new ArrayList<>(List.of(p1, p2)));
        Elements section = new Border(new Header(content));

        
        Elements footerParagraph = new Footer(p3);
        Elements borderedButton  = new Border(button);

        
        Div page = new Div(new ArrayList<>(List.of(
                section, footerParagraph, borderedButton)));

        Elements finalPage = new Footer(new Header(page));

        finalPage.render();
    }
}