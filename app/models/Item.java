/**
 * 
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="item")
public class Item extends Model {
	
	@Id
	@Column(name="sku_id")
	private Long skuId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="description") 
	private String description;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="discount")
	private double discount;
	
	@Column(name="discount_type")
	private String discountType;
	
	@ManyToOne(targetEntity=Tenant.class, fetch=FetchType.LAZY)
	@JoinColumn(name="tenant_id")
	private Tenant tenant;

}
