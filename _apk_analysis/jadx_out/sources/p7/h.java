package p7;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import s7.a0;

/* JADX INFO: compiled from: WebvttDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class h extends g7.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f77141o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f77142p;

    public h() {
        super("WebvttDecoder");
        this.f77141o = new a0();
        this.f77142p = new c();
    }

    public static int x(a0 a0Var) {
        int iE = 0;
        int i10 = -1;
        while (i10 == -1) {
            iE = a0Var.e();
            String strP = a0Var.p();
            i10 = strP == null ? 0 : "STYLE".equals(strP) ? 2 : strP.startsWith("NOTE") ? 1 : 3;
        }
        a0Var.P(iE);
        return i10;
    }

    public static void y(a0 a0Var) {
        while (!TextUtils.isEmpty(a0Var.p())) {
        }
    }

    @Override // g7.h
    public g7.i w(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        e eVarN;
        this.f77141o.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            i.d(this.f77141o);
            while (!TextUtils.isEmpty(this.f77141o.p())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iX = x(this.f77141o);
                if (iX == 0) {
                    return new k(arrayList2);
                }
                if (iX == 1) {
                    y(this.f77141o);
                } else if (iX == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.f77141o.p();
                    arrayList.addAll(this.f77142p.d(this.f77141o));
                } else if (iX == 3 && (eVarN = f.n(this.f77141o, arrayList)) != null) {
                    arrayList2.add(eVarN);
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }
}
