import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> goods = new ArrayList<>();
        goods.add("Пивасик");
        goods.add("Компотик");
        Actor a1 = new Human("Толян");
        Actor a2 = new Human("Колян");
        Actor a3 = new Human("Баян");

        Market larek = new Market();
        larek.update(goods);

        larek.acceptToMarket(a1);
        larek.acceptToMarket(a2);
        larek.acceptToMarket(a3);
    }
}
