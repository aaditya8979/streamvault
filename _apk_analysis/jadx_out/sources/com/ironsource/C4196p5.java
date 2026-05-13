package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.p5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4196p5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f33210d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f33211e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f33212f = "C38FB23A402222A0C17D34A92F971D1F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f33213g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f33214h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f33215i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C4196p5 f33216j = new C4196p5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f33217a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f33218b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33219c = "";

    private String a(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }

    public static C4196p5 b() {
        return f33216j;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f33219c)) {
            try {
                this.f33219c = C3984da.a(d(), f33213g);
            } catch (Exception e10) {
                C4228r4.d().a(e10);
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f33219c;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f33217a)) {
            this.f33217a = f33212f;
        }
        return this.f33217a;
    }

    public synchronized String d() {
        if (TextUtils.isEmpty(this.f33218b)) {
            this.f33218b = a(f33214h, 32);
        }
        return this.f33218b;
    }
}
