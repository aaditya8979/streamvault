package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Comparator, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f17389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17391c;

    public d(Parcel parcel) {
        c[] cVarArr = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f17389a = cVarArr;
        this.f17391c = cVarArr.length;
    }

    public d(boolean z10, c... cVarArr) {
        cVarArr = z10 ? (c[]) cVarArr.clone() : cVarArr;
        Arrays.sort(cVarArr, this);
        for (int i10 = 1; i10 < cVarArr.length; i10++) {
            if (cVarArr[i10 - 1].f17385b.equals(cVarArr[i10].f17385b)) {
                throw new IllegalArgumentException("Duplicate data for uuid: " + cVarArr[i10].f17385b);
            }
        }
        this.f17389a = cVarArr;
        this.f17391c = cVarArr.length;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        UUID uuid = com.fyber.inneractive.sdk.player.exoplayer2.b.f17364b;
        return uuid.equals(cVar.f17385b) ? uuid.equals(cVar2.f17385b) ? 0 : 1 : cVar.f17385b.compareTo(cVar2.f17385b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f17389a, ((d) obj).f17389a);
    }

    public final int hashCode() {
        if (this.f17390b == 0) {
            this.f17390b = Arrays.hashCode(this.f17389a);
        }
        return this.f17390b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedArray(this.f17389a, 0);
    }
}
