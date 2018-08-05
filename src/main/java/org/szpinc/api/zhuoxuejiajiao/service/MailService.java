package org.szpinc.api.zhuoxuejiajiao.service;

public interface MailService {

    void sendMessageMail (Object params, String title, String templateName, String mailTo);

}
