package da;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import da.a;

/* JADX INFO: compiled from: IFileDownloadIPCService.java */
/* JADX INFO: loaded from: classes10.dex */
public interface b extends IInterface {

    /* JADX INFO: compiled from: IFileDownloadIPCService.java */
    public static abstract class a extends Binder implements b {

        /* JADX INFO: renamed from: da.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IFileDownloadIPCService.java */
        public static class C0731a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public IBinder f59736b;

            public C0731a(IBinder iBinder) {
                this.f59736b = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f59736b;
            }

            @Override // da.b
            public boolean q(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i10);
                    this.f59736b.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // da.b
            public void r(boolean z10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    this.f59736b.transact(13, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // da.b
            public byte s(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeInt(i10);
                    this.f59736b.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readByte();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // da.b
            public void t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    int i13 = 1;
                    parcelObtain.writeInt(z10 ? 1 : 0);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(z11 ? 1 : 0);
                    C0732b.d(parcelObtain, fileDownloadHeader, 0);
                    if (!z12) {
                        i13 = 0;
                    }
                    parcelObtain.writeInt(i13);
                    this.f59736b.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // da.b
            public void w(da.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f59736b.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // da.b
            public void x(da.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    parcelObtain.writeStrongInterface(aVar);
                    this.f59736b.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // da.b
            public void y() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                    this.f59736b.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.liulishuo.filedownloader.i.IFileDownloadIPCService");
        }

        public static b f(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0731a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("com.liulishuo.filedownloader.i.IFileDownloadIPCService");
                return true;
            }
            switch (i10) {
                case 1:
                    x(a.AbstractBinderC0729a.c(parcel.readStrongBinder()));
                    return true;
                case 2:
                    w(a.AbstractBinderC0729a.c(parcel.readStrongBinder()));
                    return true;
                case 3:
                    boolean z10 = z(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                case 4:
                    t(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, (FileDownloadHeader) C0732b.c(parcel, FileDownloadHeader.CREATOR), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    boolean zQ = q(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zQ ? 1 : 0);
                    return true;
                case 6:
                    y();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    boolean zB = B(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zB ? 1 : 0);
                    return true;
                case 8:
                    long jD = D(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jD);
                    return true;
                case 9:
                    long jV = v(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(jV);
                    return true;
                case 10:
                    byte bS = s(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeByte(bS);
                    return true;
                case 11:
                    boolean zP = p();
                    parcel2.writeNoException();
                    parcel2.writeInt(zP ? 1 : 0);
                    return true;
                case 12:
                    A(parcel.readInt(), (Notification) C0732b.c(parcel, Notification.CREATOR));
                    return true;
                case 13:
                    r(parcel.readInt() != 0);
                    return true;
                case 14:
                    boolean zC = C(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zC ? 1 : 0);
                    return true;
                case 15:
                    u();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    /* JADX INFO: renamed from: da.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IFileDownloadIPCService.java */
    public static class C0732b {
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

    void A(int i10, Notification notification) throws RemoteException;

    boolean B(int i10) throws RemoteException;

    boolean C(int i10) throws RemoteException;

    long D(int i10) throws RemoteException;

    boolean p() throws RemoteException;

    boolean q(int i10) throws RemoteException;

    void r(boolean z10) throws RemoteException;

    byte s(int i10) throws RemoteException;

    void t(String str, String str2, boolean z10, int i10, int i11, int i12, boolean z11, FileDownloadHeader fileDownloadHeader, boolean z12) throws RemoteException;

    void u() throws RemoteException;

    long v(int i10) throws RemoteException;

    void w(da.a aVar) throws RemoteException;

    void x(da.a aVar) throws RemoteException;

    void y() throws RemoteException;

    boolean z(String str, String str2) throws RemoteException;
}
