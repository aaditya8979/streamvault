package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C0623a f48621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f48622b = new a("Portrait", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48623c = new a("Landscape", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f48624d = new a("None", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a[] f48625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48626f;

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a$a, reason: collision with other inner class name */
    public static final class C0623a {
        public C0623a() {
        }

        public /* synthetic */ C0623a(i iVar) {
            this();
        }
    }

    static {
        a[] aVarArrA = a();
        f48625e = aVarArrA;
        f48626f = kotlin.enums.a.a(aVarArrA);
        f48621a = new C0623a(null);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f48622b, f48623c, f48624d};
    }

    @NotNull
    public static kn.a<a> b() {
        return f48626f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48625e.clone();
    }
}
