package com.brianrook.gcphelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;


public class HelloWorldTogglzConfig implements TogglzConfig
{
   @Override
   public Class<? extends Feature> getFeatureClass()
   {
      return HelloWorldToggles.class;
   }

   @Override
   public StateRepository getStateRepository()
   {
      return null;
   }

   @Override
   public UserProvider getUserProvider() {
      return new UserProvider() {
         @Override
         public FeatureUser getCurrentUser() {
            return new SimpleFeatureUser("admin", true);
         }
      };
   }
}