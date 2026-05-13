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

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class w {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Boolean f46459a;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46462c;

        static {
            a aVar = new a();
            f46460a = aVar;
            f46462c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.MolocoSDKConfigs", aVar, 1);
            g2Var.n("server_rendering_enabled", true);
            f46461b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final w deserialize(@NotNull Decoder decoder) {
            Boolean bool;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46461b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            int i10 = 1;
            if (cVarB.l()) {
                bool = (Boolean) cVarB.C(serialDescriptor, 0, wo.i.f86540a, null);
            } else {
                bool = null;
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
                        bool = (Boolean) cVarB.C(serialDescriptor, 0, wo.i.f86540a, bool);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new w(i10, bool, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull w wVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(wVar, "value");
            SerialDescriptor serialDescriptor = f46461b;
            vo.d dVarB = encoder.b(serialDescriptor);
            w.b(wVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{to.a.t(wo.i.f86540a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46461b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<w> serializer() {
            return a.f46460a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w() {
        this((Boolean) null, 1, (tn.i) (0 == true ? 1 : 0));
    }

    public /* synthetic */ w(int i10, Boolean bool, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46459a = null;
        } else {
            this.f46459a = bool;
        }
    }

    public w(@Nullable Boolean bool) {
        this.f46459a = bool;
    }

    public /* synthetic */ w(Boolean bool, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : bool);
    }

    public static final /* synthetic */ void b(w wVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (!dVar.r(serialDescriptor, 0) && wVar.f46459a == null) {
            return;
        }
        dVar.f(serialDescriptor, 0, wo.i.f86540a, wVar.f46459a);
    }

    @Nullable
    public final Boolean a() {
        return this.f46459a;
    }
}
