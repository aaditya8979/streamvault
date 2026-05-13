package com.ironsource.sdk.controller;

import com.ironsource.C4228r4;
import com.ironsource.Jb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f33853b = "MD5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33854a;

    public s(String str) {
        this.f33854a = str;
    }

    public static String a() {
        return UUID.randomUUID().toString();
    }

    private String a(String str) {
        try {
            return Jb.a(str);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    public boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f33854a));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }

    public String b() {
        return this.f33854a;
    }
}
