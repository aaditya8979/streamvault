package d1;

import android.content.Context;
import f1.e;
import f1.f;
import f1.h;

/* JADX INFO: loaded from: classes.dex */
public class a implements j1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f59542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f59543b;

    public a(Context context, l1.a aVar, boolean z10, j1.a aVar2) {
        this(aVar, null);
        this.f59542a = new h(new e(context), false, z10, aVar2, this);
    }

    public a(l1.a aVar, h1.a aVar2) {
        l1.b.f73620b.f73621a = aVar;
        h1.b.f62968b.f62969a = aVar2;
    }

    public void authenticate() {
        n1.c.f75011a.execute(new b(this));
    }

    public void destroy() {
        this.f59543b = null;
        this.f59542a.destroy();
    }

    public String getOdt() {
        c cVar = this.f59543b;
        return cVar != null ? cVar.f59545a : "";
    }

    public boolean isAuthenticated() {
        return this.f59542a.h();
    }

    public boolean isConnected() {
        return this.f59542a.a();
    }

    @Override // j1.b
    public void onCredentialsRequestFailed(String str) {
        this.f59542a.onCredentialsRequestFailed(str);
    }

    @Override // j1.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f59542a.onCredentialsRequestSuccess(str, str2);
    }
}
