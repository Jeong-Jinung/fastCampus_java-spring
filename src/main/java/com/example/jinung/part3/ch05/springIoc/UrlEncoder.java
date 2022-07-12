package com.example.jinung.part3.ch05.springIoc;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.springframework.stereotype.Component;

@Component
public class UrlEncoder implements IEncoder {

    @Override
    public String encode(String message) {
        try {
            return URLEncoder.encode(message, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

}
