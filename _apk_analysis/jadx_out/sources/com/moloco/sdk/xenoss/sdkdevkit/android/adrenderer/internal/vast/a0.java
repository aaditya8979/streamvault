package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.ironsource.Y1;
import com.moloco.sdk.service_locator.b;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.random.Random;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final bn.g f49342a = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.z
        @Override // sn.a
        public final Object invoke() {
            return a0.a();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Regex f49343b = new Regex("\\[ERRORCODE]");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Regex f49344c = new Regex("\\[CONTENTPLAYHEAD]");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Regex f49345d = new Regex("\\[CACHEBUSTING]");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Regex f49346e = new Regex("\\[ASSETURI]");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Regex f49347f = new Regex("\\[[^]]*]");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Regex f49348g = new Regex("\\[MEDIAPLAYHEAD]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final Regex f49349h = new Regex("\\[ADPLAYHEAD]");

    public static final m a() {
        return new m(b.i.f47671a.c());
    }

    public static final String b(int i10) {
        return f(i10);
    }

    public static final String c(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    @NotNull
    public static final y e() {
        return k();
    }

    public static final String f(int i10) {
        long j10 = i10;
        tn.x xVar = tn.x.f85368a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        String str = String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % ((long) 1000))}, 4));
        tn.p.j(str, "format(...)");
        return str;
    }

    public static final String g(String str, Integer num, Integer num2, String str2, String str3) {
        if (num != null) {
            str = f49343b.replace(str, num.toString());
        }
        if (num2 != null) {
            str = f49348g.replace(f49349h.replace(f49344c.replace(str, f(num2.intValue())), b(num2.intValue())), i(num2.intValue()));
        }
        if (str2 != null) {
            str = f49346e.replace(str, c(str2));
        }
        if (str3 != null) {
            str = f49345d.replace(str, str3);
        }
        return f49347f.replace(str, "");
    }

    public static final String i(int i10) {
        return Y1.f30690f;
    }

    public static final String j() {
        tn.x xVar = tn.x.f85368a;
        String str = String.format("%08d", Arrays.copyOf(new Object[]{Integer.valueOf(Random.Default.nextInt(1, 99999999))}, 1));
        tn.p.j(str, "format(...)");
        return str;
    }

    public static final m k() {
        return (m) f49342a.getValue();
    }
}
