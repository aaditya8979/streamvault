package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import s7.m0;

/* JADX INFO: loaded from: classes4.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f21925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Id3Frame[] f21926g;

    public class a implements Parcelable.Creator<ChapterTocFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ChapterTocFrame[] newArray(int i10) {
            return new ChapterTocFrame[i10];
        }
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f21922c = (String) m0.j(parcel.readString());
        this.f21923d = parcel.readByte() != 0;
        this.f21924e = parcel.readByte() != 0;
        this.f21925f = (String[]) m0.j(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f21926g = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f21926g[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f21922c = str;
        this.f21923d = z10;
        this.f21924e = z11;
        this.f21925f = strArr;
        this.f21926g = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f21923d == chapterTocFrame.f21923d && this.f21924e == chapterTocFrame.f21924e && m0.c(this.f21922c, chapterTocFrame.f21922c) && Arrays.equals(this.f21925f, chapterTocFrame.f21925f) && Arrays.equals(this.f21926g, chapterTocFrame.f21926g);
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f21923d ? 1 : 0)) * 31) + (this.f21924e ? 1 : 0)) * 31;
        String str = this.f21922c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f21922c);
        parcel.writeByte(this.f21923d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f21924e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f21925f);
        parcel.writeInt(this.f21926g.length);
        for (Id3Frame id3Frame : this.f21926g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
