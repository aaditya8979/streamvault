package a6;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.flac.PictureFrame;
import com.google.android.exoplayer.metadata.flac.VorbisComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f3568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final a f3569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Metadata f3570l;

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f3571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f3572b;

        public a(long[] jArr, long[] jArr2) {
            this.f3571a = jArr;
            this.f3572b = jArr2;
        }
    }

    public j(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable a aVar, @Nullable Metadata metadata) {
        this.f3559a = i10;
        this.f3560b = i11;
        this.f3561c = i12;
        this.f3562d = i13;
        this.f3563e = i14;
        this.f3564f = l(i14);
        this.f3565g = i15;
        this.f3566h = i16;
        this.f3567i = g(i16);
        this.f3568j = j10;
        this.f3569k = aVar;
        this.f3570l = metadata;
    }

    public j(byte[] bArr, int i10) {
        s sVar = new s(bArr);
        sVar.o(i10 * 8);
        this.f3559a = sVar.h(16);
        this.f3560b = sVar.h(16);
        this.f3561c = sVar.h(24);
        this.f3562d = sVar.h(24);
        int iH = sVar.h(20);
        this.f3563e = iH;
        this.f3564f = l(iH);
        this.f3565g = sVar.h(3) + 1;
        int iH2 = sVar.h(5) + 1;
        this.f3566h = iH2;
        this.f3567i = g(iH2);
        this.f3568j = sVar.j(36);
        this.f3569k = null;
        this.f3570l = null;
    }

    @Nullable
    public static Metadata a(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] strArrE0 = k0.E0(str, "=");
            if (strArrE0.length != 2) {
                m.h("FlacStreamMetadata", "Failed to parse Vorbis comment: " + str);
            } else {
                arrayList.add(new VorbisComment(strArrE0[0], strArrE0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static int g(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 != 20) {
            return i10 != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int l(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public j b(List<PictureFrame> list) {
        return new j(this.f3559a, this.f3560b, this.f3561c, this.f3562d, this.f3563e, this.f3565g, this.f3566h, this.f3568j, this.f3569k, j(a(Collections.emptyList(), list)));
    }

    public j c(@Nullable a aVar) {
        return new j(this.f3559a, this.f3560b, this.f3561c, this.f3562d, this.f3563e, this.f3565g, this.f3566h, this.f3568j, aVar, this.f3570l);
    }

    public j d(List<String> list) {
        return new j(this.f3559a, this.f3560b, this.f3561c, this.f3562d, this.f3563e, this.f3565g, this.f3566h, this.f3568j, this.f3569k, j(a(list, Collections.emptyList())));
    }

    public long e() {
        long j10;
        long j11;
        int i10 = this.f3562d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f3561c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f3559a;
            j10 = ((((i11 != this.f3560b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f3565g)) * ((long) this.f3566h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public int f() {
        return this.f3566h * this.f3563e * this.f3565g;
    }

    public long h() {
        long j10 = this.f3568j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f3563e);
    }

    public Format i(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f3562d;
        if (i10 <= 0) {
            i10 = -1;
        }
        Metadata metadataJ = j(metadata);
        return Format.o(null, "audio/flac", null, f(), i10, this.f3565g, this.f3563e, -1, 0, 0, Collections.singletonList(bArr), null, 0, null, metadataJ);
    }

    @Nullable
    public Metadata j(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f3570l;
        return metadata2 == null ? metadata : metadata2.c(metadata);
    }

    public long k(long j10) {
        return k0.r((j10 * ((long) this.f3563e)) / 1000000, 0L, this.f3568j - 1);
    }
}
