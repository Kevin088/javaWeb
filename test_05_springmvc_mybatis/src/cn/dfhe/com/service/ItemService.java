package cn.dfhe.com.service;

import java.util.List;

import cn.dfhe.com.pojo.Item;

public interface ItemService {
	public List<Item>getItemList();
	public List<Item>searchItemList(Item item);
	public Item findItemById(Item item);
	public void updateItem(Item item);
	public void deleteItem(Item item);
	public void addItem(Item item);
	public void exportItem();
}
