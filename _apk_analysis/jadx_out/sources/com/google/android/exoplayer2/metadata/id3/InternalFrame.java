package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import s7.m0;

/* JADX INFO: loaded from: classes12.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f21937e;

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
        this.f21935c = (String) m0.j(parcel.readString());
        this.f21936d = (String) m0.j(parcel.readString());
        this.f21937e = (String) m0.j(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f21935c = str;
        this.f21936d = str2;
        this.f21937e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return m0.c(this.f21936d, internalFrame.f21936d) && m0.c(this.f21935c, internalFrame.f21935c) && m0.c(this.f21937e, internalFrame.f21937e);
    }

    public int hashCode() {
        String str = this.f21935c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21936d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f21937e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f21934b + ": domain=" + this.f21935c + ", description=" + this.f21936d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21934b);
        parcel.writeString(this.f21935c);
        parcel.writeString(this.f21937e);
    }
}
