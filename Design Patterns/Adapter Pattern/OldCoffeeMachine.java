public class OldCoffeeMachine {
  private CoffeePrograms programs = new CoffeePrograms();

  public void selectA() {
    programs.start('Black');
  }

  public void selectB() {
    programs.start('Cappucino');
  }
}
