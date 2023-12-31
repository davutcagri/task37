package davutcagri.task37cassandradb.repository;

import davutcagri.task37cassandradb.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, Long> {
}
