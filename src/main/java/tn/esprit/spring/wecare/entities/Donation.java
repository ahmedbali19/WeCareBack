package tn.esprit.spring.wecare.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Entity
@Getter
@Setter
@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class Donation {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long DonationId;
	private Long CagnotteId;
	private Long UserId;
	
	@ManyToOne
	User user;
	
	@ManyToOne
	Cagnotte cagnotte;
}