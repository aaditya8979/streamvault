package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes11.dex */
public final class fa0 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fa0 f89521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89522b;

    static {
        fa0 fa0Var = new fa0();
        f89521a = fa0Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCpmFloor", fa0Var, 2);
        g2Var.n("network_ad_unit_id", false);
        g2Var.n("min_cpm", false);
        f89522b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.f86635a, wo.b0.f86476a};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        double dH;
        int i10;
        wo.g2 g2Var = f89522b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            strK = cVarB.k(g2Var, 0);
            dH = cVarB.H(g2Var, 1);
            i10 = 3;
        } else {
            strK = null;
            double dH2 = 0.0d;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK = cVarB.k(g2Var, 0);
                    i11 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    dH2 = cVarB.H(g2Var, 1);
                    i11 |= 2;
                }
            }
            dH = dH2;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new ha0(i10, strK, dH);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89522b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        ha0 ha0Var = (ha0) obj;
        wo.g2 g2Var = f89522b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.q(g2Var, 0, ha0Var.f90332a);
        dVarB.H(g2Var, 1, ha0Var.f90333b);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
