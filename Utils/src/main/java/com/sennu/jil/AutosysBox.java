package com.sennu.jil;

import java.util.List;

public class AutosysBox {
    private String box;
    private String description;
    private String condition;
    private String timezone;
    private List<AutosysJob> jobs;

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public List<AutosysJob> getJobs() {
        return jobs;
    }

    public void setJobs(List<AutosysJob> jobs) {
        this.jobs = jobs;
    }
}
