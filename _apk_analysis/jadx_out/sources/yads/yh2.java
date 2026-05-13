package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes12.dex */
public final class yh2 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yh2 f97147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f97148b;

    static {
        yh2 yh2Var = new yh2();
        f97147a = yh2Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.mediation.prefetch.PrefetchedMediationResult", yh2Var, 3);
        g2Var.n("status", false);
        g2Var.n("error_message", false);
        g2Var.n("status_code", false);
        f97148b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ai2.f87708d[0], to.a.t(w2.f86635a), to.a.t(wo.v0.f86626a)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        di2 di2Var;
        Integer num;
        int i10;
        wo.g2 g2Var = f97148b;
        vo.c cVarB = decoder.b(g2Var);
        KSerializer[] kSerializerArr = ai2.f87708d;
        di2 di2Var2 = null;
        if (cVarB.l()) {
            di2Var = (di2) cVarB.i(g2Var, 0, kSerializerArr[0], null);
            str = (String) cVarB.C(g2Var, 1, w2.f86635a, null);
            num = (Integer) cVarB.C(g2Var, 2, wo.v0.f86626a, null);
            i10 = 7;
        } else {
            str = null;
            Integer num2 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    di2Var2 = (di2) cVarB.i(g2Var, 0, kSerializerArr[0], di2Var2);
                    i11 |= 1;
                } else if (iW == 1) {
                    str = (String) cVarB.C(g2Var, 1, w2.f86635a, str);
                    i11 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    num2 = (Integer) cVarB.C(g2Var, 2, wo.v0.f86626a, num2);
                    i11 |= 4;
                }
            }
            di2Var = di2Var2;
            num = num2;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new ai2(i10, di2Var, str, num);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f97148b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        ai2 ai2Var = (ai2) obj;
        wo.g2 g2Var = f97148b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.g(g2Var, 0, ai2.f87708d[0], ai2Var.f87709a);
        dVarB.f(g2Var, 1, w2.f86635a, ai2Var.f87710b);
        dVarB.f(g2Var, 2, wo.v0.f86626a, ai2Var.f87711c);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
