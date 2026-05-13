package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.v;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements com.fyber.inneractive.sdk.player.exoplayer2.extractor.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f17564g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f17565h = Pattern.compile("MPEGTS:(\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f17567b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j f17569d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17571f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.n f17568c = new com.fyber.inneractive.sdk.player.exoplayer2.util.n();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f17570e = new byte[1024];

    public p(String str, v vVar) {
        this.f17566a = str;
        this.f17567b = vVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.o oVar) throws InterruptedException, r, EOFException {
        int iMin;
        Matcher matcher;
        String strC;
        int i10 = (int) bVar.f17400b;
        int i11 = this.f17571f;
        byte[] bArr = this.f17570e;
        if (i11 == bArr.length) {
            this.f17570e = Arrays.copyOf(bArr, ((i10 != -1 ? i10 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f17570e;
        int i12 = this.f17571f;
        int length = bArr2.length - i12;
        int i13 = bVar.f17404f;
        if (i13 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i13, length);
            System.arraycopy(bVar.f17402d, 0, bArr2, i12, iMin);
            bVar.b(iMin);
        }
        if (iMin == 0) {
            iMin = bVar.a(bArr2, i12, length, 0, true);
        }
        if (iMin != -1) {
            bVar.f17401c += (long) iMin;
        }
        if (iMin != -1) {
            int i14 = this.f17571f + iMin;
            this.f17571f = i14;
            if (i10 == -1 || i14 != i10) {
                return 0;
            }
        }
        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar = new com.fyber.inneractive.sdk.player.exoplayer2.util.n(this.f17570e);
        try {
            Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f18583a;
            String strC2 = nVar.c();
            if (strC2 == null || !com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f18584b.matcher(strC2).matches()) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.text.a("Expected WEBVTT. Got " + strC2);
            }
            long jA = 0;
            long j10 = 0;
            while (true) {
                String strC3 = nVar.c();
                if (TextUtils.isEmpty(strC3)) {
                    while (true) {
                        String strC4 = nVar.c();
                        if (strC4 == null) {
                            matcher = null;
                            break;
                        }
                        if (com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.f18583a.matcher(strC4).matches()) {
                            do {
                                strC = nVar.c();
                                if (strC != null) {
                                }
                            } while (!strC.isEmpty());
                        } else {
                            matcher = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.a.f18582a.matcher(strC4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        this.f17569d.a(0, 3).a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f17566a, -1, null, 0L, Collections.emptyList()));
                        this.f17569d.b();
                    } else {
                        long jA2 = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher.group(1));
                        long jA3 = this.f17567b.a((j10 + jA2) - jA);
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = this.f17569d.a(0, 3);
                        gVarA.a(com.fyber.inneractive.sdk.player.exoplayer2.o.a(null, "text/vtt", 0, this.f17566a, -1, null, jA3 - jA2, Collections.emptyList()));
                        this.f17569d.b();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar2 = this.f17568c;
                        byte[] bArr3 = this.f17570e;
                        int i15 = this.f17571f;
                        nVar2.f18794a = bArr3;
                        nVar2.f18796c = i15;
                        nVar2.f18795b = 0;
                        gVarA.a(i15, nVar2);
                        gVarA.a(jA3, 1, this.f17571f, 0, (byte[]) null);
                    }
                    return -1;
                }
                if (strC3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f17564g.matcher(strC3);
                    if (!matcher2.find()) {
                        throw new r("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strC3));
                    }
                    Matcher matcher3 = f17565h.matcher(strC3);
                    if (!matcher3.find()) {
                        throw new r("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strC3));
                    }
                    jA = com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b.a(matcher2.group(1));
                    j10 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                }
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.text.a e10) {
            throw new r(e10);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(long j10, long j11) {
        throw new IllegalStateException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.j jVar) {
        this.f17569d = jVar;
        jVar.a(new com.fyber.inneractive.sdk.player.exoplayer2.extractor.p(-9223372036854775807L));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.i
    public final boolean a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        throw new IllegalStateException();
    }
}
