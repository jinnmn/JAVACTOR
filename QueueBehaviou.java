/**
 * QueueBehaviou
 */
public interface QueueBehaviou {
void takeInQueue(Actor actor);
void takeOrders(); // zakazat
void giveOrders(); // zabrat
void releaseFromQueue(); //exitQueue

}