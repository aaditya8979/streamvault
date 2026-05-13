package io.appmetrica.analytics.impl;

import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C5206w8 implements InterfaceC4926l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67878a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67879b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67880c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67881d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67882e = 63;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67883f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67884g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f67885h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f67886i = 64;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Regex f67887j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Regex f67888k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f67889l = cn.w.p("ru", "by", "kz", "az", "kg", "lv", com.ironsource.Q6.f30268u, "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f67890m = "yandex.ru";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f67891n = "gmail.com";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f67892o = "googlemail.com";

    /* JADX WARN: Removed duplicated region for block: B:77:0x0138  */
    @Override // io.appmetrica.analytics.impl.InterfaceC4926l2
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(@org.jetbrains.annotations.NotNull java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C5206w8.a(java.lang.String):java.lang.String");
    }

    public final boolean b(String str) {
        if (str.length() > this.f67882e || str.length() < this.f67883f || !Character.isLetterOrDigit(bo.f0.z1(str)) || !Character.isLetterOrDigit(bo.f0.B1(str))) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (!Character.isLetterOrDigit(cCharAt) && cCharAt != '-') {
                return false;
            }
        }
        return true;
    }
}
