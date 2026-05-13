package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import wo.c2;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class C4377a {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f46306b;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.a$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<C4377a> serializer() {
            return c.f46307a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.a$c */
    @StabilityInferred(parameters = 0)
    public /* synthetic */ class c implements m0<C4377a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f46307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46309c;

        static {
            c cVar = new c();
            f46307a = cVar;
            f46309c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.AndroidInline", cVar, 2);
            g2Var.n("enabled", false);
            g2Var.n("url", false);
            f46308b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4377a deserialize(@NotNull Decoder decoder) {
            boolean zE;
            String strK;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46308b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            if (cVarB.l()) {
                zE = cVarB.E(serialDescriptor, 0);
                strK = cVarB.k(serialDescriptor, 1);
                i10 = 3;
            } else {
                String strK2 = null;
                zE = false;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        zE = cVarB.E(serialDescriptor, 0);
                        i11 |= 1;
                    } else {
                        if (iW != 1) {
                            throw new UnknownFieldException(iW);
                        }
                        strK2 = cVarB.k(serialDescriptor, 1);
                        i11 |= 2;
                    }
                }
                strK = strK2;
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new C4377a(i10, zE, strK, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull C4377a c4377a) {
            tn.p.k(encoder, "encoder");
            tn.p.k(c4377a, "value");
            SerialDescriptor serialDescriptor = f46308b;
            vo.d dVarB = encoder.b(serialDescriptor);
            C4377a.a(c4377a, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{wo.i.f86540a, w2.f86635a};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46308b;
        }
    }

    public /* synthetic */ C4377a(int i10, boolean z10, String str, r2 r2Var) {
        if (3 != (i10 & 3)) {
            c2.a(i10, 3, c.f46307a.getDescriptor());
        }
        this.f46305a = z10;
        this.f46306b = str;
    }

    public static final /* synthetic */ void a(C4377a c4377a, vo.d dVar, SerialDescriptor serialDescriptor) {
        dVar.p(serialDescriptor, 0, c4377a.f46305a);
        dVar.q(serialDescriptor, 1, c4377a.f46306b);
    }

    public final boolean b() {
        return this.f46305a;
    }

    @NotNull
    public final String c() {
        return this.f46306b;
    }
}
