public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human = new Human("Pavel");
        Human human2 = new Human("Gena");
        Human human3 = new Human("Tim");

        market.acceptToMarket(human);
        market.acceptToMarket(human2);
        market.acceptToMarket(human3);
        market.update();
    }
}
