package user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@PostMapping
	public void addUserDetails(TblUser tblUser) {
			userService.save(tblUser);
	}
	
}
