package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class A {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f46265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f46266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f46267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f46268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final String f46269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f46270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f46271j;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46274c;

        static {
            a aVar = new a();
            f46272a = aVar;
            f46274c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.SdkEvents", aVar, 10);
            g2Var.n("on_ad_load_start", true);
            g2Var.n("on_ad_load_failed", true);
            g2Var.n("on_ad_load_success", true);
            g2Var.n("on_ad_show_failed", true);
            g2Var.n("on_ad_show_success", true);
            g2Var.n("on_ad_clicked", true);
            g2Var.n("on_ad_hidden", true);
            g2Var.n("on_user_rewarded", true);
            g2Var.n("on_rewarded_video_started", true);
            g2Var.n("on_rewarded_video_completed", true);
            f46273b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final A deserialize(@NotNull Decoder decoder) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            int i10;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46273b;
            vo.c cVarB = decoder.b(serialDescriptor);
            int i11 = 9;
            String str11 = null;
            if (cVarB.l()) {
                w2 w2Var = w2.f86635a;
                String str12 = (String) cVarB.C(serialDescriptor, 0, w2Var, null);
                String str13 = (String) cVarB.C(serialDescriptor, 1, w2Var, null);
                String str14 = (String) cVarB.C(serialDescriptor, 2, w2Var, null);
                String str15 = (String) cVarB.C(serialDescriptor, 3, w2Var, null);
                String str16 = (String) cVarB.C(serialDescriptor, 4, w2Var, null);
                String str17 = (String) cVarB.C(serialDescriptor, 5, w2Var, null);
                String str18 = (String) cVarB.C(serialDescriptor, 6, w2Var, null);
                String str19 = (String) cVarB.C(serialDescriptor, 7, w2Var, null);
                String str20 = (String) cVarB.C(serialDescriptor, 8, w2Var, null);
                str = (String) cVarB.C(serialDescriptor, 9, w2Var, null);
                str3 = str19;
                str6 = str18;
                str5 = str20;
                str2 = str13;
                str8 = str17;
                i10 = 1023;
                str9 = str15;
                str7 = str12;
                str10 = str16;
                str4 = str14;
            } else {
                int i12 = 0;
                boolean z10 = true;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                String str25 = null;
                String str26 = null;
                String str27 = null;
                String str28 = null;
                String str29 = null;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            i11 = 9;
                            break;
                        case 0:
                            str11 = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str11);
                            i12 |= 1;
                            i11 = 9;
                            break;
                        case 1:
                            str28 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str28);
                            i12 |= 2;
                            i11 = 9;
                            break;
                        case 2:
                            str29 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str29);
                            i12 |= 4;
                            i11 = 9;
                            break;
                        case 3:
                            str26 = (String) cVarB.C(serialDescriptor, 3, w2.f86635a, str26);
                            i12 |= 8;
                            i11 = 9;
                            break;
                        case 4:
                            str27 = (String) cVarB.C(serialDescriptor, 4, w2.f86635a, str27);
                            i12 |= 16;
                            i11 = 9;
                            break;
                        case 5:
                            str25 = (String) cVarB.C(serialDescriptor, 5, w2.f86635a, str25);
                            i12 |= 32;
                            i11 = 9;
                            break;
                        case 6:
                            str23 = (String) cVarB.C(serialDescriptor, 6, w2.f86635a, str23);
                            i12 |= 64;
                            i11 = 9;
                            break;
                        case 7:
                            str24 = (String) cVarB.C(serialDescriptor, 7, w2.f86635a, str24);
                            i12 |= 128;
                            i11 = 9;
                            break;
                        case 8:
                            str22 = (String) cVarB.C(serialDescriptor, 8, w2.f86635a, str22);
                            i12 |= 256;
                            break;
                        case 9:
                            str21 = (String) cVarB.C(serialDescriptor, i11, w2.f86635a, str21);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                str = str21;
                str2 = str28;
                str3 = str24;
                str4 = str29;
                str5 = str22;
                i10 = i12;
                String str30 = str11;
                str6 = str23;
                str7 = str30;
                String str31 = str27;
                str8 = str25;
                str9 = str26;
                str10 = str31;
            }
            cVarB.c(serialDescriptor);
            return new A(i10, str7, str2, str4, str9, str10, str8, str6, str3, str5, str, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull A a10) {
            tn.p.k(encoder, "encoder");
            tn.p.k(a10, "value");
            SerialDescriptor serialDescriptor = f46273b;
            vo.d dVarB = encoder.b(serialDescriptor);
            A.b(a10, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            w2 w2Var = w2.f86635a;
            return new KSerializer[]{to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46273b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<A> serializer() {
            return a.f46272a;
        }
    }

    public A() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (tn.i) null);
    }

    public /* synthetic */ A(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46262a = null;
        } else {
            this.f46262a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46263b = null;
        } else {
            this.f46263b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f46264c = null;
        } else {
            this.f46264c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f46265d = null;
        } else {
            this.f46265d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f46266e = null;
        } else {
            this.f46266e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f46267f = null;
        } else {
            this.f46267f = str6;
        }
        if ((i10 & 64) == 0) {
            this.f46268g = null;
        } else {
            this.f46268g = str7;
        }
        if ((i10 & 128) == 0) {
            this.f46269h = null;
        } else {
            this.f46269h = str8;
        }
        if ((i10 & 256) == 0) {
            this.f46270i = null;
        } else {
            this.f46270i = str9;
        }
        if ((i10 & 512) == 0) {
            this.f46271j = null;
        } else {
            this.f46271j = str10;
        }
    }

    public A(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.f46262a = str;
        this.f46263b = str2;
        this.f46264c = str3;
        this.f46265d = str4;
        this.f46266e = str5;
        this.f46267f = str6;
        this.f46268g = str7;
        this.f46269h = str8;
        this.f46270i = str9;
        this.f46271j = str10;
    }

    public /* synthetic */ A(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, (i10 & 128) != 0 ? null : str8, (i10 & 256) != 0 ? null : str9, (i10 & 512) == 0 ? str10 : null);
    }

    public static final /* synthetic */ void b(A a10, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || a10.f46262a != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, a10.f46262a);
        }
        if (dVar.r(serialDescriptor, 1) || a10.f46263b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, a10.f46263b);
        }
        if (dVar.r(serialDescriptor, 2) || a10.f46264c != null) {
            dVar.f(serialDescriptor, 2, w2.f86635a, a10.f46264c);
        }
        if (dVar.r(serialDescriptor, 3) || a10.f46265d != null) {
            dVar.f(serialDescriptor, 3, w2.f86635a, a10.f46265d);
        }
        if (dVar.r(serialDescriptor, 4) || a10.f46266e != null) {
            dVar.f(serialDescriptor, 4, w2.f86635a, a10.f46266e);
        }
        if (dVar.r(serialDescriptor, 5) || a10.f46267f != null) {
            dVar.f(serialDescriptor, 5, w2.f86635a, a10.f46267f);
        }
        if (dVar.r(serialDescriptor, 6) || a10.f46268g != null) {
            dVar.f(serialDescriptor, 6, w2.f86635a, a10.f46268g);
        }
        if (dVar.r(serialDescriptor, 7) || a10.f46269h != null) {
            dVar.f(serialDescriptor, 7, w2.f86635a, a10.f46269h);
        }
        if (dVar.r(serialDescriptor, 8) || a10.f46270i != null) {
            dVar.f(serialDescriptor, 8, w2.f86635a, a10.f46270i);
        }
        if (!dVar.r(serialDescriptor, 9) && a10.f46271j == null) {
            return;
        }
        dVar.f(serialDescriptor, 9, w2.f86635a, a10.f46271j);
    }

    @Nullable
    public final String a() {
        return this.f46267f;
    }

    @Nullable
    public final String c() {
        return this.f46268g;
    }

    @Nullable
    public final String d() {
        return this.f46263b;
    }

    @Nullable
    public final String e() {
        return this.f46262a;
    }

    @Nullable
    public final String f() {
        return this.f46264c;
    }

    @Nullable
    public final String g() {
        return this.f46265d;
    }

    @Nullable
    public final String h() {
        return this.f46266e;
    }

    @Nullable
    public final String i() {
        return this.f46271j;
    }

    @Nullable
    public final String j() {
        return this.f46270i;
    }

    @Nullable
    public final String k() {
        return this.f46269h;
    }
}
