package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f21307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f21308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f21309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f21310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f21311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f21312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21313h;

    public d() {
        ByteBuffer byteBuffer = AudioProcessor.f21191a;
        this.f21311f = byteBuffer;
        this.f21312g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f21192e;
        this.f21309d = aVar;
        this.f21310e = aVar;
        this.f21307b = aVar;
        this.f21308c = aVar;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f21309d = aVar;
        this.f21310e = c(aVar);
        return isActive() ? this.f21310e : AudioProcessor.a.f21192e;
    }

    public final boolean b() {
        return this.f21312g.hasRemaining();
    }

    public abstract AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f21312g = AudioProcessor.f21191a;
        this.f21313h = false;
        this.f21307b = this.f21309d;
        this.f21308c = this.f21310e;
        d();
    }

    public final ByteBuffer g(int i10) {
        if (this.f21311f.capacity() < i10) {
            this.f21311f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f21311f.clear();
        }
        ByteBuffer byteBuffer = this.f21311f;
        this.f21312g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f21312g;
        this.f21312g = AudioProcessor.f21191a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean isActive() {
        return this.f21310e != AudioProcessor.a.f21192e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    public boolean isEnded() {
        return this.f21313h && this.f21312g == AudioProcessor.f21191a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f21313h = true;
        e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f21311f = AudioProcessor.f21191a;
        AudioProcessor.a aVar = AudioProcessor.a.f21192e;
        this.f21309d = aVar;
        this.f21310e = aVar;
        this.f21307b = aVar;
        this.f21308c = aVar;
        f();
    }
}
