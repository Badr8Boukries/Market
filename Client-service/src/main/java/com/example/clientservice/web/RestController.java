package com.example.clientservice.web;

import com.example.clientservice.entities.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    ClientRepository clientRepository;


@GetMapping("/client")
    public List<Client> getAll(){
return clientRepository.findAll();

}

@GetMapping("/client/{id}")

    public Client getByid(@PathVariable ("id") Integer id){



    return clientRepository.findById(id).get();
}

@PostMapping("/client")
    public void addClient(@RequestBody Client c){
Client a=new Client();
    a.setName(c.getName());
    a.setVille(c.getVille());

    clientRepository.save(a);


}

@PutMapping("client/{id}")
    public void updateClient(@PathVariable ("id") Integer id,@RequestBody Client c){

    Client a =clientRepository.findById(id).get();

    if(c.getName()!=null){
        a.setName(c.getName());
    }
    if(c.getVille()!=null){

        a.setVille(c.getVille());
    }
    clientRepository.save(a);



}
@DeleteMapping("client/{id}")

    public void deleteClient(@PathVariable ("id")Integer id){

    clientRepository.deleteById(id);
}


}
