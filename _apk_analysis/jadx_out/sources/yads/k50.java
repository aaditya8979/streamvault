package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes6.dex */
public final class k50 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k50 f91488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f91489b;

    static {
        k50 k50Var = new k50();
        f91488a = k50Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelAppData", k50Var, 4);
        g2Var.n("app_id", false);
        g2Var.n("app_version", false);
        g2Var.n("system", false);
        g2Var.n("api_level", false);
        f91489b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, w2Var, w2Var, w2Var};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        String strK;
        String str2;
        String str3;
        int i10;
        wo.g2 g2Var = f91489b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            String strK2 = cVarB.k(g2Var, 0);
            String strK3 = cVarB.k(g2Var, 1);
            String strK4 = cVarB.k(g2Var, 2);
            str = strK2;
            strK = cVarB.k(g2Var, 3);
            str2 = strK4;
            str3 = strK3;
            i10 = 15;
        } else {
            String strK5 = null;
            String strK6 = null;
            String strK7 = null;
            String strK8 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK5 = cVarB.k(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK8 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    strK7 = cVarB.k(g2Var, 2);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    strK6 = cVarB.k(g2Var, 3);
                    i11 |= 8;
                }
            }
            str = strK5;
            strK = strK6;
            str2 = strK7;
            str3 = strK8;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new m50(i10, str, str3, str2, strK);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f91489b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        m50 m50Var = (m50) obj;
        wo.g2 g2Var = f91489b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.q(g2Var, 0, m50Var.f92265a);
        dVarB.q(g2Var, 1, m50Var.f92266b);
        dVarB.q(g2Var, 2, m50Var.f92267c);
        dVarB.q(g2Var, 3, m50Var.f92268d);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
