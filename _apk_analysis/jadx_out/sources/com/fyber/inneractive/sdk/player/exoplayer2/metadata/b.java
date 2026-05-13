package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o[] f18412a;

    public b(Parcel parcel) {
        this.f18412a = new o[parcel.readInt()];
        int i10 = 0;
        while (true) {
            o[] oVarArr = this.f18412a;
            if (i10 >= oVarArr.length) {
                return;
            }
            oVarArr[i10] = (o) parcel.readParcelable(o.class.getClassLoader());
            i10++;
        }
    }

    public b(ArrayList arrayList) {
        o[] oVarArr = new o[arrayList.size()];
        this.f18412a = oVarArr;
        arrayList.toArray(oVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f18412a, ((b) obj).f18412a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18412a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f18412a.length);
        for (o oVar : this.f18412a) {
            parcel.writeParcelable(oVar, 0);
        }
    }
}
