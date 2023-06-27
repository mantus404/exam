package lt.techin.exam.technician;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Long> {
    Technician findOneById(Long id);
}
