package org.interview.common.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Category {

    private String id;

    private String pid;

    private String name;

    public Category(String id, String pid, String name) {
        this.id = id;
        this.pid = pid;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static void printRecursive(Map<String, List<Category>> map, String pid, Integer indent) {
        List<Category> list = map.get(pid);
        if(null == list) {
            return;
        }
        for(Category category : list) {
            System.out.println(indentString(indent) + category.getId() + " " + category.getName());
            printRecursive(map, category.getId(), indent + 1);
        }
    }

    private static void printHierarchy(List<Category> categoryList) {
        Map<String, List<Category>> map = new HashMap<>();
        for(Category category : categoryList) {
            List<Category> list = map.get(category.getPid());
            if(null == list) {
                list = new ArrayList<>();
            }
            list.add(category);
            map.put(category.getPid(), list);
        }
        printRecursive(map, "0", 0);
    }

    private static String indentString(Integer indent) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < indent * 3 ; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Category category1 = new Category("1", "0", "john");
        Category category2 = new Category("2", "0", "sam");
        Category category3 = new Category("3", "0", "peter");
        Category category4 = new Category("4", "1", "jim");
        Category category5 = new Category("5", "1", "vincent");
        Category category6 = new Category("6", "2", "paul");
        Category category7 = new Category("7", "2", "james");
        Category category8 = new Category("8", "3", "jenny");
        Category category9 = new Category("9", "1", "alton");
        Category category10 = new Category("10", "6", "eden");
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);
        categoryList.add(category4);
        categoryList.add(category5);
        categoryList.add(category6);
        categoryList.add(category7);
        categoryList.add(category8);
        categoryList.add(category9);
        categoryList.add(category10);

        printHierarchy(categoryList);
    }
}
