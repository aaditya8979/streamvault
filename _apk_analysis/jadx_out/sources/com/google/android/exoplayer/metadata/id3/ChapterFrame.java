package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20265g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Id3Frame[] f20266h;

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
        this.f20261c = (String) k0.i(parcel.readString());
        this.f20262d = parcel.readInt();
        this.f20263e = parcel.readInt();
        this.f20264f = parcel.readLong();
        this.f20265g = parcel.readLong();
        int i10 = parcel.readInt();
        this.f20266h = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20266h[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j10, long j11, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f20261c = str;
        this.f20262d = i10;
        this.f20263e = i11;
        this.f20264f = j10;
        this.f20265g = j11;
        this.f20266h = id3FrameArr;
    }

    @Override // com.google.android.exoplayer.metadata.id3.Id3Frame, android.os.Parcelable
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
        return this.f20262d == chapterFrame.f20262d && this.f20263e == chapterFrame.f20263e && this.f20264f == chapterFrame.f20264f && this.f20265g == chapterFrame.f20265g && k0.c(this.f20261c, chapterFrame.f20261c) && Arrays.equals(this.f20266h, chapterFrame.f20266h);
    }

    public int hashCode() {
        int i10 = (((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f20262d) * 31) + this.f20263e) * 31) + ((int) this.f20264f)) * 31) + ((int) this.f20265g)) * 31;
        String str = this.f20261c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20261c);
        parcel.writeInt(this.f20262d);
        parcel.writeInt(this.f20263e);
        parcel.writeLong(this.f20264f);
        parcel.writeLong(this.f20265g);
        parcel.writeInt(this.f20266h.length);
        for (Id3Frame id3Frame : this.f20266h) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
