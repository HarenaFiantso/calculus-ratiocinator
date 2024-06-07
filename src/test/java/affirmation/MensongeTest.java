package affirmation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.projet1.affirmation.Mensonge;
import org.junit.jupiter.api.Test;

class MensongeTest {

  @Test
  void lou_est_pauvre() {
    Mensonge mensonge = new Mensonge("Lou est pauvre");
    assertEquals("faux", mensonge.getValeur());
  }
}
