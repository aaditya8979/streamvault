package yads;

import com.vungle.ads.internal.ui.AdActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class fu1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fu1 f89677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89678b;

    static {
        fu1 fu1Var = new fu1();
        f89677a = fu1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.utils.logger.model.MobileAdsNetworkLog", fu1Var, 2);
        g2Var.n(AdActivity.REQUEST_KEY_EXTRA, false);
        g2Var.n("response", false);
        f89678b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ku1.f91752a, to.a.t(nu1.f92990a)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        pu1 pu1Var;
        mu1 mu1Var;
        wo.g2 g2Var = f89678b;
        vo.c cVarB = decoder.b(g2Var);
        mu1 mu1Var2 = null;
        if (cVarB.l()) {
            mu1Var = (mu1) cVarB.i(g2Var, 0, ku1.f91752a, null);
            pu1Var = (pu1) cVarB.C(g2Var, 1, nu1.f92990a, null);
            i10 = 3;
        } else {
            pu1 pu1Var2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    mu1Var2 = (mu1) cVarB.i(g2Var, 0, ku1.f91752a, mu1Var2);
                    i11 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    pu1Var2 = (pu1) cVarB.C(g2Var, 1, nu1.f92990a, pu1Var2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            mu1 mu1Var3 = mu1Var2;
            pu1Var = pu1Var2;
            mu1Var = mu1Var3;
        }
        cVarB.c(g2Var);
        return new hu1(i10, mu1Var, pu1Var);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89678b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        hu1 hu1Var = (hu1) obj;
        wo.g2 g2Var = f89678b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.g(g2Var, 0, ku1.f91752a, hu1Var.f90562a);
        dVarB.f(g2Var, 1, nu1.f92990a, hu1Var.f90563b);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
