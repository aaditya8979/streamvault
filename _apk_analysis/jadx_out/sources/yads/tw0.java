package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class tw0 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tw0 f95395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f95396b;

    static {
        tw0 tw0Var = new tw0();
        f95395a = tw0Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.base.model.fonts.FontParameters", tw0Var, 1);
        g2Var.n("urls", false);
        f95396b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{to.a.t(bx0.f88181a)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        dx0 dx0Var;
        wo.g2 g2Var = f95396b;
        vo.c cVarB = decoder.b(g2Var);
        int i10 = 1;
        dx0 dx0Var2 = null;
        if (cVarB.l()) {
            dx0Var = (dx0) cVarB.C(g2Var, 0, bx0.f88181a, null);
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
                    dx0Var2 = (dx0) cVarB.C(g2Var, 0, bx0.f88181a, dx0Var2);
                    i11 = 1;
                }
            }
            dx0Var = dx0Var2;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new vw0(i10, dx0Var);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f95396b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        wo.g2 g2Var = f95396b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.f(g2Var, 0, bx0.f88181a, ((vw0) obj).f96204a);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
