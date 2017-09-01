package pl.innovestments.meetexperts.model.availability;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "availability")
public class Availability {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "availability_id")
	int id;

	@Column
	ZonedDateTime from;

	@Column
	ZonedDateTime to;

}
