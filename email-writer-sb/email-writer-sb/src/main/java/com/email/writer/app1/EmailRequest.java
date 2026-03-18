//package com.email.writer.app1;
//
//import lombok.Data;
//
//@Data
//public class EmailRequest {
//    private String emailContent;
//    private String tone;
//}
//

package com.email.writer.app1;

public class EmailRequest {

    private String emailContent;
    private String tone;

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}