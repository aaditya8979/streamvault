package yads;

import com.ironsource.Q6;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class zr1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zr1 f97757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f97758b;

    static {
        zr1 zr1Var = new zr1();
        f97757a = zr1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchNetwork", zr1Var, 2);
        g2Var.n(Q6.G1, false);
        g2Var.n("network_data", false);
        f97758b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.f86635a, cs1.f88594d[1]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        int i10;
        Map map;
        wo.g2 g2Var = f97758b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = cs1.f88594d;
        if (cVarB.l()) {
            strK = cVarB.k(g2Var, 0);
            map = (Map) cVarB.i(g2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            strK = null;
            Map map2 = null;
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
                    map2 = (Map) cVarB.i(g2Var, 1, kSerializerArr[1], map2);
                    i10 |= 2;
                }
            }
            map = map2;
        }
        cVarB.c(g2Var);
        return new cs1(i10, strK, map);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f97758b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        cs1 cs1Var = (cs1) obj;
        wo.g2 g2Var = f97758b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = cs1.f88594d;
        dVarB.q(g2Var, 0, cs1Var.f88595b);
        dVarB.g(g2Var, 1, kSerializerArr[1], cs1Var.f88596c);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
