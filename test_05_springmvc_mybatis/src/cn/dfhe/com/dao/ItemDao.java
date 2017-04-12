package cn.dfhe.com.dao;

import java.util.List;

import cn.dfhe.com.pojo.Item;

public interface ItemDao {
	public List<Item> getItemList();
	public List<Item> searchItemList(Item item);
	public Item findItemById(Item item);
	public void updateItem(Item item);
	public void deleteItem(Item item);
	public void insertItem(Item item);
}
