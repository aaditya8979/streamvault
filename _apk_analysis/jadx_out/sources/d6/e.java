package d6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.mediacodec.c;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public class e implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f59600a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f59604e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59606g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59607h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f59608i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.mediacodec.b f59601b = new com.google.android.exoplayer2.mediacodec.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59602c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f59603d = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public com.google.android.exoplayer2.mediacodec.e f59605f = com.google.android.exoplayer2.mediacodec.e.f21865a;

    public e(Context context) {
        this.f59600a = context;
    }

    @Override // d6.w1
    public com.google.android.exoplayer2.y[] a(Handler handler, t7.v vVar, com.google.android.exoplayer2.audio.b bVar, g7.o oVar, v6.d dVar) {
        ArrayList<com.google.android.exoplayer2.y> arrayList = new ArrayList<>();
        h(this.f59600a, this.f59602c, this.f59605f, this.f59604e, handler, vVar, this.f59603d, arrayList);
        AudioSink audioSinkC = c(this.f59600a, this.f59606g, this.f59607h, this.f59608i);
        if (audioSinkC != null) {
            b(this.f59600a, this.f59602c, this.f59605f, this.f59604e, audioSinkC, handler, bVar, arrayList);
        }
        g(this.f59600a, oVar, handler.getLooper(), this.f59602c, arrayList);
        e(this.f59600a, dVar, handler.getLooper(), this.f59602c, arrayList);
        d(this.f59600a, this.f59602c, arrayList);
        f(this.f59600a, handler, this.f59602c, arrayList);
        return (com.google.android.exoplayer2.y[]) arrayList.toArray(new com.google.android.exoplayer2.y[0]);
    }

    public void b(Context context, int i10, com.google.android.exoplayer2.mediacodec.e eVar, boolean z10, AudioSink audioSink, Handler handler, com.google.android.exoplayer2.audio.b bVar, ArrayList<com.google.android.exoplayer2.y> arrayList) {
        int i11;
        int i12;
        int i13;
        arrayList.add(new com.google.android.exoplayer2.audio.h(context, i(), eVar, z10, handler, bVar, audioSink));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating MIDI extension", e10);
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (com.google.android.exoplayer2.y) Class.forName("com.google.android.exoplayer2.decoder.midi.MidiRenderer").getConstructor(new Class[0]).newInstance(new Object[0]));
            s7.q.f("DefaultRenderersFactory", "Loaded MidiRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i11;
            i11 = size;
        }
        try {
            try {
                i12 = i11 + 1;
                try {
                    arrayList.add(i11, (com.google.android.exoplayer2.y) Class.forName("com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.b.class, AudioSink.class).newInstance(handler, bVar, audioSink));
                    s7.q.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i11 = i12;
                    i12 = i11;
                }
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating Opus extension", e11);
            }
        } catch (ClassNotFoundException unused4) {
        }
        try {
            try {
                i13 = i12 + 1;
                try {
                    arrayList.add(i12, (com.google.android.exoplayer2.y) Class.forName("com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.b.class, AudioSink.class).newInstance(handler, bVar, audioSink));
                    s7.q.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                    i12 = i13;
                    i13 = i12;
                }
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating FLAC extension", e12);
            }
        } catch (ClassNotFoundException unused6) {
        }
        try {
            arrayList.add(i13, (com.google.android.exoplayer2.y) Class.forName("com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer2.audio.b.class, AudioSink.class).newInstance(handler, bVar, audioSink));
            s7.q.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
        } catch (ClassNotFoundException unused7) {
        } catch (Exception e13) {
            throw new RuntimeException("Error instantiating FFmpeg extension", e13);
        }
    }

    @Nullable
    public AudioSink c(Context context, boolean z10, boolean z11, boolean z12) {
        return new DefaultAudioSink.f().g(f6.e.c(context)).i(z10).h(z11).j(z12 ? 1 : 0).f();
    }

    public void d(Context context, int i10, ArrayList<com.google.android.exoplayer2.y> arrayList) {
        arrayList.add(new u7.b());
    }

    public void e(Context context, v6.d dVar, Looper looper, int i10, ArrayList<com.google.android.exoplayer2.y> arrayList) {
        arrayList.add(new com.google.android.exoplayer2.metadata.a(dVar, looper));
    }

    public void f(Context context, Handler handler, int i10, ArrayList<com.google.android.exoplayer2.y> arrayList) {
    }

    public void g(Context context, g7.o oVar, Looper looper, int i10, ArrayList<com.google.android.exoplayer2.y> arrayList) {
        arrayList.add(new g7.p(oVar, looper));
    }

    public void h(Context context, int i10, com.google.android.exoplayer2.mediacodec.e eVar, boolean z10, Handler handler, t7.v vVar, long j10, ArrayList<com.google.android.exoplayer2.y> arrayList) {
        int i11;
        arrayList.add(new t7.g(context, i(), eVar, j10, z10, handler, vVar, 50));
        if (i10 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i10 == 2) {
            size--;
        }
        try {
            try {
                i11 = size + 1;
                try {
                    arrayList.add(size, (com.google.android.exoplayer2.y) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, t7.v.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, vVar, 50));
                    s7.q.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        } catch (ClassNotFoundException unused2) {
        }
        try {
            arrayList.add(i11, (com.google.android.exoplayer2.y) Class.forName("com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, t7.v.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, vVar, 50));
            s7.q.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    public c.b i() {
        return this.f59601b;
    }
}
