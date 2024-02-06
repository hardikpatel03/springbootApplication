package course.springboot.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customers")
public class customers {

	@Id
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "customer_name")
	private String customername;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_number")
	private long mobilenumber;
	}
