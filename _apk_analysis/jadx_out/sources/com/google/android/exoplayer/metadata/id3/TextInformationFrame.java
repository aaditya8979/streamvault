package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes12.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20291d;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    }

    public TextInformationFrame(Parcel parcel) {
        super((String) k0.i(parcel.readString()));
        this.f20290c = parcel.readString();
        this.f20291d = (String) k0.i(parcel.readString());
    }

    public TextInformationFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f20290c = str2;
        this.f20291d = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return this.f20279b.equals(textInformationFrame.f20279b) && k0.c(this.f20290c, textInformationFrame.f20290c) && k0.c(this.f20291d, textInformationFrame.f20291d);
    }

    public int hashCode() {
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20279b.hashCode()) * 31;
        String str = this.f20290c;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20291d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame
    public String toString() {
        return this.f20279b + ": description=" + this.f20290c + ": value=" + this.f20291d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20279b);
        parcel.writeString(this.f20290c);
        parcel.writeString(this.f20291d);
    }
}
