package lt.techin.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    public ServiceService(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public lt.techin.exam.service.Service add(lt.techin.exam.service.Service service){
        return serviceRepository.save(service);
    }
    public List<lt.techin.exam.service.Service> getAll() {
        return serviceRepository.findAll();
    }
    public lt.techin.exam.service.Service edit(Long id, lt.techin.exam.service.Service service){
        lt.techin.exam.service.Service temp = serviceRepository.findOneById(id);
        temp.setName(service.getName());
        temp.setAddress(service.getAddress());
        temp.setManager(service.getManager());
        return serviceRepository.save(temp);
    }
    public void delete(Long id){
        serviceRepository.deleteById(id);
    }
}
