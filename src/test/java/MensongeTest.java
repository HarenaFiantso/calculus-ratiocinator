import static org.junit.jupiter.api.Assertions.assertFalse;

import com.projet1.affirmation.Mensonge;
import org.junit.jupiter.api.Test;

class MensongeTest {

  @Test
  public void lou_est_pauvre() {
    Mensonge mensonge = new Mensonge("Lou est pauvre");
    assertFalse(mensonge.getValeur());
  }
}
