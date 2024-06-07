class VeriteTest {

  @Test
  public void testGetValeur() {
    Verite verite = new Verite("Lou est beau");
    assertTrue(verite.getValeur());
  }

  @Test
  public void testGetDescription() {
    Verite verite = new Verite("Lou est beau");
    assertEquals("Lou est beau", verite.getDescription());
  }
}
