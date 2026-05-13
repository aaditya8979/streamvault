package f1;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;

/* JADX INFO: loaded from: classes6.dex */
public abstract class f implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f61421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j1.a f61422c;

    public f(a aVar, j1.a aVar2) {
        this.f61421b = aVar;
        this.f61422c = aVar2;
        aVar.a(this);
        aVar.b(this);
    }

    @Override // f1.a
    public final void a(a aVar) {
        this.f61421b.a(aVar);
    }

    @Override // f1.a
    public void a(String str) {
        j1.a aVar = this.f61422c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticationFailed(str);
        }
    }

    @Override // f1.a
    public boolean a() {
        return this.f61421b.a();
    }

    @Override // f1.a
    public void b() {
        this.f61421b.b();
    }

    @Override // f1.a
    public final void b(a aVar) {
        this.f61421b.b(aVar);
    }

    @Override // f1.a
    public void b(String str) {
        j1.a aVar = this.f61422c;
        if (aVar != null) {
            aVar.onIgniteServiceConnectionFailed(str);
        }
    }

    @Override // f1.a
    public void c(ComponentName componentName, IBinder iBinder) {
        j1.a aVar = this.f61422c;
        if (aVar != null) {
            aVar.onIgniteServiceConnected(componentName, iBinder);
        }
    }

    @Override // f1.a
    public void c(String str) {
        j1.a aVar = this.f61422c;
        if (aVar != null) {
            aVar.onIgniteServiceAuthenticated(str);
        }
    }

    @Override // f1.a
    public boolean c() {
        return this.f61421b.c();
    }

    @Override // f1.a
    public String d() {
        return null;
    }

    @Override // f1.a
    public void destroy() {
        this.f61422c = null;
        this.f61421b.destroy();
    }

    @Override // f1.a
    public final String e() {
        return this.f61421b.e();
    }

    @Override // f1.a
    public boolean f() {
        return this.f61421b.f();
    }

    @Override // f1.a
    public Context g() {
        return this.f61421b.g();
    }

    @Override // f1.a
    public boolean h() {
        return this.f61421b.h();
    }

    @Override // f1.a
    public String i() {
        return null;
    }

    @Override // f1.a
    public boolean j() {
        return false;
    }

    @Override // f1.a
    public IIgniteServiceAPI k() {
        return this.f61421b.k();
    }

    @Override // f1.a
    public void l() {
        this.f61421b.l();
    }

    @Override // j1.b
    public void onCredentialsRequestFailed(String str) {
        this.f61421b.onCredentialsRequestFailed(str);
    }

    @Override // j1.b
    public void onCredentialsRequestSuccess(String str, String str2) {
        this.f61421b.onCredentialsRequestSuccess(str, str2);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f61421b.onServiceConnected(componentName, iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.f61421b.onServiceDisconnected(componentName);
    }
}
