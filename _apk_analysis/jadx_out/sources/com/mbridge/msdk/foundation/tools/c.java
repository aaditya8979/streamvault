package com.mbridge.msdk.foundation.tools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: AdvertisingIdClient.java */
/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f38053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f38054b;

        public b(String str, boolean z10) {
            this.f38053a = str;
            this.f38054b = z10;
        }

        public String a() {
            return this.f38053a;
        }

        public boolean b() {
            return this.f38054b;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class ServiceConnectionC0452c implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedBlockingQueue<IBinder> f38056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38057b;

        private ServiceConnectionC0452c() {
            this.f38056a = new LinkedBlockingQueue<>(1);
            this.f38057b = false;
        }

        public IBinder a() throws InterruptedException {
            if (this.f38057b) {
                throw new IllegalStateException();
            }
            this.f38057b = true;
            return this.f38056a.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f38056a.put(iBinder);
            } catch (InterruptedException e10) {
                q0.b("AdvertisingIdClient", e10.getMessage());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: compiled from: AdvertisingIdClient.java */
    public final class d implements IInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBinder f38059a;

        public d(IBinder iBinder) {
            this.f38059a = iBinder;
        }

        public boolean a(boolean z10) throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z10 ? 1 : 0);
                this.f38059a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                z = parcelObtain2.readInt() != 0;
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return z;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f38059a;
        }

        public String getId() throws RemoteException {
            String string;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f38059a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                string = parcelObtain2.readString();
            } catch (Throwable th2) {
                try {
                    q0.b("AdvertisingIdClient", th2.getMessage());
                    string = null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
            return string;
        }
    }

    public b a(Context context) throws Exception {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC0452c serviceConnectionC0452c = new ServiceConnectionC0452c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (!context.bindService(intent, serviceConnectionC0452c, 1)) {
                throw new IOException("Google Play connection failed");
            }
            try {
                try {
                    d dVar = new d(serviceConnectionC0452c.a());
                    return new b(dVar.getId(), dVar.a(true));
                } catch (Exception e10) {
                    throw e10;
                }
            } finally {
                context.unbindService(serviceConnectionC0452c);
            }
        } catch (Exception e11) {
            throw e11;
        }
    }
}
