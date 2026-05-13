package com.ironsource;

import android.content.Context;
import com.ironsource.Y5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.io.InputStream;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4085j4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f32032b = "iads/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f32033c = "CONTROLLER_FROM_BUNDLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f32034d = "controllerVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f32035e = "controller_html_loaded_from_bundle";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile boolean f32037g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4085j4 f32031a = new C4085j4();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final List<String> f32036f = cn.w.p(C3978d4.f31185f, C3978d4.f31186g, "mobileController.min.css", "index.html", "index.css", "index.js");

    private C4085j4() {
    }

    @Nullable
    public static final String a(@Nullable Context context) {
        if (context != null) {
            try {
                byte[] bArrA = a(context, f32034d);
                String string = bArrA != null ? bo.d0.s1(new String(bArrA, bo.c.f5639b)).toString() : null;
                if (string != null) {
                    IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE loaded controller version from file: " + string);
                    return string;
                }
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load controller version from file");
            } catch (Exception e10) {
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE exception while loading version from file: " + e10.getMessage());
                e10.printStackTrace();
            }
        }
        return null;
    }

    @NotNull
    public static final List<String> a() {
        return f32036f;
    }

    public static final void a(@Nullable Context context, boolean z10) {
        IronLog.INTERNAL.verbose("CONTROLLER_FROM_BUNDLE controller html was loaded from bundle, setting in html params");
        f32037g = z10;
        if (context != null) {
            IronSourceUtils.b(context, f32035e, z10);
        }
    }

    @Nullable
    public static final byte[] a(@Nullable Context context, @NotNull String str) {
        byte[] bArrC;
        Throwable th2;
        tn.p.k(str, Y5.c.f30724b);
        byte[] bArr = null;
        if (context == null) {
            return null;
        }
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open(f32032b + str);
                try {
                    tn.p.j(inputStreamOpen, "inputStream");
                    bArrC = on.a.c(inputStreamOpen);
                    try {
                        bn.r rVar = bn.r.f5635a;
                        on.b.a(inputStreamOpen, null);
                        return bArrC;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            on.b.a(inputStreamOpen, th2);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    bArrC = null;
                    th2 = th5;
                }
            } catch (Exception e10) {
                e = e10;
                IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + str);
                e.printStackTrace();
                return bArr;
            }
        } catch (Exception e11) {
            e = e11;
            bArr = bArrC;
            IronLog.INTERNAL.error("CONTROLLER_FROM_BUNDLE failed to load from bundle controller file: iads/" + str);
            e.printStackTrace();
            return bArr;
        }
    }

    public static /* synthetic */ void b() {
    }

    public static final boolean b(@Nullable Context context) {
        if (context != null) {
            f32037g = IronSourceUtils.a(context, f32035e, false);
        }
        return f32037g;
    }
}
