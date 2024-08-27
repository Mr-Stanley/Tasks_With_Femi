package Test;
import Task.CheckProduct;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CheckProductTest {
    @Test

    public void check_If_Theproduct_matches(){
        CheckProduct checkProduct = new CheckProduct();
        int [] number = {-10, -3, 5, 6, -2 };
        int product = 30;
        assertEquals(product, checkProduct.theProducts(number));
    }
}
