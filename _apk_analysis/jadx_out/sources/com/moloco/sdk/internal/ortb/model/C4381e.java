package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.ironsource.C4157n2;
import com.moloco.sdk.internal.ortb.model.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wo.c2;
import wo.g2;
import wo.l0;
import wo.m0;
import wo.r2;
import wo.w2;

/* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class C4381e {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f46330g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f46331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f46332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final f f46334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final String f46335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f46336f;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.e$b */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<C4381e> serializer() {
            return c.f46337a;
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ortb.model.e$c */
    @StabilityInferred(parameters = 0)
    public /* synthetic */ class c implements m0<C4381e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final c f46337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46338b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46339c;

        static {
            c cVar = new c();
            f46337a = cVar;
            f46339c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.Bid", cVar, 6);
            g2Var.n("adm", false);
            g2Var.n("price", false);
            g2Var.n(C4157n2.f33016y, true);
            g2Var.n("ext", false);
            g2Var.n("crid", true);
            g2Var.n(ContainerActivity.BUNDLE, true);
            f46338b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4381e deserialize(@NotNull Decoder decoder) {
            String strK;
            int i10;
            String str;
            String str2;
            f fVar;
            String str3;
            float f10;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46338b;
            vo.c cVarB = decoder.b(serialDescriptor);
            if (cVarB.l()) {
                String strK2 = cVarB.k(serialDescriptor, 0);
                float fZ = cVarB.z(serialDescriptor, 1);
                w2 w2Var = w2.f86635a;
                String str4 = (String) cVarB.C(serialDescriptor, 2, w2Var, null);
                f fVar2 = (f) cVarB.i(serialDescriptor, 3, f.a.f46346a, null);
                String str5 = (String) cVarB.C(serialDescriptor, 4, w2Var, null);
                strK = strK2;
                str = (String) cVarB.C(serialDescriptor, 5, w2Var, null);
                fVar = fVar2;
                str2 = str5;
                str3 = str4;
                f10 = fZ;
                i10 = 63;
            } else {
                float fZ2 = 0.0f;
                boolean z10 = true;
                strK = null;
                String str6 = null;
                f fVar3 = null;
                String str7 = null;
                String str8 = null;
                i10 = 0;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            strK = cVarB.k(serialDescriptor, 0);
                            i10 |= 1;
                            continue;
                        case 1:
                            fZ2 = cVarB.z(serialDescriptor, 1);
                            i10 |= 2;
                            break;
                        case 2:
                            str6 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str6);
                            i10 |= 4;
                            break;
                        case 3:
                            fVar3 = (f) cVarB.i(serialDescriptor, 3, f.a.f46346a, fVar3);
                            i10 |= 8;
                            break;
                        case 4:
                            str7 = (String) cVarB.C(serialDescriptor, 4, w2.f86635a, str7);
                            i10 |= 16;
                            break;
                        case 5:
                            str8 = (String) cVarB.C(serialDescriptor, 5, w2.f86635a, str8);
                            i10 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                str = str8;
                str2 = str7;
                fVar = fVar3;
                str3 = str6;
                f10 = fZ2;
            }
            cVarB.c(serialDescriptor);
            return new C4381e(i10, strK, f10, str3, fVar, str2, str, null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull C4381e c4381e) {
            tn.p.k(encoder, "encoder");
            tn.p.k(c4381e, "value");
            SerialDescriptor serialDescriptor = f46338b;
            vo.d dVarB = encoder.b(serialDescriptor);
            C4381e.b(c4381e, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            w2 w2Var = w2.f86635a;
            return new KSerializer[]{w2Var, l0.f86565a, to.a.t(w2Var), f.a.f46346a, to.a.t(w2Var), to.a.t(w2Var)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46338b;
        }
    }

    public /* synthetic */ C4381e(int i10, String str, float f10, String str2, f fVar, String str3, String str4, r2 r2Var) {
        if (11 != (i10 & 11)) {
            c2.a(i10, 11, c.f46337a.getDescriptor());
        }
        this.f46331a = str;
        this.f46332b = f10;
        if ((i10 & 4) == 0) {
            this.f46333c = null;
        } else {
            this.f46333c = str2;
        }
        this.f46334d = fVar;
        if ((i10 & 16) == 0) {
            this.f46335e = null;
        } else {
            this.f46335e = str3;
        }
        if ((i10 & 32) == 0) {
            this.f46336f = null;
        } else {
            this.f46336f = str4;
        }
    }

    public C4381e(@NotNull String str, float f10, @Nullable String str2, @NotNull f fVar, @Nullable String str3, @Nullable String str4) {
        tn.p.k(str, "adm");
        tn.p.k(fVar, "ext");
        this.f46331a = str;
        this.f46332b = f10;
        this.f46333c = str2;
        this.f46334d = fVar;
        this.f46335e = str3;
        this.f46336f = str4;
    }

    public static final /* synthetic */ void b(C4381e c4381e, vo.d dVar, SerialDescriptor serialDescriptor) {
        dVar.q(serialDescriptor, 0, c4381e.f46331a);
        dVar.D(serialDescriptor, 1, c4381e.f46332b);
        if (dVar.r(serialDescriptor, 2) || c4381e.f46333c != null) {
            dVar.f(serialDescriptor, 2, w2.f86635a, c4381e.f46333c);
        }
        dVar.g(serialDescriptor, 3, f.a.f46346a, c4381e.f46334d);
        if (dVar.r(serialDescriptor, 4) || c4381e.f46335e != null) {
            dVar.f(serialDescriptor, 4, w2.f86635a, c4381e.f46335e);
        }
        if (!dVar.r(serialDescriptor, 5) && c4381e.f46336f == null) {
            return;
        }
        dVar.f(serialDescriptor, 5, w2.f86635a, c4381e.f46336f);
    }

    @NotNull
    public final String a() {
        return this.f46331a;
    }

    @Nullable
    public final String c() {
        return this.f46336f;
    }

    @Nullable
    public final String d() {
        return this.f46333c;
    }

    @Nullable
    public final String e() {
        return this.f46335e;
    }

    @NotNull
    public final f f() {
        return this.f46334d;
    }

    public final float g() {
        return this.f46332b;
    }
}
