package j5;

import a6.g0;
import a6.t;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.Format;
import com.google.android.exoplayer.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k4.r;
import k4.s;
import k4.u;

/* JADX INFO: compiled from: WebvttExtractor.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements k4.g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f72307g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f72308h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f72309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f72310b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k4.i f72312d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72314f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f72311c = new t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f72313e = new byte[1024];

    public p(@Nullable String str, g0 g0Var) {
        this.f72309a = str;
        this.f72310b = g0Var;
    }

    @Override // k4.g
    public boolean a(k4.h hVar) throws InterruptedException, IOException {
        hVar.peekFully(this.f72313e, 0, 6, false);
        this.f72311c.J(this.f72313e, 6);
        if (v5.h.b(this.f72311c)) {
            return true;
        }
        hVar.peekFully(this.f72313e, 6, 3, false);
        this.f72311c.J(this.f72313e, 9);
        return v5.h.b(this.f72311c);
    }

    @Override // k4.g
    public void b(k4.i iVar) {
        this.f72312d = iVar;
        iVar.c(new s.b(-9223372036854775807L));
    }

    @Override // k4.g
    public int c(k4.h hVar, r rVar) throws InterruptedException, IOException {
        a6.a.e(this.f72312d);
        int length = (int) hVar.getLength();
        int i10 = this.f72314f;
        byte[] bArr = this.f72313e;
        if (i10 == bArr.length) {
            this.f72313e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f72313e;
        int i11 = this.f72314f;
        int i12 = hVar.read(bArr2, i11, bArr2.length - i11);
        if (i12 != -1) {
            int i13 = this.f72314f + i12;
            this.f72314f = i13;
            if (length == -1 || i13 != length) {
                return 0;
            }
        }
        e();
        return -1;
    }

    public final u d(long j10) {
        u uVarTrack = this.f72312d.track(0, 3);
        uVarTrack.d(Format.A(null, "text/vtt", null, -1, 0, this.f72309a, null, j10));
        this.f72312d.endTracks();
        return uVarTrack;
    }

    public final void e() throws ParserException {
        t tVar = new t(this.f72313e);
        v5.h.e(tVar);
        long jF = 0;
        long jD = 0;
        for (String strL = tVar.l(); !TextUtils.isEmpty(strL); strL = tVar.l()) {
            if (strL.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f72307g.matcher(strL);
                if (!matcher.find()) {
                    throw new ParserException("X-TIMESTAMP-MAP doesn't contain local timestamp: " + strL);
                }
                Matcher matcher2 = f72308h.matcher(strL);
                if (!matcher2.find()) {
                    throw new ParserException("X-TIMESTAMP-MAP doesn't contain media timestamp: " + strL);
                }
                jD = v5.h.d(matcher.group(1));
                jF = g0.f(Long.parseLong(matcher2.group(1)));
            }
        }
        Matcher matcherA = v5.h.a(tVar);
        if (matcherA == null) {
            d(0L);
            return;
        }
        long jD2 = v5.h.d(matcherA.group(1));
        long jB = this.f72310b.b(g0.i((jF + jD2) - jD));
        u uVarD = d(jB - jD2);
        this.f72311c.J(this.f72313e, this.f72314f);
        uVarD.a(this.f72311c, this.f72314f);
        uVarD.c(jB, 1, this.f72314f, 0, null);
    }

    @Override // k4.g
    public void release() {
    }

    @Override // k4.g
    public void seek(long j10, long j11) {
        throw new IllegalStateException();
    }
}
