package edu.icet.bo.asset;import edu.icet.model.Product;import javafx.collections.ObservableList;public interface PlaceOrderBo {    ObservableList<String> getProductIds();    Product getProductById(String id);    ObservableList<Product> getAllProducts();    int getLatestCartId();}