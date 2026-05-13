package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class k80 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k80 f91508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f91509b;

    static {
        k80 k80Var = new k80();
        f91508a = k80Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.model.DebugPanelReportData", k80Var, 6);
        g2Var.n("app_data", false);
        g2Var.n("sdk_data", false);
        g2Var.n("adapters_data", false);
        g2Var.n("consents_data", false);
        g2Var.n("sdk_logs", false);
        g2Var.n("network_logs", false);
        f91509b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = m80.f92304g;
        return new KSerializer[]{k50.f91488a, r80.f94323a, kSerializerArr[2], r50.f94283a, kSerializerArr[4], kSerializerArr[5]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        m50 m50Var;
        t80 t80Var;
        List list;
        t50 t50Var;
        List list2;
        List list3;
        wo.g2 g2Var = f91509b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = m80.f92304g;
        int i11 = 3;
        m50 m50Var2 = null;
        if (cVarB.l()) {
            m50 m50Var3 = (m50) cVarB.i(g2Var, 0, k50.f91488a, null);
            t80 t80Var2 = (t80) cVarB.i(g2Var, 1, r80.f94323a, null);
            List list4 = (List) cVarB.i(g2Var, 2, kSerializerArr[2], null);
            t50 t50Var2 = (t50) cVarB.i(g2Var, 3, r50.f94283a, null);
            List list5 = (List) cVarB.i(g2Var, 4, kSerializerArr[4], null);
            list3 = (List) cVarB.i(g2Var, 5, kSerializerArr[5], null);
            m50Var = m50Var3;
            t50Var = t50Var2;
            t80Var = t80Var2;
            list = list4;
            list2 = list5;
            i10 = 63;
        } else {
            int i12 = 0;
            boolean z10 = true;
            t80 t80Var3 = null;
            List list6 = null;
            t50 t50Var3 = null;
            List list7 = null;
            List list8 = null;
            while (z10) {
                int iW = cVarB.w(g2Var);
                switch (iW) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        m50Var2 = (m50) cVarB.i(g2Var, 0, k50.f91488a, m50Var2);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        t80Var3 = (t80) cVarB.i(g2Var, 1, r80.f94323a, t80Var3);
                        i12 |= 2;
                        break;
                    case 2:
                        list6 = (List) cVarB.i(g2Var, 2, kSerializerArr[2], list6);
                        i12 |= 4;
                        break;
                    case 3:
                        t50Var3 = (t50) cVarB.i(g2Var, i11, r50.f94283a, t50Var3);
                        i12 |= 8;
                        break;
                    case 4:
                        list7 = (List) cVarB.i(g2Var, 4, kSerializerArr[4], list7);
                        i12 |= 16;
                        break;
                    case 5:
                        list8 = (List) cVarB.i(g2Var, 5, kSerializerArr[5], list8);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iW);
                }
            }
            i10 = i12;
            m50Var = m50Var2;
            t80Var = t80Var3;
            list = list6;
            t50Var = t50Var3;
            list2 = list7;
            list3 = list8;
        }
        cVarB.c(g2Var);
        return new m80(i10, m50Var, t80Var, list, t50Var, list2, list3);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f91509b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        m80 m80Var = (m80) obj;
        wo.g2 g2Var = f91509b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = m80.f92304g;
        dVarB.g(g2Var, 0, k50.f91488a, m80Var.f92305a);
        dVarB.g(g2Var, 1, r80.f94323a, m80Var.f92306b);
        dVarB.g(g2Var, 2, kSerializerArr[2], m80Var.f92307c);
        dVarB.g(g2Var, 3, r50.f94283a, m80Var.f92308d);
        dVarB.g(g2Var, 4, kSerializerArr[4], m80Var.f92309e);
        dVarB.g(g2Var, 5, kSerializerArr[5], m80Var.f92310f);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
