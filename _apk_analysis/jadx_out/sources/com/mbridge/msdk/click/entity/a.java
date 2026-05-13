package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: ClickResponseHeader.java */
/* JADX INFO: loaded from: classes12.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f35609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f35611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f35613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f35614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f35615h;

    public String a() {
        return "statusCode=" + this.f35613f + ", location=" + this.f35608a + ", contentType=" + this.f35609b + ", contentLength=" + this.f35612e + ", contentEncoding=" + this.f35610c + ", referer=" + this.f35611d;
    }

    @NonNull
    public String toString() {
        return "ClickResponseHeader{location='" + this.f35608a + "', contentType='" + this.f35609b + "', contentEncoding='" + this.f35610c + "', referer='" + this.f35611d + "', contentLength=" + this.f35612e + ", statusCode=" + this.f35613f + ", url='" + this.f35614g + "', exception='" + this.f35615h + "'}";
    }
}
