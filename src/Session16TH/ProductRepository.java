package Session16TH;

import java.util.*;

public class ProductRepository implements IRepositoryry<Product> {
    List<Product> products = new ArrayList<>();
    private Map<String, Product> productMap = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null || item.getId() == null) {
            return false;
        }

        products.add(item);
        productMap.put(item.getId(), item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null) {
            return false;
        }

        Product product = productMap.remove(id);
        if (product != null) {
            return products.remove(product);
        }

        return false;
    }

    @Override
    public Product findById(String id) {
        if (id == null) {
            return null;
        }
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products);
    }

    public void sortByPriceAsc() {
        Collections.sort(products, Comparator.comparingDouble(Product::getPrice));
    }
}
