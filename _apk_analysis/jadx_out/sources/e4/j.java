package e4;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer.audio.AudioProcessor;
import com.google.android.exoplayer.audio.DefaultAudioSink;
import java.util.ArrayList;

/* JADX INFO: compiled from: DefaultRenderersFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class j implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f60148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public com.google.android.exoplayer.drm.a<j4.j> f60149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f60151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f60153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.exoplayer.mediacodec.b f60154g;

    public j(Context context) {
        this.f60148a = context;
        this.f60150c = 0;
        this.f60151d = 5000L;
        this.f60154g = com.google.android.exoplayer.mediacodec.b.f20216a;
    }

    @Deprecated
    public j(Context context, int i10) {
        this(context, i10, 5000L);
    }

    @Deprecated
    public j(Context context, int i10, long j10) {
        this(context, null, i10, j10);
    }

    @Deprecated
    public j(Context context, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, int i10, long j10) {
        this.f60148a = context;
        this.f60150c = i10;
        this.f60151d = j10;
        this.f60149b = aVar;
        this.f60154g = com.google.android.exoplayer.mediacodec.b.f20216a;
    }

    @Override // e4.s0
    public p0[] a(Handler handler, b6.q qVar, com.google.android.exoplayer.audio.a aVar, n5.j jVar, w4.d dVar, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar2) {
        com.google.android.exoplayer.drm.a<j4.j> aVar3 = aVar2 == null ? this.f60149b : aVar2;
        ArrayList<p0> arrayList = new ArrayList<>();
        com.google.android.exoplayer.drm.a<j4.j> aVar4 = aVar3;
        h(this.f60148a, this.f60150c, this.f60154g, aVar4, this.f60152e, this.f60153f, handler, qVar, this.f60151d, arrayList);
        c(this.f60148a, this.f60150c, this.f60154g, aVar4, this.f60152e, this.f60153f, b(), handler, aVar, arrayList);
        g(this.f60148a, jVar, handler.getLooper(), this.f60150c, arrayList);
        e(this.f60148a, dVar, handler.getLooper(), this.f60150c, arrayList);
        d(this.f60148a, this.f60150c, arrayList);
        f(this.f60148a, handler, this.f60150c, arrayList);
        return (p0[]) arrayList.toArray(new p0[0]);
    }

    public AudioProcessor[] b() {
        return new AudioProcessor[0];
    }

    public void c(Context context, int i10, com.google.android.exoplayer.mediacodec.b bVar, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, boolean z10, boolean z11, AudioProcessor[] audioProcessorArr, Handler handler, com.google.android.exoplayer.audio.a aVar2, ArrayList<p0> arrayList) {
        int i11;
        int i12;
        arrayList.add(new com.google.android.exoplayer.audio.f(context, bVar, aVar, z10, z11, handler, aVar2, new DefaultAudioSink(g4.d.b(context), audioProcessorArr)));
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
                    arrayList.add(size, (p0) Class.forName("com.google.android.exoplayer.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer.audio.a.class, AudioProcessor[].class).newInstance(handler, aVar2, audioProcessorArr));
                    a6.m.f("DefaultRenderersFactory", "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i11;
                    i11 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i12 = i11 + 1;
                    try {
                        arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer.audio.a.class, AudioProcessor[].class).newInstance(handler, aVar2, audioProcessorArr));
                        a6.m.f("DefaultRenderersFactory", "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i11 = i12;
                        i12 = i11;
                    }
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                arrayList.add(i12, (p0) Class.forName("com.google.android.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.google.android.exoplayer.audio.a.class, AudioProcessor[].class).newInstance(handler, aVar2, audioProcessorArr));
                a6.m.f("DefaultRenderersFactory", "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused5) {
            } catch (Exception e11) {
                throw new RuntimeException("Error instantiating FFmpeg extension", e11);
            }
        } catch (Exception e12) {
            throw new RuntimeException("Error instantiating Opus extension", e12);
        }
    }

    public void d(Context context, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new c6.b());
    }

    public void e(Context context, w4.d dVar, Looper looper, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new com.google.android.exoplayer.metadata.a(dVar, looper));
    }

    public void f(Context context, Handler handler, int i10, ArrayList<p0> arrayList) {
    }

    public void g(Context context, n5.j jVar, Looper looper, int i10, ArrayList<p0> arrayList) {
        arrayList.add(new n5.k(jVar, looper));
    }

    public void h(Context context, int i10, com.google.android.exoplayer.mediacodec.b bVar, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, boolean z10, boolean z11, Handler handler, b6.q qVar, long j10, ArrayList<p0> arrayList) {
        int i11;
        arrayList.add(new b6.d(context, bVar, j10, aVar, z10, z11, handler, qVar, 50));
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
                    arrayList.add(size, (p0) Class.forName("com.google.android.exoplayer.ext.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, b6.q.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, qVar, 50));
                    a6.m.f("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
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
            arrayList.add(i11, (p0) Class.forName("com.google.android.exoplayer.ext.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, b6.q.class, Integer.TYPE).newInstance(Long.valueOf(j10), handler, qVar, 50));
            a6.m.f("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
        } catch (ClassNotFoundException unused3) {
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating AV1 extension", e11);
        }
    }

    public j i(long j10) {
        this.f60151d = j10;
        return this;
    }

    public j j(int i10) {
        this.f60150c = i10;
        return this;
    }
}
