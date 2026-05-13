package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f20257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f20259f;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f20256c = (String) k0.i(parcel.readString());
        this.f20257d = parcel.readString();
        this.f20258e = parcel.readInt();
        this.f20259f = (byte[]) k0.i(parcel.createByteArray());
    }

    public ApicFrame(String str, @Nullable String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f20256c = str;
        this.f20257d = str2;
        this.f20258e = i10;
        this.f20259f = bArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.f20258e == apicFrame.f20258e && k0.c(this.f20256c, apicFrame.f20256c) && k0.c(this.f20257d, apicFrame.f20257d) && Arrays.equals(this.f20259f, apicFrame.f20259f);
    }

    public int hashCode() {
        int i10 = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20258e) * 31;
        String str = this.f20256c;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20257d;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f20259f);
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame
    public String toString() {
        return this.f20279b + ": mimeType=" + this.f20256c + ", description=" + this.f20257d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20256c);
        parcel.writeString(this.f20257d);
        parcel.writeInt(this.f20258e);
        parcel.writeByteArray(this.f20259f);
    }
}
