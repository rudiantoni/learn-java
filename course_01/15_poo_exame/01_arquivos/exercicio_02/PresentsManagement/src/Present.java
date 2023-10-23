public class Present {
  private Sweet[] sweets;

  public Present() {
    sweets = new Sweet[]{};
  }
  public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
    String foundSweetIndexes = "";
    Sweet[] currentSweets = filterNonNullSweets(sweets);
    for (int i = 0; i < currentSweets.length; i++) {
      Sweet sweet = currentSweets[i];
      if (sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight() <= maxSugarWeight) {
        foundSweetIndexes += i + ",";
      }
    }

    if (!foundSweetIndexes.isEmpty()) {
      String[] sweetIndexes = foundSweetIndexes.split(",");
      Sweet[] filterResult = new Sweet[sweetIndexes.length];
      int idxToAdd = 0;
      for (String sweetIndexAsStr: sweetIndexes) {
        int idx = Integer.parseInt(sweetIndexAsStr);
        filterResult[idxToAdd++] = currentSweets[idx];
      }
      return filterResult;
    } else {
      return new Sweet[]{};
    }
  }

  public double calculateTotalWeight() {
    double totalWeight = 0.0;
    for (Sweet sweet: sweets) {
      if (sweet != null) {
        totalWeight += sweet.getWeight();
      }
    }
    return totalWeight;
  }


  public void addSweet(Sweet sweet) {
    if (sweet != null) {
      Sweet[] currentSweets = sweets;
      int totalSize = currentSweets.length + 1;

      Sweet[] newSweets = new Sweet[totalSize];
      for (int i = 0; i < totalSize; i++) {
        if (i > currentSweets.length - 1) {
          newSweets[i] = sweet;
        } else {
          newSweets[i] = currentSweets[i];
        }
      }

      sweets = filterNonNullSweets(newSweets);
    }
  }

  public Sweet[] getSweets() {
    Sweet[] currentSweets = filterNonNullSweets(sweets);
    Sweet[] newSweets = new Sweet[currentSweets.length];
    int idxToAdd = 0;
    for (Sweet currentSweet : currentSweets) {
      if (currentSweet != null) {
        newSweets[idxToAdd++] = currentSweet.copy();
      }
    }
    return newSweets;
  }

  private int countNonNullSweets(Sweet[] sweets) {
    int validSweet = 0;
    for (Sweet sweet: sweets) {
      if (sweet != null) {
        validSweet++;
      }
    }
    return validSweet;
  }

  private Sweet[] filterNonNullSweets(Sweet[] sweets) {
    int validSweets = countNonNullSweets(sweets);
    Sweet[] filteredSweets = new Sweet[validSweets];
    int nextIdxToAdd = 0;
    for (Sweet sweet : sweets) {
      if (sweet != null) {
        filteredSweets[nextIdxToAdd++] = sweet;
      }
    }
    return filteredSweets;
  }
}
