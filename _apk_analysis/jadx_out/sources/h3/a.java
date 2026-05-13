package h3;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: IReceiverService.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: h3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IReceiverService.java */
    public static abstract class AbstractBinderC0775a extends Binder implements a {

        /* JADX INFO: renamed from: h3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IReceiverService.java */
        public static class C0776a implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static a f62971c;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f62972b;

            public C0776a(IBinder iBinder) {
                this.f62972b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f62972b;
            }

            @Override // h3.a
            public int e(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f62972b.transact(1, parcelObtain, parcelObtain2, 0) && AbstractBinderC0775a.d() != null) {
                        return AbstractBinderC0775a.d().e(bundle);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0776a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a d() {
            return C0776a.f62971c;
        }
    }

    int e(Bundle bundle) throws RemoteException;
}
