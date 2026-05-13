package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;
import wo.w2;

/* JADX INFO: loaded from: classes4.dex */
public final class e50 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e50 f89100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f89101b;

    static {
        e50 e50Var = new e50();
        f89100a = e50Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.remote.model.DebugPanelAlert", e50Var, 3);
        g2Var.n("title", true);
        g2Var.n("message", true);
        g2Var.n("type", true);
        f89101b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        w2 w2Var = w2.f86635a;
        return new KSerializer[]{to.a.t(w2Var), to.a.t(w2Var), to.a.t(w2Var)};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        int i10;
        String str;
        String str2;
        String str3;
        wo.g2 g2Var = f89101b;
        vo.c cVarB = decoder.b(g2Var);
        if (cVarB.l()) {
            w2 w2Var = w2.f86635a;
            str = (String) cVarB.C(g2Var, 0, w2Var, null);
            str2 = (String) cVarB.C(g2Var, 1, w2Var, null);
            str3 = (String) cVarB.C(g2Var, 2, w2Var, null);
            i10 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            i10 = 0;
            boolean z10 = true;
            while (z10) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z10 = false;
                } else if (iW == 0) {
                    str4 = (String) cVarB.C(g2Var, 0, w2.f86635a, str4);
                    i10 |= 1;
                } else if (iW == 1) {
                    str5 = (String) cVarB.C(g2Var, 1, w2.f86635a, str5);
                    i10 |= 2;
                } else {
                    if (iW != 2) {
                        throw new UnknownFieldException(iW);
                    }
                    str6 = (String) cVarB.C(g2Var, 2, w2.f86635a, str6);
                    i10 |= 4;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        cVarB.c(g2Var);
        return new g50(i10, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f89101b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        g50 g50Var = (g50) obj;
        wo.g2 g2Var = f89101b;
        vo.d dVarB = encoder.b(g2Var);
        if (dVarB.r(g2Var, 0) || g50Var.f89814a != null) {
            dVarB.f(g2Var, 0, w2.f86635a, g50Var.f89814a);
        }
        if (dVarB.r(g2Var, 1) || g50Var.f89815b != null) {
            dVarB.f(g2Var, 1, w2.f86635a, g50Var.f89815b);
        }
        if (dVarB.r(g2Var, 2) || g50Var.f89816c != null) {
            dVarB.f(g2Var, 2, w2.f86635a, g50Var.f89816c);
        }
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
