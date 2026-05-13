package com.google.android.exoplayer;

import a6.k0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.drm.DrmInitData;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.video.ColorInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.iab.vast.tags.VastAttributes;
import j4.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public final int A;

    @Nullable
    public final String B;
    public final int C;

    @Nullable
    public final Class<? extends i> D;
    public int E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f19919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f19920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f19924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public final Metadata f19925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public final String f19926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final String f19927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f19928k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<byte[]> f19929l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final DrmInitData f19930m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f19931n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f19932o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f19933p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f19934q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19935r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f19936s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f19937t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public final byte[] f19938u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public final ColorInfo f19939v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f19941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f19942y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f19943z;

    public class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Format[] newArray(int i10) {
            return new Format[i10];
        }
    }

    public Format(Parcel parcel) {
        this.f19919b = parcel.readString();
        this.f19920c = parcel.readString();
        this.f19921d = parcel.readInt();
        this.f19922e = parcel.readInt();
        this.f19923f = parcel.readInt();
        this.f19924g = parcel.readString();
        this.f19925h = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f19926i = parcel.readString();
        this.f19927j = parcel.readString();
        this.f19928k = parcel.readInt();
        int i10 = parcel.readInt();
        this.f19929l = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19929l.add(parcel.createByteArray());
        }
        this.f19930m = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f19931n = parcel.readLong();
        this.f19932o = parcel.readInt();
        this.f19933p = parcel.readInt();
        this.f19934q = parcel.readFloat();
        this.f19935r = parcel.readInt();
        this.f19936s = parcel.readFloat();
        this.f19938u = k0.u0(parcel) ? parcel.createByteArray() : null;
        this.f19937t = parcel.readInt();
        this.f19939v = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f19940w = parcel.readInt();
        this.f19941x = parcel.readInt();
        this.f19942y = parcel.readInt();
        this.f19943z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
        this.D = null;
    }

    public Format(@Nullable String str, @Nullable String str2, int i10, int i11, int i12, @Nullable String str3, @Nullable Metadata metadata, @Nullable String str4, @Nullable String str5, int i13, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, long j10, int i14, int i15, float f10, int i16, float f11, @Nullable byte[] bArr, int i17, @Nullable ColorInfo colorInfo, int i18, int i19, int i20, int i21, int i22, @Nullable String str6, int i23, @Nullable Class<? extends i> cls) {
        this.f19919b = str;
        this.f19920c = str2;
        this.f19921d = i10;
        this.f19922e = i11;
        this.f19923f = i12;
        this.f19924g = str3;
        this.f19925h = metadata;
        this.f19926i = str4;
        this.f19927j = str5;
        this.f19928k = i13;
        this.f19929l = list == null ? Collections.emptyList() : list;
        this.f19930m = drmInitData;
        this.f19931n = j10;
        this.f19932o = i14;
        this.f19933p = i15;
        this.f19934q = f10;
        int i24 = i16;
        this.f19935r = i24 == -1 ? 0 : i24;
        this.f19936s = f11 == -1.0f ? 1.0f : f11;
        this.f19938u = bArr;
        this.f19937t = i17;
        this.f19939v = colorInfo;
        this.f19940w = i18;
        this.f19941x = i19;
        this.f19942y = i20;
        int i25 = i21;
        this.f19943z = i25 == -1 ? 0 : i25;
        this.A = i22 != -1 ? i22 : 0;
        this.B = k0.n0(str6);
        this.C = i23;
        this.D = cls;
    }

    public static Format A(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable String str4, @Nullable DrmInitData drmInitData, long j10) {
        return z(str, str2, str3, i10, i11, str4, -1, drmInitData, j10, Collections.emptyList());
    }

    public static Format B(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Metadata metadata, int i10, int i11, int i12, float f10, @Nullable List<byte[]> list, int i13, int i14) {
        return new Format(str, str2, i13, i14, i10, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, i11, i12, f10, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format C(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, float f10, @Nullable List<byte[]> list, int i14, float f11, @Nullable DrmInitData drmInitData) {
        return D(str, str2, str3, i10, i11, i12, i13, f10, list, i14, f11, null, -1, null, drmInitData);
    }

    public static Format D(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, float f10, @Nullable List<byte[]> list, int i14, float f11, @Nullable byte[] bArr, int i15, @Nullable ColorInfo colorInfo, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i10, str3, null, null, str2, i11, list, drmInitData, Long.MAX_VALUE, i12, i13, f10, i14, f11, bArr, i15, colorInfo, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static String G(@Nullable Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(format.f19919b);
        sb2.append(", mimeType=");
        sb2.append(format.f19927j);
        if (format.f19923f != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.f19923f);
        }
        if (format.f19924g != null) {
            sb2.append(", codecs=");
            sb2.append(format.f19924g);
        }
        if (format.f19932o != -1 && format.f19933p != -1) {
            sb2.append(", res=");
            sb2.append(format.f19932o);
            sb2.append(VastAttributes.HORIZONTAL_POSITION);
            sb2.append(format.f19933p);
        }
        if (format.f19934q != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.f19934q);
        }
        if (format.f19940w != -1) {
            sb2.append(", channels=");
            sb2.append(format.f19940w);
        }
        if (format.f19941x != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.f19941x);
        }
        if (format.B != null) {
            sb2.append(", language=");
            sb2.append(format.B);
        }
        if (format.f19920c != null) {
            sb2.append(", label=");
            sb2.append(format.f19920c);
        }
        return sb2.toString();
    }

    public static Format n(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Metadata metadata, int i10, int i11, int i12, @Nullable List<byte[]> list, int i13, int i14, @Nullable String str6) {
        return new Format(str, str2, i13, i14, i10, str5, metadata, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i11, i12, -1, -1, -1, str6, -1, null);
    }

    public static Format o(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i17, @Nullable String str4, @Nullable Metadata metadata) {
        return new Format(str, null, i17, 0, i10, str3, metadata, null, str2, i11, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, str4, -1, null);
    }

    public static Format p(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, int i14, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i15, @Nullable String str4) {
        return o(str, str2, str3, i10, i11, i12, i13, i14, -1, -1, list, drmInitData, i15, str4, null);
    }

    public static Format q(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, int i12, int i13, @Nullable List<byte[]> list, @Nullable DrmInitData drmInitData, int i14, @Nullable String str4) {
        return p(str, str2, str3, i10, i11, i12, i13, -1, list, drmInitData, i14, str4);
    }

    public static Format r(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i10, int i11, int i12, @Nullable String str6) {
        return new Format(str, str2, i11, i12, i10, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1, null);
    }

    public static Format s(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable List<byte[]> list, @Nullable String str4, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, i11, 0, i10, str3, null, null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1, null);
    }

    public static Format t(@Nullable String str, @Nullable String str2, long j10) {
        return new Format(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j10, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format u(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, @Nullable DrmInitData drmInitData) {
        return new Format(str, null, 0, 0, i10, str3, null, null, str2, -1, null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1, null);
    }

    public static Format v(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i10, int i11, int i12, @Nullable String str6) {
        return w(str, str2, str3, str4, str5, i10, i11, i12, str6, -1);
    }

    public static Format w(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, int i10, int i11, int i12, @Nullable String str6, int i13) {
        return new Format(str, str2, i11, i12, i10, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i13, null);
    }

    public static Format x(@Nullable String str, @Nullable String str2, int i10, @Nullable String str3) {
        return y(str, str2, i10, str3, null);
    }

    public static Format y(@Nullable String str, @Nullable String str2, int i10, @Nullable String str3, @Nullable DrmInitData drmInitData) {
        return z(str, str2, null, -1, i10, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format z(@Nullable String str, @Nullable String str2, @Nullable String str3, int i10, int i11, @Nullable String str4, int i12, @Nullable DrmInitData drmInitData, long j10, @Nullable List<byte[]> list) {
        return new Format(str, null, i11, 0, i10, str3, null, null, str2, -1, list, drmInitData, j10, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i12, null);
    }

    public int E() {
        int i10;
        int i11 = this.f19932o;
        if (i11 == -1 || (i10 = this.f19933p) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean F(Format format) {
        if (this.f19929l.size() != format.f19929l.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f19929l.size(); i10++) {
            if (!Arrays.equals(this.f19929l.get(i10), format.f19929l.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public Format b(@Nullable DrmInitData drmInitData, @Nullable Metadata metadata) {
        if (drmInitData == this.f19930m && metadata == this.f19925h) {
            return this;
        }
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, this.f19923f, this.f19924g, metadata, this.f19926i, this.f19927j, this.f19928k, this.f19929l, drmInitData, this.f19931n, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, this.D);
    }

    public Format c(int i10) {
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, i10, this.f19924g, this.f19925h, this.f19926i, this.f19927j, this.f19928k, this.f19929l, this.f19930m, this.f19931n, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, this.D);
    }

    public Format d(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Metadata metadata, int i10, int i11, int i12, int i13, int i14, @Nullable String str5) {
        Metadata metadata2 = this.f19925h;
        return new Format(str, str2, i14, this.f19922e, i10, str4, metadata2 != null ? metadata2.c(metadata) : metadata, this.f19926i, str3, this.f19928k, this.f19929l, this.f19930m, this.f19931n, i11, i12, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, i13, this.f19941x, this.f19942y, this.f19943z, this.A, str5, this.C, this.D);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Format e(@Nullable DrmInitData drmInitData) {
        return b(drmInitData, this.f19925h);
    }

    public boolean equals(@Nullable Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i11 = this.E;
        if (i11 == 0 || (i10 = format.E) == 0 || i11 == i10) {
            return this.f19921d == format.f19921d && this.f19922e == format.f19922e && this.f19923f == format.f19923f && this.f19928k == format.f19928k && this.f19931n == format.f19931n && this.f19932o == format.f19932o && this.f19933p == format.f19933p && this.f19935r == format.f19935r && this.f19937t == format.f19937t && this.f19940w == format.f19940w && this.f19941x == format.f19941x && this.f19942y == format.f19942y && this.f19943z == format.f19943z && this.A == format.A && this.C == format.C && Float.compare(this.f19934q, format.f19934q) == 0 && Float.compare(this.f19936s, format.f19936s) == 0 && k0.c(this.D, format.D) && k0.c(this.f19919b, format.f19919b) && k0.c(this.f19920c, format.f19920c) && k0.c(this.f19924g, format.f19924g) && k0.c(this.f19926i, format.f19926i) && k0.c(this.f19927j, format.f19927j) && k0.c(this.B, format.B) && Arrays.equals(this.f19938u, format.f19938u) && k0.c(this.f19925h, format.f19925h) && k0.c(this.f19939v, format.f19939v) && k0.c(this.f19930m, format.f19930m) && F(format);
        }
        return false;
    }

    public Format f(@Nullable Class<? extends i> cls) {
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, this.f19923f, this.f19924g, this.f19925h, this.f19926i, this.f19927j, this.f19928k, this.f19929l, this.f19930m, this.f19931n, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, cls);
    }

    public Format g(float f10) {
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, this.f19923f, this.f19924g, this.f19925h, this.f19926i, this.f19927j, this.f19928k, this.f19929l, this.f19930m, this.f19931n, this.f19932o, this.f19933p, f10, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, this.D);
    }

    public Format h(int i10, int i11) {
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, this.f19923f, this.f19924g, this.f19925h, this.f19926i, this.f19927j, this.f19928k, this.f19929l, this.f19930m, this.f19931n, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, i10, i11, this.B, this.C, this.D);
    }

    public int hashCode() {
        if (this.E == 0) {
            String str = this.f19919b;
            int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f19920c;
            int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f19921d) * 31) + this.f19922e) * 31) + this.f19923f) * 31;
            String str3 = this.f19924g;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.f19925h;
            int iHashCode4 = (iHashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.f19926i;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f19927j;
            int iHashCode6 = (((((((((((((((((((((((((((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f19928k) * 31) + ((int) this.f19931n)) * 31) + this.f19932o) * 31) + this.f19933p) * 31) + Float.floatToIntBits(this.f19934q)) * 31) + this.f19935r) * 31) + Float.floatToIntBits(this.f19936s)) * 31) + this.f19937t) * 31) + this.f19940w) * 31) + this.f19941x) * 31) + this.f19942y) * 31) + this.f19943z) * 31) + this.A) * 31;
            String str6 = this.B;
            int iHashCode7 = (((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.C) * 31;
            Class<? extends i> cls = this.D;
            this.E = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.E;
    }

    public Format i(@Nullable String str) {
        return new Format(this.f19919b, str, this.f19921d, this.f19922e, this.f19923f, this.f19924g, this.f19925h, this.f19926i, this.f19927j, this.f19928k, this.f19929l, this.f19930m, this.f19931n, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, this.D);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.exoplayer.Format j(com.google.android.exoplayer.Format r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            if (r0 != r1) goto L7
            return r0
        L7:
            java.lang.String r2 = r0.f19927j
            int r2 = a6.p.h(r2)
            java.lang.String r4 = r1.f19919b
            java.lang.String r3 = r1.f19920c
            if (r3 == 0) goto L14
            goto L16
        L14:
            java.lang.String r3 = r0.f19920c
        L16:
            r5 = r3
            java.lang.String r3 = r0.B
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L1f
            if (r2 != r7) goto L26
        L1f:
            java.lang.String r6 = r1.B
            if (r6 == 0) goto L26
            r31 = r6
            goto L28
        L26:
            r31 = r3
        L28:
            int r3 = r0.f19923f
            r6 = -1
            if (r3 != r6) goto L2f
            int r3 = r1.f19923f
        L2f:
            r8 = r3
            java.lang.String r3 = r0.f19924g
            if (r3 != 0) goto L43
            java.lang.String r6 = r1.f19924g
            java.lang.String r6 = a6.k0.D(r6, r2)
            java.lang.String[] r9 = a6.k0.F0(r6)
            int r9 = r9.length
            if (r9 != r7) goto L43
            r9 = r6
            goto L44
        L43:
            r9 = r3
        L44:
            com.google.android.exoplayer.metadata.Metadata r3 = r0.f19925h
            if (r3 != 0) goto L4b
            com.google.android.exoplayer.metadata.Metadata r3 = r1.f19925h
            goto L51
        L4b:
            com.google.android.exoplayer.metadata.Metadata r6 = r1.f19925h
            com.google.android.exoplayer.metadata.Metadata r3 = r3.c(r6)
        L51:
            r10 = r3
            float r3 = r0.f19934q
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L62
            r6 = 2
            if (r2 != r6) goto L62
            float r2 = r1.f19934q
            r20 = r2
            goto L64
        L62:
            r20 = r3
        L64:
            int r2 = r0.f19921d
            int r3 = r1.f19921d
            r6 = r2 | r3
            int r2 = r0.f19922e
            int r3 = r1.f19922e
            r7 = r2 | r3
            com.google.android.exoplayer.drm.DrmInitData r1 = r1.f19930m
            com.google.android.exoplayer.drm.DrmInitData r2 = r0.f19930m
            com.google.android.exoplayer.drm.DrmInitData r15 = com.google.android.exoplayer.drm.DrmInitData.e(r1, r2)
            com.google.android.exoplayer.Format r1 = new com.google.android.exoplayer.Format
            r3 = r1
            java.lang.String r11 = r0.f19926i
            java.lang.String r12 = r0.f19927j
            int r13 = r0.f19928k
            java.util.List<byte[]> r14 = r0.f19929l
            r35 = r1
            long r1 = r0.f19931n
            r16 = r1
            int r1 = r0.f19932o
            r18 = r1
            int r1 = r0.f19933p
            r19 = r1
            int r1 = r0.f19935r
            r21 = r1
            float r1 = r0.f19936s
            r22 = r1
            byte[] r1 = r0.f19938u
            r23 = r1
            int r1 = r0.f19937t
            r24 = r1
            com.google.android.exoplayer.video.ColorInfo r1 = r0.f19939v
            r25 = r1
            int r1 = r0.f19940w
            r26 = r1
            int r1 = r0.f19941x
            r27 = r1
            int r1 = r0.f19942y
            r28 = r1
            int r1 = r0.f19943z
            r29 = r1
            int r1 = r0.A
            r30 = r1
            int r1 = r0.C
            r32 = r1
            java.lang.Class<? extends j4.i> r1 = r0.D
            r33 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r35
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer.Format.j(com.google.android.exoplayer.Format):com.google.android.exoplayer.Format");
    }

    public Format k(int i10) {
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, this.f19923f, this.f19924g, this.f19925h, this.f19926i, this.f19927j, i10, this.f19929l, this.f19930m, this.f19931n, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, this.D);
    }

    public Format l(@Nullable Metadata metadata) {
        return b(this.f19930m, metadata);
    }

    public Format m(long j10) {
        return new Format(this.f19919b, this.f19920c, this.f19921d, this.f19922e, this.f19923f, this.f19924g, this.f19925h, this.f19926i, this.f19927j, this.f19928k, this.f19929l, this.f19930m, j10, this.f19932o, this.f19933p, this.f19934q, this.f19935r, this.f19936s, this.f19938u, this.f19937t, this.f19939v, this.f19940w, this.f19941x, this.f19942y, this.f19943z, this.A, this.B, this.C, this.D);
    }

    public String toString() {
        return "Format(" + this.f19919b + ", " + this.f19920c + ", " + this.f19926i + ", " + this.f19927j + ", " + this.f19924g + ", " + this.f19923f + ", " + this.B + ", [" + this.f19932o + ", " + this.f19933p + ", " + this.f19934q + "], [" + this.f19940w + ", " + this.f19941x + "])";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19919b);
        parcel.writeString(this.f19920c);
        parcel.writeInt(this.f19921d);
        parcel.writeInt(this.f19922e);
        parcel.writeInt(this.f19923f);
        parcel.writeString(this.f19924g);
        parcel.writeParcelable(this.f19925h, 0);
        parcel.writeString(this.f19926i);
        parcel.writeString(this.f19927j);
        parcel.writeInt(this.f19928k);
        int size = this.f19929l.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.f19929l.get(i11));
        }
        parcel.writeParcelable(this.f19930m, 0);
        parcel.writeLong(this.f19931n);
        parcel.writeInt(this.f19932o);
        parcel.writeInt(this.f19933p);
        parcel.writeFloat(this.f19934q);
        parcel.writeInt(this.f19935r);
        parcel.writeFloat(this.f19936s);
        k0.O0(parcel, this.f19938u != null);
        byte[] bArr = this.f19938u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f19937t);
        parcel.writeParcelable(this.f19939v, i10);
        parcel.writeInt(this.f19940w);
        parcel.writeInt(this.f19941x);
        parcel.writeInt(this.f19942y);
        parcel.writeInt(this.f19943z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
    }
}
