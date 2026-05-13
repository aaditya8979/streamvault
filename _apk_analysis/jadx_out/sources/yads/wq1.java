package yads;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes12.dex */
public final class wq1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wq1 f96475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f96476b;

    static {
        wq1 wq1Var = new wq1();
        f96475a = wq1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.core.initializer.validation.adapters.MediationNetworkData", wq1Var, 4);
        g2Var.n("name", false);
        g2Var.n("id", false);
        g2Var.n("version", false);
        g2Var.n("adapters", false);
        f96476b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = br1.f88114e;
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{w2Var, w2Var, to.a.t(w2Var), kSerializerArr[3]};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        int i10;
        String str2;
        String str3;
        List list;
        wo.g2 g2Var = f96476b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = br1.f88114e;
        if (cVarB.l()) {
            String strK = cVarB.k(g2Var, 0);
            String strK2 = cVarB.k(g2Var, 1);
            String str4 = (String) cVarB.C(g2Var, 2, w2.f86635a, null);
            list = (List) cVarB.i(g2Var, 3, kSerializerArr[3], null);
            str = strK;
            str3 = str4;
            i10 = 15;
            str2 = strK2;
        } else {
            String strK3 = null;
            String strK4 = null;
            String str5 = null;
            List list2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    strK3 = cVarB.k(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK4 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    str5 = (String) cVarB.C(g2Var, 2, w2.f86635a, str5);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    list2 = (List) cVarB.i(g2Var, 3, kSerializerArr[3], list2);
                    i11 |= 8;
                }
            }
            str = strK3;
            i10 = i11;
            str2 = strK4;
            str3 = str5;
            list = list2;
        }
        cVarB.c(g2Var);
        return new br1(i10, str, str2, str3, list);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f96476b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        br1 br1Var = (br1) obj;
        wo.g2 g2Var = f96476b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = br1.f88114e;
        dVarB.q(g2Var, 0, br1Var.f88115a);
        dVarB.q(g2Var, 1, br1Var.f88116b);
        dVarB.f(g2Var, 2, w2.f86635a, br1Var.f88117c);
        dVarB.g(g2Var, 3, kSerializerArr[3], br1Var.f88118d);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
