package com.Project;

import com.Project.lastprojectcreditCardInfo.customers;
import com.Project.services.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class RestAPIController {

    @Autowired
    private CreditService service;


    @GetMapping("/")
    public List<customers> getAllInfo(){
        return getAllInfo();
    }

    @PostMapping("/customers")
    public customers addCustomer(customers creditCard){
        return addCustomer(creditCard);
    }

//    @GetMapping("/customers/{_id}")
//        public ResponseEntity<customers> getCreditCardById (@PathVariable String _id){
//            Optional<customers> creditCard = creditCardRepository.findById(_id);
//            return creditCard.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
//
//        }
//
//   @PutMapping("/new_customers/{_id}")
//        public ResponseEntity<customers> updateCreditCard(@PathVariable String _id, @RequestBody customers updatedCard) {
//            if (!creditCardRepository.existsById(_id)) {
//                return ResponseEntity.notFound().build();
//            }
//            updatedCard.set_id(_id);
//            customers savedCard = creditCardRepository.save(updatedCard);
//            return ResponseEntity.ok(savedCard);
//        }
//   @DeleteMapping("/delete_customers/{_id}")
//        public ResponseEntity<Void> deleteCreditCard(@PathVariable String _id) {
//            if (!creditCardRepository.existsById(_id)) {
//                return ResponseEntity.notFound().build();
//            }
//            creditCardRepository.deleteById(_id);
//            return ResponseEntity.noContent().build();
//        }

    }





