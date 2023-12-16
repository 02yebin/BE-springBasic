package hello.itemservice.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @GetMapping("/itemList")
    public String getItemListForm(){
        return "ItemListForm";
    }

    @GetMapping("/itemDetail")
    public String getItemDetailForm(){
        return "ItemDetailForm";
    }

    @GetMapping("/itemSave")
    public String getItemSaveForm(){
        return "ItemSaveForm";
    }

    @GetMapping("/itemUpdate")
    public String getItemUpdateForm(){
        return "ItemUpdateForm";
    }
}
