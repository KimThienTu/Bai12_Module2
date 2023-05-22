package BT_LTSDArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products;

    public ProductManager(){
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("Đã thêm sản phẩm thành công.");
    }

    public void updateProduct(int id, double newPrice){
        for (Product product : products){
            if (product.getId() == id){
                product.setPrice(newPrice);
                System.out.println("Đã cập nhật sản phẩm thành công.");
                return;
            }
        }
        System.out.println("Không có sản phẩm");
    }

    public void removeProduct(int id){
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getId() == id){
                products.remove(i);
                System.out.println("Đã xóa sản phẩm thành công");
                return;
            }
        }
        System.out.println("Không có sản phẩm");
    }

    public void displayProducts(){
        if (products.isEmpty()){
            System.out.println("Không tìm thấy sản phẩm nào.");
        } else {
            for (Product product : products)
                System.out.println(product);
        }
    }

    public void searchProduct(String name){
        ArrayList<Product> searchResults = new ArrayList<>();
        for (Product product : products){
            if (product.getName().equalsIgnoreCase(name)){
                searchResults.add(product);
            }
        }

        if (searchResults.isEmpty()){
            System.out.println("Không tìm thấy sản phẩm nào có tên đã cho.");
        } else {
            System.out.println("Kết quả tìm kiếm");
            for (Product product : searchResults){
                System.out.println(product);
            }
        }
    }

    public void sortProductsAscending(){
        Collections.sort(products, Comparator.comparing(Product::getPrice));
        System.out.println("Sản phẩm sắp xếp theo giá tăng dần");
        displayProducts();
    }

    public void sortProductsDescending(){
        Collections.sort(products, Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Sản phẩm được sắp xếp theo thứ tự giá giảm dần.");
        displayProducts();
    }
}
