package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes9.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20282e;

    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i10) {
            return new InternalFrame[i10];
        }
    }

    public InternalFrame(Parcel parcel) {
        super("----");
        this.f20280c = (String) k0.i(parcel.readString());
        this.f20281d = (String) k0.i(parcel.readString());
        this.f20282e = (String) k0.i(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f20280c = str;
        this.f20281d = str2;
        this.f20282e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return k0.c(this.f20281d, internalFrame.f20281d) && k0.c(this.f20280c, internalFrame.f20280c) && k0.c(this.f20282e, internalFrame.f20282e);
    }

    public int hashCode() {
        String str = this.f20280c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20281d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20282e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame
    public String toString() {
        return this.f20279b + ": domain=" + this.f20280c + ", description=" + this.f20281d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20279b);
        parcel.writeString(this.f20280c);
        parcel.writeString(this.f20282e);
    }
}
