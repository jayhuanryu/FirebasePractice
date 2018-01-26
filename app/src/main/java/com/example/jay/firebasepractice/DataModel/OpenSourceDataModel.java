package com.example.jay.firebasepractice.DataModel;

/**
 * @file OpenSourceDataModel.java
 * @date Jan 26th 2018
 * @biref
 * @copyright GE Appliances, a Haier Company (Confidential). All rights reserved.
 */

public class OpenSourceDataModel {

    private String name;
    private String license;
    private String link;

    public OpenSourceDataModel() {
    }

    public OpenSourceDataModel(String libraryName, String license, String link) {
        this.name = libraryName;
        this.license = license;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
