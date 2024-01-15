import java.awt.*;
import java.awt.image.MultiResolutionImage;
import java.util.List;

public class SimpleMultiResolutionImage implements MultiResolutionImage {
  private final List<Image> resolutionVariants;

  public SimpleMultiResolutionImage(List<Image> resolutionVariants) {
    this.resolutionVariants = resolutionVariants;
  }

  @Override
  public Image getResolutionVariant(double destImageWidth, double destImageHeight) {
    // In a real implementation, you would choose the best variant based on the destination size
    // For simplicity, let's return the first variant
    return resolutionVariants.get(0);
  }

  @Override
  public List<Image> getResolutionVariants() {
    return resolutionVariants;
  }
}
