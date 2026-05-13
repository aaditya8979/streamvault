package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes4.dex */
public final class e80 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e80 f89155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89156b;

    static {
        e80 e80Var = new e80();
        f89155a = e80Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelMediationNetwork", e80Var, 6);
        g2Var.n("id", true);
        g2Var.n("name", false);
        g2Var.n("logo_url", true);
        g2Var.n("adapter_status", true);
        g2Var.n("adapters", false);
        g2Var.n("latest_adapter_version", true);
        f89156b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = g80.f89865g;
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{to.a.t(w2Var), w2Var, to.a.t(w2Var), to.a.t(w2Var), kSerializerArr[4], to.a.t(w2Var)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        String str;
        String str2;
        List list;
        String str3;
        int i10;
        wo.g2 g2Var = f89156b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = g80.f89865g;
        int i11 = 5;
        String str4 = null;
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            String str5 = (String) cVarB.C(g2Var, 0, w2Var, null);
            String strK2 = cVarB.k(g2Var, 1);
            String str6 = (String) cVarB.C(g2Var, 2, w2Var, null);
            String str7 = (String) cVarB.C(g2Var, 3, w2Var, null);
            list = (List) cVarB.i(g2Var, 4, kSerializerArr[4], null);
            str3 = (String) cVarB.C(g2Var, 5, w2Var, null);
            i10 = 63;
            str2 = str7;
            str = str6;
            str4 = str5;
            strK = strK2;
        } else {
            int i12 = 0;
            boolean z10 = true;
            strK = null;
            str = null;
            str2 = null;
            list = null;
            str3 = null;
            while (z10) {
                int iW = cVarB.w(g2Var);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i11 = 5;
                        break;
                    case 0:
                        str4 = (String) cVarB.C(g2Var, 0, w2.f86635a, str4);
                        i12 |= 1;
                        i11 = 5;
                        break;
                    case 1:
                        strK = cVarB.k(g2Var, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        str = (String) cVarB.C(g2Var, 2, w2.f86635a, str);
                        i12 |= 4;
                        break;
                    case 3:
                        str2 = (String) cVarB.C(g2Var, 3, w2.f86635a, str2);
                        i12 |= 8;
                        break;
                    case 4:
                        list = (List) cVarB.i(g2Var, 4, kSerializerArr[4], list);
                        i12 |= 16;
                        break;
                    case 5:
                        str3 = (String) cVarB.C(g2Var, i11, w2.f86635a, str3);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = i12;
        }
        cVarB.c(g2Var);
        return new g80(i10, str4, strK, str, str2, list, str3);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89156b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        g80 g80Var = (g80) obj;
        wo.g2 g2Var = f89156b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = g80.f89865g;
        if (dVarB.r(g2Var, 0) || g80Var.f89866a != null) {
            dVarB.f(g2Var, 0, w2.f86635a, g80Var.f89866a);
        }
        dVarB.q(g2Var, 1, g80Var.f89867b);
        if (dVarB.r(g2Var, 2) || g80Var.f89868c != null) {
            dVarB.f(g2Var, 2, w2.f86635a, g80Var.f89868c);
        }
        if (dVarB.r(g2Var, 3) || g80Var.f89869d != null) {
            dVarB.f(g2Var, 3, w2.f86635a, g80Var.f89869d);
        }
        dVarB.g(g2Var, 4, kSerializerArr[4], g80Var.f89870e);
        if (dVarB.r(g2Var, 5) || g80Var.f89871f != null) {
            dVarB.f(g2Var, 5, w2.f86635a, g80Var.f89871f);
        }
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
