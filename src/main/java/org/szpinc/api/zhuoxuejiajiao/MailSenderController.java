package org.szpinc.api.zhuoxuejiajiao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.szpinc.api.zhuoxuejiajiao.entity.Message;
import org.szpinc.api.zhuoxuejiajiao.service.MailService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/mail")
public class MailSenderController {

    private static final Logger LOG = LoggerFactory.getLogger(MailSenderController.class);

    @Autowired
    private MailService mailService;

    @PostMapping("/send_notice")
    public Map<String,Object> send (@RequestBody Message message) {
        /*@RequestParam String name,@RequestParam String phone,@RequestParam String grade,@RequestParam String subject,@RequestParam String mailTo
        Message message = new Message();
        message.setSubject(subject);
        message.setGrade(grade);
        message.setPhone(phone);
        message.setName(name);
        message.setMailTo(mailTo);*/
        LOG.info("提交的信息为:[{}]",message);
        Map<String,Object> result = new HashMap<>();
        mailService.sendMessageMail(message,"新预约提醒","message.ftl",message.getMailTo());
        result.put("code",200);
        result.put("status","ok");
        return result;
    }


    @GetMapping("/test")
    public void sendMailTest () {

        Message message = new Message();

        message.setName("张三");
        message.setPhone("123456");
        message.setGrade("三年级");
        message.setSubject("数学");

        mailService.sendMessageMail(message,"测试新消息通知","message.ftl","1316420259@qq.com");

    }


}
