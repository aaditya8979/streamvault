package yads;

import com.ironsource.Q6;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes4.dex */
public final class ur1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur1 f95767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f95768b;

    static {
        ur1 ur1Var = new ur1();
        f95767a = ur1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchAdUnit", ur1Var, 2);
        g2Var.n("ad_unit_id", false);
        g2Var.n(Q6.E1, false);
        f95768b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.f86635a, xr1.f96858d[1]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        int i10;
        List list;
        wo.g2 g2Var = f95768b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = xr1.f96858d;
        if (cVarB.l()) {
            strK = cVarB.k(g2Var, 0);
            list = (List) cVarB.i(g2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            strK = null;
            List list2 = null;
            i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK = cVarB.k(g2Var, 0);
                    i10 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    list2 = (List) cVarB.i(g2Var, 1, kSerializerArr[1], list2);
                    i10 |= 2;
                }
            }
            list = list2;
        }
        cVarB.c(g2Var);
        return new xr1(i10, strK, list);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f95768b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        xr1 xr1Var = (xr1) obj;
        wo.g2 g2Var = f95768b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = xr1.f96858d;
        dVarB.q(g2Var, 0, xr1Var.f96859b);
        dVarB.g(g2Var, 1, kSerializerArr[1], xr1Var.f96860c);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
