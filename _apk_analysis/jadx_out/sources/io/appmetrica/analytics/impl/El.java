package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes7.dex */
public final class El {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f65218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f65219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f65220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f65221f;

    public El(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }

    public El(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f65216a = str;
        this.f65217b = str2;
        this.f65218c = num;
        this.f65219d = num2;
        this.f65220e = str3;
        this.f65221f = bool;
    }
}
