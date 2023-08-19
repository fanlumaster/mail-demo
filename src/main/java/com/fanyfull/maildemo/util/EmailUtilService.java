package com.fanyfull.maildemo.util;

public interface EmailUtilService {
    /**
     * 发送文本文件
     * @param to       收件人
     * @param subject  主题
     * @param content  内容
     */
    void sendSimpleMail(String to, String subject, String content);
}
