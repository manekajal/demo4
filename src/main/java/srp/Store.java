package srp;

public class Store {


   public static void main(String[] args)
    {
        Customer customer1 = new Customer();
        customer1.setName("John");
        customer1.setAddress("Pune");
        Order order1 = new Order();
        order1.setItemName("Pizza");
        order1.setQuantity(2);
        order1.setCustomer(customer1);

        order1.prepareOrder();

        bill billCalculation
                = new bill(order1);
        billCalculation.calculateBill();

        Delivery deliveryApp = new Delivery(order1);
        deliveryApp.delivery();
    }


}
