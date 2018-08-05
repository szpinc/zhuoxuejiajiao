package org.szpinc.api.zhuoxuejiajiao.entity;

public class Message {
    private String mailTo;
    private String name;
    private String phone;
    private String grade;
    private String subject;

    public String getMailTo() {
        return mailTo;
    }

    public void setMailTo(String mailTo) {
        this.mailTo = mailTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Message{" +
                "mailTo='" + mailTo + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", grade='" + grade + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
