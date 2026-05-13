package com.moloco.sdk.internal.ortb.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.internal.ortb.model.m;
import com.moloco.sdk.internal.ortb.model.n;
import com.moloco.sdk.internal.ortb.model.p;
import com.moloco.sdk.internal.ortb.model.q;
import com.moloco.sdk.internal.ortb.model.r;
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

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@so.k
public final class l {

    @NotNull
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f46378j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f46379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f46380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f46381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f46382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final r f46383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final p f46384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final m f46385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final q f46386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final n f46387i;

    @StabilityInferred(parameters = 0)
    public /* synthetic */ class a implements m0<l> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f46388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final SerialDescriptor f46389b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f46390c;

        static {
            a aVar = new a();
            f46388a = aVar;
            f46390c = 8;
            g2 g2Var = new g2("com.moloco.sdk.internal.ortb.model.DEC", aVar, 9);
            g2Var.n("imp_link", true);
            g2Var.n("click_through", true);
            g2Var.n("click_tracking", true);
            g2Var.n("skip_event", true);
            g2Var.n("close", true);
            g2Var.n("cta", true);
            g2Var.n("app_icon", true);
            g2Var.n("rating", true);
            g2Var.n("app_name", true);
            f46389b = g2Var;
        }

        @Override // so.c
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final l deserialize(@NotNull Decoder decoder) {
            int i10;
            n nVar;
            String str;
            r rVar;
            String str2;
            m mVar;
            String str3;
            p pVar;
            String str4;
            q qVar;
            tn.p.k(decoder, "decoder");
            SerialDescriptor serialDescriptor = f46389b;
            vo.c cVarB = decoder.b(serialDescriptor);
            int i11 = 7;
            String str5 = null;
            if (cVarB.l()) {
                w2 w2Var = w2.f86635a;
                String str6 = (String) cVarB.C(serialDescriptor, 0, w2Var, null);
                String str7 = (String) cVarB.C(serialDescriptor, 1, w2Var, null);
                String str8 = (String) cVarB.C(serialDescriptor, 2, w2Var, null);
                String str9 = (String) cVarB.C(serialDescriptor, 3, w2Var, null);
                r rVar2 = (r) cVarB.C(serialDescriptor, 4, r.a.f46430a, null);
                p pVar2 = (p) cVarB.C(serialDescriptor, 5, p.a.f46418a, null);
                m mVar2 = (m) cVarB.C(serialDescriptor, 6, m.a.f46395a, null);
                qVar = (q) cVarB.C(serialDescriptor, 7, q.a.f46426a, null);
                mVar = mVar2;
                pVar = pVar2;
                rVar = rVar2;
                nVar = (n) cVarB.C(serialDescriptor, 8, n.a.f46400a, null);
                i10 = 511;
                str = str6;
                str2 = str8;
                str3 = str7;
                str4 = str9;
            } else {
                int i12 = 0;
                boolean z10 = true;
                q qVar2 = null;
                n nVar2 = null;
                m mVar3 = null;
                r rVar3 = null;
                p pVar3 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                while (z10) {
                    int iW = cVarB.w(serialDescriptor);
                    switch (iW) {
                        case -1:
                            z10 = false;
                            i11 = 7;
                            break;
                        case 0:
                            str5 = (String) cVarB.C(serialDescriptor, 0, w2.f86635a, str5);
                            i12 |= 1;
                            i11 = 7;
                            break;
                        case 1:
                            str10 = (String) cVarB.C(serialDescriptor, 1, w2.f86635a, str10);
                            i12 |= 2;
                            i11 = 7;
                            break;
                        case 2:
                            str11 = (String) cVarB.C(serialDescriptor, 2, w2.f86635a, str11);
                            i12 |= 4;
                            i11 = 7;
                            break;
                        case 3:
                            str12 = (String) cVarB.C(serialDescriptor, 3, w2.f86635a, str12);
                            i12 |= 8;
                            i11 = 7;
                            break;
                        case 4:
                            rVar3 = (r) cVarB.C(serialDescriptor, 4, r.a.f46430a, rVar3);
                            i12 |= 16;
                            i11 = 7;
                            break;
                        case 5:
                            pVar3 = (p) cVarB.C(serialDescriptor, 5, p.a.f46418a, pVar3);
                            i12 |= 32;
                            i11 = 7;
                            break;
                        case 6:
                            mVar3 = (m) cVarB.C(serialDescriptor, 6, m.a.f46395a, mVar3);
                            i12 |= 64;
                            break;
                        case 7:
                            qVar2 = (q) cVarB.C(serialDescriptor, i11, q.a.f46426a, qVar2);
                            i12 |= 128;
                            break;
                        case 8:
                            nVar2 = (n) cVarB.C(serialDescriptor, 8, n.a.f46400a, nVar2);
                            i12 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iW);
                    }
                }
                i10 = i12;
                nVar = nVar2;
                str = str5;
                rVar = rVar3;
                str2 = str11;
                mVar = mVar3;
                str3 = str10;
                pVar = pVar3;
                str4 = str12;
                qVar = qVar2;
            }
            cVarB.c(serialDescriptor);
            return new l(i10, str, str3, str2, str4, rVar, pVar, mVar, qVar, nVar, (r2) null);
        }

        @Override // so.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(@NotNull Encoder encoder, @NotNull l lVar) {
            tn.p.k(encoder, "encoder");
            tn.p.k(lVar, "value");
            SerialDescriptor serialDescriptor = f46389b;
            vo.d dVarB = encoder.b(serialDescriptor);
            l.b(lVar, dVarB, serialDescriptor);
            dVarB.c(serialDescriptor);
        }

        @Override // wo.m0
        @NotNull
        public final KSerializer<?>[] childSerializers() {
            w2 w2Var = w2.f86635a;
            return new KSerializer[]{to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(r.a.f46430a), to.a.t(p.a.f46418a), to.a.t(m.a.f46395a), to.a.t(q.a.f46426a), to.a.t(n.a.f46400a)};
        }

        @Override // kotlinx.serialization.KSerializer, so.l, so.c
        @NotNull
        public final SerialDescriptor getDescriptor() {
            return f46389b;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<l> serializer() {
            return a.f46388a;
        }
    }

    public l() {
        this((String) null, (String) null, (String) null, (String) null, (r) null, (p) null, (m) null, (q) null, (n) null, 511, (tn.i) null);
    }

    public /* synthetic */ l(int i10, String str, String str2, String str3, String str4, r rVar, p pVar, m mVar, q qVar, n nVar, r2 r2Var) {
        if ((i10 & 1) == 0) {
            this.f46379a = null;
        } else {
            this.f46379a = str;
        }
        if ((i10 & 2) == 0) {
            this.f46380b = null;
        } else {
            this.f46380b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f46381c = null;
        } else {
            this.f46381c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f46382d = null;
        } else {
            this.f46382d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f46383e = null;
        } else {
            this.f46383e = rVar;
        }
        if ((i10 & 32) == 0) {
            this.f46384f = null;
        } else {
            this.f46384f = pVar;
        }
        if ((i10 & 64) == 0) {
            this.f46385g = null;
        } else {
            this.f46385g = mVar;
        }
        if ((i10 & 128) == 0) {
            this.f46386h = null;
        } else {
            this.f46386h = qVar;
        }
        if ((i10 & 256) == 0) {
            this.f46387i = null;
        } else {
            this.f46387i = nVar;
        }
    }

    public l(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable r rVar, @Nullable p pVar, @Nullable m mVar, @Nullable q qVar, @Nullable n nVar) {
        this.f46379a = str;
        this.f46380b = str2;
        this.f46381c = str3;
        this.f46382d = str4;
        this.f46383e = rVar;
        this.f46384f = pVar;
        this.f46385g = mVar;
        this.f46386h = qVar;
        this.f46387i = nVar;
    }

    public /* synthetic */ l(String str, String str2, String str3, String str4, r rVar, p pVar, m mVar, q qVar, n nVar, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : rVar, (i10 & 32) != 0 ? null : pVar, (i10 & 64) != 0 ? null : mVar, (i10 & 128) != 0 ? null : qVar, (i10 & 256) == 0 ? nVar : null);
    }

    public static final /* synthetic */ void b(l lVar, vo.d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.r(serialDescriptor, 0) || lVar.f46379a != null) {
            dVar.f(serialDescriptor, 0, w2.f86635a, lVar.f46379a);
        }
        if (dVar.r(serialDescriptor, 1) || lVar.f46380b != null) {
            dVar.f(serialDescriptor, 1, w2.f86635a, lVar.f46380b);
        }
        if (dVar.r(serialDescriptor, 2) || lVar.f46381c != null) {
            dVar.f(serialDescriptor, 2, w2.f86635a, lVar.f46381c);
        }
        if (dVar.r(serialDescriptor, 3) || lVar.f46382d != null) {
            dVar.f(serialDescriptor, 3, w2.f86635a, lVar.f46382d);
        }
        if (dVar.r(serialDescriptor, 4) || lVar.f46383e != null) {
            dVar.f(serialDescriptor, 4, r.a.f46430a, lVar.f46383e);
        }
        if (dVar.r(serialDescriptor, 5) || lVar.f46384f != null) {
            dVar.f(serialDescriptor, 5, p.a.f46418a, lVar.f46384f);
        }
        if (dVar.r(serialDescriptor, 6) || lVar.f46385g != null) {
            dVar.f(serialDescriptor, 6, m.a.f46395a, lVar.f46385g);
        }
        if (dVar.r(serialDescriptor, 7) || lVar.f46386h != null) {
            dVar.f(serialDescriptor, 7, q.a.f46426a, lVar.f46386h);
        }
        if (!dVar.r(serialDescriptor, 8) && lVar.f46387i == null) {
            return;
        }
        dVar.f(serialDescriptor, 8, n.a.f46400a, lVar.f46387i);
    }

    @Nullable
    public final n a() {
        return this.f46387i;
    }

    @Nullable
    public final r c() {
        return this.f46383e;
    }

    @Nullable
    public final String d() {
        return this.f46381c;
    }

    @Nullable
    public final String e() {
        return this.f46380b;
    }

    @Nullable
    public final m f() {
        return this.f46385g;
    }

    @Nullable
    public final p g() {
        return this.f46384f;
    }

    @Nullable
    public final q h() {
        return this.f46386h;
    }

    @Nullable
    public final String i() {
        return this.f46379a;
    }

    @Nullable
    public final String j() {
        return this.f46382d;
    }
}
