package pubs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleRest {
	@Autowired
	TitleRepo tr;
	
	@GetMapping("/title")
    public List<String> getTitle(@RequestParam("minp") Double minp,@RequestParam("maxp") Double maxp)
    {
    	return tr.getTitleByPriceBetween(minp, maxp);
    	
    }
	@PutMapping("/title/id")
	public void updatePrice(@RequestParam("id") String id,@RequestParam("price") Double price)
	{
	    var a=tr.findById(id).get();
	    a.setPrice(price);
	    tr.save(a);
	}
	
	@GetMapping("/title/type")
	public List<PubsTitle> getTitles(@RequestParam("type") String type)
	{
		return tr.findTitleByType(type);
		
	}
	

	
}
