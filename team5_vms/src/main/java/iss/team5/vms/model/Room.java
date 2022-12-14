package iss.team5.vms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import iss.team5.vms.helper.BookingAvailablity;
import iss.team5.vms.helper.BookingSlots;
import iss.team5.vms.helper.IdGenerator;
import lombok.Data;

@Entity
@Data
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custom_id_gen")
	  @GenericGenerator(
	      name = "custom_id_gen",      strategy = "iss.team5.vms.helper.IdGenerator", 
	      parameters = {
	          @Parameter(name = IdGenerator.INCREMENT_PARAM, value = "1"),
	          @Parameter(name = IdGenerator.VALUE_PREFIX_PARAMETER, value = "RM_"),
	          @Parameter(name = IdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	private String id;
	@Column(name = "Booking_availbility", columnDefinition = "ENUM('BOOKED','OPEN')")
	@Enumerated(EnumType.STRING)
	private BookingAvailablity availbility;
	private String facilities;
	private String roomName;
	
}
