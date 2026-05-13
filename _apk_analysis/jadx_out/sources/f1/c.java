package f1;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f61399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f61400c;

    public c(e eVar, d dVar) {
        this.f61400c = eVar;
        this.f61399b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.a aVarA;
        e eVar = this.f61400c;
        if (eVar.a()) {
            try {
                aVarA = m1.a.a(new JSONObject(eVar.f61413k.version()));
            } catch (Exception e10) {
                h1.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e10);
                l1.b.b("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e10.toString());
                aVarA = new g1.a(false, "");
            }
        } else {
            aVarA = new g1.a(false, "");
        }
        eVar.f61412j = aVarA;
        n1.c.f75012b.post(this.f61399b);
    }
}
