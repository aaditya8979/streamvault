package com.moloco.sdk.internal.ortb.model;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.o;
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
import wo.v0;
import wo.w2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class p {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46410h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f46411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Integer f46413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final o f46415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f46416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f46417g;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46420c;

        static {
            a aVar = new a();
            f46418a = aVar;
            f46420c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DECCtaSerializable", aVar, 7);
            g2Var.n("vertical_spacing", true);
            g2Var.n("text", true);
            g2Var.n("button_width", true);
            g2Var.n("font_size", true);
            g2Var.n(OutlinedTextFieldKt.BorderId, true);
            g2Var.n("foreground_color", true);
            g2Var.n("background_color", true);
            f46419b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p deserialize(@NotNull Decoder decoder) {
            String str;
            o oVar;
            String str2;
            Integer num;
            Integer num2;
            Integer num3;
            String str3;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46419b;
            vo.c cVarB = decoder.b(serialDescriptor);
            int i11 = 6;
            Integer num4 = null;
            if (cVarB.l()) {
                v0 v0Var = v0.f86626a;
                Integer num5 = (Integer) cVarB.C(serialDescriptor, 0, v0Var, null);
                w2 w2Var = w2.f86635a;
                String str4 = (String) cVarB.C(serialDescriptor, 1, w2Var, null);
                Integer num6 = (Integer) cVarB.C(serialDescriptor, 2, v0Var, null);
                Integer num7 = (Integer) cVarB.C(serialDescriptor, 3, v0Var, null);
                o oVar2 = (o) cVarB.C(serialDescriptor, 4, o.a.f46407a, null);
                String str5 = (String) cVarB.C(serialDescriptor, 5, w2Var, null);
                num2 = num7;
                str = (String) cVarB.C(serialDescriptor, 6, w2Var, null);
                str2 = str5;
                oVar = oVar2;
                i10 = 127;
                num = num6;
                num3 = num5;
                str3 = str4;
            } else {
                int i12 = 0;
                boolean z10 = true;
                String str6 = null;
                String str7 = null;
                Integer num8 = null;
                Integer num9 = null;
                o oVar3 = null;
                String str8 = null;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            i11 = 6;
                            break;
                        case 0:
                            num4 = (Integer) cVarB.C(serialDescriptor, 0, v0.f86626a, num4);
                            i12 |= 1;
                            i11 = 6;
                            break;
                        case 1:
                            str7 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str7);
                            i12 |= 2;
                            i11 = 6;
                            break;
                        case 2:
                            num8 = (Integer) cVarB.C(serialDescriptor, 2, v0.f86626a, num8);
                            i12 |= 4;
                            break;
                        case 3:
                            num9 = (Integer) cVarB.C(serialDescriptor, 3, v0.f86626a, num9);
                            i12 |= 8;
                            break;
                        case 4:
                            oVar3 = (o) cVarB.C(serialDescriptor, 4, o.a.f46407a, oVar3);
                            i12 |= 16;
                            break;
                        case 5:
                            str8 = (String) cVarB.C(serialDescriptor, 5, w2.f86635a, str8);
                            i12 |= 32;
                            break;
                        case 6:
                            str6 = (String) cVarB.C(serialDescriptor, i11, w2.f86635a, str6);
                            i12 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                str = str6;
                oVar = oVar3;
                str2 = str8;
                num = num8;
                num2 = num9;
                num3 = num4;
                str3 = str7;
                i10 = i12;
            }
            cVarB.c(serialDescriptor);
            return new p(i10, num3, str3, num, num2, oVar, str2, str, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull p pVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(pVar, "value");
            SerialDescriptor serialDescriptor = f46419b;
            vo.d dVarB = encoder.b(serialDescriptor);
            p.a(pVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            v0 v0Var = v0.f86626a;
            KSerializer<?> kSerializerT = to.a.t(v0Var);
            w2 w2Var = w2.f86635a;
            return new KSerializer[]{kSerializerT, to.a.t(w2Var), to.a.t(v0Var), to.a.t(v0Var), to.a.t(o.a.f46407a), to.a.t(w2Var), to.a.t(w2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46419b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<p> serializer() {
            return a.f46418a;
        }
    }

    public p() {
        this((Integer) null, (String) null, (Integer) null, (Integer) null, (o) null, (String) null, (String) null, 127, (tn.i) null);
    }

    public /* synthetic */ p(int i10, Integer num, String str, Integer num2, Integer num3, o oVar, String str2, String str3, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46411a = null;
        } else {
            this.f46411a = num;
        }
        if ((i10 & 2) == 0) {
            this.f46412b = null;
        } else {
            this.f46412b = str;
        }
        if ((i10 & 4) == 0) {
            this.f46413c = null;
        } else {
            this.f46413c = num2;
        }
        if ((i10 & 8) == 0) {
            this.f46414d = null;
        } else {
            this.f46414d = num3;
        }
        if ((i10 & 16) == 0) {
            this.f46415e = null;
        } else {
            this.f46415e = oVar;
        }
        if ((i10 & 32) == 0) {
            this.f46416f = null;
        } else {
            this.f46416f = str2;
        }
        if ((i10 & 64) == 0) {
            this.f46417g = null;
        } else {
            this.f46417g = str3;
        }
    }

    public p(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable Integer num3, @Nullable o oVar, @Nullable String str2, @Nullable String str3) {
        this.f46411a = num;
        this.f46412b = str;
        this.f46413c = num2;
        this.f46414d = num3;
        this.f46415e = oVar;
        this.f46416f = str2;
        this.f46417g = str3;
    }

    public /* synthetic */ p(Integer num, String str, Integer num2, Integer num3, o oVar, String str2, String str3, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : oVar, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3);
    }

    public static final /* synthetic */ void a(p pVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || pVar.f46411a != null) {
            dVar.f(serialDescriptor, 0, v0.f86626a, pVar.f46411a);
        }
        if (dVar.r(serialDescriptor, 1) || pVar.f46412b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, pVar.f46412b);
        }
        if (dVar.r(serialDescriptor, 2) || pVar.f46413c != null) {
            dVar.f(serialDescriptor, 2, v0.f86626a, pVar.f46413c);
        }
        if (dVar.r(serialDescriptor, 3) || pVar.f46414d != null) {
            dVar.f(serialDescriptor, 3, v0.f86626a, pVar.f46414d);
        }
        if (dVar.r(serialDescriptor, 4) || pVar.f46415e != null) {
            dVar.f(serialDescriptor, 4, o.a.f46407a, pVar.f46415e);
        }
        if (dVar.r(serialDescriptor, 5) || pVar.f46416f != null) {
            dVar.f(serialDescriptor, 5, w2.f86635a, pVar.f46416f);
        }
        if (!dVar.r(serialDescriptor, 6) && pVar.f46417g == null) {
            return;
        }
        dVar.f(serialDescriptor, 6, w2.f86635a, pVar.f46417g);
    }

    @Nullable
    public final String b() {
        return this.f46417g;
    }

    @Nullable
    public final o c() {
        return this.f46415e;
    }

    @Nullable
    public final Integer d() {
        return this.f46413c;
    }

    @Nullable
    public final String e() {
        return this.f46412b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return tn.p.f(this.f46411a, pVar.f46411a) && tn.p.f(this.f46412b, pVar.f46412b) && tn.p.f(this.f46413c, pVar.f46413c) && tn.p.f(this.f46414d, pVar.f46414d) && tn.p.f(this.f46415e, pVar.f46415e) && tn.p.f(this.f46416f, pVar.f46416f) && tn.p.f(this.f46417g, pVar.f46417g);
    }

    @Nullable
    public final Integer f() {
        return this.f46414d;
    }

    @Nullable
    public final String g() {
        return this.f46416f;
    }

    @Nullable
    public final Integer h() {
        return this.f46411a;
    }

    public int hashCode() {
        Integer num = this.f46411a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f46412b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f46413c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f46414d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        o oVar = this.f46415e;
        int iHashCode5 = (iHashCode4 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str2 = this.f46416f;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46417g;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECCtaSerializable(verticalSpacing=" + this.f46411a + ", ctaText=" + this.f46412b + ", buttonWidth=" + this.f46413c + ", fontSize=" + this.f46414d + ", border=" + this.f46415e + ", foregroundColor=" + this.f46416f + ", backgroundColor=" + this.f46417g + ')';
    }
}
