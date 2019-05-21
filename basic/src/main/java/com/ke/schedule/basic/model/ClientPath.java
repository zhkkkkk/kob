package com.ke.schedule.basic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

public @NoArgsConstructor @Getter @Setter class ClientPath implements Serializable {

    private String ip;
    private String identification;
    private String projectCode;
    private Map<String, String> tasks;

    public ClientPath(String ip, String identification, String projectCode, Map<String, String> tasks) {
        this.ip = ip;
        this.identification = identification;
        this.projectCode = projectCode;
        this.tasks = tasks;
    }

    public int getTaskSize() {
        return tasks == null ? 0 : tasks.size();
    }

    public String getTasksDesc() {
        if (tasks == null) {
            return "";
        } else {
            StringBuffer desc = new StringBuffer();
            tasks.forEach((k, v) -> desc.append("key：" + k + " &nbsp; &nbsp; &nbsp; &nbsp; remark：" + v));
            return desc.toString();
        }
    }
}
