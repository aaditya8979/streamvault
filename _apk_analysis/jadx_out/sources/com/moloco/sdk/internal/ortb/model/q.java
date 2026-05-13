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
import wo.l0;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class q {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Float f46421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Integer f46424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final Integer f46425e;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46428c;

        static {
            a aVar = new a();
            f46426a = aVar;
            f46428c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DECRatingSerializable", aVar, 5);
            g2Var.n("rating_value", true);
            g2Var.n("foreground_color", true);
            g2Var.n("background_color", true);
            g2Var.n("rating_size", true);
            g2Var.n("font_size", true);
            f46427b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q deserialize(@NotNull Decoder decoder) {
            int i10;
            Float f10;
            String str;
            String str2;
            Integer num;
            Integer num2;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46427b;
            vo.c cVarB = decoder.b(serialDescriptor);
            Float f11 = null;
            if (cVarB.l()) {
                Float f12 = (Float) cVarB.C(serialDescriptor, 0, l0.f86565a, null);
                w2 w2Var = w2.f86635a;
                String str3 = (String) cVarB.C(serialDescriptor, 1, w2Var, null);
                String str4 = (String) cVarB.C(serialDescriptor, 2, w2Var, null);
                v0 v0Var = v0.f86626a;
                f10 = f12;
                num = (Integer) cVarB.C(serialDescriptor, 3, v0Var, null);
                num2 = (Integer) cVarB.C(serialDescriptor, 4, v0Var, null);
                str2 = str4;
                i10 = 31;
                str = str3;
            } else {
                int i11 = 0;
                String str5 = null;
                String str6 = null;
                Integer num3 = null;
                Integer num4 = null;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        f11 = (Float) cVarB.C(serialDescriptor, 0, l0.f86565a, f11);
                        i11 |= 1;
                    } else if (iW == 1) {
                        str5 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str5);
                        i11 |= 2;
                    } else if (iW == 2) {
                        str6 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str6);
                        i11 |= 4;
                    } else if (iW == 3) {
                        num3 = (Integer) cVarB.C(serialDescriptor, 3, v0.f86626a, num3);
                        i11 |= 8;
                    } else {
                        if (iW != 4) {
                            throw new UnknownFieldException(iW);
                        }
                        num4 = (Integer) cVarB.C(serialDescriptor, 4, v0.f86626a, num4);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                f10 = f11;
                str = str5;
                str2 = str6;
                num = num3;
                num2 = num4;
            }
            cVarB.c(serialDescriptor);
            return new q(i10, f10, str, str2, num, num2, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull q qVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(qVar, "value");
            SerialDescriptor serialDescriptor = f46427b;
            vo.d dVarB = encoder.b(serialDescriptor);
            q.a(qVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializerT = to.a.t(l0.f86565a);
            w2 w2Var = w2.f86635a;
            KSerializer<?> kSerializerT2 = to.a.t(w2Var);
            KSerializer<?> kSerializerT3 = to.a.t(w2Var);
            v0 v0Var = v0.f86626a;
            return new KSerializer[]{kSerializerT, kSerializerT2, kSerializerT3, to.a.t(v0Var), to.a.t(v0Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46427b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<q> serializer() {
            return a.f46426a;
        }
    }

    public q() {
        this((Float) null, (String) null, (String) null, (Integer) null, (Integer) null, 31, (tn.i) null);
    }

    public /* synthetic */ q(int i10, Float f10, String str, String str2, Integer num, Integer num2, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46421a = null;
        } else {
            this.f46421a = f10;
        }
        if ((i10 & 2) == 0) {
            this.f46422b = null;
        } else {
            this.f46422b = str;
        }
        if ((i10 & 4) == 0) {
            this.f46423c = null;
        } else {
            this.f46423c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f46424d = null;
        } else {
            this.f46424d = num;
        }
        if ((i10 & 16) == 0) {
            this.f46425e = null;
        } else {
            this.f46425e = num2;
        }
    }

    public q(@Nullable Float f10, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2) {
        this.f46421a = f10;
        this.f46422b = str;
        this.f46423c = str2;
        this.f46424d = num;
        this.f46425e = num2;
    }

    public /* synthetic */ q(Float f10, String str, String str2, Integer num, Integer num2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : f10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num, (i10 & 16) != 0 ? null : num2);
    }

    public static final /* synthetic */ void a(q qVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || qVar.f46421a != null) {
            dVar.f(serialDescriptor, 0, l0.f86565a, qVar.f46421a);
        }
        if (dVar.r(serialDescriptor, 1) || qVar.f46422b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, qVar.f46422b);
        }
        if (dVar.r(serialDescriptor, 2) || qVar.f46423c != null) {
            dVar.f(serialDescriptor, 2, w2.f86635a, qVar.f46423c);
        }
        if (dVar.r(serialDescriptor, 3) || qVar.f46424d != null) {
            dVar.f(serialDescriptor, 3, v0.f86626a, qVar.f46424d);
        }
        if (!dVar.r(serialDescriptor, 4) && qVar.f46425e == null) {
            return;
        }
        dVar.f(serialDescriptor, 4, v0.f86626a, qVar.f46425e);
    }

    @Nullable
    public final String b() {
        return this.f46423c;
    }

    @Nullable
    public final Integer c() {
        return this.f46425e;
    }

    @Nullable
    public final String d() {
        return this.f46422b;
    }

    @Nullable
    public final Float e() {
        return this.f46421a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return tn.p.f(this.f46421a, qVar.f46421a) && tn.p.f(this.f46422b, qVar.f46422b) && tn.p.f(this.f46423c, qVar.f46423c) && tn.p.f(this.f46424d, qVar.f46424d) && tn.p.f(this.f46425e, qVar.f46425e);
    }

    @Nullable
    public final Integer f() {
        return this.f46424d;
    }

    public int hashCode() {
        Float f10 = this.f46421a;
        int iHashCode = (f10 == null ? 0 : f10.hashCode()) * 31;
        String str = this.f46422b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46423c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f46424d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f46425e;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECRatingSerializable(ratingValue=" + this.f46421a + ", foregroundColor=" + this.f46422b + ", backgroundColor=" + this.f46423c + ", size=" + this.f46424d + ", fontSize=" + this.f46425e + ')';
    }
}
