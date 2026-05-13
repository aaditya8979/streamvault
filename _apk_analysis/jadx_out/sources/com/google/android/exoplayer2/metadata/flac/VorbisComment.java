package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.q;
import com.ironsource.mediationsdk.logger.IronSourceError;
import s7.m0;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21901c;

    public class a implements Parcelable.Creator<VorbisComment> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public VorbisComment[] newArray(int i10) {
            return new VorbisComment[i10];
        }
    }

    public VorbisComment(Parcel parcel) {
        this.f21900b = (String) m0.j(parcel.readString());
        this.f21901c = (String) m0.j(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
        this.f21900b = str;
        this.f21901c = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void a(q.b bVar) {
        String str = this.f21900b;
        str.hashCode();
        switch (str) {
            case "ALBUM":
                bVar.L(this.f21901c);
                break;
            case "TITLE":
                bVar.i0(this.f21901c);
                break;
            case "DESCRIPTION":
                bVar.S(this.f21901c);
                break;
            case "ALBUMARTIST":
                bVar.K(this.f21901c);
                break;
            case "ARTIST":
                bVar.M(this.f21901c);
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.f21900b.equals(vorbisComment.f21900b) && this.f21901c.equals(vorbisComment.f21901c);
    }

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21900b.hashCode()) * 31) + this.f21901c.hashCode();
    }

    public String toString() {
        return "VC: " + this.f21900b + "=" + this.f21901c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21900b);
        parcel.writeString(this.f21901c);
    }
}
