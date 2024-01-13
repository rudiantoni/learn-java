import java.util.Optional;

public class SolutionDemo {
  public static void main(String[] args) {
    Computer computer = new Computer();
    Optional<UsbDrive> usbDriveOpt = computer.getUsbDrive();
    computer.getUsbDrive().ifPresent(drive ->
      drive.getWriteProtectSwitch()
        .ifPresent(switcher -> System.out.println(switcher.isSwitchedOn()))
    );
    computer.getUsbDrive().orElseGet(() -> {
      System.out.println("Nenhum drive USB localizado");
      return null;
    });
  }

  private static class Computer {
    private UsbDrive usbDrive;
    public Optional<UsbDrive> getUsbDrive() {
      return Optional.ofNullable(this.usbDrive);
    }
  }

  private static class UsbDrive {
    private WriteProtectSwitch writeProtectSwitch;
    public Optional<WriteProtectSwitch> getWriteProtectSwitch() {
      return Optional.ofNullable(this.writeProtectSwitch);
    }
  }

  private static class WriteProtectSwitch {
    private boolean switchedOn;
    public boolean isSwitchedOn() {
      return this.switchedOn;
    }
  }
}
