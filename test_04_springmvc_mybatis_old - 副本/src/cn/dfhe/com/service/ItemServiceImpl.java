package cn.dfhe.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.dfhe.com.dao.ItemDao;
import cn.dfhe.com.pojo.Item;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private ItemDao itemDao;
	
	@Override
	public List<Item> getItemList() {
		return itemDao.getItemList();
	}
	@Override
	public List<Item> searchItemList(Item item) {
		return itemDao.searchItemList(item);
	}
	@Override
	public Item findItemById(Item item) {
		return itemDao.findItemById(item);
	}
	@Override
	public void updateItem(Item item) {
		itemDao.updateItem(item);
	}
	@Override
	public void deleteItem(Item item) {
		itemDao.deleteItem(item);
	}
	@Override
	public void addItem(Item item) {
		itemDao.insertItem(item);
	}
}
