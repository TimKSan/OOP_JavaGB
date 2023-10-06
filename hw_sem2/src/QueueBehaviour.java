public interface QueueBehaviour {
    void toLongQueue(Actor actor);
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
