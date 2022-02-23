package com.softserveinc.edu.oms.repository;

import com.softserveinc.edu.oms.domain.entities.Role;
import com.softserveinc.edu.oms.repository.params.SortProperties;
import com.softserveinc.edu.oms.repository.params.user.UserSelectWayCondition;
import org.hibernate.criterion.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query(nativeQuery = true,
            value = "SELECT * FROM roles r WHERE r.role_name = 'Administrator'")
    Role getAdminRole();
//
    @Query(nativeQuery = true,
            value = "SELECT * FROM roles r WHERE r.role_name = 'Customer'")
    Role getCustomerRole();
    @Query(nativeQuery = true,
            value = "SELECT * FROM roles r WHERE r.role_name = 'Merchandiser'")
    Role getMerchandiserRole();
    @Query(nativeQuery = true,
            value = "SELECT * FROM roles r WHERE r.role_name = 'Supervisor'")
    Role getSupervisorRole();

    List<Role> findByName(final String roleName);

//    List<Role> findByRoleName(final String roleName,
//                              SortProperties sortProperties);
//
//    List<Role> findByRoleName(final String roleName,
//                              final UserSelectWayCondition condition);
//
//    List<Role> findByRoleName(final String roleName,
//                              final UserSelectWayCondition condition,
//                              SortProperties sortProperties);

//    boolean containsRole(String roleName);

//    Long getRowCount();
//
//    List<Role> findAll(final SortProperties sortProperties);
//
//    List<Role> findAll(final Integer startingFrom, final Integer maxResult);
//
//    List<Role> findAll(final Integer startingFrom, final Integer maxResult,
//                    final SortProperties sortProperties);
//
//    List<Role> findByCriterions(final Criterion... criterions);
}
