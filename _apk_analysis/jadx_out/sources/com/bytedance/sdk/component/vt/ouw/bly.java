package com.bytedance.sdk.component.vt.ouw;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class bly {
    public String ouw;
    private String vt;

    private bly(String str) {
        this.ouw = str;
    }

    public static bly ouw(String str) {
        return new bly(str);
    }

    public final Charset ouw(Charset charset) {
        try {
            String str = this.vt;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
