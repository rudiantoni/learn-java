public class Candy extends Sweet {
  @Override
  Sweet copy() {
    Sweet newSweet = new Candy();
    newSweet.setName(this.getName());
    newSweet.setWeight(this.getWeight());
    newSweet.setSugarWeight(this.getSugarWeight());
    return newSweet;
  }
}
