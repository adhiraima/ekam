/**
 * 
 */
package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.avaje.ebean.Model;

/**
 * @author adhiraima
 *
 */
public class Config extends Model {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="config_id")
	private Long configId;
	
	@Column(name="config_name")
	private String configName;
	
	@Column(name="config_domain")
	private String configDomain;
	
	@OneToOne(targetEntity=User.class, fetch=FetchType.EAGER)
	@JoinColumn(name="user_id")
	private User user;
	
	@Column(name="create_date")
	private Date createDate;
	
	@Column(name="port")
	private String port;
}
