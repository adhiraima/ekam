/**
 * 
 */
package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
@Entity
@Table(name="catalogue")
public class Catalogue extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="catalogue_id")
	private Long catalogueId;
	
	@JoinColumn(name="tenant_id", unique=false)
	@OneToOne(targetEntity=Tenant.class, fetch=FetchType.LAZY)
	private Tenant tenant;
	
	@Column(name="catagory")
	private String catagory;

}
