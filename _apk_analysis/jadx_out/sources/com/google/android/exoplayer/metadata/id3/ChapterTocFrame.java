package com.google.android.exoplayer.metadata.id3;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f20267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f20270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Id3Frame[] f20271g;

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
        this.f20267c = (String) k0.i(parcel.readString());
        this.f20268d = parcel.readByte() != 0;
        this.f20269e = parcel.readByte() != 0;
        this.f20270f = (String[]) k0.i(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f20271g = new Id3Frame[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20271g[i11] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z10, boolean z11, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f20267c = str;
        this.f20268d = z10;
        this.f20269e = z11;
        this.f20270f = strArr;
        this.f20271g = id3FrameArr;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.f20268d == chapterTocFrame.f20268d && this.f20269e == chapterTocFrame.f20269e && k0.c(this.f20267c, chapterTocFrame.f20267c) && Arrays.equals(this.f20270f, chapterTocFrame.f20270f) && Arrays.equals(this.f20271g, chapterTocFrame.f20271g);
    }

    public int hashCode() {
        int i10 = (((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (this.f20268d ? 1 : 0)) * 31) + (this.f20269e ? 1 : 0)) * 31;
        String str = this.f20267c;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20267c);
        parcel.writeByte(this.f20268d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f20269e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f20270f);
        parcel.writeInt(this.f20271g.length);
        for (Id3Frame id3Frame : this.f20271g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
