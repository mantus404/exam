package lt.techin.exam.technician;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lt.techin.exam.service.Service;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "TECHNICIAN")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Technician {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String firstname;
    @NotBlank
    private String lastname;
    @NotBlank
    private String speciality;
    @NotBlank
    private String city;
    @ManyToOne
    @JoinColumn(name = "SERVICE_ID")
    private Service service;
}
