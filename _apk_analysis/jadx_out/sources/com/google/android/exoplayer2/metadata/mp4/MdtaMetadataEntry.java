package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f21950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21952e;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i10) {
            return new MdtaMetadataEntry[i10];
        }
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f21949b = (String) m0.j(parcel.readString());
        this.f21950c = (byte[]) m0.j(parcel.createByteArray());
        this.f21951d = parcel.readInt();
        this.f21952e = parcel.readInt();
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i10, int i11) {
        this.f21949b = str;
        this.f21950c = bArr;
        this.f21951d = i10;
        this.f21952e = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f21949b.equals(mdtaMetadataEntry.f21949b) && Arrays.equals(this.f21950c, mdtaMetadataEntry.f21950c) && this.f21951d == mdtaMetadataEntry.f21951d && this.f21952e == mdtaMetadataEntry.f21952e;
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21949b.hashCode()) * 31) + Arrays.hashCode(this.f21950c)) * 31) + this.f21951d) * 31) + this.f21952e;
    }

    public String toString() {
        return "mdta: key=" + this.f21949b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21949b);
        parcel.writeByteArray(this.f21950c);
        parcel.writeInt(this.f21951d);
        parcel.writeInt(this.f21952e);
    }
}
