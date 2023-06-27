package lt.techin.exam.rating;

import lt.techin.exam.technician.Technician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;

    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }
    public Double getRating(Long id) {
        Technician technician = new Technician();
        technician.setId(id);
        Rating temp = ratingRepository.findOneByTechnician(technician);
        return ((double) temp.getRatingcounter() / temp.getRatingdivider());
    }
    public Rating createRating(Long rating, Long id){
        Technician technician = new Technician();
        technician.setId(id);
        Rating temp = new Rating();
        temp.setTechnician(technician);
        temp.setRatingcounter(rating);
        temp.setRatingdivider(1L);
        return ratingRepository.save(temp);
    }
    public Rating rateRating(Long rating, Long id){
        Technician technician = new Technician();
        technician.setId(id);
        Rating temp = ratingRepository.findOneByTechnician(technician);
        temp.setRatingcounter(temp.getRatingcounter() + rating);
        temp.setRatingdivider(temp.getRatingdivider() + 1L);
        return ratingRepository.save(temp);
    }
}
