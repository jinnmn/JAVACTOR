import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviou {

    private List<Actor> actors = new ArrayList<>(); 
    private List<String> goods = new ArrayList<>();

    public Market() {
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " входит в ларек");   
        takeInQueue(actor);
    } 
    @Override
    public void releaseFromMarket() {
        if (actors.get(0).isTakeOrder()) {
            System.out.println(actors.get(0).getName() + " довольный выходит из ларька");
            releaseFromQueue();
        } else System.out.println(actors.get(0).getName() + " почемуто не вышел((");
    }   
    @Override
    public void update(List<String> items) {
        goods.addAll(items); 
        System.out.println(goods + " в наличии");      
    }


    @Override
    public void giveOrders() {
        actors.get(0).setMakeOrder(true); 
        takeOrders();       
    }
    @Override
    public void takeOrders() {
        if (!goods.isEmpty()) {
            System.out.println(actors.get(0).getName() 
            + " забирает " 
            + goods.get(0));
            goods.remove(0);
            actors.get(0).setMakeOrder(false); 
            actors.get(0).setTakeOrder(true); 
            releaseFromMarket();
        } else System.out.println("Недостаточно товаров");       
    }
    @Override
    public void releaseFromQueue() {
        actors.remove(0);
        
    }
    @Override
    public void takeInQueue(Actor actor) {
        this.actors.add(actor);
        giveOrders();        
    }

   
    
}
