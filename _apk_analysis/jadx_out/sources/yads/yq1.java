package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes4.dex */
public final class yq1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yq1 f97269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f97270b;

    static {
        yq1 yq1Var = new yq1();
        f97269a = yq1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData.MediationAdapterData", yq1Var, 3);
        g2Var.n("format", false);
        g2Var.n("version", false);
        g2Var.n("isIntegrated", false);
        f97270b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, to.a.t(w2Var), wo.i.f86540a};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        boolean zE;
        int i10;
        String str;
        String strK;
        wo.g2 g2Var = f97270b;
        vo.c cVarB = decoder.b(g2Var);
        String strK2 = null;
        if (cVarB.l()) {
            strK = cVarB.k(g2Var, 0);
            str = (String) cVarB.C(g2Var, 1, w2.f86635a, null);
            zE = cVarB.E(g2Var, 2);
            i10 = 7;
        } else {
            String str2 = null;
            boolean zE2 = false;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK2 = cVarB.k(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    str2 = (String) cVarB.C(g2Var, 1, w2.f86635a, str2);
                    i11 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    zE2 = cVarB.E(g2Var, 2);
                    i11 |= 4;
                }
            }
            zE = zE2;
            i10 = i11;
            String str3 = strK2;
            str = str2;
            strK = str3;
        }
        cVarB.c(g2Var);
        return new ar1(i10, strK, str, zE);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f97270b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        ar1 ar1Var = (ar1) obj;
        wo.g2 g2Var = f97270b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.q(g2Var, 0, ar1Var.f87789a);
        dVarB.f(g2Var, 1, w2.f86635a, ar1Var.f87790b);
        dVarB.p(g2Var, 2, ar1Var.f87791c);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
