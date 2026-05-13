package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes12.dex */
public final class c40 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c40 f88333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f88334b;

    static {
        c40 c40Var = new c40();
        f88333a = c40Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnit", c40Var, 4);
        g2Var.n("name", false);
        g2Var.n("ad_type", false);
        g2Var.n("ad_unit_id", false);
        g2Var.n("mediation", true);
        f88334b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerT = to.a.t(k40.f91476a);
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, w2Var, w2Var, kSerializerT};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        int i10;
        String str2;
        String str3;
        m40 m40Var;
        wo.g2 g2Var = f88334b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            String strK = cVarB.k(g2Var, 0);
            String strK2 = cVarB.k(g2Var, 1);
            String strK3 = cVarB.k(g2Var, 2);
            str = strK;
            m40Var = (m40) cVarB.C(g2Var, 3, k40.f91476a, null);
            str3 = strK3;
            i10 = 15;
            str2 = strK2;
        } else {
            String strK4 = null;
            String strK5 = null;
            String strK6 = null;
            m40 m40Var2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK4 = cVarB.k(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK5 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    strK6 = cVarB.k(g2Var, 2);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    m40Var2 = (m40) cVarB.C(g2Var, 3, k40.f91476a, m40Var2);
                    i11 |= 8;
                }
            }
            str = strK4;
            i10 = i11;
            str2 = strK5;
            str3 = strK6;
            m40Var = m40Var2;
        }
        cVarB.c(g2Var);
        return new e40(i10, str, str2, str3, m40Var);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f88334b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        e40 e40Var = (e40) obj;
        wo.g2 g2Var = f88334b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.q(g2Var, 0, e40Var.f89089a);
        dVarB.q(g2Var, 1, e40Var.f89090b);
        dVarB.q(g2Var, 2, e40Var.f89091c);
        if (dVarB.r(g2Var, 3) || e40Var.f89092d != null) {
            dVarB.f(g2Var, 3, k40.f91476a, e40Var.f89092d);
        }
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
