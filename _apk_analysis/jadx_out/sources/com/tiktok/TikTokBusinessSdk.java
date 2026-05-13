package com.tiktok;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class TikTokBusinessSdk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f53375a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f53376b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f53377c = Boolean.TRUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f53378d = "v1.2";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f53379e = "analytics.us.tiktok.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static LogLevel f53380f = LogLevel.INFO;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static AtomicBoolean f53381g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static AtomicBoolean f53382h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static AtomicBoolean f53383i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f53384j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f53385k = UUID.randomUUID().toString();

    public enum LogLevel {
        NONE,
        INFO,
        WARN,
        DEBUG;

        public boolean log() {
            return this != NONE;
        }
    }

    public static LogLevel a() {
        return f53380f;
    }
}
