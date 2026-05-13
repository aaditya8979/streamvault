package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class kd2 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd2 f91573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f91574b;

    static {
        kd2 kd2Var = new kd2();
        f91573a = kd2Var;
        wo.g2 g2Var = new wo.g2("com.monetization.ads.core.configuration.model.PlayBackOptimizationConfig", kd2Var, 5);
        g2Var.n("minBufferMs", true);
        g2Var.n("maxBufferMs", true);
        g2Var.n("bufferForPlaybackMs", true);
        g2Var.n("bufferForPlaybackAfterRebufferMs", true);
        g2Var.n("targetBufferBytes", true);
        f91574b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        wo.v0 v0Var = wo.v0.f86626a;
        return new KSerializer[]{to.a.t(v0Var), to.a.t(v0Var), to.a.t(v0Var), to.a.t(v0Var), to.a.t(v0Var)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        wo.g2 g2Var = f91574b;
        vo.c cVarB = decoder.b(g2Var);
        Integer num6 = null;
        if (cVarB.l()) {
            wo.v0 v0Var = wo.v0.f86626a;
            Integer num7 = (Integer) cVarB.C(g2Var, 0, v0Var, null);
            Integer num8 = (Integer) cVarB.C(g2Var, 1, v0Var, null);
            Integer num9 = (Integer) cVarB.C(g2Var, 2, v0Var, null);
            Integer num10 = (Integer) cVarB.C(g2Var, 3, v0Var, null);
            num5 = (Integer) cVarB.C(g2Var, 4, v0Var, null);
            num4 = num10;
            i10 = 31;
            num3 = num9;
            num = num7;
            num2 = num8;
        } else {
            int i11 = 0;
            Integer num11 = null;
            Integer num12 = null;
            Integer num13 = null;
            Integer num14 = null;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    num6 = (Integer) cVarB.C(g2Var, 0, wo.v0.f86626a, num6);
                    i11 |= 1;
                } else if (iW == 1) {
                    num11 = (Integer) cVarB.C(g2Var, 1, wo.v0.f86626a, num11);
                    i11 |= 2;
                } else if (iW == 2) {
                    num12 = (Integer) cVarB.C(g2Var, 2, wo.v0.f86626a, num12);
                    i11 |= 4;
                } else if (iW == 3) {
                    num13 = (Integer) cVarB.C(g2Var, 3, wo.v0.f86626a, num13);
                    i11 |= 8;
                } else {
                    if (iW != 4) {
                        throw new UnknownFieldException(iW);
                    }
                    num14 = (Integer) cVarB.C(g2Var, 4, wo.v0.f86626a, num14);
                    i11 |= 16;
                }
            }
            i10 = i11;
            num = num6;
            num2 = num11;
            num3 = num12;
            num4 = num13;
            num5 = num14;
        }
        cVarB.c(g2Var);
        return new md2(i10, num, num2, num3, num4, num5);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f91574b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        md2 md2Var = (md2) obj;
        wo.g2 g2Var = f91574b;
        vo.d dVarB = encoder.b(g2Var);
        if (dVarB.r(g2Var, 0) || md2Var.f92323a != null) {
            dVarB.f(g2Var, 0, wo.v0.f86626a, md2Var.f92323a);
        }
        if (dVarB.r(g2Var, 1) || md2Var.f92324b != null) {
            dVarB.f(g2Var, 1, wo.v0.f86626a, md2Var.f92324b);
        }
        if (dVarB.r(g2Var, 2) || md2Var.f92325c != null) {
            dVarB.f(g2Var, 2, wo.v0.f86626a, md2Var.f92325c);
        }
        if (dVarB.r(g2Var, 3) || md2Var.f92326d != null) {
            dVarB.f(g2Var, 3, wo.v0.f86626a, md2Var.f92326d);
        }
        if (dVarB.r(g2Var, 4) || md2Var.f92327e != null) {
            dVarB.f(g2Var, 4, wo.v0.f86626a, md2Var.f92327e);
        }
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
