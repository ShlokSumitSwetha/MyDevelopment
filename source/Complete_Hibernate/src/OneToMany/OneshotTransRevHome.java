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
 * Home object for domain model class OneshotTransRev.
 * @see com.i21.bccs.model.OneshotTransRev
 * @author Hibernate Tools
 */
public class OneshotTransRevHome {

	private static final Log log = LogFactory.getLog(OneshotTransRevHome.class);

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

	public void persist(OneshotTransRev transientInstance) {
		log.debug("persisting OneshotTransRev instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(OneshotTransRev instance) {
		log.debug("attaching dirty OneshotTransRev instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(OneshotTransRev instance) {
		log.debug("attaching clean OneshotTransRev instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(OneshotTransRev persistentInstance) {
		log.debug("deleting OneshotTransRev instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public OneshotTransRev merge(OneshotTransRev detachedInstance) {
		log.debug("merging OneshotTransRev instance");
		try {
			OneshotTransRev result = (OneshotTransRev) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public OneshotTransRev findById(java.math.BigDecimal id) {
		log.debug("getting OneshotTransRev instance with id: " + id);
		try {
			OneshotTransRev instance = (OneshotTransRev) sessionFactory
					.getCurrentSession().get(
							"com.i21.bccs.model.OneshotTransRev", id);
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

	public List<OneshotTransRev> findByExample(OneshotTransRev instance) {
		log.debug("finding OneshotTransRev instance by example");
		try {
			List<OneshotTransRev> results = (List<OneshotTransRev>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.i21.bccs.model.OneshotTransRev")
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
