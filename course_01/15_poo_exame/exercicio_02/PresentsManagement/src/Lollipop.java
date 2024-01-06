public class Lollipop extends Sweet {
  @Override
  Sweet copy() {
    Sweet newSweet = new Lollipop();
    newSweet.setName(this.getName());
    newSweet.setWeight(this.getWeight());
    newSweet.setSugarWeight(this.getSugarWeight());
    return newSweet;
  }
}
