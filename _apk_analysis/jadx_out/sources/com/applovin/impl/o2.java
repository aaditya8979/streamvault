package com.applovin.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f9388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f9389b;

    public static class a implements ServiceConnection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f9390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f9391b;

        public a(com.applovin.impl.sdk.o oVar, s4 s4Var) {
            this.f9390a = oVar;
            this.f9391b = s4Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            try {
                com.applovin.impl.sdk.k.o().unbindService(this);
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9390a.d("LicenseVerificationManager", "Failed to unbind license service", e10);
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9390a.a("LicenseVerificationManager", "License service connected: " + componentName);
            }
            int iNextInt = new SecureRandom().nextInt();
            b bVar = new b(this.f9390a, this.f9391b, iNextInt, new Runnable() { // from class: com.applovin.impl.vc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10556b.a();
                }
            });
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                parcelObtain.writeLong(iNextInt);
                parcelObtain.writeString(com.applovin.impl.sdk.k.o().getPackageName());
                parcelObtain.writeStrongBinder(bVar);
                if (iBinder.transact(1, parcelObtain, null, 1)) {
                } else {
                    throw new RemoteException("transact() returned false");
                }
            } catch (Exception e10) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9390a.a("LicenseVerificationManager", "Failed to check license", e10);
                }
                a();
                this.f9391b.a((Object) e10);
            } finally {
                parcelObtain.recycle();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IllegalStateException illegalStateException = new IllegalStateException("License service disconnected");
            if (com.applovin.impl.sdk.o.a()) {
                this.f9390a.k("LicenseVerificationManager", illegalStateException.getMessage());
            }
            this.f9391b.a((Object) illegalStateException);
        }
    }

    public static final class b extends Binder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.o f9392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final s4 f9393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f9395d;

        public b(com.applovin.impl.sdk.o oVar, s4 s4Var, int i10, Runnable runnable) {
            this.f9392a = oVar;
            this.f9393b = s4Var;
            this.f9394c = i10;
            this.f9395d = runnable;
        }

        @Override // android.os.Binder, android.os.IBinder
        public String getInterfaceDescriptor() {
            return "com.android.vending.licensing.ILicenseResultListener";
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            try {
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                int i12 = parcel.readInt();
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9392a.a("LicenseVerificationManager", "Verified with code " + i12);
                }
                this.f9393b.b(p2.a().b(string).a(string2).b(i12).a(this.f9394c).a());
                if (parcel2 != null) {
                    parcel2.writeNoException();
                }
                return true;
            } catch (Throwable th2) {
                try {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f9392a.a("LicenseVerificationManager", "Exception handling verifyLicense callback", th2);
                    }
                    this.f9393b.a((Object) new Exception(th2));
                    this.f9395d.run();
                    return false;
                } finally {
                    this.f9395d.run();
                }
            }
        }
    }

    public o2(com.applovin.impl.sdk.k kVar) {
        this.f9388a = kVar;
        this.f9389b = kVar.O();
    }

    public s4 a(long j10) {
        s4 s4Var = new s4("verify_license");
        if (j10 > 0) {
            i6.a(j10, s4Var, new Exception("License Verification Timed Out"), "verify_license_timeout", this.f9388a);
        }
        try {
            if (!com.applovin.impl.sdk.k.o().bindService(new Intent("com.android.vending.licensing.ILicensingService").setPackage("com.android.vending"), new a(this.f9389b, s4Var), 1)) {
                Exception exc = new Exception("Failed to bind to license service");
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9389b.k("LicenseVerificationManager", exc.getMessage());
                }
                s4Var.a((Object) exc);
            }
        } catch (Exception e10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9389b.a("LicenseVerificationManager", "Failed to verify license", e10);
            }
            s4Var.a((Object) e10);
        }
        return s4Var;
    }
}
