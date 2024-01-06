public class Cookie extends Sweet {
  @Override
  Sweet copy() {
    Sweet newSweet = new Cookie();
    newSweet.setName(this.getName());
    newSweet.setWeight(this.getWeight());
    newSweet.setSugarWeight(this.getSugarWeight());
    return newSweet;
  }
}
