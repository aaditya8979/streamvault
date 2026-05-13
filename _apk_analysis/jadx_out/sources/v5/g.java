package v5;

import a6.t;
import android.text.TextUtils;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.List;
import v5.e;

/* JADX INFO: compiled from: WebvttDecoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends n5.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f f85915o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f85916p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e.b f85917q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f85918r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List<d> f85919s;

    public g() {
        super("WebvttDecoder");
        this.f85915o = new f();
        this.f85916p = new t();
        this.f85917q = new e.b();
        this.f85918r = new a();
        this.f85919s = new ArrayList();
    }

    public static int x(t tVar) {
        int iC = 0;
        int i10 = -1;
        while (i10 == -1) {
            iC = tVar.c();
            String strL = tVar.l();
            i10 = strL == null ? 0 : "STYLE".equals(strL) ? 2 : strL.startsWith("NOTE") ? 1 : 3;
        }
        tVar.L(iC);
        return i10;
    }

    public static void y(t tVar) {
        while (!TextUtils.isEmpty(tVar.l())) {
        }
    }

    @Override // n5.c
    public n5.e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f85916p.J(bArr, i10);
        this.f85917q.g();
        this.f85919s.clear();
        try {
            h.e(this.f85916p);
            while (!TextUtils.isEmpty(this.f85916p.l())) {
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                int iX = x(this.f85916p);
                if (iX == 0) {
                    return new i(arrayList);
                }
                if (iX == 1) {
                    y(this.f85916p);
                } else if (iX == 2) {
                    if (!arrayList.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f85916p.l();
                    this.f85919s.addAll(this.f85918r.d(this.f85916p));
                } else if (iX == 3 && this.f85915o.h(this.f85916p, this.f85917q, this.f85919s)) {
                    arrayList.add(this.f85917q.a());
                    this.f85917q.g();
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }
}
