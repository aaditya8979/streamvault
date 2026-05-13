package com.ironsource;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.AbstractC4191p0;
import com.ironsource.E0;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4004ec extends AbstractC4191p0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4004ec(@NotNull C4173o0 c4173o0, @NotNull C4022fc c4022fc, @NotNull InterfaceC4040gc interfaceC4040gc) {
        String str;
        int iB;
        super(c4173o0, c4022fc, interfaceC4040gc, null, 8, null);
        tn.p.k(c4173o0, "adTools");
        tn.p.k(c4022fc, "adUnitData");
        tn.p.k(interfaceC4040gc, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C4041gd c4041gdG = g();
        IronLog.INTERNAL.verbose("placement = " + c4041gdG);
        if (c4041gdG == null || TextUtils.isEmpty(c4041gdG.c())) {
            tn.x xVar = tn.x.f85368a;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c4041gdG == null ? "placement is null" : "placement name is empty"}, 1));
            tn.p.j(str, "format(format, *args)");
            iB = A0.b(c4022fc.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A a(C4004ec c4004ec, B b10, H h10) {
        tn.p.k(c4004ec, "this$0");
        tn.p.k(b10, "adInstanceData");
        tn.p.k(h10, "adInstancePayload");
        return new Wb(new W0(c4004ec.f(), E0.b.PROVIDER), b10, h10, new AbstractC4191p0.a());
    }

    @Override // com.ironsource.AbstractC4191p0
    @NotNull
    public D a() {
        return new D() { // from class: com.ironsource.xk
            @Override // com.ironsource.D
            public final A a(B b10, H h10) {
                return C4004ec.a(this.f34405a, b10, h10);
            }
        };
    }
}
