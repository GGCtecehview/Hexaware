package dao;

import entity.Policy;
import exception.PolicyNotFoundException;

import java.util.List;

public interface IPolicyService {
    boolean addPolicy(Policy policy);

    Policy getPolicyById(Long policyId) throws PolicyNotFoundException;

    List<Policy> getAllPolicies();

    boolean updatePolicy(Policy policy) throws PolicyNotFoundException;
    
    boolean deletePolicy(Long policyId) throws PolicyNotFoundException;


}
