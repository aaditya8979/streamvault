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
import wo.w2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 1)
@so.k
public final class C4380d {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46326b;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.d$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<C4380d> serializer() {
            return c.f46327a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.d$c */
    @StabilityInferred(parameters = 0)
    public /* synthetic */ class c implements m0<C4380d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f46327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46328b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46329c;

        static {
            c cVar = new c();
            f46327a = cVar;
            f46329c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.BannerClickMetaData", cVar, 2);
            g2Var.n("click_tracking", true);
            g2Var.n("click_through", true);
            f46328b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4380d deserialize(@NotNull Decoder decoder) {
            String str;
            String str2;
            int i10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46328b;
            vo.c cVarB = decoder.b(serialDescriptor);
            r2 r2Var = null;
            if (cVarB.l()) {
                w2 w2Var = w2.f86635a;
                str2 = (String) cVarB.C(serialDescriptor, 0, w2Var, null);
                str = (String) cVarB.C(serialDescriptor, 1, w2Var, null);
                i10 = 3;
            } else {
                str = null;
                String str3 = null;
                int i11 = 0;
                boolean z10 = true;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    if (iW == -1) {
                        z10 = false;
                    } else if (iW == 0) {
                        str3 = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str3);
                        i11 |= 1;
                    } else {
                        if (iW != 1) {
                            throw new UnknownFieldException(iW);
                        }
                        str = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str);
                        i11 |= 2;
                    }
                }
                str2 = str3;
                i10 = i11;
            }
            cVarB.c(serialDescriptor);
            return new C4380d(i10, str2, str, r2Var);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull C4380d c4380d) {
            tn.p.k(encoder, "encoder");
            tn.p.k(c4380d, "value");
            SerialDescriptor serialDescriptor = f46328b;
            vo.d dVarB = encoder.b(serialDescriptor);
            C4380d.b(c4380d, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            w2 w2Var = w2.f86635a;
            return new KSerializer[]{to.a.t(w2Var), to.a.t(w2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46328b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4380d() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (tn.i) (0 == true ? 1 : 0));
    }

    public /* synthetic */ C4380d(int i10, String str, String str2, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46325a = null;
        } else {
            this.f46325a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46326b = null;
        } else {
            this.f46326b = str2;
        }
    }

    public C4380d(@Nullable String str, @Nullable String str2) {
        this.f46325a = str;
        this.f46326b = str2;
    }

    public /* synthetic */ C4380d(String str, String str2, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }

    public static final /* synthetic */ void b(C4380d c4380d, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || c4380d.f46325a != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, c4380d.f46325a);
        }
        if (!dVar.r(serialDescriptor, 1) && c4380d.f46326b == null) {
            return;
        }
        dVar.f(serialDescriptor, 1, w2.f86635a, c4380d.f46326b);
    }

    @Nullable
    public final String a() {
        return this.f46326b;
    }

    @Nullable
    public final String c() {
        return this.f46325a;
    }
}
