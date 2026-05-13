package f1;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d1.d f61423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d1.a f61424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r1.a f61425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1.b f61426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d1.c f61427h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i1.a f61428i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f61429j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f61430k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f61431l;

    public h(a aVar, boolean z10, boolean z11, j1.a aVar2, d1.a aVar3) {
        super(aVar, aVar2);
        this.f61429j = false;
        this.f61430k = false;
        this.f61431l = new AtomicBoolean(false);
        this.f61424e = aVar3;
        this.f61429j = z10;
        this.f61426g = new m1.b();
        this.f61425f = new r1.a(aVar.g());
        this.f61430k = z11;
        if (z11) {
            this.f61423d = new d1.d(aVar.g(), this, this);
        }
    }

    @Override // f1.f, f1.a
    public final void b() {
        if (this.f61427h == null) {
            Object[] objArr = {"OneDTAuthenticator"};
            l1.a aVar = l1.b.f73620b.f73621a;
            if (aVar != null) {
                aVar.i("%s : initializing new Ignite authentication session", objArr);
            }
            r1.a aVar2 = this.f61425f;
            aVar2.getClass();
            try {
                aVar2.f78544b.c();
            } catch (IOException e10) {
                e = e10;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidAlgorithmParameterException e11) {
                e = e11;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (InvalidKeyException e12) {
                e = e12;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (KeyStoreException e13) {
                e = e13;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchAlgorithmException e14) {
                e = e14;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchProviderException e15) {
                e = e15;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (UnrecoverableEntryException e16) {
                e = e16;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (CertificateException e17) {
                e = e17;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (NoSuchPaddingException e18) {
                e = e18;
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            } catch (Exception e19) {
                h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ENCRYPTION_EXCEPTION, o1.a.a(e19, com.digitalturbine.ignite.authenticator.events.c.FAILED_INIT_ENCRYPTION));
            }
            String strA = this.f61425f.a();
            this.f61426g.getClass();
            d1.c cVarA = m1.b.a(strA);
            this.f61427h = cVarA;
            if (cVarA.f59546b > TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())) {
                l1.b.a("%s : One DT resolved from cache", "OneDTAuthenticator");
                d1.c cVar = this.f61427h;
                d1.a aVar3 = this.f61424e;
                if (aVar3 != null) {
                    l1.b.a("%s : setting one dt entity", "IgniteManager");
                    aVar3.f59543b = cVar;
                }
            } else {
                this.f61431l.set(true);
            }
        }
        if (this.f61430k && this.f61423d == null) {
            l1.b.b("%s : unable to authenticate: authenticator destroyed", "OneDTAuthenticator");
            a("Unable to authenticate: authenticator destroyed");
            return;
        }
        if (!this.f61429j && !this.f61431l.get()) {
            if (this.f61430k) {
                this.f61423d.a();
            }
        } else {
            Object[] objArr2 = {"OneDTAuthenticator"};
            l1.a aVar4 = l1.b.f73620b.f73621a;
            if (aVar4 != null) {
                aVar4.i("%s : will try to authenticate with Ignite if didn't done yet", objArr2);
            }
            this.f61421b.b();
        }
    }

    @Override // f1.f, f1.a
    public final void c(ComponentName componentName, IBinder iBinder) {
        j1.a aVar;
        boolean zJ = this.f61421b.j();
        if (!zJ && (aVar = this.f61422c) != null) {
            aVar.onOdtUnsupported();
        }
        if (this.f61423d != null && this.f61421b.j() && this.f61430k) {
            this.f61423d.a();
        }
        if (zJ || this.f61429j) {
            super.c(componentName, iBinder);
        }
    }

    @Override // f1.f, f1.a
    public final void c(String str) {
        super.c(str);
        if (this.f61421b.h() && this.f61431l.get() && this.f61421b.j()) {
            this.f61431l.set(false);
            m();
        }
    }

    @Override // f1.f, f1.a
    public final String d() {
        a aVar = this.f61421b;
        if (aVar instanceof f) {
            return aVar.d();
        }
        return null;
    }

    @Override // f1.f, f1.a
    public final void destroy() {
        this.f61424e = null;
        d1.d dVar = this.f61423d;
        if (dVar != null) {
            com.digitalturbine.ignite.authenticator.receiver.a aVar = dVar.f59547a;
            if (aVar != null && aVar.f14950b) {
                dVar.f59548b.unregisterReceiver(aVar);
                dVar.f59547a.f14950b = false;
            }
            com.digitalturbine.ignite.authenticator.receiver.a aVar2 = dVar.f59547a;
            if (aVar2 != null) {
                aVar2.f14949a = null;
                dVar.f59547a = null;
            }
            dVar.f59549c = null;
            dVar.f59548b = null;
            dVar.f59550d = null;
            this.f61423d = null;
        }
        i1.a aVar3 = this.f61428i;
        if (aVar3 != null) {
            e1.b bVar = aVar3.f63686b;
            if (bVar != null) {
                bVar.f60024c.clear();
                aVar3.f63686b = null;
            }
            aVar3.f63687c = null;
            aVar3.f63685a = null;
            this.f61428i = null;
        }
        this.f61422c = null;
        this.f61421b.destroy();
    }

    @Override // f1.f, f1.a
    public final String i() {
        a aVar = this.f61421b;
        if (aVar instanceof f) {
            return aVar.i();
        }
        return null;
    }

    @Override // f1.f, f1.a
    public final boolean j() {
        return this.f61421b.j();
    }

    @Override // f1.f, f1.a
    public final void l() {
        b();
    }

    public final void m() {
        IIgniteServiceAPI iIgniteServiceAPIK = this.f61421b.k();
        if (iIgniteServiceAPIK == null) {
            l1.b.b("%s : service is unavailable", "OneDTAuthenticator");
            h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_UNAVAILABLE.a());
            return;
        }
        if (this.f61428i == null) {
            this.f61428i = new i1.a(iIgniteServiceAPIK, this);
        }
        if (TextUtils.isEmpty(this.f61421b.e())) {
            h1.b.b(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, "error_code", com.digitalturbine.ignite.authenticator.events.c.IGNITE_SERVICE_INVALID_SESSION.a());
            l1.b.b("%s : service session is unavailable", "OneDTAuthenticator");
            return;
        }
        i1.a aVar = this.f61428i;
        String strE = this.f61421b.e();
        aVar.getClass();
        try {
            Bundle bundle = new Bundle();
            bundle.putString("clientToken", strE);
            aVar.f63687c.getProperty("onedtid", bundle, new Bundle(), aVar.f63686b);
        } catch (RemoteException e10) {
            h1.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_REQUEST_ERROR, e10);
            l1.b.b("%s : request failed : %s", "OneDTPropertyHandler", e10.toString());
        }
    }
}
