package com.safedk.android.analytics.brandsafety;

/* JADX INFO: loaded from: classes8.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f52724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f52725c;

    private t() {
        this.f52725c = 0L;
    }

    public t(String str, String str2, long j10) {
        this.f52725c = 0L;
        this.f52723a = str;
        this.f52724b = str2;
        this.f52725c = j10;
    }

    public static String a(String str, long j10) {
        return str + "_" + j10;
    }

    public String a() {
        return this.f52724b;
    }

    public void a(long j10) {
        this.f52725c = j10;
    }

    public void a(String str) {
        this.f52724b = str;
    }

    public long b() {
        return this.f52725c;
    }

    public String c() {
        return a(this.f52723a, this.f52725c);
    }
}
