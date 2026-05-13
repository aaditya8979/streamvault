package v7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import d4.b;
import d4.c;

/* JADX INFO: compiled from: IGetInstallReferrerService.java */
/* JADX INFO: loaded from: classes9.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: v7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IGetInstallReferrerService.java */
    public static abstract class AbstractBinderC1076a extends b implements a {

        /* JADX INFO: renamed from: v7.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IGetInstallReferrerService.java */
        public static class C1077a extends d4.a implements a {
            public C1077a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // v7.a
            public final Bundle a(Bundle bundle) throws RemoteException {
                Parcel parcelC = c();
                c.b(parcelC, bundle);
                Parcel parcelD = d(parcelC);
                Bundle bundle2 = (Bundle) c.a(parcelD, Bundle.CREATOR);
                parcelD.recycle();
                return bundle2;
            }
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C1077a(iBinder);
        }
    }

    Bundle a(Bundle bundle) throws RemoteException;
}
