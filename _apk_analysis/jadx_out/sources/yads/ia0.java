package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class ia0 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ia0 f90723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f90724b;

    static {
        ia0 ia0Var = new ia0();
        f90723a = ia0Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelWaterfallCurrency", ia0Var, 2);
        g2Var.n("name", false);
        g2Var.n("symbol", false);
        f90724b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, w2Var};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        String strK2;
        int i10;
        wo.g2 g2Var = f90724b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            strK = cVarB.k(g2Var, 0);
            strK2 = cVarB.k(g2Var, 1);
            i10 = 3;
        } else {
            strK = null;
            String strK3 = null;
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
                    strK3 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                }
            }
            strK2 = strK3;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new ka0(i10, strK, strK2);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f90724b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        ka0 ka0Var = (ka0) obj;
        wo.g2 g2Var = f90724b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.q(g2Var, 0, ka0Var.f91529a);
        dVarB.q(g2Var, 1, ka0Var.f91530b);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
