package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.c2;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class s {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46433a;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46436c;

        static {
            a aVar = new a();
            f46434a = aVar;
            f46436c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.GradientColor", aVar, 1);
            g2Var.n("color", false);
            f46435b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s deserialize(@NotNull Decoder decoder) {
            String strK;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46435b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            int i10 = 1;
            if (cVarB.l()) {
                strK = cVarB.k(serialDescriptor, 0);
            } else {
                strK = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else {
                        if (iW != 0) {
                            throw new UnknownFieldException(iW);
                        }
                        strK = cVarB.k(serialDescriptor, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new s(i10, strK, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull s sVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(sVar, "value");
            SerialDescriptor serialDescriptor = f46435b;
            vo.d dVarB = encoder.b(serialDescriptor);
            s.a(sVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{w2.f86635a};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46435b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<s> serializer() {
            return a.f46434a;
        }
    }

    public /* synthetic */ s(int i10, String str, r2 r2Var) {
        if (1 != (i10 & 1)) {
            c2.a(i10, 1, a.f46434a.getDescriptor());
        }
        this.f46433a = str;
    }

    public static final /* synthetic */ void a(s sVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        dVar.q(serialDescriptor, 0, sVar.f46433a);
    }

    @NotNull
    public final String b() {
        return this.f46433a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && tn.p.f(this.f46433a, ((s) obj).f46433a);
    }

    public int hashCode() {
        return this.f46433a.hashCode();
    }

    @NotNull
    public String toString() {
        return "GradientColor(color=" + this.f46433a + ')';
    }
}
