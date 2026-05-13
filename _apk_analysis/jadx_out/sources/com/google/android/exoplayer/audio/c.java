package com.google.android.exoplayer.audio;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: BaseAudioProcessor.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c implements AudioProcessor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AudioProcessor.a f20026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AudioProcessor.a f20027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioProcessor.a f20028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AudioProcessor.a f20029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ByteBuffer f20030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ByteBuffer f20031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20032h;

    public c() {
        ByteBuffer byteBuffer = AudioProcessor.f19944a;
        this.f20030f = byteBuffer;
        this.f20031g = byteBuffer;
        AudioProcessor.a aVar = AudioProcessor.a.f19945e;
        this.f20028d = aVar;
        this.f20029e = aVar;
        this.f20026b = aVar;
        this.f20027c = aVar;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        this.f20028d = aVar;
        this.f20029e = c(aVar);
        return isActive() ? this.f20029e : AudioProcessor.a.f19945e;
    }

    public final boolean b() {
        return this.f20031g.hasRemaining();
    }

    public abstract AudioProcessor.a c(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException;

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public final void flush() {
        this.f20031g = AudioProcessor.f19944a;
        this.f20032h = false;
        this.f20026b = this.f20028d;
        this.f20027c = this.f20029e;
        d();
    }

    public final ByteBuffer g(int i10) {
        if (this.f20030f.capacity() < i10) {
            this.f20030f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f20030f.clear();
        }
        ByteBuffer byteBuffer = this.f20030f;
        this.f20031g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    @CallSuper
    public ByteBuffer getOutput() {
        ByteBuffer byteBuffer = this.f20031g;
        this.f20031g = AudioProcessor.f19944a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public boolean isActive() {
        return this.f20029e != AudioProcessor.a.f19945e;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    @CallSuper
    public boolean isEnded() {
        return this.f20032h && this.f20031g == AudioProcessor.f19944a;
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public final void queueEndOfStream() {
        this.f20032h = true;
        e();
    }

    @Override // com.google.android.exoplayer.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f20030f = AudioProcessor.f19944a;
        AudioProcessor.a aVar = AudioProcessor.a.f19945e;
        this.f20028d = aVar;
        this.f20029e = aVar;
        this.f20026b = aVar;
        this.f20027c = aVar;
        f();
    }
}
