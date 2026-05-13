package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Z5[] f26686a;

    static {
        Z5[] z5Arr = {new Z5(0, -100, "PING_V2_DISABLED", "Ping V2 is disabled from SDK config"), new Z5(1, -101, "PING_ID_MISSING", "Ping ID is missing"), new Z5(2, -102, "PING_URL_INVALID", "Ping url is invalid"), new Z5(3, -103, "PING_URL_MISSING", "Ping URL is missing"), new Z5(4, -104, "PING_JSON_INVALID", "Ping JSON is invalid"), new Z5(5, -105, "PING_ARRAY_EMPTY", "Ping array is empty"), new Z5(6, -106, "PING_UNKNOWN_RESPONSE", "Ping response is unknown"), new Z5(7, -107, "PING_EXCEPTION", "Ping exception occurred")};
        f26686a = z5Arr;
        kotlin.enums.a.a(z5Arr);
    }

    public Z5(int i10, int i11, String str, String str2) {
    }

    public static Z5 valueOf(String str) {
        return (Z5) Enum.valueOf(Z5.class, str);
    }

    public static Z5[] values() {
        return (Z5[]) f26686a.clone();
    }
}
