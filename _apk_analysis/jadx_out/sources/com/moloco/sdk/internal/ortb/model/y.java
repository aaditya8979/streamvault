package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.ortb.model.C;
import com.moloco.sdk.internal.ortb.model.C4377a;
import com.moloco.sdk.internal.ortb.model.C4378b;
import com.moloco.sdk.internal.ortb.model.C4379c;
import com.moloco.sdk.internal.ortb.model.D;
import com.moloco.sdk.internal.ortb.model.i;
import com.moloco.sdk.internal.ortb.model.k;
import com.moloco.sdk.internal.ortb.model.l;
import com.moloco.sdk.internal.ortb.model.u;
import com.moloco.sdk.internal.ortb.model.x;
import com.moloco.sdk.internal.ortb.model.z;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
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

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class y {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46474n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final C f46475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C f46476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final z f46477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final x f46478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final i f46479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f46480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final C4379c f46481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final D f46482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final l f46483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final k f46484j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final C4377a f46485k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final C4378b f46486l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final u f46487m;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46490c;

        static {
            a aVar = new a();
            f46488a = aVar;
            f46490c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.Player", aVar, 13);
            g2Var.n("skip", true);
            g2Var.n("close", false);
            g2Var.n("progress_bar", true);
            g2Var.n(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false);
            g2Var.n("cta", true);
            g2Var.n("is_all_area_clickable", false);
            g2Var.n("auto_store", true);
            g2Var.n("vast_privacy_icon", true);
            g2Var.n(ImpressionLog.L, true);
            g2Var.n("countdown_timer", true);
            g2Var.n("android_inline", true);
            g2Var.n("auto_inline", true);
            g2Var.n("inline_button", true);
            f46489b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y deserialize(@NotNull Decoder decoder) {
            C c10;
            int i10;
            C c11;
            C4378b c4378b;
            k kVar;
            D d10;
            i iVar;
            C4377a c4377a;
            C4379c c4379c;
            x xVar;
            u uVar;
            boolean z10;
            l lVar;
            z zVar;
            u uVar2;
            C c12;
            u uVar3;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46489b;
            vo.c cVarB = decoder.b(serialDescriptor);
            C c13 = null;
            if (cVarB.l()) {
                C.a aVar = C.a.f46289a;
                C c14 = (C) cVarB.C(serialDescriptor, 0, aVar, null);
                C c15 = (C) cVarB.i(serialDescriptor, 1, aVar, null);
                z zVar2 = (z) cVarB.C(serialDescriptor, 2, z.a.f46496a, null);
                x xVar2 = (x) cVarB.i(serialDescriptor, 3, x.a.f46471a, null);
                i iVar2 = (i) cVarB.C(serialDescriptor, 4, i.a.f46363a, null);
                boolean zE = cVarB.E(serialDescriptor, 5);
                C4379c c4379c2 = (C4379c) cVarB.C(serialDescriptor, 6, C4379c.C0567c.f46322a, null);
                D d11 = (D) cVarB.C(serialDescriptor, 7, D.a.f46296a, null);
                l lVar2 = (l) cVarB.C(serialDescriptor, 8, l.a.f46388a, null);
                k kVar2 = (k) cVarB.C(serialDescriptor, 9, k.a.f46375a, null);
                C4377a c4377a2 = (C4377a) cVarB.C(serialDescriptor, 10, C4377a.c.f46307a, null);
                C4378b c4378b2 = (C4378b) cVarB.C(serialDescriptor, 11, C4378b.c.f46316a, null);
                c10 = c15;
                uVar = (u) cVarB.C(serialDescriptor, 12, u.a.f46452a, null);
                c4378b = c4378b2;
                c4377a = c4377a2;
                kVar = kVar2;
                d10 = d11;
                c4379c = c4379c2;
                z10 = zE;
                xVar = xVar2;
                lVar = lVar2;
                iVar = iVar2;
                zVar = zVar2;
                i10 = 8191;
                c11 = c14;
            } else {
                int i11 = 0;
                boolean zE2 = false;
                C c16 = null;
                u uVar4 = null;
                C4378b c4378b3 = null;
                k kVar3 = null;
                l lVar3 = null;
                D d12 = null;
                i iVar3 = null;
                C4377a c4377a3 = null;
                C4379c c4379c3 = null;
                x xVar3 = null;
                boolean z11 = true;
                z zVar3 = null;
                while (z11) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            uVar2 = uVar4;
                            z11 = false;
                            uVar4 = uVar2;
                            break;
                        case 0:
                            uVar2 = uVar4;
                            c13 = (C) cVarB.C(serialDescriptor, 0, C.a.f46289a, c13);
                            i11 |= 1;
                            uVar4 = uVar2;
                            break;
                        case 1:
                            c12 = c13;
                            uVar3 = uVar4;
                            c16 = (C) cVarB.i(serialDescriptor, 1, C.a.f46289a, c16);
                            i11 |= 2;
                            uVar4 = uVar3;
                            c13 = c12;
                            break;
                        case 2:
                            c12 = c13;
                            uVar3 = uVar4;
                            zVar3 = (z) cVarB.C(serialDescriptor, 2, z.a.f46496a, zVar3);
                            i11 |= 4;
                            uVar4 = uVar3;
                            c13 = c12;
                            break;
                        case 3:
                            c12 = c13;
                            uVar3 = uVar4;
                            xVar3 = (x) cVarB.i(serialDescriptor, 3, x.a.f46471a, xVar3);
                            i11 |= 8;
                            uVar4 = uVar3;
                            c13 = c12;
                            break;
                        case 4:
                            c12 = c13;
                            uVar3 = uVar4;
                            iVar3 = (i) cVarB.C(serialDescriptor, 4, i.a.f46363a, iVar3);
                            i11 |= 16;
                            uVar4 = uVar3;
                            c13 = c12;
                            break;
                        case 5:
                            c12 = c13;
                            zE2 = cVarB.E(serialDescriptor, 5);
                            i11 |= 32;
                            c13 = c12;
                            break;
                        case 6:
                            c12 = c13;
                            c4379c3 = (C4379c) cVarB.C(serialDescriptor, 6, C4379c.C0567c.f46322a, c4379c3);
                            i11 |= 64;
                            c13 = c12;
                            break;
                        case 7:
                            c12 = c13;
                            d12 = (D) cVarB.C(serialDescriptor, 7, D.a.f46296a, d12);
                            i11 |= 128;
                            c13 = c12;
                            break;
                        case 8:
                            c12 = c13;
                            lVar3 = (l) cVarB.C(serialDescriptor, 8, l.a.f46388a, lVar3);
                            i11 |= 256;
                            c13 = c12;
                            break;
                        case 9:
                            c12 = c13;
                            kVar3 = (k) cVarB.C(serialDescriptor, 9, k.a.f46375a, kVar3);
                            i11 |= 512;
                            c13 = c12;
                            break;
                        case 10:
                            c12 = c13;
                            c4377a3 = (C4377a) cVarB.C(serialDescriptor, 10, C4377a.c.f46307a, c4377a3);
                            i11 |= 1024;
                            c13 = c12;
                            break;
                        case 11:
                            c12 = c13;
                            c4378b3 = (C4378b) cVarB.C(serialDescriptor, 11, C4378b.c.f46316a, c4378b3);
                            i11 |= 2048;
                            c13 = c12;
                            break;
                        case 12:
                            uVar4 = (u) cVarB.C(serialDescriptor, 12, u.a.f46452a, uVar4);
                            i11 |= 4096;
                            c13 = c13;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                c10 = c16;
                i10 = i11;
                c11 = c13;
                c4378b = c4378b3;
                kVar = kVar3;
                d10 = d12;
                iVar = iVar3;
                c4377a = c4377a3;
                c4379c = c4379c3;
                xVar = xVar3;
                uVar = uVar4;
                z10 = zE2;
                lVar = lVar3;
                zVar = zVar3;
            }
            cVarB.c(serialDescriptor);
            return new y(i10, c11, c10, zVar, xVar, iVar, z10, c4379c, d10, lVar, kVar, c4377a, c4378b, uVar, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull y yVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(yVar, "value");
            SerialDescriptor serialDescriptor = f46489b;
            vo.d dVarB = encoder.b(serialDescriptor);
            y.b(yVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            C.a aVar = C.a.f46289a;
            return new KSerializer[]{to.a.t(aVar), aVar, to.a.t(z.a.f46496a), x.a.f46471a, to.a.t(i.a.f46363a), wo.i.f86540a, to.a.t(C4379c.C0567c.f46322a), to.a.t(D.a.f46296a), to.a.t(l.a.f46388a), to.a.t(k.a.f46375a), to.a.t(C4377a.c.f46307a), to.a.t(C4378b.c.f46316a), to.a.t(u.a.f46452a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46489b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<y> serializer() {
            return a.f46488a;
        }
    }

    public /* synthetic */ y(int i10, C c10, C c11, z zVar, x xVar, i iVar, boolean z10, C4379c c4379c, D d10, l lVar, k kVar, C4377a c4377a, C4378b c4378b, u uVar, r2 r2Var) {
        if (42 != (i10 & 42)) {
            c2.a(i10, 42, a.f46488a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f46475a = null;
        } else {
            this.f46475a = c10;
        }
        this.f46476b = c11;
        if ((i10 & 4) == 0) {
            this.f46477c = null;
        } else {
            this.f46477c = zVar;
        }
        this.f46478d = xVar;
        if ((i10 & 16) == 0) {
            this.f46479e = null;
        } else {
            this.f46479e = iVar;
        }
        this.f46480f = z10;
        if ((i10 & 64) == 0) {
            this.f46481g = null;
        } else {
            this.f46481g = c4379c;
        }
        if ((i10 & 128) == 0) {
            this.f46482h = null;
        } else {
            this.f46482h = d10;
        }
        if ((i10 & 256) == 0) {
            this.f46483i = null;
        } else {
            this.f46483i = lVar;
        }
        if ((i10 & 512) == 0) {
            this.f46484j = null;
        } else {
            this.f46484j = kVar;
        }
        if ((i10 & 1024) == 0) {
            this.f46485k = null;
        } else {
            this.f46485k = c4377a;
        }
        if ((i10 & 2048) == 0) {
            this.f46486l = null;
        } else {
            this.f46486l = c4378b;
        }
        if ((i10 & 4096) == 0) {
            this.f46487m = null;
        } else {
            this.f46487m = uVar;
        }
    }

    public y(@Nullable C c10, @NotNull C c11, @Nullable z zVar, @NotNull x xVar, @Nullable i iVar, boolean z10, @Nullable C4379c c4379c, @Nullable D d10, @Nullable l lVar, @Nullable k kVar, @Nullable C4377a c4377a, @Nullable C4378b c4378b, @Nullable u uVar) {
        tn.p.k(c11, "close");
        tn.p.k(xVar, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        this.f46475a = c10;
        this.f46476b = c11;
        this.f46477c = zVar;
        this.f46478d = xVar;
        this.f46479e = iVar;
        this.f46480f = z10;
        this.f46481g = c4379c;
        this.f46482h = d10;
        this.f46483i = lVar;
        this.f46484j = kVar;
        this.f46485k = c4377a;
        this.f46486l = c4378b;
        this.f46487m = uVar;
    }

    public /* synthetic */ y(C c10, C c11, z zVar, x xVar, i iVar, boolean z10, C4379c c4379c, D d10, l lVar, k kVar, C4377a c4377a, C4378b c4378b, u uVar, int i10, tn.i iVar2) {
        this((i10 & 1) != 0 ? null : c10, c11, (i10 & 4) != 0 ? null : zVar, xVar, (i10 & 16) != 0 ? null : iVar, z10, (i10 & 64) != 0 ? null : c4379c, (i10 & 128) != 0 ? null : d10, (i10 & 256) != 0 ? null : lVar, (i10 & 512) != 0 ? null : kVar, (i10 & 1024) != 0 ? null : c4377a, (i10 & 2048) != 0 ? null : c4378b, (i10 & 4096) != 0 ? null : uVar);
    }

    public static final /* synthetic */ void b(y yVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || yVar.f46475a != null) {
            dVar.f(serialDescriptor, 0, C.a.f46289a, yVar.f46475a);
        }
        dVar.g(serialDescriptor, 1, C.a.f46289a, yVar.f46476b);
        if (dVar.r(serialDescriptor, 2) || yVar.f46477c != null) {
            dVar.f(serialDescriptor, 2, z.a.f46496a, yVar.f46477c);
        }
        dVar.g(serialDescriptor, 3, x.a.f46471a, yVar.f46478d);
        if (dVar.r(serialDescriptor, 4) || yVar.f46479e != null) {
            dVar.f(serialDescriptor, 4, i.a.f46363a, yVar.f46479e);
        }
        dVar.p(serialDescriptor, 5, yVar.f46480f);
        if (dVar.r(serialDescriptor, 6) || yVar.f46481g != null) {
            dVar.f(serialDescriptor, 6, C4379c.C0567c.f46322a, yVar.f46481g);
        }
        if (dVar.r(serialDescriptor, 7) || yVar.f46482h != null) {
            dVar.f(serialDescriptor, 7, D.a.f46296a, yVar.f46482h);
        }
        if (dVar.r(serialDescriptor, 8) || yVar.f46483i != null) {
            dVar.f(serialDescriptor, 8, l.a.f46388a, yVar.f46483i);
        }
        if (dVar.r(serialDescriptor, 9) || yVar.f46484j != null) {
            dVar.f(serialDescriptor, 9, k.a.f46375a, yVar.f46484j);
        }
        if (dVar.r(serialDescriptor, 10) || yVar.f46485k != null) {
            dVar.f(serialDescriptor, 10, C4377a.c.f46307a, yVar.f46485k);
        }
        if (dVar.r(serialDescriptor, 11) || yVar.f46486l != null) {
            dVar.f(serialDescriptor, 11, C4378b.c.f46316a, yVar.f46486l);
        }
        if (!dVar.r(serialDescriptor, 12) && yVar.f46487m == null) {
            return;
        }
        dVar.f(serialDescriptor, 12, u.a.f46452a, yVar.f46487m);
    }

    @Nullable
    public final C4377a a() {
        return this.f46485k;
    }

    @Nullable
    public final C4378b c() {
        return this.f46486l;
    }

    @Nullable
    public final C4379c d() {
        return this.f46481g;
    }

    @NotNull
    public final C e() {
        return this.f46476b;
    }

    @Nullable
    public final k f() {
        return this.f46484j;
    }

    @Nullable
    public final i g() {
        return this.f46479e;
    }

    @Nullable
    public final l h() {
        return this.f46483i;
    }

    @Nullable
    public final u i() {
        return this.f46487m;
    }

    @NotNull
    public final x j() {
        return this.f46478d;
    }

    @Nullable
    public final z k() {
        return this.f46477c;
    }

    @Nullable
    public final C l() {
        return this.f46475a;
    }

    @Nullable
    public final D m() {
        return this.f46482h;
    }

    public final boolean n() {
        return this.f46480f;
    }
}
