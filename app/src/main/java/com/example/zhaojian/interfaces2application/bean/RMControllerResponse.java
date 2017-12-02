package com.example.zhaojian.interfaces2application.bean;

/**
 * Created by zhaojian on 2017/12/2.
 */

public class RMControllerResponse {


    /**
     * result : {"code":3000,"reason":"terminal doesnot exist"}
     * msgcontent : {"sessionid":2132132,"protocol":"tcp straight","controludpaddr":"","streamcontroltcpaddr":"192.168.0.210:61000","keymap":{}}
     */

    private ResultBean result;
    private MsgcontentBean msgcontent;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public MsgcontentBean getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(MsgcontentBean msgcontent) {
        this.msgcontent = msgcontent;
    }

    public static class ResultBean {
        /**
         * code : 3000
         * reason : terminal doesnot exist
         */

        private int code;
        private String reason;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

    public static class MsgcontentBean {
        /**
         * sessionid : 2132132
         * protocol : tcp straight
         * controludpaddr :
         * streamcontroltcpaddr : 192.168.0.210:61000
         * keymap : {}
         */

        private int sessionid;
        private String protocol;
        private String controludpaddr;
        private String streamcontroltcpaddr;
        private KeymapBean keymap;

        public int getSessionid() {
            return sessionid;
        }

        public void setSessionid(int sessionid) {
            this.sessionid = sessionid;
        }

        public String getProtocol() {
            return protocol;
        }

        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }

        public String getControludpaddr() {
            return controludpaddr;
        }

        public void setControludpaddr(String controludpaddr) {
            this.controludpaddr = controludpaddr;
        }

        public String getStreamcontroltcpaddr() {
            return streamcontroltcpaddr;
        }

        public void setStreamcontroltcpaddr(String streamcontroltcpaddr) {
            this.streamcontroltcpaddr = streamcontroltcpaddr;
        }

        public KeymapBean getKeymap() {
            return keymap;
        }

        public void setKeymap(KeymapBean keymap) {
            this.keymap = keymap;
        }

        public static class KeymapBean {
        }
    }
}
