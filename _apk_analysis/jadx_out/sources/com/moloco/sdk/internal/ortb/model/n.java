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
import wo.v0;
import wo.w2;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class n {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Integer f46399b;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46402c;

        static {
            a aVar = new a();
            f46400a = aVar;
            f46402c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DECAppNameSerializable", aVar, 2);
            g2Var.n("text", true);
            g2Var.n("font_size", true);
            f46401b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n deserialize(@NotNull Decoder decoder) {
            String str;
            Integer num;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46401b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            if (cVarB.l()) {
                str = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, null);
                num = (Integer) cVarB.C(serialDescriptor, 1, v0.f86626a, null);
                i10 = 3;
            } else {
                str = null;
                Integer num2 = null;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        str = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str);
                        i11 |= 1;
                    } else {
                        if (iW != 1) {
                            throw new UnknownFieldException(iW);
                        }
                        num2 = (Integer) cVarB.C(serialDescriptor, 1, v0.f86626a, num2);
                        i11 |= 2;
                    }
                }
                num = num2;
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new n(i10, str, num, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull n nVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(nVar, "value");
            SerialDescriptor serialDescriptor = f46401b;
            vo.d dVarB = encoder.b(serialDescriptor);
            n.a(nVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(w2.f86635a), to.a.t(v0.f86626a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46401b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<n> serializer() {
            return a.f46400a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this((String) null, (Integer) (0 == true ? 1 : 0), 3, (tn.i) (0 == true ? 1 : 0));
    }

    public /* synthetic */ n(int i10, String str, Integer num, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46398a = null;
        } else {
            this.f46398a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46399b = null;
        } else {
            this.f46399b = num;
        }
    }

    public n(@Nullable String str, @Nullable Integer num) {
        this.f46398a = str;
        this.f46399b = num;
    }

    public /* synthetic */ n(String str, Integer num, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }

    public static final /* synthetic */ void a(n nVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || nVar.f46398a != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, nVar.f46398a);
        }
        if (!dVar.r(serialDescriptor, 1) && nVar.f46399b == null) {
            return;
        }
        dVar.f(serialDescriptor, 1, v0.f86626a, nVar.f46399b);
    }

    @Nullable
    public final Integer b() {
        return this.f46399b;
    }

    @Nullable
    public final String c() {
        return this.f46398a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return tn.p.f(this.f46398a, nVar.f46398a) && tn.p.f(this.f46399b, nVar.f46399b);
    }

    public int hashCode() {
        String str = this.f46398a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f46399b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECAppNameSerializable(text=" + this.f46398a + ", fontSize=" + this.f46399b + ')';
    }
}
