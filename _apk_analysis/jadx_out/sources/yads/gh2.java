package yads;

import com.ironsource.Q6;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes2.dex */
public final class gh2 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gh2 f89985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89986b;

    static {
        gh2 gh2Var = new gh2();
        f89985a = gh2Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationInfo", gh2Var, 5);
        g2Var.n(Q6.G1, false);
        g2Var.n("network_winner", false);
        g2Var.n("revenue", false);
        g2Var.n("result", false);
        g2Var.n("network_ad_info", false);
        f89986b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, to.a.t(oh2.f93227a), to.a.t(ei2.f89267a), yh2.f97147a, to.a.t(w2Var)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        int i10;
        qh2 qh2Var;
        gi2 gi2Var;
        ai2 ai2Var;
        String str2;
        wo.g2 g2Var = f89986b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            String strK = cVarB.k(g2Var, 0);
            qh2 qh2Var2 = (qh2) cVarB.C(g2Var, 1, oh2.f93227a, null);
            gi2 gi2Var2 = (gi2) cVarB.C(g2Var, 2, ei2.f89267a, null);
            str = strK;
            ai2Var = (ai2) cVarB.i(g2Var, 3, yh2.f97147a, null);
            str2 = (String) cVarB.C(g2Var, 4, w2.f86635a, null);
            gi2Var = gi2Var2;
            qh2Var = qh2Var2;
            i10 = 31;
        } else {
            String strK2 = null;
            qh2 qh2Var3 = null;
            gi2 gi2Var3 = null;
            ai2 ai2Var2 = null;
            String str3 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK2 = cVarB.k(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    qh2Var3 = (qh2) cVarB.C(g2Var, 1, oh2.f93227a, qh2Var3);
                    i11 |= 2;
                } else if (iW == 2) {
                    gi2Var3 = (gi2) cVarB.C(g2Var, 2, ei2.f89267a, gi2Var3);
                    i11 |= 4;
                } else if (iW == 3) {
                    ai2Var2 = (ai2) cVarB.i(g2Var, 3, yh2.f97147a, ai2Var2);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    str3 = (String) cVarB.C(g2Var, 4, w2.f86635a, str3);
                    i11 |= 16;
                }
            }
            str = strK2;
            i10 = i11;
            qh2Var = qh2Var3;
            gi2Var = gi2Var3;
            ai2Var = ai2Var2;
            str2 = str3;
        }
        cVarB.c(g2Var);
        return new ih2(i10, str, qh2Var, gi2Var, ai2Var, str2);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89986b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        ih2 ih2Var = (ih2) obj;
        wo.g2 g2Var = f89986b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.q(g2Var, 0, ih2Var.f90838a);
        dVarB.f(g2Var, 1, oh2.f93227a, ih2Var.f90839b);
        dVarB.f(g2Var, 2, ei2.f89267a, ih2Var.f90840c);
        dVarB.g(g2Var, 3, yh2.f97147a, ih2Var.f90841d);
        dVarB.f(g2Var, 4, w2.f86635a, ih2Var.f90842e);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
