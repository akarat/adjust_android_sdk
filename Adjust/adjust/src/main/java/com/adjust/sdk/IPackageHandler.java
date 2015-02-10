package com.adjust.sdk;

import org.json.JSONObject;

public interface IPackageHandler {
    public void addPackage(ActivityPackage pack);

    public void sendFirstPackage();

    public void sendNextPackage();

    public void closeFirstPackage();

    public void pauseSending();

    public void resumeSending();

    public String getFailureMessage();

    public void finishedTrackingActivity(JSONObject jsonResponse);

    public void sendClickPackage(ActivityPackage clickPackage);
}