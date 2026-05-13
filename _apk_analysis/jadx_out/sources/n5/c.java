package n5;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SimpleSubtitleDecoder.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends i4.g<h, i, SubtitleDecoderException> implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f75140n;

    public c(String str) {
        super(new h[2], new i[2]);
        this.f75140n = str;
        q(1024);
    }

    @Override // i4.g
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final h c() {
        return new h();
    }

    @Override // i4.g
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return new d(this);
    }

    @Override // n5.f
    public void setPositionUs(long j10) {
    }

    @Override // i4.g
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException e(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // i4.g
    @Nullable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException f(h hVar, i iVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) a6.a.e(hVar.f63711c);
            iVar.a(hVar.f63713e, v(byteBuffer.array(), byteBuffer.limit(), z10), hVar.f75143h);
            iVar.clearFlag(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e10) {
            return e10;
        }
    }

    public abstract e v(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException;

    public final void w(i iVar) {
        super.n(iVar);
    }
}
