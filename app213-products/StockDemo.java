
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author (Stefan Allen) 
 * @version (02/11/2021)
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Mercedes AMG GT"));
        stock.add(new Product(102, "BMW M8 GC"));
        stock.add(new Product(103, "Audi RS3"));
        stock.add(new Product(104, "Brabus E63S AMG"));
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 500);
        stock.buyProduct(102, 200);
        stock.buyProduct(103, 100);
        stock.buyProduct(104, 50);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 300);
        stock.sellProduct(102, 500);
        stock.sellProduct(103, 300);
        stock.sellProduct(104, 300);
    }    
    
}