package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes2.dex */
public final class ku1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ku1 f91752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f91753b;

    static {
        ku1 ku1Var = new ku1();
        f91752a = ku1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.utils.logger.model.MobileAdsNetworkRequestLog", ku1Var, 5);
        g2Var.n("timestamp", false);
        g2Var.n("method", false);
        g2Var.n("url", false);
        g2Var.n("headers", false);
        g2Var.n("body", false);
        f91753b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = mu1.f92571f;
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{wo.g1.f86515a, w2Var, w2Var, to.a.t(kSerializerArr[3]), to.a.t(w2Var)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        int i10;
        String str2;
        Map map;
        String str3;
        long j10;
        wo.g2 g2Var = f91753b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = mu1.f92571f;
        if (cVarB.l()) {
            long jF = cVarB.f(g2Var, 0);
            String strK = cVarB.k(g2Var, 1);
            String strK2 = cVarB.k(g2Var, 2);
            map = (Map) cVarB.C(g2Var, 3, kSerializerArr[3], null);
            str = strK;
            str3 = (String) cVarB.C(g2Var, 4, w2.f86635a, null);
            str2 = strK2;
            i10 = 31;
            j10 = jF;
        } else {
            String strK3 = null;
            String str4 = null;
            boolean z10 = true;
            long jF2 = 0;
            String strK4 = null;
            Map map2 = null;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    jF2 = cVarB.f(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK3 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    strK4 = cVarB.k(g2Var, 2);
                    i11 |= 4;
                } else if (iW == 3) {
                    map2 = (Map) cVarB.C(g2Var, 3, kSerializerArr[3], map2);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    str4 = (String) cVarB.C(g2Var, 4, w2.f86635a, str4);
                    i11 |= 16;
                }
            }
            str = strK3;
            i10 = i11;
            str2 = strK4;
            map = map2;
            str3 = str4;
            j10 = jF2;
        }
        cVarB.c(g2Var);
        return new mu1(i10, j10, str, str2, map, str3);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f91753b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        mu1 mu1Var = (mu1) obj;
        wo.g2 g2Var = f91753b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = mu1.f92571f;
        dVarB.v(g2Var, 0, mu1Var.f92572a);
        dVarB.q(g2Var, 1, mu1Var.f92573b);
        dVarB.q(g2Var, 2, mu1Var.f92574c);
        dVarB.f(g2Var, 3, kSerializerArr[3], mu1Var.f92575d);
        dVarB.f(g2Var, 4, w2.f86635a, mu1Var.f92576e);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
