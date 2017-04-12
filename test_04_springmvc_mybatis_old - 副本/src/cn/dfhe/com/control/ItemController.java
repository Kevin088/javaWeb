package cn.dfhe.com.control;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.dfhe.com.pojo.Item;
import cn.dfhe.com.service.ItemService;

@Controller
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/itemList")
	public ModelAndView itemList() throws Exception{
		List<Item>list=itemService.getItemList();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemList",list);
		modelAndView.setViewName("itemList");
		return modelAndView;
	}
	@RequestMapping("/itemSelectList")
	public ModelAndView searchItemList(Item item) throws Exception{
		List<Item>list=itemService.searchItemList(item);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("itemList",list);
		modelAndView.setViewName("itemList");
		return modelAndView;
	}
	@RequestMapping("/itemEdit")
	public ModelAndView findItemById(Item item_) throws Exception{
		Item item=itemService.findItemById(item_);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("item",item);
		modelAndView.setViewName("editItem");
		return modelAndView;
	}
	
	@RequestMapping("/itemUpdate")
	public String itemUpdate(Item item) throws Exception{
		itemService.updateItem(item);
		return "redirect:itemList.action";
	}
	@RequestMapping("/itemDel")
	public String itemDelete(Item item) throws Exception{
		itemService.deleteItem(item);
		return "redirect:itemList.action";
	}
	@RequestMapping("/itemAddView")
	public ModelAndView itemAddView(Item item) throws Exception{
		ModelAndView modelAndView=new ModelAndView();	
		modelAndView.setViewName("addItem");
		return modelAndView;
	}
	@RequestMapping("/itemInsert")
	public String itemAdd(Item item) throws Exception{
		item.setCreatetime(new Date());
		itemService.addItem(item);
		return "redirect:itemList.action";
	}
}
