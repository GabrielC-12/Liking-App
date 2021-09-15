package com.example.likingapp.view_presenter.loginup_register;

import android.content.Intent;

import androidx.activity.result.ActivityResultLauncher;

import com.example.likingapp.models.DaoSession;
import com.example.likingapp.models.OwnUser;
import com.example.likingapp.models.OwnUserDao;

public interface LoginUpRegisterContract {

    interface View {
        ActivityResultLauncher<Intent> createEmailActivityLauncher(OwnUser user);
        void registerEmail(android.view.View v, OwnUser user, ActivityResultLauncher<Intent> emailActivityResultLauncher);
        void registerAccess(android.view.View v, OwnUser user);
        void apiAccess(android.view.View v, OwnUser user);
    }

    interface Presenter {
        boolean haveBlankFields(OwnUser user);
        boolean isNullOrEmpty(String... values);
        OwnUser createNewEmptyOwnUser();
        void registerOwnUserOnDB(OwnUserDao daoSession, OwnUser ownUser);
        boolean checkUserLoginExist(OwnUserDao daoSession, OwnUser user);
        boolean isUserWrong(OwnUser user, OwnUser registeredUser);
        OwnUser getUserByLogin(OwnUserDao daoSession, String login);
    }
}
