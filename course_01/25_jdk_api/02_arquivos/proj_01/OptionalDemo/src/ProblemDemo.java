public class ProblemDemo {
  public static void main(String[] args) {
    Computer computer = new Computer();
    UsbDrive usbDrive = computer.getUsbDrive();

    if (usbDrive != null) {
      WriteProtectSwitch writeProtectSwitch = usbDrive.getWriteProtectSwitch();
      if (writeProtectSwitch != null) {
        // some code for write protect switch
      }
    } else {

    }

  }

  private static class Computer {
    private UsbDrive usbDrive;
    public UsbDrive getUsbDrive() {
      return this.usbDrive;
    }
  }

  private static class UsbDrive {
    private WriteProtectSwitch writeProtectSwitch;
    public WriteProtectSwitch getWriteProtectSwitch() {
      return writeProtectSwitch;
    }
  }

  private static class WriteProtectSwitch {
  }
}
