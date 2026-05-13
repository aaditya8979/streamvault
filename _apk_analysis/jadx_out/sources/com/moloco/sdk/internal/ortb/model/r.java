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
import wo.j3;
import wo.m0;
import wo.r2;

/* JADX INFO: loaded from: classes11.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class r {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final bn.k f46429a;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46432c;

        static {
            a aVar = new a();
            f46430a = aVar;
            f46432c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DECSkipClose", aVar, 1);
            g2Var.n("delay_seconds", true);
            f46431b = g2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final r deserialize(@NotNull Decoder decoder) {
            bn.k kVar;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46431b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            Object[] objArr = 0;
            int i10 = 1;
            if (cVarB.l()) {
                kVar = (bn.k) cVarB.C(serialDescriptor, 0, j3.f86555a, null);
            } else {
                kVar = null;
                Object[] objArr2 = true;
                int i11 = 0;
                while (objArr2 != false) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        objArr2 = false;
                    } else {
                        if (iW != 0) {
                            throw new UnknownFieldException(iW);
                        }
                        kVar = (bn.k) cVarB.C(serialDescriptor, 0, j3.f86555a, kVar);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new r(i10, kVar, r2Var, objArr == true ? 1 : 0);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull r rVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(rVar, "value");
            SerialDescriptor serialDescriptor = f46431b;
            vo.d dVarB = encoder.b(serialDescriptor);
            r.b(rVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(j3.f86555a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46431b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<r> serializer() {
            return a.f46430a;
        }
    }

    public /* synthetic */ r(int i10, bn.k kVar, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46429a = null;
        } else {
            this.f46429a = kVar;
        }
    }

    public /* synthetic */ r(int i10, bn.k kVar, r2 r2Var, tn.i iVar) {
        this(i10, kVar, r2Var);
    }

    public static final /* synthetic */ void b(r rVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (!dVar.r(serialDescriptor, 0) && rVar.f46429a == null) {
            return;
        }
        dVar.f(serialDescriptor, 0, j3.f86555a, rVar.f46429a);
    }

    @Nullable
    public final bn.k a() {
        return this.f46429a;
    }
}
