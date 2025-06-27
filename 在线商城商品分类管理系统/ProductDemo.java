package 在线商城商品分类管理系统;



import java.util.List;
import java.util.Scanner;

// 定义商品类
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "商品名称: " + name + ", 价格: " + price;
    }
}



public class ProductDemo {
    public static void main(String[] args) {
        OnlineMallCategorySystem mallSystem = new OnlineMallCategorySystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请选择操作：");
            System.out.println("1. 添加商品分类");
            System.out.println("2. 添加商品到分类");
            System.out.println("3. 显示所有分类及商品");
            System.out.println("4. 计算某个分类下商品的总价");
            System.out.println("5. 查找包含特定商品的分类");
            System.out.println("6. 退出");

            String choiceStr = scanner.nextLine();
            int choice = Integer.parseInt(choiceStr);

            switch (choice) {
                case 1:
                    System.out.println("请输入商品分类名称：");
                    String categoryName = scanner.nextLine();
                    mallSystem.addCategory(categoryName);
                    System.out.println("商品分类添加成功！");
                    break;
                case 2:
                    System.out.println("请输入商品分类名称：");
                    String targetCategory = scanner.nextLine();
                    System.out.println("请输入商品名称：");
                    String productName = scanner.nextLine();
                    System.out.println("请输入商品价格：");
                    String productPriceStr = scanner.nextLine();
                    Double productPrice = Double.parseDouble(productPriceStr);
                    Product product = new Product(productName, productPrice);
                    mallSystem.addProductToCategory(targetCategory, product);
                    System.out.println("商品添加到分类成功！");
                    break;
                case 3:
                    mallSystem.displayAllCategoriesAndProducts();
                    break;
                case 4:
                    System.out.println("请输入要计算总价的分类名称：");
                    String calculateCategory = scanner.nextLine();
                    double totalPrice = mallSystem.calculateTotalPriceInCategory(calculateCategory);
                    System.out.println(calculateCategory + " 分类下商品的总价是：" + totalPrice);
                    break;
                case 5:
                    System.out.println("请输入要查找的商品名称：");
                    String searchProduct = scanner.nextLine();
                    List<String> categories = mallSystem.findCategoriesWithProduct(searchProduct);
                    if (categories.isEmpty()) {
                        System.out.println("未找到包含 " + searchProduct + " 的分类。");
                    } else {
                        System.out.println("包含 " + searchProduct + " 的分类有：" + categories);
                    }
                    break;
                case 6:
                    System.out.println("退出在线商城商品分类管理系统。");
                    scanner.close();
                    return;
                default:
                    System.out.println("无效的选择，请重新输入。");
            }
        }
    }
}
