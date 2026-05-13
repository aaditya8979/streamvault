package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes11.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21916c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21917d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21918e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f21919f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21920g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Id3Frame[] f21921h;

    public class a implements Parcelable.Creator<ChapterFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterFrame[] newArray(int i10) {
            return new ChapterFrame[i10];
        }
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f21916c = (String) m0.j(parcel.readString());
        this.f21917d = parcel.readInt();
        this.f21918e = parcel.readInt();
        this.f21919f = parcel.readLong();
        this.f21920g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f21921h = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21921h[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f21916c = str;
        this.f21917d = i10;
        this.f21918e = i11;
        this.f21919f = j10;
        this.f21920g = j11;
        this.f21921h = id3FrameArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.f21917d == chapterFrame.f21917d && this.f21918e == chapterFrame.f21918e && this.f21919f == chapterFrame.f21919f && this.f21920g == chapterFrame.f21920g && m0.c(this.f21916c, chapterFrame.f21916c) && Arrays.equals(this.f21921h, chapterFrame.f21921h);
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f21917d) * 31) + this.f21918e) * 31) + ((int) this.f21919f)) * 31) + ((int) this.f21920g)) * 31;
        String str = this.f21916c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21916c);
        parcel.writeInt(this.f21917d);
        parcel.writeInt(this.f21918e);
        parcel.writeLong(this.f21919f);
        parcel.writeLong(this.f21920g);
        parcel.writeInt(this.f21921h.length);
        for (Id3Frame id3Frame : this.f21921h) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
