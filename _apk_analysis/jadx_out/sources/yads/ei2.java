package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class ei2 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ei2 f89267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89268b;

    static {
        ei2 ei2Var = new ei2();
        f89267a = ei2Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationRevenue", ei2Var, 1);
        g2Var.n("value", false);
        f89268b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{wo.b0.f86476a};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        double dH;
        wo.g2 g2Var = f89268b;
        vo.c cVarB = decoder.b(g2Var);
        int i10 = 1;
        if (cVarB.l()) {
            dH = cVarB.H(g2Var, 0);
        } else {
            double dH2 = 0.0d;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else {
                    if (iW != 0) {
                        throw new UnknownFieldException(iW);
                    }
                    dH2 = cVarB.H(g2Var, 0);
                    i11 = 1;
                }
            }
            dH = dH2;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new gi2(i10, dH);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89268b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        wo.g2 g2Var = f89268b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.H(g2Var, 0, ((gi2) obj).f89996a);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
