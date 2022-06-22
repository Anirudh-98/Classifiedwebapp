package com.example.app.Api;
import com.example.app.Domain.User;
import com.example.app.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@AllArgsConstructor
public class UserEntity {

     private UserService userService;


    @RequestMapping("/")
    public String Welcome(){
        return "<h3>Welcome To login Page</h3>";
    }
    //To Display Admin HomePage
//    @RequestMapping("/admin")
//    public String Admin(){
//        return "Welcome Admin";
//    }
    //To Display User HomePage
    @RequestMapping("/user")
    public String User(){
        return "Welcome User";
    }
    //Display all Adds
    @GetMapping(value="/user/list")
    public List<User> getAdds(){
     return userService.getAllActiveUsers();
    }
    //To Add new Ads
    @PostMapping("/user/list/add")
    public User addAdd(@RequestBody User user){
        return userService.saveUser(user);
    }
    // Find by ID
    @GetMapping(value="/user/list/{id}")
    public Optional<User> getAdd(@PathVariable("id") Long id){
       return userService.getUserById(id);
    }
    // Find by Brand name
    @GetMapping("/user/list/brand/{brand}")
    public List<User> getByBrand (@PathVariable("brand") String brand ){
        return userService.getBrandByName(brand);
    }
    //Update the Ads
    @PutMapping(value = "/user/list/update/{id}")
    public User updateAdd(@PathVariable("id") Long id,@RequestBody  User user){
       return userService.updateUser(id,user);
    }
    //Delete the Ads
    @DeleteMapping(value = "/user/list/delete/{id}")
    public void deleteAdd(@PathVariable("id") Long  id){userService.deleteUser(id);}

}

