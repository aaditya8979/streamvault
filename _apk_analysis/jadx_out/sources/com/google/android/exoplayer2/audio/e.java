package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public int[] f21314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public int[] f21315j;

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f21314i;
        if (iArr == null) {
            return AudioProcessor.a.f21192e;
        }
        if (aVar.f21195c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f21194b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f21194b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f21193a, iArr.length, 2) : AudioProcessor.a.f21192e;
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void d() {
        this.f21315j = this.f21314i;
    }

    @Override // com.google.android.exoplayer2.audio.d
    public void f() {
        this.f21315j = null;
        this.f21314i = null;
    }

    public void h(@Nullable int[] iArr) {
        this.f21314i = iArr;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) s7.a.e(this.f21315j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f21307b.f21196d) * this.f21308c.f21196d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferG.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f21307b.f21196d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
