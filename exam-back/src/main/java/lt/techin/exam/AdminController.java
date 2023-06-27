package lt.techin.exam;

import lt.techin.exam.rating.Rating;
import lt.techin.exam.rating.RatingService;
import lt.techin.exam.service.Service;
import lt.techin.exam.service.ServiceService;
import lt.techin.exam.technician.Technician;
import lt.techin.exam.technician.TechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    ServiceService serviceService;
    @Autowired
    TechnicianService technicianService;
    @Autowired
    RatingService ratingService;
    @GetMapping("/service")
    public List<Service> getAllService(){
        return serviceService.getAll();
    }
    @PostMapping("/service")
    public Service addService(@RequestBody Service service){
        return serviceService.add(service);
    }
    @PatchMapping("/service/{id}")
    public Service editService(@PathVariable Long id, @RequestBody Service service){
        return serviceService.edit(id, service);
    }
    @DeleteMapping("/service/{id}")
    public void deleteService(@PathVariable Long id){
        serviceService.delete(id);
    }


    @GetMapping("/technician")
    public List<Technician> getAllTechnician(){
        return technicianService.getAll();
    }
    @PostMapping("/technician")
    public Technician addTechnician(@RequestBody Technician technician){
        return technicianService.add(technician);
    }
    @PatchMapping("/technician/{id}")
    public Technician editTechnician(@PathVariable Long id, @RequestBody Technician technician){
        return technicianService.edit(id, technician);
    }
    @DeleteMapping("/technician/{id}")
    public void deleteTechnician(@PathVariable Long id){
        technicianService.delete(id);
    }

    @GetMapping("/rating/{id}")
    public Double getRatingId(@PathVariable Long id){
        return ratingService.getRating(id);
    }
    @PostMapping("/rating/{id}/{rating}")
    public Rating createRating(@PathVariable("id") Long id, @PathVariable("rating") Long rating){
        return ratingService.createRating(rating, id);
    }
    @PatchMapping("/rating/{id}/{rating}")
    public Rating rateRating(@PathVariable("id") Long id, @PathVariable("rating") Long rating){
        return ratingService.rateRating(rating, id);
    }
}
