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

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class m {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f46391d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Integer f46392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final o f46394c;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46397c;

        static {
            a aVar = new a();
            f46395a = aVar;
            f46397c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DECAppIconSerializable", aVar, 3);
            g2Var.n("size", true);
            g2Var.n("app_icon_url", true);
            g2Var.n(OutlinedTextFieldKt.BorderId, true);
            f46396b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final m deserialize(@NotNull Decoder decoder) {
            String str;
            Integer num;
            o oVar;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46396b;
            vo.c cVarB = decoder.b(serialDescriptor);
            Integer num2 = null;
            if (cVarB.l()) {
                Integer num3 = (Integer) cVarB.C(serialDescriptor, 0, v0.f86626a, null);
                String str2 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, null);
                num = num3;
                oVar = (o) cVarB.C(serialDescriptor, 2, o.a.f46407a, null);
                i10 = 7;
                str = str2;
            } else {
                String str3 = null;
                o oVar2 = null;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        num2 = (Integer) cVarB.C(serialDescriptor, 0, v0.f86626a, num2);
                        i11 |= 1;
                    } else if (iW == 1) {
                        str3 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str3);
                        i11 |= 2;
                    } else {
                        if (iW != 2) {
                            throw new UnknownFieldException(iW);
                        }
                        oVar2 = (o) cVarB.C(serialDescriptor, 2, o.a.f46407a, oVar2);
                        i11 |= 4;
                    }
                }
                str = str3;
                num = num2;
                oVar = oVar2;
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new m(i10, num, str, oVar, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull m mVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(mVar, "value");
            SerialDescriptor serialDescriptor = f46396b;
            vo.d dVarB = encoder.b(serialDescriptor);
            m.a(mVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(v0.f86626a), to.a.t(w2.f86635a), to.a.t(o.a.f46407a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46396b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<m> serializer() {
            return a.f46395a;
        }
    }

    public m() {
        this((Integer) null, (String) null, (o) null, 7, (tn.i) null);
    }

    public /* synthetic */ m(int i10, Integer num, String str, o oVar, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46392a = null;
        } else {
            this.f46392a = num;
        }
        if ((i10 & 2) == 0) {
            this.f46393b = null;
        } else {
            this.f46393b = str;
        }
        if ((i10 & 4) == 0) {
            this.f46394c = null;
        } else {
            this.f46394c = oVar;
        }
    }

    public m(@Nullable Integer num, @Nullable String str, @Nullable o oVar) {
        this.f46392a = num;
        this.f46393b = str;
        this.f46394c = oVar;
    }

    public /* synthetic */ m(Integer num, String str, o oVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : oVar);
    }

    public static final /* synthetic */ void a(m mVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || mVar.f46392a != null) {
            dVar.f(serialDescriptor, 0, v0.f86626a, mVar.f46392a);
        }
        if (dVar.r(serialDescriptor, 1) || mVar.f46393b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, mVar.f46393b);
        }
        if (!dVar.r(serialDescriptor, 2) && mVar.f46394c == null) {
            return;
        }
        dVar.f(serialDescriptor, 2, o.a.f46407a, mVar.f46394c);
    }

    @Nullable
    public final String b() {
        return this.f46393b;
    }

    @Nullable
    public final o c() {
        return this.f46394c;
    }

    @Nullable
    public final Integer d() {
        return this.f46392a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return tn.p.f(this.f46392a, mVar.f46392a) && tn.p.f(this.f46393b, mVar.f46393b) && tn.p.f(this.f46394c, mVar.f46394c);
    }

    public int hashCode() {
        Integer num = this.f46392a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f46393b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        o oVar = this.f46394c;
        return iHashCode2 + (oVar != null ? oVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DECAppIconSerializable(size=" + this.f46392a + ", appIconUri=" + this.f46393b + ", border=" + this.f46394c + ')';
    }
}
