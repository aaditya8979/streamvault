package yads;

import com.ironsource.Q6;
import com.safedk.android.analytics.events.BrandSafetyEvent;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class f40 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f40 f89475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89476b;

    static {
        f40 f40Var = new f40();
        f89475a = f40Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitBiddingMediation", f40Var, 5);
        g2Var.n(Q6.G1, true);
        g2Var.n(BrandSafetyEvent.f52736ad, false);
        g2Var.n("bidding_parameters", false);
        g2Var.n("network_ad_unit_id", true);
        g2Var.n("network_ad_unit_id_name", true);
        f89476b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = h40.f90236f;
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{to.a.t(w2Var), w2Var, kSerializerArr[2], to.a.t(w2Var), to.a.t(w2Var)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        wo.g2 g2Var = f89476b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = h40.f90236f;
        String str5 = null;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            String str6 = (String) cVarB.C(g2Var, 0, w2Var, null);
            String strK = cVarB.k(g2Var, 1);
            List list2 = (List) cVarB.i(g2Var, 2, kSerializerArr[2], null);
            String str7 = (String) cVarB.C(g2Var, 3, w2Var, null);
            list = list2;
            str4 = (String) cVarB.C(g2Var, 4, w2Var, null);
            str3 = str7;
            i10 = 31;
            str = str6;
            str2 = strK;
        } else {
            int i11 = 0;
            String strK2 = null;
            List list3 = null;
            String str8 = null;
            String str9 = null;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    str5 = (String) cVarB.C(g2Var, 0, w2.f86635a, str5);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK2 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    list3 = (List) cVarB.i(g2Var, 2, kSerializerArr[2], list3);
                    i11 |= 4;
                } else if (iW == 3) {
                    str8 = (String) cVarB.C(g2Var, 3, w2.f86635a, str8);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    str9 = (String) cVarB.C(g2Var, 4, w2.f86635a, str9);
                    i11 |= 16;
                }
            }
            i10 = i11;
            str = str5;
            str2 = strK2;
            list = list3;
            str3 = str8;
            str4 = str9;
        }
        cVarB.c(g2Var);
        return new h40(i10, str, str2, list, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89476b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        h40 h40Var = (h40) obj;
        wo.g2 g2Var = f89476b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = h40.f90236f;
        if (dVarB.r(g2Var, 0) || h40Var.f90237a != null) {
            dVarB.f(g2Var, 0, w2.f86635a, h40Var.f90237a);
        }
        dVarB.q(g2Var, 1, h40Var.f90238b);
        dVarB.g(g2Var, 2, kSerializerArr[2], h40Var.f90239c);
        if (dVarB.r(g2Var, 3) || h40Var.f90240d != null) {
            dVarB.f(g2Var, 3, w2.f86635a, h40Var.f90240d);
        }
        if (dVarB.r(g2Var, 4) || h40Var.f90241e != null) {
            dVarB.f(g2Var, 4, w2.f86635a, h40Var.f90241e);
        }
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
