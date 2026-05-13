package yads;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes12.dex */
public final class nu1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nu1 f92990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f92991b;

    static {
        nu1 nu1Var = new nu1();
        f92990a = nu1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.utils.logger.model.MobileAdsNetworkResponseLog", nu1Var, 4);
        g2Var.n("timestamp", false);
        g2Var.n("code", false);
        g2Var.n("headers", false);
        g2Var.n("body", false);
        f92991b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{wo.g1.f86515a, to.a.t(wo.v0.f86626a), to.a.t(pu1.f93781e[2]), to.a.t(w2.f86635a)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        Integer num;
        int i10;
        Map map;
        String str;
        long j10;
        wo.g2 g2Var = f92991b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = pu1.f93781e;
        if (cVarB.l()) {
            long jF = cVarB.f(g2Var, 0);
            Integer num2 = (Integer) cVarB.C(g2Var, 1, wo.v0.f86626a, null);
            map = (Map) cVarB.C(g2Var, 2, kSerializerArr[2], null);
            num = num2;
            str = (String) cVarB.C(g2Var, 3, w2.f86635a, null);
            i10 = 15;
            j10 = jF;
        } else {
            Integer num3 = null;
            boolean z10 = true;
            long jF2 = 0;
            Map map2 = null;
            String str2 = null;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    jF2 = cVarB.f(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    num3 = (Integer) cVarB.C(g2Var, 1, wo.v0.f86626a, num3);
                    i11 |= 2;
                } else if (iW == 2) {
                    map2 = (Map) cVarB.C(g2Var, 2, kSerializerArr[2], map2);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    str2 = (String) cVarB.C(g2Var, 3, w2.f86635a, str2);
                    i11 |= 8;
                }
            }
            num = num3;
            i10 = i11;
            map = map2;
            str = str2;
            j10 = jF2;
        }
        cVarB.c(g2Var);
        return new pu1(i10, j10, num, map, str);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f92991b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        pu1 pu1Var = (pu1) obj;
        wo.g2 g2Var = f92991b;
        vo.d dVarB = encoder.b(g2Var);
        KSerializer[] kSerializerArr = pu1.f93781e;
        dVarB.v(g2Var, 0, pu1Var.f93782a);
        dVarB.f(g2Var, 1, wo.v0.f86626a, pu1Var.f93783b);
        dVarB.f(g2Var, 2, kSerializerArr[2], pu1Var.f93784c);
        dVarB.f(g2Var, 3, w2.f86635a, pu1Var.f93785d);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
