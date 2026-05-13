package hr;

import mr.e;
import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.UpnpResponse;
import qr.f;
import qr.k;
import qr.l;

/* JADX INFO: compiled from: ActionCallback.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jr.d f63609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f63610c;

    public a(jr.d dVar) {
        this.f63609b = dVar;
    }

    public String a(jr.d dVar, UpnpResponse upnpResponse) {
        ActionException actionExceptionC = dVar.c();
        String str = "Error: ";
        if (actionExceptionC != null) {
            str = "Error: " + actionExceptionC.getMessage();
        }
        if (upnpResponse == null) {
            return str;
        }
        return str + " (HTTP response was: " + upnpResponse.c() + ")";
    }

    public void b(jr.d dVar, UpnpResponse upnpResponse) {
        c(dVar, upnpResponse, a(dVar, upnpResponse));
    }

    public abstract void c(jr.d dVar, UpnpResponse upnpResponse, String str);

    public jr.d d() {
        return this.f63609b;
    }

    public synchronized b f() {
        return this.f63610c;
    }

    public synchronized a g(b bVar) {
        this.f63610c = bVar;
        return this;
    }

    public abstract void h(jr.d dVar);

    @Override // java.lang.Runnable
    public void run() {
        l lVarG = this.f63609b.a().g();
        if (lVarG instanceof f) {
            ((f) lVarG).p(this.f63609b.a()).a(this.f63609b);
            if (this.f63609b.c() != null) {
                b(this.f63609b, null);
                return;
            } else {
                h(this.f63609b);
                return;
            }
        }
        if (lVarG instanceof k) {
            if (f() == null) {
                throw new IllegalStateException("Callback must be executed through ControlPoint");
            }
            k kVar = (k) lVarG;
            try {
                xr.f fVarD = f().a().d(this.f63609b, kVar.d().O(kVar.n()));
                fVarD.run();
                e eVarF = fVarD.f();
                if (eVarF == null) {
                    b(this.f63609b, null);
                } else if (eVarF.k().f()) {
                    b(this.f63609b, eVarF.k());
                } else {
                    h(this.f63609b);
                }
            } catch (IllegalArgumentException unused) {
                c(this.f63609b, null, "bad control URL: " + kVar.n());
            }
        }
    }

    public String toString() {
        return "(ActionCallback) " + this.f63609b;
    }
}
