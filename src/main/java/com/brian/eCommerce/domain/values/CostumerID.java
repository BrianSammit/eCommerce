package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class CostumerID extends Identity {
    public CostumerID(){}
    private CostumerID(String id) {
        super(id);
    }
    public static CostumerID of(String id) {
        return new CostumerID(id);
    }
}
