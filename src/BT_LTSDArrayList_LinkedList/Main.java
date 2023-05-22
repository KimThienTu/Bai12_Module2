package BT_LTSDArrayList_LinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Sửa thông tin sản phẩm theo Id");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Hiển thị danh sách sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo giá giảm dần");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập ID sản phẩm");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm:");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá sản phẩm:");
                    double price = scanner.nextDouble();
                    Product product = new Product(id, name, price);
                    productManager.addProduct(product);
                    break;
                case 2:
                    System.out.println("Nhập ID muốn sửa");
                    int updateId = scanner.nextInt();
                    System.out.println("Nhập giá mới: ");
                    double newPrice = scanner.nextDouble();
                    productManager.updateProduct(updateId, newPrice);
                    break;
                case 3:
                    System.out.println("Nhập ID sản phẩm để xóa: ");
                    int removeId = scanner.nextInt();
                    productManager.removeProduct(removeId);
                    break;
                case 4:
                    productManager.displayProducts();
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    productManager.searchProduct(searchName);
                    break;
                case 6:
                    productManager.sortProductsAscending();
                    break;
                case 7:
                    productManager.sortProductsDescending();
                    break;
                case 0:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại");
            }

            System.out.println();
        } while (choice != 0);
        scanner.close();
    }
}
