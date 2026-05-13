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

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class C4378b {

    @NotNull
    public static final C0566b Companion = new C0566b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f46312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f46313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final Boolean f46315d;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.b$b, reason: collision with other inner class name */
    public static final class C0566b {
        public C0566b() {
        }

        public /* synthetic */ C0566b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<C4378b> serializer() {
            return c.f46316a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.b$c */
    @StabilityInferred(parameters = 0)
    public /* synthetic */ class c implements m0<C4378b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f46316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46318c;

        static {
            c cVar = new c();
            f46316a = cVar;
            f46318c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.AutoInline", cVar, 4);
            g2Var.n("on_skip", false);
            g2Var.n("event_link", false);
            g2Var.n("click_through", true);
            g2Var.n("force_fullscreen", true);
            f46317b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4378b deserialize(@NotNull Decoder decoder) {
            boolean z10;
            int i10;
            String str;
            String str2;
            Boolean bool;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46317b;
            vo.c cVarB = decoder.b(serialDescriptor);
            if (cVarB.l()) {
                boolean zE = cVarB.E(serialDescriptor, 0);
                String strK = cVarB.k(serialDescriptor, 1);
                String str3 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, null);
                z10 = zE;
                bool = (Boolean) cVarB.C(serialDescriptor, 3, wo.i.f86540a, null);
                i10 = 15;
                str2 = str3;
                str = strK;
            } else {
                String strK2 = null;
                String str4 = null;
                Boolean bool2 = null;
                boolean zE2 = false;
                int i11 = 0;
                boolean z11 = true;
                while (z11) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z11 = false;
                    } else if (iW == 0) {
                        zE2 = cVarB.E(serialDescriptor, 0);
                        i11 |= 1;
                    } else if (iW == 1) {
                        strK2 = cVarB.k(serialDescriptor, 1);
                        i11 |= 2;
                    } else if (iW == 2) {
                        str4 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str4);
                        i11 |= 4;
                    } else {
                        if (iW != 3) {
                            throw new UnknownFieldException(iW);
                        }
                        bool2 = (Boolean) cVarB.C(serialDescriptor, 3, wo.i.f86540a, bool2);
                        i11 |= 8;
                    }
                }
                z10 = zE2;
                i10 = i11;
                str = strK2;
                str2 = str4;
                bool = bool2;
            }
            cVarB.c(serialDescriptor);
            return new C4378b(i10, z10, str, str2, bool, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull C4378b c4378b) {
            tn.p.k(encoder, "encoder");
            tn.p.k(c4378b, "value");
            SerialDescriptor serialDescriptor = f46317b;
            vo.d dVarB = encoder.b(serialDescriptor);
            C4378b.b(c4378b, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            wo.i iVar = wo.i.f86540a;
            w2 w2Var = w2.f86635a;
            return new KSerializer[]{iVar, w2Var, to.a.t(w2Var), to.a.t(iVar)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46317b;
        }
    }

    public /* synthetic */ C4378b(int i10, boolean z10, String str, String str2, Boolean bool, r2 r2Var) {
        if (3 != (i10 & 3)) {
            c2.a(i10, 3, c.f46316a.getDescriptor());
        }
        this.f46312a = z10;
        this.f46313b = str;
        if ((i10 & 4) == 0) {
            this.f46314c = null;
        } else {
            this.f46314c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f46315d = Boolean.FALSE;
        } else {
            this.f46315d = bool;
        }
    }

    public static final /* synthetic */ void b(C4378b c4378b, vo.d dVar, SerialDescriptor serialDescriptor) {
        dVar.p(serialDescriptor, 0, c4378b.f46312a);
        dVar.q(serialDescriptor, 1, c4378b.f46313b);
        if (dVar.r(serialDescriptor, 2) || c4378b.f46314c != null) {
            dVar.f(serialDescriptor, 2, w2.f86635a, c4378b.f46314c);
        }
        if (!dVar.r(serialDescriptor, 3) && tn.p.f(c4378b.f46315d, Boolean.FALSE)) {
            return;
        }
        dVar.f(serialDescriptor, 3, wo.i.f86540a, c4378b.f46315d);
    }

    @Nullable
    public final String a() {
        return this.f46314c;
    }

    @NotNull
    public final String c() {
        return this.f46313b;
    }

    @Nullable
    public final Boolean d() {
        return this.f46315d;
    }

    public final boolean e() {
        return this.f46312a;
    }
}
