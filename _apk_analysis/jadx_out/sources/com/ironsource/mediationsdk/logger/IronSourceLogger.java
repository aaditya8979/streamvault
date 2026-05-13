package com.ironsource.mediationsdk.logger;

/* JADX INFO: loaded from: classes12.dex */
public abstract class IronSourceLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32657b;

    public class IronSourceLogLevel {
        public static final int ERROR = 3;
        public static final int GENERAL = 4;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;

        public IronSourceLogLevel() {
        }
    }

    public enum IronSourceTag {
        API,
        ADAPTER_API,
        CALLBACK,
        ADAPTER_CALLBACK,
        NETWORK,
        INTERNAL,
        NATIVE,
        EVENT
    }

    public IronSourceLogger(String str) {
        this.f32657b = str;
        this.f32656a = 0;
    }

    public IronSourceLogger(String str, int i10) {
        this.f32657b = str;
        this.f32656a = i10;
    }

    public int a() {
        return this.f32656a;
    }

    public String b() {
        return this.f32657b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof IronSourceLogger)) {
            return false;
        }
        IronSourceLogger ironSourceLogger = (IronSourceLogger) obj;
        String str = this.f32657b;
        return str != null && str.equals(ironSourceLogger.f32657b);
    }

    public abstract void log(IronSourceTag ironSourceTag, String str, int i10);

    public abstract void logException(IronSourceTag ironSourceTag, String str, Throwable th2);

    public void setDebugLevel(int i10) {
        this.f32656a = i10;
    }
}
