package com.example.likingapp.model_view_presenter.register_person;

import com.example.likingapp.models.OwnUser;
import com.example.likingapp.models.Person;

public interface RegisterPersonContract {
    interface View {
        void registerPerson(Person person);
        void savePerson(Person person);
        void returnRegisteredPersonID(Person person);
        void editPerson(long id);
        void initiatePreviousValues(Person person);
    }

    interface Presenter {
        Person createNewEmptyPerson();
        boolean haveBlankFields(Person person);
        void registerPersonOnDB(Person person);
        boolean isValidEmail(CharSequence target);
        boolean isValidPhoneNumber(String phone);
        boolean isSameUser(long newId, long registeredId);
        boolean checkPersonDBExists();
        boolean checkPersonCpfExists(Person person);
        Person getOnePersonOfUserFromDB(long id);
    }
}
