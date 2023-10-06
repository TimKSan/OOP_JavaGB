import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour {
    
    int count = 0;
    private final List<Actor> actors;
    
    public Market() {
        this.actors = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин"); 
        this.count++; 
        toLongQueue(actor);      
    }

    @Override
    public void toLongQueue(Actor actor) {
        if (count > 2) {
            System.out.println(actor.getName() + " ну нафиг, чет народу много");
            actors.remove(actor);
        } else takeInQueue(actor);
    }
    
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.actors.add(actor);
    }

    @Override
    public void takeOrders() {
        for(Actor actor: actors){
            if(!actor.isMakeOrder()){
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }
    
    @Override
    public void giveOrders() {
        for(Actor actor: actors){
            if(actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " забрал покупки");
            }
        }
    }
    
    @Override
    public void releaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for(Actor actor: actors){
            if(actor.isTakeOrder()){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " покинул очередь");
            }
        }
        releaseFromMarket(releasedActors);
    }
    
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println(actor.getName() + " вышел из магазина");
            this.actors.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
    
}
