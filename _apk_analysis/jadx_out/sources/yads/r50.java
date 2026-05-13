package yads;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import wo.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class r50 implements wo.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r50 f94283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wo.g2 f94284b;

    static {
        r50 r50Var = new r50();
        f94283a = r50Var;
        wo.g2 g2Var = new wo.g2("com.yandex.mobile.ads.features.debugpanel.data.local.model.DebugPanelConsentsData", r50Var, 4);
        g2Var.n("has_location_consent", false);
        g2Var.n("age_restricted_user", false);
        g2Var.n("has_user_consent", false);
        g2Var.n("has_cmp_value", false);
        f94284b = g2Var;
    }

    @Override // wo.m0
    public final KSerializer[] childSerializers() {
        wo.i iVar = wo.i.f86540a;
        return new KSerializer[]{iVar, to.a.t(iVar), to.a.t(iVar), iVar};
    }

    @Override // so.c
    public final Object deserialize(Decoder decoder) {
        boolean z10;
        Boolean bool;
        Boolean bool2;
        boolean zE;
        int i10;
        wo.g2 g2Var = f94284b;
        vo.c cVarB = decoder.b(g2Var);
        Boolean bool3 = null;
        if (cVarB.l()) {
            boolean zE2 = cVarB.E(g2Var, 0);
            wo.i iVar = wo.i.f86540a;
            Boolean bool4 = (Boolean) cVarB.C(g2Var, 1, iVar, null);
            z10 = zE2;
            bool2 = (Boolean) cVarB.C(g2Var, 2, iVar, null);
            zE = cVarB.E(g2Var, 3);
            i10 = 15;
            bool = bool4;
        } else {
            Boolean bool5 = null;
            boolean z11 = true;
            boolean zE3 = false;
            boolean zE4 = false;
            int i11 = 0;
            while (z11) {
                int iW = cVarB.w(g2Var);
                if (iW == -1) {
                    z11 = false;
                } else if (iW == 0) {
                    zE3 = cVarB.E(g2Var, 0);
                    i11 |= 1;
                } else if (iW == 1) {
                    bool3 = (Boolean) cVarB.C(g2Var, 1, wo.i.f86540a, bool3);
                    i11 |= 2;
                } else if (iW == 2) {
                    bool5 = (Boolean) cVarB.C(g2Var, 2, wo.i.f86540a, bool5);
                    i11 |= 4;
                } else {
                    if (iW != 3) {
                        throw new UnknownFieldException(iW);
                    }
                    zE4 = cVarB.E(g2Var, 3);
                    i11 |= 8;
                }
            }
            z10 = zE3;
            bool = bool3;
            bool2 = bool5;
            zE = zE4;
            i10 = i11;
        }
        cVarB.c(g2Var);
        return new t50(i10, z10, bool, bool2, zE);
    }

    @Override // kotlinx.serialization.KSerializer, so.l, so.c
    public final SerialDescriptor getDescriptor() {
        return f94284b;
    }

    @Override // so.l
    public final void serialize(Encoder encoder, Object obj) {
        t50 t50Var = (t50) obj;
        wo.g2 g2Var = f94284b;
        vo.d dVarB = encoder.b(g2Var);
        dVarB.p(g2Var, 0, t50Var.f95064a);
        wo.i iVar = wo.i.f86540a;
        dVarB.f(g2Var, 1, iVar, t50Var.f95065b);
        dVarB.f(g2Var, 2, iVar, t50Var.f95066c);
        dVarB.p(g2Var, 3, t50Var.f95067d);
        dVarB.c(g2Var);
    }

    @Override // wo.m0
    public final KSerializer[] typeParametersSerializers() {
        return m0.a.a(this);
    }
}
