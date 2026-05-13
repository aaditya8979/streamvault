package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import s7.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f21947c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f21948d;

    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i10) {
            return new UrlLinkFrame[i10];
        }
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) m0.j(parcel.readString()));
        this.f21947c = parcel.readString();
        this.f21948d = (String) m0.j(parcel.readString());
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f21947c = str2;
        this.f21948d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f21934b.equals(urlLinkFrame.f21934b) && m0.c(this.f21947c, urlLinkFrame.f21947c) && m0.c(this.f21948d, urlLinkFrame.f21948d);
    }

    public int hashCode() {
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21934b.hashCode()) * 31;
        String str = this.f21947c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f21948d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f21934b + ": url=" + this.f21948d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21934b);
        parcel.writeString(this.f21947c);
        parcel.writeString(this.f21948d);
    }
}
