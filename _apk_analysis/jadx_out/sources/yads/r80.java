package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes2.dex */
public final class r80 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r80 f94323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f94324b;

    static {
        r80 r80Var = new r80();
        f94323a = r80Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelSdkData", r80Var, 3);
        g2Var.n("version", false);
        g2Var.n("is_integrated", false);
        g2Var.n("integration_messages", false);
        f94324b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{w2.f86635a, wo.i.f86540a, t80.f95099d[2]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String strK;
        int i10;
        List list;
        boolean zE;
        wo.g2 g2Var = f94324b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = t80.f95099d;
        if (cVarB.l()) {
            strK = cVarB.k(g2Var, 0);
            zE = cVarB.E(g2Var, 1);
            list = (List) cVarB.i(g2Var, 2, kSerializerArr[2], null);
            i10 = 7;
        } else {
            strK = null;
            List list2 = null;
            i10 = 0;
            boolean zE2 = false;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK = cVarB.k(g2Var, 0);
                    i10 |= 1;
                } else if (iW == 1) {
                    zE2 = cVarB.E(g2Var, 1);
                    i10 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    list2 = (List) cVarB.i(g2Var, 2, kSerializerArr[2], list2);
                    i10 |= 4;
                }
            }
            list = list2;
            zE = zE2;
        }
        cVarB.c(g2Var);
        return new t80(i10, strK, zE, list);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f94324b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        t80 t80Var = (t80) obj;
        wo.g2 g2Var = f94324b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = t80.f95099d;
        dVarB.q(g2Var, 0, t80Var.f95100a);
        dVarB.p(g2Var, 1, t80Var.f95101b);
        dVarB.g(g2Var, 2, kSerializerArr[2], t80Var.f95102c);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
