package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f21909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f21910d;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i10) {
            return new IcyInfo[i10];
        }
    }

    public IcyInfo(Parcel parcel) {
        this.f21908b = (byte[]) s7.a.e(parcel.createByteArray());
        this.f21909c = parcel.readString();
        this.f21910d = parcel.readString();
    }

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.f21908b = bArr;
        this.f21909c = str;
        this.f21910d = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void a(q.b bVar) {
        String str = this.f21909c;
        if (str != null) {
            bVar.i0(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21908b, ((IcyInfo) obj).f21908b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f21908b);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f21909c, this.f21910d, Integer.valueOf(this.f21908b.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f21908b);
        parcel.writeString(this.f21909c);
        parcel.writeString(this.f21910d);
    }
}
