package com.westos.saasmarketing.marketingprogram.service;

import java.io.OutputStream;

public interface UtilsImageCheck {

    String  captcha();

    void outputimage(String str, OutputStream os);
}
