package org.fourthline.cling.android;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import br.c;
import br.d;
import yr.g;

/* JADX INFO: loaded from: classes.dex */
public class AndroidUpnpServiceImpl extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public br.b f76823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f76824c = new b();

    public class a extends d {
        public a(c cVar, g... gVarArr) {
            super(cVar, gVarArr);
        }

        @Override // br.d
        public is.a h(vr.a aVar, yr.c cVar) {
            return AndroidUpnpServiceImpl.this.b(getConfiguration(), aVar, AndroidUpnpServiceImpl.this);
        }

        @Override // br.d, br.b
        public synchronized void shutdown() {
            ((cr.b) c()).v();
            super.i(true);
        }
    }

    public class b extends Binder implements cr.c {
        public b() {
        }

        public br.b get() {
            return AndroidUpnpServiceImpl.this.f76823b;
        }

        public yr.c getRegistry() {
            return AndroidUpnpServiceImpl.this.f76823b.getRegistry();
        }
    }

    public c a() {
        return new cr.d();
    }

    public cr.b b(c cVar, vr.a aVar, Context context) {
        return new cr.b(cVar, aVar, context);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f76824c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f76823b = new a(a(), new g[0]);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f76823b.shutdown();
        super.onDestroy();
    }
}
