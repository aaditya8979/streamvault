package com.mbridge.msdk.mbsignalcommon.windvane;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;

/* JADX INFO: compiled from: MimeTypeEnum.java */
/* JADX INFO: loaded from: classes2.dex */
public enum d {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", "image/jpeg"),
    JPEG("jpep", "image/jpeg"),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML(CreativeInfo.f52467al, "text/html");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f38929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38930b;

    d(String str, String str2) {
        this.f38929a = str;
        this.f38930b = str2;
    }

    public String d() {
        return this.f38930b;
    }

    public String g() {
        return this.f38929a;
    }
}
