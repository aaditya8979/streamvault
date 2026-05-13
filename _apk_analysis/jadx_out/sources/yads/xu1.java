package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes3.dex */
public final class xu1 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xu1 f96875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f96876b;

    static {
        xu1 xu1Var = new xu1();
        f96875a = xu1Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.utils.logger.model.MobileAdsSdkLog", xu1Var, 4);
        g2Var.n("timestamp", false);
        g2Var.n("type", false);
        g2Var.n("tag", false);
        g2Var.n("text", false);
        f96876b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{wo.g1.f86515a, w2Var, w2Var, w2Var};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        String str;
        String strK;
        String str2;
        int i10;
        long j10;
        wo.g2 g2Var = f96876b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            long jF = cVarB.f(g2Var, 0);
            String strK2 = cVarB.k(g2Var, 1);
            String strK3 = cVarB.k(g2Var, 2);
            str = strK2;
            strK = cVarB.k(g2Var, 3);
            str2 = strK3;
            i10 = 15;
            j10 = jF;
        } else {
            String strK4 = null;
            int i11 = 0;
            boolean z10 = true;
            long jF2 = 0;
            String strK5 = null;
            String strK6 = null;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    jF2 = cVarB.f(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    strK4 = cVarB.k(g2Var, 1);
                    i11 |= 2;
                } else if (iW == 2) {
                    strK6 = cVarB.k(g2Var, 2);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    strK5 = cVarB.k(g2Var, 3);
                    i11 |= 8;
                }
            }
            str = strK4;
            strK = strK5;
            str2 = strK6;
            i10 = i11;
            j10 = jF2;
        }
        cVarB.c(g2Var);
        return new zu1(i10, j10, str, str2, strK);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f96876b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        zu1 zu1Var = (zu1) obj;
        wo.g2 g2Var = f96876b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.v(g2Var, 0, zu1Var.f97771a);
        dVarB.q(g2Var, 1, zu1Var.f97772b);
        dVarB.q(g2Var, 2, zu1Var.f97773c);
        dVarB.q(g2Var, 3, zu1Var.f97774d);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
