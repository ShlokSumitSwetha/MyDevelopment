package OneToMany;



// Generated May 24, 2011 7:06:06 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class OneshotCcTrans.
 * @see com.i21.bccs.model.OneshotCcTrans
 * @author Hibernate Tools
 */
public class OneshotCcTransHome {

	private static final Log log = LogFactory.getLog(OneshotCcTransHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(OneshotCcTrans transientInstance) {
		log.debug("persisting OneshotCcTrans instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(OneshotCcTrans instance) {
		log.debug("attaching dirty OneshotCcTrans instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OneshotCcTrans instance) {
		log.debug("attaching clean OneshotCcTrans instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OneshotCcTrans persistentInstance) {
		log.debug("deleting OneshotCcTrans instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OneshotCcTrans merge(OneshotCcTrans detachedInstance) {
		log.debug("merging OneshotCcTrans instance");
		try {
			OneshotCcTrans result = (OneshotCcTrans) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OneshotCcTrans findById(java.math.BigDecimal id) {
		log.debug("getting OneshotCcTrans instance with id: " + id);
		try {
			OneshotCcTrans instance = (OneshotCcTrans) sessionFactory
					.getCurrentSession().get(
							"com.i21.bccs.model.OneshotCcTrans", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<OneshotCcTrans> findByExample(OneshotCcTrans instance) {
		log.debug("finding OneshotCcTrans instance by example");
		try {
			List<OneshotCcTrans> results = (List<OneshotCcTrans>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.i21.bccs.model.OneshotCcTrans")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
