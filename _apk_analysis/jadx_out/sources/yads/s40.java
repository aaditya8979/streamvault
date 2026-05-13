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
public final class s40 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s40 f94698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f94699b;

    static {
        s40 s40Var = new s40();
        f94698a = s40Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitWaterfallMediation", s40Var, 6);
        g2Var.n(Q6.G1, true);
        g2Var.n(BrandSafetyEvent.f52736ad, false);
        g2Var.n("waterfall_parameters", false);
        g2Var.n("network_ad_unit_id_name", true);
        g2Var.n("currency", false);
        g2Var.n("cpm_floors", false);
        f94699b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = u40.f95540g;
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{to.a.t(w2Var), w2Var, kSerializerArr[2], to.a.t(w2Var), to.a.t(ia0.f90723a), kSerializerArr[5]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        List list;
        String str;
        ka0 ka0Var;
        List list2;
        int i10;
        wo.g2 g2Var = f94699b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = u40.f95540g;
        int i11 = 3;
        String str2 = null;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            String str3 = (String) cVarB.C(g2Var, 0, w2Var, null);
            String strK2 = cVarB.k(g2Var, 1);
            List list3 = (List) cVarB.i(g2Var, 2, kSerializerArr[2], null);
            String str4 = (String) cVarB.C(g2Var, 3, w2Var, null);
            ka0 ka0Var2 = (ka0) cVarB.C(g2Var, 4, ia0.f90723a, null);
            list2 = (List) cVarB.i(g2Var, 5, kSerializerArr[5], null);
            str = str4;
            ka0Var = ka0Var2;
            str2 = str3;
            strK = strK2;
            list = list3;
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            strK = null;
            list = null;
            str = null;
            ka0Var = null;
            list2 = null;
            while (z10) {
                int iW = cVarB.w(g2Var);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str2 = (String) cVarB.C(g2Var, 0, w2.f86635a, str2);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        strK = cVarB.k(g2Var, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        list = (List) cVarB.i(g2Var, 2, kSerializerArr[2], list);
                        i12 |= 4;
                        break;
                    case 3:
                        str = (String) cVarB.C(g2Var, i11, w2.f86635a, str);
                        i12 |= 8;
                        break;
                    case 4:
                        ka0Var = (ka0) cVarB.C(g2Var, 4, ia0.f90723a, ka0Var);
                        i12 |= 16;
                        break;
                    case 5:
                        list2 = (List) cVarB.i(g2Var, 5, kSerializerArr[5], list2);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = i12;
        }
        cVarB.c(g2Var);
        return new u40(i10, str2, strK, list, str, ka0Var, list2);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f94699b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        u40 u40Var = (u40) obj;
        wo.g2 g2Var = f94699b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = u40.f95540g;
        if (dVarB.r(g2Var, 0) || u40Var.f95541a != null) {
            dVarB.f(g2Var, 0, w2.f86635a, u40Var.f95541a);
        }
        dVarB.q(g2Var, 1, u40Var.f95542b);
        dVarB.g(g2Var, 2, kSerializerArr[2], u40Var.f95543c);
        if (dVarB.r(g2Var, 3) || u40Var.f95544d != null) {
            dVarB.f(g2Var, 3, w2.f86635a, u40Var.f95544d);
        }
        dVarB.f(g2Var, 4, ia0.f90723a, u40Var.f95545e);
        dVarB.g(g2Var, 5, kSerializerArr[5], u40Var.f95546f);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
