package com.safedk.android.analytics.reporters;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52854a = "application";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StackTraceElement f52855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f52856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f52857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52858e;

    public c(StackTraceElement stackTraceElement) {
        this.f52855b = stackTraceElement;
        this.f52856c = "application";
    }

    public c(StackTraceElement stackTraceElement, String str) {
        this.f52855b = stackTraceElement;
        this.f52856c = str;
    }

    public StackTraceElement a() {
        return this.f52855b;
    }

    public void a(int i10) {
        this.f52858e = i10;
    }

    public String b() {
        return this.f52856c;
    }

    public int c() {
        return this.f52858e;
    }
}
