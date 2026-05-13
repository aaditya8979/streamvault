package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes8.dex */
public final class k40 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k40 f91476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f91477b;

    static {
        k40 k40Var = new k40();
        f91476a = k40Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAdUnitMediation", k40Var, 2);
        g2Var.n(com.ironsource.mediationsdk.d.f32393h, false);
        g2Var.n("bidding", false);
        f91477b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = m40.f92257c;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        List list;
        int i10;
        List list2;
        wo.g2 g2Var = f91477b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = m40.f92257c;
        if (cVarB.l()) {
            list = (List) cVarB.i(g2Var, 0, kSerializerArr[0], null);
            list2 = (List) cVarB.i(g2Var, 1, kSerializerArr[1], null);
            i10 = 3;
        } else {
            list = null;
            List list3 = null;
            i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    list = (List) cVarB.i(g2Var, 0, kSerializerArr[0], list);
                    i10 |= 1;
                } else {
                    if (iW != 1) {
                        throw new UnknownFieldException(iW);
                    }
                    list3 = (List) cVarB.i(g2Var, 1, kSerializerArr[1], list3);
                    i10 |= 2;
                }
            }
            list2 = list3;
        }
        cVarB.c(g2Var);
        return new m40(i10, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f91477b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        m40 m40Var = (m40) obj;
        wo.g2 g2Var = f91477b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = m40.f92257c;
        dVarB.g(g2Var, 0, kSerializerArr[0], m40Var.f92258a);
        dVarB.g(g2Var, 1, kSerializerArr[1], m40Var.f92259b);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
