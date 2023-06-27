package lt.techin.exam.rating;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lt.techin.exam.service.Service;
import lt.techin.exam.technician.Technician;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "RATING")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long ratingcounter;
    private Long ratingdivider;
    @ManyToOne
    @JoinColumn(name = "TECHNICIAN_ID")
    private Technician technician;
}
