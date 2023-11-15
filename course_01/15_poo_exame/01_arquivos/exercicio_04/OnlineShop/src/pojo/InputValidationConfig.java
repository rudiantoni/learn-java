package pojo;

public class InputValidationConfig<T> {
  private boolean emptyString;
  private boolean emailFormat;
  private boolean notInList;
  private T[] notInListData;
  public InputValidationConfig() {}

  public boolean isEmptyString() { return emptyString; }
  public void setEmptyString(boolean emptyString) { this.emptyString = emptyString;}

  public boolean isEmailFormat() { return emailFormat; }
  public void setEmailFormat(boolean emailFormat) { this.emailFormat = emailFormat; }

  public boolean isNotInList() { return notInList; }
  public void setNotInList(boolean notInList) { this.notInList = notInList; }

  public T[] getNotInListData() { return notInListData; }
  public void setNotInListData(T[] notInListData) {this.notInListData = notInListData;}

  public InputValidationConfig emptyString() {
    this.emptyString = true;
    return this;
  }
  public InputValidationConfig emailFormat() {
    this.emailFormat = true;
    return this;
  }

  public InputValidationConfig notInList(T[] notInListData) {
    this.notInList = true;
    this.notInListData = notInListData;
    return this;
  }

  @Override
  public String toString() {
    return "InputValidationConfig{" +
      "emptyString=" + emptyString +
      ", emailFormat=" + emailFormat +
      '}';
  }
}
