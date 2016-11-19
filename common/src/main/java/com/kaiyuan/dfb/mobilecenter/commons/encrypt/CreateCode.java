package com.kaiyuan.dfb.mobilecenter.commons.encrypt;

import java.util.Random;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/28
 */
public class CreateCode {
    public CreateCode() {
    }

    public String code() {
        Random rand = new Random();
        String str = "";

        for (int i = 0; i < 6; ++i) {
            int itmp = rand.nextInt(10);
            str = str + itmp;
        }

        return str;
    }

    public String alphabet() {
        Random rand = new Random();
        String str = "";

        for (int i = 0; i < 6; ++i) {
            int itmp = rand.nextInt(26) + 65;
            char ctmp = (char) itmp;
            str = str + ctmp;
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println((new CreateCode()).code());
    }
}
