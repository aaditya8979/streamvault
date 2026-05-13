package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes6.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20274e;

    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i10) {
            return new CommentFrame[i10];
        }
    }

    public CommentFrame(Parcel parcel) {
        super("COMM");
        this.f20272c = (String) k0.i(parcel.readString());
        this.f20273d = (String) k0.i(parcel.readString());
        this.f20274e = (String) k0.i(parcel.readString());
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f20272c = str;
        this.f20273d = str2;
        this.f20274e = str3;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return k0.c(this.f20273d, commentFrame.f20273d) && k0.c(this.f20272c, commentFrame.f20272c) && k0.c(this.f20274e, commentFrame.f20274e);
    }

    public int hashCode() {
        String str = this.f20272c;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f20273d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f20274e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame
    public String toString() {
        return this.f20279b + ": language=" + this.f20272c + ", description=" + this.f20273d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20279b);
        parcel.writeString(this.f20272c);
        parcel.writeString(this.f20274e);
    }
}
