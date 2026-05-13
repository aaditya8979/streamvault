package f1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f61408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f61409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f61410h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f61411i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g1.a f61412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IIgniteServiceAPI f61413k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f61417o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f61418p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f61404b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f61405c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f61406d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f61407e = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f61414l = new Bundle();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f61415m = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f61419q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f61420r = new b(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1.a f61416n = new e1.a(this);

    public e(Context context) {
        String str = null;
        this.f61408f = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f61408f;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f61411i = str;
        this.f61412j = new g1.a(false, "");
    }

    @Override // f1.a
    public final void a(a aVar) {
        this.f61418p = aVar;
    }

    @Override // f1.a
    public final void a(String str) {
        l1.b.b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f61405c = false;
        a aVar = this.f61417o;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // f1.a
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f61407e && (iIgniteServiceAPI = this.f61413k) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // f1.a
    public final void b() {
        if (!(!TextUtils.isEmpty(this.f61411i))) {
            l1.b.b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            n1.c.f75011a.execute(this.f61420r);
            return;
        }
        if (!this.f61404b || f()) {
            m();
            return;
        }
        Object[] objArr = {"IgniteAuthenticationComponent"};
        l1.a aVar = l1.b.f73620b.f73621a;
        if (aVar != null) {
            aVar.i("%s : already authenticated", objArr);
        }
    }

    @Override // f1.a
    public final void b(a aVar) {
        this.f61417o = aVar;
    }

    @Override // f1.a
    public final void b(String str) {
        l1.b.b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        a aVar = this.f61418p;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // f1.a
    public final void c(ComponentName componentName, IBinder iBinder) {
        a aVar = this.f61418p;
        if (aVar != null) {
            aVar.c(componentName, iBinder);
        }
    }

    @Override // f1.a
    public final void c(String str) {
        String str2;
        l1.b.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f61405c = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f61419q = str;
        this.f61414l.putString("clientToken", str);
        this.f61404b = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), "UTF-8");
            } catch (Exception e10) {
                l1.b.b("%s : decodeJwtBody : %s", "JwtUtil", e10.toString());
                str2 = "";
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong(ImpressionLog.f51755y);
                this.f61406d = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                l1.b.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e11) {
                h1.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e11);
                l1.b.b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e11.toString());
            }
        }
        a aVar = this.f61417o;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // f1.a
    public final boolean c() {
        return f() || !a();
    }

    @Override // f1.a
    public final String d() {
        return this.f61411i;
    }

    @Override // f1.a
    public final void destroy() {
        if (this.f61408f != null && a()) {
            this.f61408f.unbindService(this);
            this.f61408f = null;
        }
        this.f61418p = null;
        this.f61417o = null;
        this.f61413k = null;
    }

    @Override // f1.a
    public final String e() {
        return this.f61419q;
    }

    @Override // f1.a
    public final boolean f() {
        return this.f61406d > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f61406d;
    }

    @Override // f1.a
    public final Context g() {
        return this.f61408f;
    }

    @Override // f1.a
    public final boolean h() {
        return this.f61404b;
    }

    @Override // f1.a
    public final String i() {
        return this.f61412j.f61882a;
    }

    @Override // f1.a
    public final boolean j() {
        return this.f61412j.f61883b;
    }

    @Override // f1.a
    public final IIgniteServiceAPI k() {
        return this.f61413k;
    }

    @Override // f1.a
    public final void l() {
        b();
    }

    public final void m() {
        if (a()) {
            String str = this.f61409g;
            String str2 = this.f61410h;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f61405c) {
                return;
            }
            if ((f() || !this.f61404b) && this.f61413k != null) {
                try {
                    this.f61405c = true;
                    this.f61414l.putInt("sdkFlowTypeKey", 1);
                    this.f61413k.authenticate(this.f61409g, this.f61410h, this.f61414l, this.f61416n);
                } catch (RemoteException e10) {
                    this.f61405c = false;
                    h1.b.a(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_AUTHENTICATION_ERROR, e10);
                    l1.b.b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e10.toString());
                }
            }
        }
    }

    @Override // j1.b
    public final void onCredentialsRequestFailed(String str) {
        l1.b.b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // j1.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f61409g = str;
        this.f61410h = str2;
        m();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        l1.b.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f61413k = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f61407e = true;
        n1.c.f75011a.execute(new c(this, new d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f61407e = false;
        this.f61406d = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }
}
