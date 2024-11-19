public class GadgetValidatorUtil {
    public boolean validateGadgetID(String gadgetID) throws InvalidGadgetException {
        // Fill the code here
    	if(gadgetID.matches("^[A-Z]\\d{3}$")) {
    		return true;
    	}
    	else {
    		throw new InvalidGadgetException("Invalid gadget ID");
    	}
//        return false;
    }

    public boolean validateWarrantyPeriod(int period) throws InvalidGadgetException {
        // Fill the code here
    	if (period >= 6 && period <= 36) {
			return true;
		} else {
	    	throw new InvalidGadgetException("Invalid warranty period");

		}
    	
//        return false;
    }
}
//ist.stream().filter(e->e.getSalary()>25000).map(n->n.getSalary()+5000).collect(Collectors.toList()).forEach(System.out::println);