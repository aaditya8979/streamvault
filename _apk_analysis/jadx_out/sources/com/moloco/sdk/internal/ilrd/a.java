package com.moloco.sdk.internal.ilrd;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import bo.d0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.f;
import com.moloco.sdk.internal.services.j;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import so.k;
import tn.p;
import wo.c2;
import wo.g1;
import wo.g2;
import wo.m0;
import wo.r2;
import wo.v0;
import wo.w2;
import xo.a;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final C0559a f46145g = new C0559a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f46146h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final j f46147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final c f46148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final bn.g f46149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f46150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final AtomicReference<b> f46151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f46152f;

    /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$a, reason: collision with other inner class name */
    public static final class C0559a {
        public C0559a() {
        }

        public /* synthetic */ C0559a(tn.i iVar) {
            this();
        }
    }

    @StabilityInferred(parameters = 1)
    @k
    public static final class b {

        @NotNull
        public static final C0561b Companion = new C0561b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f46157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f46158f;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$b$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public /* synthetic */ class C0560a implements m0<b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0560a f46159a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final SerialDescriptor f46160b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f46161c;

            static {
                C0560a c0560a = new C0560a();
                f46159a = c0560a;
                f46161c = 8;
                g2 g2Var = new g2("com.moloco.sdk.internal.ilrd.IlrdActiveSession.ImpressionCounts", c0560a, 6);
                g2Var.n("lastEventReceivedTs", false);
                g2Var.n("banner", false);
                g2Var.n("mrec", false);
                g2Var.n("native", false);
                g2Var.n("interstitial", false);
                g2Var.n("rewarded", false);
                f46160b = g2Var;
            }

            @Override // so.c
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b deserialize(@NotNull Decoder decoder) {
                int iG;
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                long j10;
                p.k(decoder, "decoder");
                SerialDescriptor serialDescriptor = f46160b;
                vo.c cVarB = decoder.b(serialDescriptor);
                if (cVarB.l()) {
                    long jF = cVarB.f(serialDescriptor, 0);
                    int iG2 = cVarB.g(serialDescriptor, 1);
                    int iG3 = cVarB.g(serialDescriptor, 2);
                    int iG4 = cVarB.g(serialDescriptor, 3);
                    int iG5 = cVarB.g(serialDescriptor, 4);
                    i11 = iG2;
                    iG = cVarB.g(serialDescriptor, 5);
                    i12 = iG4;
                    i10 = iG5;
                    i13 = iG3;
                    i14 = 63;
                    j10 = jF;
                } else {
                    boolean z10 = true;
                    int iG6 = 0;
                    int iG7 = 0;
                    int iG8 = 0;
                    int i15 = 0;
                    long jF2 = 0;
                    int iG9 = 0;
                    int iG10 = 0;
                    while (z10) {
                        int iW = cVarB.w(serialDescriptor);
                        switch (iW) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                jF2 = cVarB.f(serialDescriptor, 0);
                                i15 |= 1;
                                continue;
                            case 1:
                                iG6 = cVarB.g(serialDescriptor, 1);
                                i15 |= 2;
                                break;
                            case 2:
                                iG8 = cVarB.g(serialDescriptor, 2);
                                i15 |= 4;
                                break;
                            case 3:
                                iG10 = cVarB.g(serialDescriptor, 3);
                                i15 |= 8;
                                break;
                            case 4:
                                iG7 = cVarB.g(serialDescriptor, 4);
                                i15 |= 16;
                                break;
                            case 5:
                                iG9 = cVarB.g(serialDescriptor, 5);
                                i15 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iW);
                        }
                    }
                    iG = iG9;
                    i10 = iG7;
                    int i16 = i15;
                    i11 = iG6;
                    long j11 = jF2;
                    i12 = iG10;
                    i13 = iG8;
                    i14 = i16;
                    j10 = j11;
                }
                cVarB.c(serialDescriptor);
                return new b(i14, j10, i11, i13, i12, i10, iG, null);
            }

            @Override // so.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final void serialize(@NotNull Encoder encoder, @NotNull b bVar) {
                p.k(encoder, "encoder");
                p.k(bVar, "value");
                SerialDescriptor serialDescriptor = f46160b;
                vo.d dVarB = encoder.b(serialDescriptor);
                b.c(bVar, dVarB, serialDescriptor);
                dVarB.c(serialDescriptor);
            }

            @Override // wo.m0
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                v0 v0Var = v0.f86626a;
                return new KSerializer[]{g1.f86515a, v0Var, v0Var, v0Var, v0Var, v0Var};
            }

            @Override // kotlinx.serialization.KSerializer, so.l, so.c
            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f46160b;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$b$b, reason: collision with other inner class name */
        public static final class C0561b {
            public C0561b() {
            }

            public /* synthetic */ C0561b(tn.i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<b> serializer() {
                return C0560a.f46159a;
            }
        }

        public /* synthetic */ b(int i10, long j10, int i11, int i12, int i13, int i14, int i15, r2 r2Var) {
            if (63 != (i10 & 63)) {
                c2.a(i10, 63, C0560a.f46159a.getDescriptor());
            }
            this.f46153a = j10;
            this.f46154b = i11;
            this.f46155c = i12;
            this.f46156d = i13;
            this.f46157e = i14;
            this.f46158f = i15;
        }

        public b(long j10, int i10, int i11, int i12, int i13, int i14) {
            this.f46153a = j10;
            this.f46154b = i10;
            this.f46155c = i11;
            this.f46156d = i12;
            this.f46157e = i13;
            this.f46158f = i14;
        }

        public static /* synthetic */ b b(b bVar, long j10, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            return bVar.a((i15 & 1) != 0 ? bVar.f46153a : j10, (i15 & 2) != 0 ? bVar.f46154b : i10, (i15 & 4) != 0 ? bVar.f46155c : i11, (i15 & 8) != 0 ? bVar.f46156d : i12, (i15 & 16) != 0 ? bVar.f46157e : i13, (i15 & 32) != 0 ? bVar.f46158f : i14);
        }

        public static final /* synthetic */ void c(b bVar, vo.d dVar, SerialDescriptor serialDescriptor) {
            dVar.v(serialDescriptor, 0, bVar.f46153a);
            dVar.o(serialDescriptor, 1, bVar.f46154b);
            dVar.o(serialDescriptor, 2, bVar.f46155c);
            dVar.o(serialDescriptor, 3, bVar.f46156d);
            dVar.o(serialDescriptor, 4, bVar.f46157e);
            dVar.o(serialDescriptor, 5, bVar.f46158f);
        }

        @NotNull
        public final b a(long j10, int i10, int i11, int i12, int i13, int i14) {
            return new b(j10, i10, i11, i12, i13, i14);
        }

        public final int d() {
            return this.f46154b;
        }

        public final int e() {
            return this.f46157e;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f46153a == bVar.f46153a && this.f46154b == bVar.f46154b && this.f46155c == bVar.f46155c && this.f46156d == bVar.f46156d && this.f46157e == bVar.f46157e && this.f46158f == bVar.f46158f;
        }

        public final long f() {
            return this.f46153a;
        }

        public final int g() {
            return this.f46155c;
        }

        public final int h() {
            return this.f46156d;
        }

        public int hashCode() {
            return (((((((((Long.hashCode(this.f46153a) * 31) + Integer.hashCode(this.f46154b)) * 31) + Integer.hashCode(this.f46155c)) * 31) + Integer.hashCode(this.f46156d)) * 31) + Integer.hashCode(this.f46157e)) * 31) + Integer.hashCode(this.f46158f);
        }

        public final int i() {
            return this.f46158f;
        }

        @NotNull
        public String toString() {
            return "ImpressionCounts(lastEventReceivedTs=" + this.f46153a + ", banner=" + this.f46154b + ", mrec=" + this.f46155c + ", native=" + this.f46156d + ", interstitial=" + this.f46157e + ", rewarded=" + this.f46158f + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    @VisibleForTesting
    @k
    public static final class c {

        @NotNull
        public static final b Companion = new b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f46162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final b f46163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f46164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f46165d;

        /* JADX INFO: renamed from: com.moloco.sdk.internal.ilrd.a$c$a, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public /* synthetic */ class C0562a implements m0<c> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final C0562a f46166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NotNull
            public static final SerialDescriptor f46167b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f46168c;

            static {
                C0562a c0562a = new C0562a();
                f46166a = c0562a;
                f46168c = 8;
                g2 g2Var = new g2("com.moloco.sdk.internal.ilrd.IlrdActiveSession.SessionData", c0562a, 4);
                g2Var.n(JsonStorageKeyNames.SESSION_ID_KEY, false);
                g2Var.n("impressionCounts", false);
                g2Var.n("isExpired", false);
                g2Var.n("sessionStartTs", false);
                f46167b = g2Var;
            }

            @Override // so.c
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c deserialize(@NotNull Decoder decoder) {
                b bVar;
                String str;
                int i10;
                boolean zE;
                long jF;
                p.k(decoder, "decoder");
                SerialDescriptor serialDescriptor = f46167b;
                vo.c cVarB = decoder.b(serialDescriptor);
                String strK = null;
                if (cVarB.l()) {
                    String strK2 = cVarB.k(serialDescriptor, 0);
                    str = strK2;
                    bVar = (b) cVarB.i(serialDescriptor, 1, b.C0560a.f46159a, null);
                    i10 = 15;
                    zE = cVarB.E(serialDescriptor, 2);
                    jF = cVarB.f(serialDescriptor, 3);
                } else {
                    b bVar2 = null;
                    boolean z10 = true;
                    long jF2 = 0;
                    int i11 = 0;
                    boolean zE2 = false;
                    while (z10) {
                        int iW = cVarB.w(serialDescriptor);
                        if (iW == -1) {
                            z10 = false;
                        } else if (iW == 0) {
                            strK = cVarB.k(serialDescriptor, 0);
                            i11 |= 1;
                        } else if (iW == 1) {
                            bVar2 = (b) cVarB.i(serialDescriptor, 1, b.C0560a.f46159a, bVar2);
                            i11 |= 2;
                        } else if (iW == 2) {
                            zE2 = cVarB.E(serialDescriptor, 2);
                            i11 |= 4;
                        } else {
                            if (iW != 3) {
                                throw new UnknownFieldException(iW);
                            }
                            jF2 = cVarB.f(serialDescriptor, 3);
                            i11 |= 8;
                        }
                    }
                    bVar = bVar2;
                    str = strK;
                    i10 = i11;
                    zE = zE2;
                    jF = jF2;
                }
                cVarB.c(serialDescriptor);
                return new c(i10, str, bVar, zE, jF, null);
            }

            @Override // so.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final void serialize(@NotNull Encoder encoder, @NotNull c cVar) {
                p.k(encoder, "encoder");
                p.k(cVar, "value");
                SerialDescriptor serialDescriptor = f46167b;
                vo.d dVarB = encoder.b(serialDescriptor);
                c.a(cVar, dVarB, serialDescriptor);
                dVarB.c(serialDescriptor);
            }

            @Override // wo.m0
            @NotNull
            public final KSerializer<?>[] childSerializers() {
                return new KSerializer[]{w2.f86635a, b.C0560a.f46159a, wo.i.f86540a, g1.f86515a};
            }

            @Override // kotlinx.serialization.KSerializer, so.l, so.c
            @NotNull
            public final SerialDescriptor getDescriptor() {
                return f46167b;
            }
        }

        public static final class b {
            public b() {
            }

            public /* synthetic */ b(tn.i iVar) {
                this();
            }

            @NotNull
            public final KSerializer<c> serializer() {
                return C0562a.f46166a;
            }
        }

        public /* synthetic */ c(int i10, String str, b bVar, boolean z10, long j10, r2 r2Var) {
            if (15 != (i10 & 15)) {
                c2.a(i10, 15, C0562a.f46166a.getDescriptor());
            }
            this.f46162a = str;
            this.f46163b = bVar;
            this.f46164c = z10;
            this.f46165d = j10;
        }

        public c(@NotNull String str, @NotNull b bVar, boolean z10, long j10) {
            p.k(str, JsonStorageKeyNames.SESSION_ID_KEY);
            p.k(bVar, "impressionCounts");
            this.f46162a = str;
            this.f46163b = bVar;
            this.f46164c = z10;
            this.f46165d = j10;
        }

        public static final /* synthetic */ void a(c cVar, vo.d dVar, SerialDescriptor serialDescriptor) {
            dVar.q(serialDescriptor, 0, cVar.f46162a);
            dVar.g(serialDescriptor, 1, b.C0560a.f46159a, cVar.f46163b);
            dVar.p(serialDescriptor, 2, cVar.f46164c);
            dVar.v(serialDescriptor, 3, cVar.f46165d);
        }

        @NotNull
        public final b b() {
            return this.f46163b;
        }

        @NotNull
        public final String c() {
            return this.f46162a;
        }

        public final long d() {
            return this.f46165d;
        }

        public final boolean e() {
            return this.f46164c;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p.f(this.f46162a, cVar.f46162a) && p.f(this.f46163b, cVar.f46163b) && this.f46164c == cVar.f46164c && this.f46165d == cVar.f46165d;
        }

        public int hashCode() {
            return (((((this.f46162a.hashCode() * 31) + this.f46163b.hashCode()) * 31) + Boolean.hashCode(this.f46164c)) * 31) + Long.hashCode(this.f46165d);
        }

        @NotNull
        public String toString() {
            return "SessionData(sessionId=" + this.f46162a + ", impressionCounts=" + this.f46163b + ", isExpired=" + this.f46164c + ", sessionStartTs=" + this.f46165d + ')';
        }
    }

    public a(@NotNull j jVar, @Nullable String str) {
        b bVarB;
        p.k(jVar, "timeProvider");
        this.f46147a = jVar;
        c cVar = null;
        if (str != null) {
            try {
                a.C1101a c1101a = xo.a.f87008d;
                c1101a.a();
                cVar = (c) c1101a.c(c.Companion.serializer(), str);
            } catch (Exception e10) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Error deserializing session data", e10, false, 8, null);
            }
        }
        this.f46148b = cVar;
        this.f46149c = kotlin.b.b(new sn.a() { // from class: com.moloco.sdk.internal.ilrd.b
            @Override // sn.a
            public final Object invoke() {
                return a.a(this.f46169b);
            }
        });
        this.f46150d = cVar != null ? cVar.d() : this.f46147a.a();
        this.f46151e = new AtomicReference<>((cVar == null || (bVarB = cVar.b()) == null) ? new b(-1L, 0, 0, 0, 0, 0) : bVarB);
        this.f46152f = cVar != null ? cVar.e() : false;
    }

    public /* synthetic */ a(j jVar, String str, int i10, tn.i iVar) {
        this(jVar, (i10 & 2) != 0 ? null : str);
    }

    public static final String a(a aVar) {
        String strC;
        c cVar = aVar.f46148b;
        if (cVar != null && (strC = cVar.c()) != null) {
            return strC;
        }
        String string = UUID.randomUUID().toString();
        p.j(string, "toString(...)");
        return string;
    }

    public final void b() {
        this.f46152f = true;
    }

    public final void c(@NotNull f.a aVar) {
        p.k(aVar, "ilrdData");
        if (aVar instanceof f.a.b) {
            String strJ = ((f.a.b) aVar).a().j();
            p.j(strJ, "getAdFormat(...)");
            String upperCase = strJ.toUpperCase(Locale.ROOT);
            p.j(upperCase, "toUpperCase(...)");
            d(upperCase, "Applovin");
            return;
        }
        if (!(aVar instanceof f.a.C0563a)) {
            throw new NoWhenBranchMatchedException();
        }
        String strB = ((f.a.C0563a) aVar).a().b();
        p.j(strB, "getAdFormat(...)");
        String upperCase2 = strB.toUpperCase(Locale.ROOT);
        p.j(upperCase2, "toUpperCase(...)");
        d(upperCase2, "Ironsource");
    }

    public final boolean d(String str, String str2) {
        b bVarB;
        long jA = this.f46147a.a();
        b bVar = this.f46151e.get();
        if (d0.c0(str, "BANNER", false, 2, null)) {
            bVarB = b.b(bVar, jA, bVar.d() + 1, 0, 0, 0, 0, 60, null);
        } else if (d0.c0(str, BrandSafetyUtils.f51658o, false, 2, null)) {
            bVarB = b.b(bVar, jA, 0, bVar.g() + 1, 0, 0, 0, 58, null);
        } else if (d0.c0(str, "NATIVE", false, 2, null)) {
            bVarB = b.b(bVar, jA, 0, 0, bVar.h() + 1, 0, 0, 54, null);
        } else if (d0.c0(str, BrandSafetyUtils.f51653j, false, 2, null)) {
            bVarB = b.b(bVar, jA, 0, 0, 0, bVar.e() + 1, 0, 46, null);
        } else {
            if (!d0.c0(str, "REWARD", false, 2, null)) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "IlrdActiveSession", "Unknown ad format for " + str2 + ": " + str, null, false, 12, null);
                return false;
            }
            bVarB = b.b(bVar, jA, 0, 0, 0, 0, bVar.i() + 1, 30, null);
        }
        this.f46151e.set(bVarB);
        return true;
    }

    @NotNull
    public final b e() {
        b bVar = this.f46151e.get();
        p.j(bVar, "get(...)");
        return bVar;
    }

    @NotNull
    public final String f() {
        return (String) this.f46149c.getValue();
    }

    public final long g() {
        return this.f46150d;
    }

    public final boolean h() {
        return this.f46152f;
    }

    @NotNull
    public final String i() {
        return xo.a.f87008d.b(c.Companion.serializer(), new c(f(), e(), h(), this.f46150d));
    }

    @NotNull
    public String toString() {
        b bVarE = e();
        return "IlrdActiveSession(id=" + f() + ", startTs=" + this.f46150d + ", expired=" + h() + ", impressions=" + (bVarE.d() + bVarE.g() + bVarE.h() + bVarE.e() + bVarE.i()) + " [banner=" + bVarE.d() + ", mrec=" + bVarE.g() + ", native=" + bVarE.h() + ", interstitial=" + bVarE.e() + ", rewarded=" + bVarE.i() + "])";
    }
}
