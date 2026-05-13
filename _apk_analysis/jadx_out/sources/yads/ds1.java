package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class ds1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ds1 f88972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f88973b;

    static {
        ds1 ds1Var = new ds1();
        f88972a = ds1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.config.MediationPrefetchSettings", ds1Var, 2);
        g2Var.n("load_timeout_millis", true);
        g2Var.n("mediation_prefetch_ad_units", true);
        f88973b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{wo.g1.f86515a, gs1.f90100d[1]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        List list;
        long jF;
        wo.g2 g2Var = f88973b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = gs1.f90100d;
        List list2 = null;
        if (cVarB.l()) {
            jF = cVarB.f(g2Var, 0);
            list = (List) cVarB.i(g2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            long jF2 = 0;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    jF2 = cVarB.f(g2Var, 0);
                    i11 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    list2 = (List) cVarB.i(g2Var, 1, kSerializerArr[1], list2);
                    i11 |= 2;
                }
            }
            i10 = i11;
            list = list2;
            jF = jF2;
        }
        cVarB.c(g2Var);
        return new gs1(i10, jF, list);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f88973b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        gs1 gs1Var = (gs1) obj;
        wo.g2 g2Var = f88973b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = gs1.f90100d;
        if (dVarB.r(g2Var, 0) || gs1Var.f90101b != 30000) {
            dVarB.v(g2Var, 0, gs1Var.f90101b);
        }
        if (dVarB.r(g2Var, 1) || !tn.p.f(gs1Var.f90102c, cn.w.m())) {
            dVarB.g(g2Var, 1, kSerializerArr[1], gs1Var.f90102c);
        }
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
