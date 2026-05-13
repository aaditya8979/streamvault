package da;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
/* JADX INFO: loaded from: classes11.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: da.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
    public static abstract class AbstractBinderC0729a extends Binder implements a {

        /* JADX INFO: renamed from: da.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
        public static class C0730a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f59735b;

            public C0730a(IBinder iBinder) {
                this.f59735b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59735b;
            }

            @Override // da.a
            public void b(MessageSnapshot messageSnapshot) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                    b.d(parcelObtain, messageSnapshot, 0);
                    this.f59735b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0729a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
        }

        public static a c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0730a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCCallback");
                return true;
            }
            if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            b((MessageSnapshot) b.c(parcel, MessageSnapshot.CREATOR));
            return true;
        }
    }

    /* JADX INFO: compiled from: IFileDownloadIPCCallback.java */
    public static class b {
        public static <T> T c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void d(Parcel parcel, T t10, int i10) {
            if (t10 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t10.writeToParcel(parcel, i10);
            }
        }
    }

    void b(MessageSnapshot messageSnapshot) throws RemoteException;
}
