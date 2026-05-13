package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Am {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Am f25178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Am f25179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Am f25180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Am f25181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Am f25182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Am[] f25183g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y7 f25184a;

    static {
        Am am2 = new Am("UNKNOWN", 0, Y7.f26616b);
        f25178b = am2;
        Am am3 = new Am("MALFORMED_URL", 1, Y7.f26618d);
        f25179c = am3;
        Am am4 = new Am("TIMEOUT", 2, Y7.f26619e);
        Am am5 = new Am("NETWORK", 3, Y7.f26620f);
        f25180d = am5;
        Am am6 = new Am("NO_URL_FOUND", 4, Y7.f26621g);
        f25181e = am6;
        Am am7 = new Am("INVALID_STATE", 5, Y7.f26617c);
        f25182f = am7;
        Am[] amArr = {am2, am3, am4, am5, am6, am7};
        f25183g = amArr;
        kotlin.enums.a.a(amArr);
    }

    public Am(String str, int i10, Y7 y72) {
        this.f25184a = y72;
    }

    public static Am valueOf(String str) {
        return (Am) Enum.valueOf(Am.class, str);
    }

    public static Am[] values() {
        return (Am[]) f25183g.clone();
    }
}
