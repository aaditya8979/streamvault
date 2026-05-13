package v5;

import a6.k0;
import a6.t;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Collections;
import v5.e;

/* JADX INFO: compiled from: Mp4WebvttDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends n5.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f85874o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e.b f85875p;

    public b() {
        super("Mp4WebvttDecoder");
        this.f85874o = new t();
        this.f85875p = new e.b();
    }

    public static n5.b x(t tVar, e.b bVar, int i10) throws SubtitleDecoderException {
        bVar.g();
        while (i10 > 0) {
            if (i10 < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iJ = tVar.j();
            int iJ2 = tVar.j();
            int i11 = iJ - 8;
            String strA = k0.A(tVar.f3620a, tVar.c(), i11);
            tVar.M(i11);
            i10 = (i10 - 8) - i11;
            if (iJ2 == 1937011815) {
                f.j(strA, bVar);
            } else if (iJ2 == 1885436268) {
                f.k(null, strA.trim(), bVar, Collections.emptyList());
            }
        }
        return bVar.a();
    }

    @Override // n5.c
    public n5.e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f85874o.J(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f85874o.a() > 0) {
            if (this.f85874o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iJ = this.f85874o.j();
            if (this.f85874o.j() == 1987343459) {
                arrayList.add(x(this.f85874o, this.f85875p, iJ - 8));
            } else {
                this.f85874o.M(iJ - 8);
            }
        }
        return new c(arrayList);
    }
}
