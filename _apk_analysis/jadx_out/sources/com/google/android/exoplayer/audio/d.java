package com.google.android.exoplayer.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ChannelMappingAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public int[] f20033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public int[] f20034j;

    @Override // com.google.android.exoplayer.audio.c
    public AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f20033i;
        if (iArr == null) {
            return AudioProcessor.a.f19945e;
        }
        if (aVar.f19948c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        boolean z10 = aVar.f19947b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f19947b) {
                throw new AudioProcessor.UnhandledAudioFormatException(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new AudioProcessor.a(aVar.f19946a, iArr.length, 2) : AudioProcessor.a.f19945e;
    }

    @Override // com.google.android.exoplayer.audio.c
    public void d() {
        this.f20034j = this.f20033i;
    }

    @Override // com.google.android.exoplayer.audio.c
    public void f() {
        this.f20034j = null;
        this.f20033i = null;
    }

    public void h(@Nullable int[] iArr) {
        this.f20033i = iArr;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) a6.a.e(this.f20034j);
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferG = g(((iLimit - iPosition) / this.f20026b.f19949d) * this.f20027c.f19949d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferG.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f20026b.f19949d;
        }
        byteBuffer.position(iLimit);
        byteBufferG.flip();
    }
}
