package com.brian.eCommerce.domain.values;

import com.brian.eCommerce.generic.Identity;

public class ContactDetailsID extends Identity {

        public ContactDetailsID(){}
        private ContactDetailsID(String id) {
            super(id);
        }
        public static ContactDetailsID of(String id) {
            return new ContactDetailsID(id);
        }
}
