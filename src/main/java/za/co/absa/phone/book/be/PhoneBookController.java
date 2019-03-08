package za.co.absa.phone.book.be;

import za.co.absa.phone.book.be.model.PhoneBook;
import za.co.absa.phone.book.be.service.PhoneBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class PhoneBookController {

  @Autowired private PhoneBookService phoneBookService;

  @RequestMapping(value = "/Services/phoneBook/findById", method = RequestMethod.GET)
  PhoneBook findById(@RequestParam long id) {
    return phoneBookService.findOne(id);
  }

  @RequestMapping(value = "/Services/phoneBook/save", method = RequestMethod.POST)
  PhoneBook save(@RequestBody PhoneBook phoneBook) {
    return phoneBookService.save(phoneBook);
  }

  @RequestMapping(value = "/Services/phoneBook/update", method = RequestMethod.PUT)
  PhoneBook update(@RequestBody PhoneBook phoneBook) {
    return phoneBookService.save(phoneBook);
  }

  @RequestMapping(value = "/Services/phoneBook/delete", method = RequestMethod.DELETE)
  Map delete(@RequestParam long id) {
    phoneBookService.delete(id);
    Map<String, String> status = new HashMap<>();
    status.put("Status", "Success");
    return status;
  }

  @RequestMapping(value = "/Services/phoneBook/findAll", method = RequestMethod.GET)
  List<PhoneBook> getPhoneBookEntries() {
    return phoneBookService.findAll();
  }
}
