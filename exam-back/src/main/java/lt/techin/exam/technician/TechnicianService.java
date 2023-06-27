package lt.techin.exam.technician;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicianService {
    @Autowired
    TechnicianRepository technicianRepository;

    public TechnicianService(TechnicianRepository technicianRepository) {
        this.technicianRepository = technicianRepository;
    }
    public Technician add(Technician technician){
        return technicianRepository.save(technician);
    }
    public List<Technician> getAll(){
        return technicianRepository.findAll();
    }
    public Technician edit(Long id, Technician technician){
        Technician temp = technicianRepository.findOneById(id);
        temp.setFirstname(technician.getFirstname());
        temp.setLastname(technician.getLastname());
        temp.setSpeciality(technician.getSpeciality());
        temp.setCity(technician.getCity());
        temp.setService(technician.getService());
        return technicianRepository.save(temp);
    }
    public void delete(Long id){
        technicianRepository.deleteById(id);
    }
}
