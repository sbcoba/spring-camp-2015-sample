package com.springcamp.env;

public enum Profile {
    ALPHA, LOCAL_H2(true), LOCAL_OLACLE, PROD1, PROD2, PROD3, STAGING, TEST1, TEST2;

    private boolean isDefault;

    Profile() {
        this.isDefault = false;
    }

    Profile(boolean isDefault) {
        this.isDefault = isDefault;
    }
    public String value() {
        return this.name().toLowerCase();
    }
    public boolean isDefault() {
        return isDefault;
    }

    public Profile getDefaultProfile() {
        Profile[] profiles = Profile.values();
        for (Profile profile : profiles) {
            if(profile.isDefault()) {
                return profile;
            }
        }
        throw new IllegalStateException("The default profile is not specified!");
    }
}