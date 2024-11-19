import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TabletUtil {
	
	public List<Tablet> retrieveTabletsByBrand(Stream<Tablet> tabletStream, String brand) {
        
        //Fill the code here
		

        return tabletStream.filter(t->t.getBrand().equalsIgnoreCase(brand)).toList();
    }
	
	public List<String> getTabletsAboveMg(Stream<Tablet> tabletStream, int mg) {
	    
	    //Fill the code here
	    
	    return tabletStream.filter(f->f.getMg() >= mg).map(Tablet :: getName).toList();
//	    return tabletStream.filter().max();
		//return null;
	}
}

