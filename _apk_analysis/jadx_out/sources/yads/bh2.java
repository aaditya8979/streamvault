package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class bh2 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bh2 f88010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f88011b;

    static {
        bh2 bh2Var = new bh2();
        f88010a = bh2Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationData", bh2Var, 1);
        g2Var.n("prefetched_mediation_data", false);
        f88011b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{dh2.f88854b[0]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        List list;
        wo.g2 g2Var = f88011b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = dh2.f88854b;
        int i10 = 1;
        List list2 = null;
        if (cVarB.l()) {
            list = (List) cVarB.i(g2Var, 0, kSerializerArr[0], null);
        } else {
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
                    list2 = (List) cVarB.i(g2Var, 0, kSerializerArr[0], list2);
                    i11 = 1;
                }
            }
            list = list2;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new dh2(i10, list);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f88011b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        wo.g2 g2Var = f88011b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.g(g2Var, 0, dh2.f88854b[0], ((dh2) obj).f88855a);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
