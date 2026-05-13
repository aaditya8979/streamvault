package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.C4380d;
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

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class v {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C4380d f46455a;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<v> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46458c;

        static {
            a aVar = new a();
            f46456a = aVar;
            f46458c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.MolocoSDKClickMetaData", aVar, 1);
            g2Var.n("banner", true);
            f46457b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v deserialize(@NotNull Decoder decoder) {
            C4380d c4380d;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46457b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            int i10 = 1;
            if (cVarB.l()) {
                c4380d = (C4380d) cVarB.C(serialDescriptor, 0, C4380d.c.f46327a, null);
            } else {
                c4380d = null;
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
                        c4380d = (C4380d) cVarB.C(serialDescriptor, 0, C4380d.c.f46327a, c4380d);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new v(i10, c4380d, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull v vVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(vVar, "value");
            SerialDescriptor serialDescriptor = f46457b;
            vo.d dVarB = encoder.b(serialDescriptor);
            v.b(vVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(C4380d.c.f46327a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46457b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<v> serializer() {
            return a.f46456a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this((C4380d) null, 1, (tn.i) (0 == true ? 1 : 0));
    }

    public /* synthetic */ v(int i10, C4380d c4380d, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46455a = null;
        } else {
            this.f46455a = c4380d;
        }
    }

    public v(@Nullable C4380d c4380d) {
        this.f46455a = c4380d;
    }

    public /* synthetic */ v(C4380d c4380d, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : c4380d);
    }

    public static final /* synthetic */ void b(v vVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (!dVar.r(serialDescriptor, 0) && vVar.f46455a == null) {
            return;
        }
        dVar.f(serialDescriptor, 0, C4380d.c.f46327a, vVar.f46455a);
    }

    @Nullable
    public final C4380d a() {
        return this.f46455a;
    }
}
