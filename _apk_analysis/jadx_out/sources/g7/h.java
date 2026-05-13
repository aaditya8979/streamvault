package g7;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class h extends g6.h<m, n, SubtitleDecoderException> implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f62183n;

    /* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
    public class a extends n {
        public a() {
        }

        @Override // g6.f
        public void l() {
            h.this.n(this);
        }
    }

    public h(String str) {
        super(new m[2], new n[2]);
        this.f62183n = str;
        q(1024);
    }

    @Override // g6.h
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final m c() {
        return new m();
    }

    @Override // g7.j
    public void setPositionUs(long j10) {
    }

    @Override // g6.h
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return new a();
    }

    @Override // g6.h
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException e(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // g6.h
    @Nullable
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException f(m mVar, n nVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) s7.a.e(mVar.f21430d);
            nVar.m(mVar.f21432f, w(byteBuffer.array(), byteBuffer.limit(), z10), mVar.f62197j);
            nVar.c(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    public abstract i w(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;
}
