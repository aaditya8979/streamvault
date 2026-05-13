package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ts1 implements Parcelable {
    public static final Parcelable.Creator<ts1> CREATOR = new rs1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1[] f95344b;

    public ts1(Parcel parcel) {
        this.f95344b = new ss1[parcel.readInt()];
        int i10 = 0;
        while (true) {
            ss1[] ss1VarArr = this.f95344b;
            if (i10 >= ss1VarArr.length) {
                return;
            }
            ss1VarArr[i10] = (ss1) parcel.readParcelable(ss1.class.getClassLoader());
            i10++;
        }
    }

    public ts1(List list) {
        this.f95344b = (ss1[]) list.toArray(new ss1[0]);
    }

    public ts1(ss1... ss1VarArr) {
        this.f95344b = ss1VarArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ts1.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f95344b, ((ts1) obj).f95344b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f95344b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f95344b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f95344b.length);
        for (ss1 ss1Var : this.f95344b) {
            parcel.writeParcelable(ss1Var, 0);
        }
    }
}
