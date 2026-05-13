package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class hq1 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<hq1> CREATOR = new gq1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f90485c;

    public hq1(ArrayList arrayList, Map map) {
        this.f90484b = arrayList;
        this.f90485c = map;
    }

    public final List c() {
        return this.f90484b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f90484b;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((qq1) it.next()).writeToParcel(parcel, i10);
        }
        Map map = this.f90485c;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
