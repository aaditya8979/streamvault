package i6;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.Collections;
import java.util.List;
import s7.m0;

/* JADX INFO: compiled from: FlacStreamMetadata.java */
/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f63921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f63922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f63923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f63924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f63925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f63926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f63927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f63928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f63929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f63930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final a f63931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Metadata f63932l;

    /* JADX INFO: compiled from: FlacStreamMetadata.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f63933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f63934b;

        public a(long[] jArr, long[] jArr2) {
            this.f63933a = jArr;
            this.f63934b = jArr2;
        }
    }

    public t(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @Nullable a aVar, @Nullable Metadata metadata) {
        this.f63921a = i10;
        this.f63922b = i11;
        this.f63923c = i12;
        this.f63924d = i13;
        this.f63925e = i14;
        this.f63926f = j(i14);
        this.f63927g = i15;
        this.f63928h = i16;
        this.f63929i = e(i16);
        this.f63930j = j10;
        this.f63931k = aVar;
        this.f63932l = metadata;
    }

    public t(byte[] bArr, int i10) {
        s7.z zVar = new s7.z(bArr);
        zVar.p(i10 * 8);
        this.f63921a = zVar.h(16);
        this.f63922b = zVar.h(16);
        this.f63923c = zVar.h(24);
        this.f63924d = zVar.h(24);
        int iH = zVar.h(20);
        this.f63925e = iH;
        this.f63926f = j(iH);
        this.f63927g = zVar.h(3) + 1;
        int iH2 = zVar.h(5) + 1;
        this.f63928h = iH2;
        this.f63929i = e(iH2);
        this.f63930j = zVar.j(36);
        this.f63931k = null;
        this.f63932l = null;
    }

    public static int e(int i10) {
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

    public static int j(int i10) {
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

    public t a(List<PictureFrame> list) {
        return new t(this.f63921a, this.f63922b, this.f63923c, this.f63924d, this.f63925e, this.f63927g, this.f63928h, this.f63930j, this.f63931k, h(new Metadata(list)));
    }

    public t b(@Nullable a aVar) {
        return new t(this.f63921a, this.f63922b, this.f63923c, this.f63924d, this.f63925e, this.f63927g, this.f63928h, this.f63930j, aVar, this.f63932l);
    }

    public t c(List<String> list) {
        return new t(this.f63921a, this.f63922b, this.f63923c, this.f63924d, this.f63925e, this.f63927g, this.f63928h, this.f63930j, this.f63931k, h(e0.c(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f63924d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f63923c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f63921a;
            j10 = ((((i11 != this.f63922b || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) this.f63927g)) * ((long) this.f63928h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f63930j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f63925e);
    }

    public com.google.android.exoplayer2.m g(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = -128;
        int i10 = this.f63924d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new m.b().e0("audio/flac").W(i10).H(this.f63927g).f0(this.f63925e).T(Collections.singletonList(bArr)).X(h(metadata)).E();
    }

    @Nullable
    public Metadata h(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f63932l;
        return metadata2 == null ? metadata : metadata2.c(metadata);
    }

    public long i(long j10) {
        return m0.q((j10 * ((long) this.f63925e)) / 1000000, 0L, this.f63930j - 1);
    }
}
