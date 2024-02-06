package course.springboot.application.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="orders")
public class orders {

	@Id
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="shipper_id")
	private int shipperId;
	
	@Column(name="ammount")
	private double ammount;
}
