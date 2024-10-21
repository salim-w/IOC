package dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaoImplTest {
    
 
    public void testGetValue() {
        IDao dao = new DaoImpl();
        double value = dao.getValue();
        Assertions.assertEquals(100.0, value, "La valeur doit être 100.0");
    }
}
