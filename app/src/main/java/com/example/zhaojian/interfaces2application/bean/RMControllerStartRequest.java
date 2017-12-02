package com.example.zhaojian.interfaces2application.bean;

/**
 * Created by zhaojian on 2017/12/2.
 */

public class RMControllerStartRequest {

    /**
     * version : v1
     * terminaltype : pc-explorer-flash
     * sessionid : 2132132
     */

    private String version = "v1";
    private String terminaltype = "android";
    private int sessionid;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype;
    }

    public int getSessionid() {
        return sessionid;
    }

    public void setSessionid(int sessionid) {
        this.sessionid = sessionid;
    }
}
