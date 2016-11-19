package com.kaiyuan.dfb.mobilecenter.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/28
 */
public class MessageTemplate extends MessagePo {
    private String template;
    private Map<String, String> templateData;
    private List<BinaryData> imageData;
    private List<String> attachmentData;
    private String subjectTemplate;
    private Map<String, String> subjectTemplateData;

    public MessageTemplate() {
    }

    public MessageTemplate(String template, Map<String, String> templateData) {
        this.template = template;
        this.templateData = templateData;
    }

    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public Map<String, String> getTemplateData() {
        return templateData;
    }

    public void setTemplateData(Map<String, String> templateData) {
        this.templateData = templateData;
    }

    public List<BinaryData> getImageData() {
        return imageData;
    }

    public void setImageData(List<BinaryData> imageData) {
        this.imageData = imageData;
    }

    public List<String> getAttachmentData() {
        return attachmentData;
    }

    public void setAttachmentData(List<String> attachmentData) {
        this.attachmentData = attachmentData;
    }

    public String getSubjectTemplate() {
        return subjectTemplate;
    }

    public void setSubjectTemplate(String subjectTemplate) {
        this.subjectTemplate = subjectTemplate;
    }

    public Map<String, String> getSubjectTemplateData() {
        return subjectTemplateData;
    }

    public void setSubjectTemplateData(Map<String, String> subjectTemplateData) {
        this.subjectTemplateData = subjectTemplateData;
    }

    public void addSubjectTemplateData(String key, String value) {
        if (subjectTemplateData == null) {
            subjectTemplateData = new HashMap<>();
        }
        subjectTemplateData.put(key, value);
    }

    public void addAttachmentData(List<String> data) {
        if (attachmentData == null) {
            attachmentData = new ArrayList<>();
        }

        attachmentData.addAll(data);
    }
}
