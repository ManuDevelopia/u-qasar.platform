package eu.uqasar.web.provider.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import com.vaynberg.wicket.select2.Response;
import com.vaynberg.wicket.select2.TextChoiceProvider;

import eu.uqasar.model.role.Role;

/**
 *
 *
 * @param <T>
 */
public class UserRoleChoiceProvider  extends TextChoiceProvider<Role> {


    @Override
    public Collection<Role> toChoices(Collection<String> ids) {    	
    	ArrayList<Role> roles = new ArrayList<Role>();
    	
    	// TODO: Mapping String to Enum with translation
    	for(String id : ids){
    		switch (id){
    			case "Entwickler": id = "Developer"; break;
    			case "Tester": id = "Tester"; break;
    			case "Anonym": id = "NoRole"; break;
    			case "Benutzer": id = "User"; break;
    			case "Requirements Engineer": id = "ReqsEngineer"; break;
    			case "Design Engineer": id = "DesignEngineer"; break;
    			case "Scrum Master": id = "ScrumMaster"; break;
    			case "Produkt Manager": id = "ProductManager"; break;
    			case "Prozess Manager": id = "ProcessManager"; break;
    		}
    		
    		
    		roles.add(Role.valueOf(id));
    	} 	
    	
    
    	
        return roles;
    }
    
    @Override
	protected String getDisplayText(Role choice) {
	    return choice.name();
    }
	@Override
	protected Object getId(Role choice) {
	    return choice;
	}

	@Override
	public void query(String term, int page, Response<Role> response) {
		response.addAll(Role.getAllRoles());
		response.setHasMore(response.size() == 9);
		
	}
}