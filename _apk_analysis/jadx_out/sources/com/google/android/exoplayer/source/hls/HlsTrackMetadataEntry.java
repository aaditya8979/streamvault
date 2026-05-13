package com.google.android.exoplayer.source.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.metadata.Metadata;
import com.ironsource.C3978d4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f20537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<VariantInfo> f20539d;

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f20541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f20542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f20543e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final String f20544f;

        public class a implements Parcelable.Creator<VariantInfo> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public VariantInfo createFromParcel(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public VariantInfo[] newArray(int i10) {
                return new VariantInfo[i10];
            }
        }

        public VariantInfo(long j10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f20540b = j10;
            this.f20541c = str;
            this.f20542d = str2;
            this.f20543e = str3;
            this.f20544f = str4;
        }

        public VariantInfo(Parcel parcel) {
            this.f20540b = parcel.readLong();
            this.f20541c = parcel.readString();
            this.f20542d = parcel.readString();
            this.f20543e = parcel.readString();
            this.f20544f = parcel.readString();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || VariantInfo.class != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.f20540b == variantInfo.f20540b && TextUtils.equals(this.f20541c, variantInfo.f20541c) && TextUtils.equals(this.f20542d, variantInfo.f20542d) && TextUtils.equals(this.f20543e, variantInfo.f20543e) && TextUtils.equals(this.f20544f, variantInfo.f20544f);
        }

        public int hashCode() {
            long j10 = this.f20540b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            String str = this.f20541c;
            int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f20542d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f20543e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f20544f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f20540b);
            parcel.writeString(this.f20541c);
            parcel.writeString(this.f20542d);
            parcel.writeString(this.f20543e);
            parcel.writeString(this.f20544f);
        }
    }

    public class a implements Parcelable.Creator<HlsTrackMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HlsTrackMetadataEntry[] newArray(int i10) {
            return new HlsTrackMetadataEntry[i10];
        }
    }

    public HlsTrackMetadataEntry(Parcel parcel) {
        this.f20537b = parcel.readString();
        this.f20538c = parcel.readString();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.f20539d = Collections.unmodifiableList(arrayList);
    }

    public HlsTrackMetadataEntry(@Nullable String str, @Nullable String str2, List<VariantInfo> list) {
        this.f20537b = str;
        this.f20538c = str2;
        this.f20539d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HlsTrackMetadataEntry.class != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.f20537b, hlsTrackMetadataEntry.f20537b) && TextUtils.equals(this.f20538c, hlsTrackMetadataEntry.f20538c) && this.f20539d.equals(hlsTrackMetadataEntry.f20539d);
    }

    public int hashCode() {
        String str = this.f20537b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f20538c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f20539d.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f20537b != null) {
            str = " [" + this.f20537b + ", " + this.f20538c + C3978d4.j.f31385e;
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f20537b);
        parcel.writeString(this.f20538c);
        int size = this.f20539d.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable(this.f20539d.get(i11), 0);
        }
    }
}
