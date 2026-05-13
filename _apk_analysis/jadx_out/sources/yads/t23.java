package yads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class t23 extends j23 {
    public static final Parcelable.Creator<t23> CREATOR = new q23();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f95052b;

    public t23(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(s23.a(parcel));
        }
        this.f95052b = Collections.unmodifiableList(arrayList);
    }

    public t23(ArrayList arrayList) {
        this.f95052b = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.f95052b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            s23 s23Var = (s23) this.f95052b.get(i11);
            parcel.writeLong(s23Var.f94682a);
            parcel.writeByte(s23Var.f94683b ? (byte) 1 : (byte) 0);
            parcel.writeByte(s23Var.f94684c ? (byte) 1 : (byte) 0);
            parcel.writeByte(s23Var.f94685d ? (byte) 1 : (byte) 0);
            int size2 = s23Var.f94687f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                r23 r23Var = (r23) s23Var.f94687f.get(i12);
                parcel.writeInt(r23Var.f94264a);
                parcel.writeLong(r23Var.f94265b);
            }
            parcel.writeLong(s23Var.f94686e);
            parcel.writeByte(s23Var.f94688g ? (byte) 1 : (byte) 0);
            parcel.writeLong(s23Var.f94689h);
            parcel.writeInt(s23Var.f94690i);
            parcel.writeInt(s23Var.f94691j);
            parcel.writeInt(s23Var.f94692k);
        }
    }
}
