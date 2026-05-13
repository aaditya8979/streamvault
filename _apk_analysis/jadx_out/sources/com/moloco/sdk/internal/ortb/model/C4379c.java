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

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class C4379c {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46321c;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.c$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<C4379c> serializer() {
            return C0567c.f46322a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.c$c, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public /* synthetic */ class C0567c implements m0<C4379c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0567c f46322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46324c;

        static {
            C0567c c0567c = new C0567c();
            f46322a = c0567c;
            f46324c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.AutoStore", c0567c, 3);
            g2Var.n("enabled", false);
            g2Var.n("on_skip", true);
            g2Var.n("event_link", true);
            f46323b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4379c deserialize(@NotNull Decoder decoder) {
            boolean z10;
            boolean z11;
            int i10;
            String str;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46323b;
            vo.c cVarB = decoder.b(serialDescriptor);
            if (cVarB.l()) {
                boolean zE = cVarB.E(serialDescriptor, 0);
                boolean zE2 = cVarB.E(serialDescriptor, 1);
                z10 = zE;
                str = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, null);
                z11 = zE2;
                i10 = 7;
            } else {
                boolean z12 = true;
                boolean zE3 = false;
                int i11 = 0;
                String str2 = null;
                boolean zE4 = false;
                while (z12) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z12 = false;
                    } else if (iW == 0) {
                        zE3 = cVarB.E(serialDescriptor, 0);
                        i11 |= 1;
                    } else if (iW == 1) {
                        zE4 = cVarB.E(serialDescriptor, 1);
                        i11 |= 2;
                    } else {
                        if (iW != 2) {
                            throw new UnknownFieldException(iW);
                        }
                        str2 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str2);
                        i11 |= 4;
                    }
                }
                z10 = zE3;
                z11 = zE4;
                i10 = i11;
                str = str2;
            }
            cVarB.c(serialDescriptor);
            return new C4379c(i10, z10, z11, str, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull C4379c c4379c) {
            tn.p.k(encoder, "encoder");
            tn.p.k(c4379c, "value");
            SerialDescriptor serialDescriptor = f46323b;
            vo.d dVarB = encoder.b(serialDescriptor);
            C4379c.a(c4379c, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializerT = to.a.t(w2.f86635a);
            wo.i iVar = wo.i.f86540a;
            return new KSerializer[]{iVar, iVar, kSerializerT};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46323b;
        }
    }

    public /* synthetic */ C4379c(int i10, boolean z10, boolean z11, String str, r2 r2Var) {
        if (1 != (i10 & 1)) {
            c2.a(i10, 1, C0567c.f46322a.getDescriptor());
        }
        this.f46319a = z10;
        if ((i10 & 2) == 0) {
            this.f46320b = true;
        } else {
            this.f46320b = z11;
        }
        if ((i10 & 4) == 0) {
            this.f46321c = null;
        } else {
            this.f46321c = str;
        }
    }

    public C4379c(boolean z10, boolean z11, @Nullable String str) {
        this.f46319a = z10;
        this.f46320b = z11;
        this.f46321c = str;
    }

    public /* synthetic */ C4379c(boolean z10, boolean z11, String str, int i10, tn.i iVar) {
        this(z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? null : str);
    }

    public static final /* synthetic */ void a(C4379c c4379c, vo.d dVar, SerialDescriptor serialDescriptor) {
        dVar.p(serialDescriptor, 0, c4379c.f46319a);
        if (dVar.r(serialDescriptor, 1) || !c4379c.f46320b) {
            dVar.p(serialDescriptor, 1, c4379c.f46320b);
        }
        if (!dVar.r(serialDescriptor, 2) && c4379c.f46321c == null) {
            return;
        }
        dVar.f(serialDescriptor, 2, w2.f86635a, c4379c.f46321c);
    }

    public final boolean b() {
        return this.f46319a;
    }

    @Nullable
    public final String c() {
        return this.f46321c;
    }

    public final boolean d() {
        return this.f46320b;
    }
}
