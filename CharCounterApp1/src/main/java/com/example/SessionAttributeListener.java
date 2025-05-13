package com.example;

import javax.servlet.http.*;

public class SessionAttributeListener implements HttpSessionAttributeListener {
    public void attributeAdded(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            System.out.println("Thêm inputString: " + event.getValue());
        }
    }

    public void attributeReplaced(HttpSessionBindingEvent event) {
        if ("inputString".equals(event.getName())) {
            System.out.println("Cập nhật inputString: " + event.getValue());
        }
    }
}
