package com.fyber.inneractive.sdk.flow.endcard;

import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16306a = IAlog.a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public JSONArray f16307b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f16308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n f16309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16311f;

    public b(int i10, x0 x0Var) {
        this.f16308c = x0Var;
        this.f16311f = i10;
    }

    public static int a(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar == null) {
            return 3;
        }
        Integer numA = uVar.a("autoClickDelay");
        int iIntValue = numA != null ? numA.intValue() : 3;
        if (iIntValue < 0 || iIntValue > 10) {
            return 3;
        }
        return iIntValue;
    }

    public static boolean b(com.fyber.inneractive.sdk.config.global.features.u uVar) {
        if (uVar == null) {
            return false;
        }
        Boolean boolC = uVar.c("shouldEnableEndCardAutoClick");
        return boolC != null ? boolC.booleanValue() : false;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final void a() {
        n nVar = this.f16309d;
        if (nVar != null) {
            nVar.a();
        }
    }

    public abstract void a(ViewGroup viewGroup, com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        IAlog.a("%s loading failed for %s", inneractiveInfrastructureError.getCause(), i(), this.f16306a);
    }

    public void a(JSONArray jSONArray) {
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return f().b();
    }

    public abstract n c();

    public com.fyber.inneractive.sdk.player.ui.c d() {
        com.fyber.inneractive.sdk.config.global.features.u uVar = this.f16308c.f16707g;
        com.fyber.inneractive.sdk.player.ui.c cVar = new com.fyber.inneractive.sdk.player.ui.c();
        cVar.f19005a = l();
        cVar.f19010f = i();
        boolean zB = b(uVar);
        Integer numValueOf = Integer.valueOf(a(uVar));
        if (zB) {
            cVar.f19008d = numValueOf;
        }
        return cVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public void destroy() {
        e();
        n nVar = this.f16309d;
        if (nVar != null) {
            nVar.destroy();
            this.f16309d = null;
        }
    }

    public void e() {
        a();
    }

    public final n f() {
        if (this.f16309d == null) {
            this.f16309d = c();
        }
        return this.f16309d;
    }

    public abstract com.fyber.inneractive.sdk.util.g g();

    public abstract l h();

    public abstract com.fyber.inneractive.sdk.model.vast.i i();

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public abstract boolean l();

    public void m() {
        IAlog.a("%s loading success for %s", i(), this.f16306a);
    }
}
