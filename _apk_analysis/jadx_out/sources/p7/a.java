package p7;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import g7.b;
import java.util.ArrayList;
import java.util.Collections;
import s7.a0;
import s7.m0;

/* JADX INFO: compiled from: Mp4WebvttDecoder.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends g7.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f77091o;

    public a() {
        super("Mp4WebvttDecoder");
        this.f77091o = new a0();
    }

    public static g7.b x(a0 a0Var, int i10) throws SubtitleDecoderException {
        CharSequence charSequenceQ = null;
        b.C0768b c0768bO = null;
        while (i10 > 0) {
            if (i10 < 8) {
                throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
            }
            int iN = a0Var.n();
            int iN2 = a0Var.n();
            int i11 = iN - 8;
            String strB = m0.B(a0Var.d(), a0Var.e(), i11);
            a0Var.Q(i11);
            i10 = (i10 - 8) - i11;
            if (iN2 == 1937011815) {
                c0768bO = f.o(strB);
            } else if (iN2 == 1885436268) {
                charSequenceQ = f.q(null, strB.trim(), Collections.emptyList());
            }
        }
        if (charSequenceQ == null) {
            charSequenceQ = "";
        }
        return c0768bO != null ? c0768bO.o(charSequenceQ).a() : f.l(charSequenceQ);
    }

    @Override // g7.h
    public g7.i w(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f77091o.N(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f77091o.a() > 0) {
            if (this.f77091o.a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int iN = this.f77091o.n();
            if (this.f77091o.n() == 1987343459) {
                arrayList.add(x(this.f77091o, iN - 8));
            } else {
                this.f77091o.Q(iN - 8);
            }
        }
        return new b(arrayList);
    }
}
