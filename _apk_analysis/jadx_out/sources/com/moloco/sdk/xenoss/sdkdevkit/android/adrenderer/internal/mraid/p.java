package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.ironsource.C3978d4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f48424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f48425b = new p("Portrait", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f48426c = new p("Landscape", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f48427d = new p("None", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ p[] f48428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f48429f;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @Nullable
        public final p a(@Nullable String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 3387192) {
                    if (iHashCode != 729267099) {
                        if (iHashCode == 1430647483 && str.equals(C3978d4.i.C)) {
                            return p.f48426c;
                        }
                    } else if (str.equals(C3978d4.i.D)) {
                        return p.f48425b;
                    }
                } else if (str.equals("none")) {
                    return p.f48427d;
                }
            }
            return null;
        }
    }

    static {
        p[] pVarArrA = a();
        f48428e = pVarArrA;
        f48429f = kotlin.enums.a.a(pVarArrA);
        f48424a = new a(null);
    }

    public p(String str, int i10) {
    }

    public static final /* synthetic */ p[] a() {
        return new p[]{f48425b, f48426c, f48427d};
    }

    @NotNull
    public static kn.a<p> b() {
        return f48429f;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f48428e.clone();
    }
}
