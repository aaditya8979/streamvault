package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48081a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f48075a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f48076b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f48077c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.f48078d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48081a = iArr;
        }
    }

    @NotNull
    public static final i a(@NotNull g gVar) {
        p.k(gVar, "<this>");
        int i10 = a.f48081a[gVar.ordinal()];
        if (i10 == 1) {
            return i.f48082a;
        }
        if (i10 == 2) {
            return i.f48083b;
        }
        if (i10 == 3) {
            return i.f48084c;
        }
        if (i10 == 4) {
            return i.f48085d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final j b(@NotNull g gVar) {
        p.k(gVar, "<this>");
        int i10 = a.f48081a[gVar.ordinal()];
        if (i10 == 1) {
            return j.f48088a;
        }
        if (i10 == 2) {
            return j.f48089b;
        }
        if (i10 == 3) {
            return j.f48090c;
        }
        if (i10 == 4) {
            return j.f48091d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
