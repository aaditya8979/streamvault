package d6;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: BundleListRetriever.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends Binder {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f59578c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImmutableList<Bundle> f59579b;

    static {
        f59578c = s7.m0.f79487a >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : 65536;
    }

    public b(List<Bundle> list) {
        this.f59579b = ImmutableList.copyOf((Collection) list);
    }

    public static ImmutableList<Bundle> a(IBinder iBinder) {
        int i10;
        ImmutableList.a aVarBuilder = ImmutableList.builder();
        int i11 = 0;
        int i12 = 1;
        while (i12 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i11);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i10 = parcelObtain2.readInt();
                        if (i10 == 1) {
                            aVarBuilder.a((Bundle) s7.a.e(parcelObtain2.readBundle()));
                            i11++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i12 = i10;
                } catch (RemoteException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th2;
            }
        }
        return aVarBuilder.m();
    }

    @Override // android.os.Binder
    public boolean onTransact(int i10, Parcel parcel, @Nullable Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        if (parcel2 == null) {
            return false;
        }
        int size = this.f59579b.size();
        int i12 = parcel.readInt();
        while (i12 < size && parcel2.dataSize() < f59578c) {
            parcel2.writeInt(1);
            parcel2.writeBundle(this.f59579b.get(i12));
            i12++;
        }
        parcel2.writeInt(i12 < size ? 2 : 0);
        return true;
    }
}
