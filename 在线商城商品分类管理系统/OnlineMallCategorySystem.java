package 在线商城商品分类管理系统;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineMallCategorySystem {
	// 定义在线商城商品分类管理系统类
	    private Map<String, List<Product>> categoryMap;

	    public OnlineMallCategorySystem() {
	        this.categoryMap = new HashMap<>();
	    }

	    // 添加商品分类的方法
	    public void addCategory(String categoryName) {
	        if (!categoryMap.containsKey(categoryName)) {
	            categoryMap.put(categoryName, new ArrayList<>());
	        }
	    }

	    // 添加商品到指定分类的方法
	    public void addProductToCategory(String categoryName, Product product) {
	        categoryMap.computeIfAbsent(categoryName, k -> new ArrayList<>()).add(product);
	    }

	    // 显示所有分类及商品的方法
	    public void displayAllCategoriesAndProducts() {
	        for (Map.Entry<String, List<Product>> entry : categoryMap.entrySet()) {
	            String category = entry.getKey();
	            List<Product> products = entry.getValue();
	            System.out.println("分类: " + category);
	            for (Product product : products) {
	                System.out.println("  " + product);
	            }
	        }
	    }

	    // 计算某个分类下商品总价的方法
	    public double calculateTotalPriceInCategory(String categoryName) {
	        List<Product> products = categoryMap.get(categoryName);
	        if (products == null) {
	            return 0;
	        }
	        double totalPrice = 0;
	        for (Product product : products) {
	            totalPrice += product.getPrice();
	        }
	        return totalPrice;
	    }

	    // 查找包含特定商品的分类的方法
	    public List<String> findCategoriesWithProduct(String productName) {
	        List<String> categories = new ArrayList<>();
	        for (Map.Entry<String, List<Product>> entry : categoryMap.entrySet()) {
	            String category = entry.getKey();
	            List<Product> products = entry.getValue();
	            for (Product product : products) {
	                if (product.getName().equals(productName)) {
	                    categories.add(category);
	                    break;
	                }
	            }
	        }
	        return categories;
	    }
	}

