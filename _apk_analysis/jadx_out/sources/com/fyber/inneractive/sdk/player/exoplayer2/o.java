package com.fyber.inneractive.sdk.player.exoplayer2;

import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new n();
    public int A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.b f18451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f18454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f18455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.d f18456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f18458k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f18459l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f18460m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f18461n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18462o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final byte[] f18463p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.c f18464q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18465r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18466s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f18467t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f18468u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f18469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f18470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f18471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f18472y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f18473z;

    public o(Parcel parcel) {
        this.f18448a = parcel.readString();
        this.f18452e = parcel.readString();
        this.f18453f = parcel.readString();
        this.f18450c = parcel.readString();
        this.f18449b = parcel.readInt();
        this.f18454g = parcel.readInt();
        this.f18457j = parcel.readInt();
        this.f18458k = parcel.readInt();
        this.f18459l = parcel.readFloat();
        this.f18460m = parcel.readInt();
        this.f18461n = parcel.readFloat();
        this.f18463p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f18462o = parcel.readInt();
        this.f18464q = (com.fyber.inneractive.sdk.player.exoplayer2.video.c) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.c.class.getClassLoader());
        this.f18465r = parcel.readInt();
        this.f18466s = parcel.readInt();
        this.f18467t = parcel.readInt();
        this.f18468u = parcel.readInt();
        this.f18469v = parcel.readInt();
        this.f18471x = parcel.readInt();
        this.f18472y = parcel.readString();
        this.f18473z = parcel.readInt();
        this.f18470w = parcel.readLong();
        int i10 = parcel.readInt();
        this.f18455h = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18455h.add(parcel.createByteArray());
        }
        this.f18456i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.d) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.d.class.getClassLoader());
        this.f18451d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.b.class.getClassLoader());
    }

    public o(String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, float f10, int i14, float f11, byte[] bArr, int i15, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, int i16, int i17, int i18, int i19, int i20, int i21, String str5, int i22, long j10, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        this.f18448a = str;
        this.f18452e = str2;
        this.f18453f = str3;
        this.f18450c = str4;
        this.f18449b = i10;
        this.f18454g = i11;
        this.f18457j = i12;
        this.f18458k = i13;
        this.f18459l = f10;
        this.f18460m = i14;
        this.f18461n = f11;
        this.f18463p = bArr;
        this.f18462o = i15;
        this.f18464q = cVar;
        this.f18465r = i16;
        this.f18466s = i17;
        this.f18467t = i18;
        this.f18468u = i19;
        this.f18469v = i20;
        this.f18471x = i21;
        this.f18472y = str5;
        this.f18473z = i22;
        this.f18470w = j10;
        this.f18455h = list == null ? Collections.emptyList() : list;
        this.f18456i = dVar;
        this.f18451d = bVar;
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, int i17, String str3, com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar) {
        return new o(str, null, str2, null, i10, i11, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i12, i13, i14, i15, i16, i17, str3, -1, Long.MAX_VALUE, list, dVar, bVar);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, int i13, List list, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, String str3) {
        return a(str, str2, i10, i11, i12, i13, -1, -1, -1, list, dVar, 0, str3, null);
    }

    public static o a(String str, String str2, int i10, int i11, int i12, List list, int i13, float f10, byte[] bArr, int i14, com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, i10, i11, i12, -1.0f, i13, f10, bArr, i14, cVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, dVar, null);
    }

    public static o a(String str, String str2, int i10, String str3, int i11, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar, long j10, List list) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i10, str3, i11, j10, list, dVar, null);
    }

    public static o a(String str, String str2, com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar) {
        return new o(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, dVar, null);
    }

    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f18453f);
        String str = this.f18472y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f18454g);
        a(mediaFormat, "width", this.f18457j);
        a(mediaFormat, "height", this.f18458k);
        float f10 = this.f18459l;
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        a(mediaFormat, "rotation-degrees", this.f18460m);
        a(mediaFormat, "channel-count", this.f18465r);
        a(mediaFormat, "sample-rate", this.f18466s);
        a(mediaFormat, "encoder-delay", this.f18468u);
        a(mediaFormat, "encoder-padding", this.f18469v);
        for (int i10 = 0; i10 < this.f18455h.size(); i10++) {
            mediaFormat.setByteBuffer(m.a("csd-", i10), ByteBuffer.wrap((byte[]) this.f18455h.get(i10)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar = this.f18464q;
        if (cVar != null) {
            a(mediaFormat, "color-transfer", cVar.f18859c);
            a(mediaFormat, "color-standard", cVar.f18857a);
            a(mediaFormat, "color-range", cVar.f18858b);
            byte[] bArr = cVar.f18860d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final int b() {
        int i10;
        int i11 = this.f18457j;
        if (i11 == -1 || (i10 = this.f18458k) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f18449b == oVar.f18449b && this.f18454g == oVar.f18454g && this.f18457j == oVar.f18457j && this.f18458k == oVar.f18458k && this.f18459l == oVar.f18459l && this.f18460m == oVar.f18460m && this.f18461n == oVar.f18461n && this.f18462o == oVar.f18462o && this.f18465r == oVar.f18465r && this.f18466s == oVar.f18466s && this.f18467t == oVar.f18467t && this.f18468u == oVar.f18468u && this.f18469v == oVar.f18469v && this.f18470w == oVar.f18470w && this.f18471x == oVar.f18471x && z.a(this.f18448a, oVar.f18448a) && z.a(this.f18472y, oVar.f18472y) && this.f18473z == oVar.f18473z && z.a(this.f18452e, oVar.f18452e) && z.a(this.f18453f, oVar.f18453f) && z.a(this.f18450c, oVar.f18450c) && z.a(this.f18456i, oVar.f18456i) && z.a(this.f18451d, oVar.f18451d) && z.a(this.f18464q, oVar.f18464q) && Arrays.equals(this.f18463p, oVar.f18463p) && this.f18455h.size() == oVar.f18455h.size()) {
                for (int i10 = 0; i10 < this.f18455h.size(); i10++) {
                    if (!Arrays.equals((byte[]) this.f18455h.get(i10), (byte[]) oVar.f18455h.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f18448a;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f18452e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f18453f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f18450c;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f18449b) * 31) + this.f18457j) * 31) + this.f18458k) * 31) + this.f18465r) * 31) + this.f18466s) * 31;
            String str5 = this.f18472y;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f18473z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar = this.f18456i;
            int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.b bVar = this.f18451d;
            this.A = iHashCode6 + (bVar != null ? Arrays.hashCode(bVar.f18412a) : 0);
        }
        return this.A;
    }

    public final String toString() {
        return "Format(" + this.f18448a + ", " + this.f18452e + ", " + this.f18453f + ", " + this.f18449b + ", " + this.f18472y + ", [" + this.f18457j + ", " + this.f18458k + ", " + this.f18459l + "], [" + this.f18465r + ", " + this.f18466s + "])";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f18448a);
        parcel.writeString(this.f18452e);
        parcel.writeString(this.f18453f);
        parcel.writeString(this.f18450c);
        parcel.writeInt(this.f18449b);
        parcel.writeInt(this.f18454g);
        parcel.writeInt(this.f18457j);
        parcel.writeInt(this.f18458k);
        parcel.writeFloat(this.f18459l);
        parcel.writeInt(this.f18460m);
        parcel.writeFloat(this.f18461n);
        parcel.writeInt(this.f18463p != null ? 1 : 0);
        byte[] bArr = this.f18463p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f18462o);
        parcel.writeParcelable(this.f18464q, i10);
        parcel.writeInt(this.f18465r);
        parcel.writeInt(this.f18466s);
        parcel.writeInt(this.f18467t);
        parcel.writeInt(this.f18468u);
        parcel.writeInt(this.f18469v);
        parcel.writeInt(this.f18471x);
        parcel.writeString(this.f18472y);
        parcel.writeInt(this.f18473z);
        parcel.writeLong(this.f18470w);
        int size = this.f18455h.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray((byte[]) this.f18455h.get(i11));
        }
        parcel.writeParcelable(this.f18456i, 0);
        parcel.writeParcelable(this.f18451d, 0);
    }
}
