package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes10.dex */
public final class h80 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h80 f90275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f90276b;

    static {
        h80 h80Var = new h80();
        f90275a = h80Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelRemoteData", h80Var, 7);
        g2Var.n("page_id", true);
        g2Var.n("latest_sdk_version", true);
        g2Var.n("app_ads_txt_url", true);
        g2Var.n("app_status", true);
        g2Var.n("alerts", true);
        g2Var.n("ad_units", true);
        g2Var.n("mediation_networks", false);
        f90276b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = j80.f91118h;
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var), to.a.t(kSerializerArr[4]), to.a.t(kSerializerArr[5]), kSerializerArr[6]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        List list;
        String str2;
        String str3;
        List list2;
        String str4;
        List list3;
        wo.g2 g2Var = f90276b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = j80.f91118h;
        int i11 = 3;
        String str5 = null;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            str2 = (String) cVarB.C(g2Var, 0, w2Var, null);
            str4 = (String) cVarB.C(g2Var, 1, w2Var, null);
            String str6 = (String) cVarB.C(g2Var, 2, w2Var, null);
            String str7 = (String) cVarB.C(g2Var, 3, w2Var, null);
            List list4 = (List) cVarB.C(g2Var, 4, kSerializerArr[4], null);
            List list5 = (List) cVarB.C(g2Var, 5, kSerializerArr[5], null);
            list2 = (List) cVarB.i(g2Var, 6, kSerializerArr[6], null);
            str3 = str7;
            list3 = list4;
            str = str6;
            list = list5;
            i10 = 127;
        } else {
            int i12 = 0;
            boolean z10 = true;
            List list6 = null;
            List list7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            List list8 = null;
            while (z10) {
                int iW = cVarB.w(g2Var);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        str5 = (String) cVarB.C(g2Var, 0, w2.f86635a, str5);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        str8 = (String) cVarB.C(g2Var, 1, w2.f86635a, str8);
                        i12 |= 2;
                        i11 = 3;
                        break;
                    case 2:
                        str9 = (String) cVarB.C(g2Var, 2, w2.f86635a, str9);
                        i12 |= 4;
                        i11 = 3;
                        break;
                    case 3:
                        str10 = (String) cVarB.C(g2Var, i11, w2.f86635a, str10);
                        i12 |= 8;
                        break;
                    case 4:
                        list8 = (List) cVarB.C(g2Var, 4, kSerializerArr[4], list8);
                        i12 |= 16;
                        break;
                    case 5:
                        list6 = (List) cVarB.C(g2Var, 5, kSerializerArr[5], list6);
                        i12 |= 32;
                        break;
                    case 6:
                        list7 = (List) cVarB.i(g2Var, 6, kSerializerArr[6], list7);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = i12;
            str = str9;
            list = list6;
            str2 = str5;
            str3 = str10;
            list2 = list7;
            str4 = str8;
            list3 = list8;
        }
        cVarB.c(g2Var);
        return new j80(i10, str2, str4, str, str3, list3, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f90276b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        j80 j80Var = (j80) obj;
        wo.g2 g2Var = f90276b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = j80.f91118h;
        if (dVarB.r(g2Var, 0) || j80Var.f91119a != null) {
            dVarB.f(g2Var, 0, w2.f86635a, j80Var.f91119a);
        }
        if (dVarB.r(g2Var, 1) || j80Var.f91120b != null) {
            dVarB.f(g2Var, 1, w2.f86635a, j80Var.f91120b);
        }
        if (dVarB.r(g2Var, 2) || j80Var.f91121c != null) {
            dVarB.f(g2Var, 2, w2.f86635a, j80Var.f91121c);
        }
        if (dVarB.r(g2Var, 3) || j80Var.f91122d != null) {
            dVarB.f(g2Var, 3, w2.f86635a, j80Var.f91122d);
        }
        if (dVarB.r(g2Var, 4) || j80Var.f91123e != null) {
            dVarB.f(g2Var, 4, kSerializerArr[4], j80Var.f91123e);
        }
        if (dVarB.r(g2Var, 5) || j80Var.f91124f != null) {
            dVarB.f(g2Var, 5, kSerializerArr[5], j80Var.f91124f);
        }
        dVarB.g(g2Var, 6, kSerializerArr[6], j80Var.f91125g);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
