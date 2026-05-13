package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48067a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f48051a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f48052b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f48053c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f48054d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f48055e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[d.f48056f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[d.f48057g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[d.f48058h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[d.f48059i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[d.f48060j.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[d.f48061k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[d.f48062l.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[d.f48063m.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[d.f48064n.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f48067a = iArr;
        }
    }

    @NotNull
    public static final d a(@NotNull d dVar) {
        p.k(dVar, "<this>");
        switch (a.f48067a[dVar.ordinal()]) {
            case 1:
                return d.f48061k;
            case 2:
                return d.f48062l;
            case 3:
                return d.f48063m;
            case 4:
                return d.f48064n;
            case 5:
                return d.f48055e;
            case 6:
                return d.f48061k;
            case 7:
                return d.f48062l;
            case 8:
                return d.f48063m;
            case 9:
                return d.f48064n;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return dVar;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final d b(@NotNull d dVar) {
        p.k(dVar, "<this>");
        switch (a.f48067a[dVar.ordinal()]) {
            case 1:
                return d.f48056f;
            case 2:
                return d.f48057g;
            case 3:
                return d.f48058h;
            case 4:
                return d.f48059i;
            case 5:
                return d.f48055e;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return dVar;
            case 11:
                return d.f48056f;
            case 12:
                return d.f48057g;
            case 13:
                return d.f48058h;
            case 14:
                return d.f48059i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
