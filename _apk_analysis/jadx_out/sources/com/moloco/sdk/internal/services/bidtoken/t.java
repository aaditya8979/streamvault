package com.moloco.sdk.internal.services.bidtoken;

import androidx.compose.runtime.internal.StabilityInferred;
import bo.d0;
import com.google.protobuf.ByteString;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;
import com.moloco.sdk.h;
import com.moloco.sdk.internal.services.H;
import com.moloco.sdk.internal.services.a;
import com.moloco.sdk.internal.services.i0;
import com.moloco.sdk.internal.services.j0;
import com.moloco.sdk.internal.services.o;
import java.util.Date;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
public final class t implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final j0 f47309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.moloco.sdk.internal.services.f f47310c;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f47312b;

        static {
            int[] iArr = new int[H.values().length];
            try {
                iArr[H.f47101a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H.f47102b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H.f47103c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47311a = iArr;
            int[] iArr2 = new int[com.moloco.sdk.internal.services.z.values().length];
            try {
                iArr2[com.moloco.sdk.internal.services.z.f47569a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.moloco.sdk.internal.services.z.f47570b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.moloco.sdk.internal.services.z.f47571c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f47312b = iArr2;
        }
    }

    public t(@NotNull j0 j0Var, @NotNull com.moloco.sdk.internal.services.f fVar) {
        tn.p.k(j0Var, "deviceInfoService");
        tn.p.k(fVar, "screenInfoService");
        this.f47309b = j0Var;
        this.f47310c = fVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.s
    @NotNull
    public BidToken$ClientBidTokenComponents a(@NotNull com.moloco.sdk.internal.services.bidtoken.providers.k kVar, @NotNull h hVar) {
        BidToken$ClientBidTokenComponents.NetworkInfo.ConnectionType connectionType;
        tn.p.k(kVar, "clientSignals");
        tn.p.k(hVar, "bidTokenConfig");
        i0 i0VarB = this.f47309b.b();
        com.moloco.sdk.internal.services.e eVarA = this.f47310c.a();
        BidToken$ClientBidTokenComponents.c cVarN = BidToken$ClientBidTokenComponents.n();
        BidToken$ClientBidTokenComponents.j.a aVarC = BidToken$ClientBidTokenComponents.j.c();
        aVarC.a(kVar.k());
        cVarN.h(aVarC.build());
        BidToken$ClientBidTokenComponents.g.a aVarE = BidToken$ClientBidTokenComponents.g.e();
        Boolean boolA = kVar.h().a();
        if (boolA != null) {
            aVarE.a(boolA.booleanValue());
        }
        Long lB = kVar.h().b();
        if (lB != null) {
            aVarE.b(lB.longValue());
        }
        Long lC = kVar.h().c();
        if (lC != null) {
            aVarE.c(lC.longValue());
        }
        cVarN.i(aVarE.build());
        BidToken$ClientBidTokenComponents.d.a aVarC2 = BidToken$ClientBidTokenComponents.d.c();
        Long lA = kVar.c().a();
        if (lA != null) {
            aVarC2.a(lA.longValue());
        }
        cVarN.f(aVarC2.build());
        BidToken$ClientBidTokenComponents.NetworkInfo.a aVarF = BidToken$ClientBidTokenComponents.NetworkInfo.f();
        if (kVar.i().a() != null) {
            aVarF.a(kVar.i().a().intValue());
        }
        Integer numB = kVar.i().b();
        if (numB != null) {
            aVarF.b(numB.intValue());
        }
        Boolean boolC = kVar.i().c();
        if (boolC != null) {
            aVarF.c(boolC.booleanValue());
        }
        com.moloco.sdk.internal.services.a aVarD = kVar.i().d();
        if (aVarD != null) {
            if (aVarD instanceof a.C0580a) {
                connectionType = BidToken$ClientBidTokenComponents.NetworkInfo.ConnectionType.CELLULAR;
            } else if (tn.p.f(aVarD, a.b.f47111a)) {
                connectionType = BidToken$ClientBidTokenComponents.NetworkInfo.ConnectionType.NO_NETWORK;
            } else {
                if (!tn.p.f(aVarD, a.c.f47112a)) {
                    throw new NoWhenBranchMatchedException();
                }
                connectionType = BidToken$ClientBidTokenComponents.NetworkInfo.ConnectionType.WIFI;
            }
            aVarF.d(connectionType);
        }
        cVarN.j(aVarF.build());
        BidToken$ClientBidTokenComponents.BatteryInfo.a aVarE2 = BidToken$ClientBidTokenComponents.BatteryInfo.e();
        Integer numB2 = kVar.e().b();
        if (numB2 != null) {
            aVarE2.c(numB2.intValue());
        }
        Integer numA = kVar.e().a();
        if (numA != null) {
            int iIntValue = numA.intValue();
            aVarE2.a(iIntValue != 2 ? iIntValue != 3 ? iIntValue != 4 ? iIntValue != 5 ? BidToken$ClientBidTokenComponents.BatteryInfo.BatteryStatus.UNKNOWN : BidToken$ClientBidTokenComponents.BatteryInfo.BatteryStatus.FULL : BidToken$ClientBidTokenComponents.BatteryInfo.BatteryStatus.NOT_CHARGING : BidToken$ClientBidTokenComponents.BatteryInfo.BatteryStatus.DISCHARGING : BidToken$ClientBidTokenComponents.BatteryInfo.BatteryStatus.CHARGING);
        }
        Boolean boolC2 = kVar.e().c();
        if (boolC2 != null) {
            aVarE2.b(boolC2.booleanValue());
        }
        cVarN.d(aVarE2.build());
        BidToken$ClientBidTokenComponents.b.a aVarD2 = BidToken$ClientBidTokenComponents.b.d();
        com.moloco.sdk.internal.services.o oVarB = kVar.b();
        if (oVarB instanceof o.a) {
            aVarD2.a(false);
            aVarD2.b(((o.a) oVarB).a());
        } else {
            if (!tn.p.f(oVarB, o.b.f47535a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarD2.a(true);
        }
        cVarN.b(aVarD2.build());
        BidToken$ClientBidTokenComponents.i.a aVarG = BidToken$ClientBidTokenComponents.i.g();
        Boolean boolIsAgeRestrictedUser = kVar.j().isAgeRestrictedUser();
        if (boolIsAgeRestrictedUser != null) {
            aVarG.b(boolIsAgeRestrictedUser.booleanValue());
        }
        Boolean boolIsUserConsent = kVar.j().isUserConsent();
        if (boolIsUserConsent != null) {
            aVarG.c(boolIsUserConsent.booleanValue());
        }
        Boolean boolIsDoNotSell = kVar.j().isDoNotSell();
        if (boolIsDoNotSell != null) {
            aVarG.a(boolIsDoNotSell.booleanValue());
        }
        String tCFConsent = kVar.j().getTCFConsent();
        if (tCFConsent != null) {
            aVarG.d(tCFConsent);
        }
        aVarG.e(kVar.j().getUsPrivacy());
        cVarN.k(aVarG.build());
        BidToken$ClientBidTokenComponents.Device.a aVarY = BidToken$ClientBidTokenComponents.Device.y();
        aVarY.l(i0VarB.e());
        aVarY.r(i0VarB.j());
        aVarY.n(i0VarB.f());
        aVarY.o(i0VarB.h());
        aVarY.i(i0VarB.d());
        aVarY.b(i0VarB.g());
        aVarY.d(i0VarB.l() ? 5 : 1);
        aVarY.j(1);
        BidToken$ClientBidTokenComponents.e.a aVarC3 = BidToken$ClientBidTokenComponents.e.c();
        aVarC3.a(TimeZone.getDefault().getOffset(new Date().getTime()) / 60000);
        aVarY.e(aVarC3.build());
        aVarY.u(eVarA.f());
        aVarY.f(eVarA.d());
        aVarY.t(eVarA.a());
        aVarY.s(eVarA.b());
        aVarY.q(i0VarB.i());
        if (hVar.a()) {
            aVarY.c(b(i0VarB.b()));
        }
        H hC = kVar.f().c();
        if (hC != null) {
            aVarY.p(d(hC));
        }
        Boolean boolA2 = this.f47309b.a();
        if (boolA2 != null) {
            aVarY.h(boolA2.booleanValue());
        }
        String strA = kVar.f().a();
        if (strA != null) {
            aVarY.k(strA);
        }
        String strB = kVar.f().b();
        if (strB != null) {
            aVarY.m(strB);
        }
        aVarY.v(eVarA.g());
        aVarY.w(eVarA.h());
        aVarY.g(i0VarB.c());
        aVarY.a(i0VarB.a());
        cVarN.e(aVarY.build());
        BidToken$ClientBidTokenComponents.AudioInfo.a aVarD3 = BidToken$ClientBidTokenComponents.AudioInfo.d();
        com.moloco.sdk.internal.services.z zVarB = kVar.d().b();
        if (zVarB != null) {
            aVarD3.a(c(zVarB));
        }
        Integer numA2 = kVar.d().a();
        if (numA2 != null) {
            aVarD3.b(numA2.intValue());
        }
        cVarN.c(aVarD3.build());
        BidToken$ClientBidTokenComponents.a.C0549a c0549aF = BidToken$ClientBidTokenComponents.a.f();
        Float fC = kVar.a().c();
        if (fC != null) {
            c0549aF.c(fC.floatValue());
        }
        Boolean boolB = kVar.a().b();
        if (boolB != null) {
            c0549aF.b(boolB.booleanValue());
        }
        Boolean boolA3 = kVar.a().a();
        if (boolA3 != null) {
            c0549aF.a(boolA3.booleanValue());
        }
        Boolean boolD = kVar.a().d();
        if (boolD != null) {
            c0549aF.d(boolD.booleanValue());
        }
        cVarN.a(c0549aF.build());
        if (kVar.g().i()) {
            BidToken$ClientBidTokenComponents.f.a aVarF2 = BidToken$ClientBidTokenComponents.f.f();
            aVarF2.c(kVar.g().g());
            aVarF2.b(kVar.g().c());
            aVarF2.d(kVar.g().h());
            BidToken$ClientBidTokenComponents.f.b.a aVarG2 = BidToken$ClientBidTokenComponents.f.b.g();
            aVarG2.a(kVar.g().a());
            aVarG2.c(kVar.g().d());
            aVarG2.d(kVar.g().e());
            aVarG2.b(kVar.g().b());
            aVarG2.e(kVar.g().f());
            aVarF2.a(aVarG2.build());
            cVarN.g(aVarF2.build());
        }
        String strA2 = kVar.l().a();
        if (strA2 != null && (!d0.u0(strA2))) {
            BidToken$ClientBidTokenComponents.k.a aVarC4 = BidToken$ClientBidTokenComponents.k.c();
            aVarC4.a(strA2);
            cVarN.l(aVarC4.build());
        }
        BidToken$ClientBidTokenComponents bidToken$ClientBidTokenComponentsBuild = cVarN.build();
        tn.p.j(bidToken$ClientBidTokenComponentsBuild, "build(...)");
        return bidToken$ClientBidTokenComponentsBuild;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.s
    @NotNull
    public byte[] a(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        tn.p.k(bArr, "bidTokenComponents");
        tn.p.k(bArr2, "secret");
        h.a aVarD = com.moloco.sdk.h.d();
        aVarD.a(ByteString.copyFrom(bArr2));
        aVarD.b(ByteString.copyFrom(bArr));
        byte[] byteArray = aVarD.build().toByteArray();
        tn.p.j(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final long b(long j10) {
        return j10 * ((long) 1000000);
    }

    public final BidToken$ClientBidTokenComponents.AudioInfo.MuteSwitchState c(com.moloco.sdk.internal.services.z zVar) {
        int i10 = a.f47312b[zVar.ordinal()];
        if (i10 == 1) {
            return BidToken$ClientBidTokenComponents.AudioInfo.MuteSwitchState.SILENT;
        }
        if (i10 == 2) {
            return BidToken$ClientBidTokenComponents.AudioInfo.MuteSwitchState.VIBRATE;
        }
        if (i10 == 3) {
            return BidToken$ClientBidTokenComponents.AudioInfo.MuteSwitchState.NORMAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final BidToken$ClientBidTokenComponents.Device.Orientation d(H h10) {
        int i10 = a.f47311a[h10.ordinal()];
        if (i10 == 1) {
            return BidToken$ClientBidTokenComponents.Device.Orientation.UNKNOWN;
        }
        if (i10 == 2) {
            return BidToken$ClientBidTokenComponents.Device.Orientation.PORTRAIT;
        }
        if (i10 == 3) {
            return BidToken$ClientBidTokenComponents.Device.Orientation.LANDSCAPE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
