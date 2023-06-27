package lt.techin.exam.rating;

import lt.techin.exam.technician.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    Rating findOneByTechnician(Technician technician);
}
