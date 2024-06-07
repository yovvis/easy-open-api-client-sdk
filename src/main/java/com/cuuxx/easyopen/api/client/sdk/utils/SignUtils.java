package com.cuuxx.easyopen.api.client.sdk.utils;

import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

/**
 * 签名工具
 * @author yovvis
 * @date 2024-06-07
 */
public class SignUtils {

    /**
     * 获取签名
     *
     * @param body       地图
     * @param secretKey 秘密密钥
     * @return
     */
    public static String getSign(String body, String secretKey){
        Digester digester = new Digester(DigestAlgorithm.SHA256);
        String content = body.toString() + "." + secretKey;
        String digestHex = digester.digestHex(content);
        return digestHex;
    }
}
