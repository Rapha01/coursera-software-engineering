public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
  private OldCoffeeMachine machine;

  public void connect(OldCoffeeMachine currentMachine) {
    this.machine = currentMachine;
  }

  public void chooseFirstSelection() {
    machine.selectA();
  }

  public void chooseSecondSelection() {
    machine.selectB();
  }
}
