package u7;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.util.GlUtil;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import s7.i0;
import s7.q;

/* JADX INFO: compiled from: SceneRenderer.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h implements t7.i, a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f85589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f85590k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public byte[] f85593n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f85581b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f85582c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f85583d = new f();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f85584e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0<Long> f85585f = new i0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0<d> f85586g = new i0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f85587h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f85588i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f85591l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f85592m = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(SurfaceTexture surfaceTexture) {
        this.f85581b.set(true);
    }

    @Override // t7.i
    public void a(long j10, long j11, m mVar, @Nullable MediaFormat mediaFormat) {
        this.f85585f.a(j11, Long.valueOf(j10));
        g(mVar.f21761w, mVar.f21762x, j11);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            q.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f85581b.compareAndSet(true, false)) {
            ((SurfaceTexture) s7.a.e(this.f85590k)).updateTexImage();
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e11) {
                q.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f85582c.compareAndSet(true, false)) {
                GlUtil.j(this.f85587h);
            }
            long timestamp = this.f85590k.getTimestamp();
            Long lG = this.f85585f.g(timestamp);
            if (lG != null) {
                this.f85584e.c(this.f85587h, lG.longValue());
            }
            d dVarJ = this.f85586g.j(timestamp);
            if (dVarJ != null) {
                this.f85583d.d(dVarJ);
            }
        }
        Matrix.multiplyMM(this.f85588i, 0, fArr, 0, this.f85587h, 0);
        this.f85583d.a(this.f85589j, this.f85588i, z10);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f85583d.b();
            GlUtil.b();
            this.f85589j = GlUtil.f();
        } catch (GlUtil.GlException e10) {
            q.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f85589j);
        this.f85590k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: u7.g
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f85580b.e(surfaceTexture2);
            }
        });
        return this.f85590k;
    }

    public void f(int i10) {
        this.f85591l = i10;
    }

    public final void g(@Nullable byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f85593n;
        int i11 = this.f85592m;
        this.f85593n = bArr;
        if (i10 == -1) {
            i10 = this.f85591l;
        }
        this.f85592m = i10;
        if (i11 == i10 && Arrays.equals(bArr2, this.f85593n)) {
            return;
        }
        byte[] bArr3 = this.f85593n;
        d dVarA = bArr3 != null ? e.a(bArr3, this.f85592m) : null;
        if (dVarA == null || !f.c(dVarA)) {
            dVarA = d.b(this.f85592m);
        }
        this.f85586g.a(j10, dVarA);
    }

    @Override // u7.a
    public void onCameraMotion(long j10, float[] fArr) {
        this.f85584e.e(j10, fArr);
    }

    @Override // u7.a
    public void onCameraMotionReset() {
        this.f85585f.c();
        this.f85584e.d();
        this.f85582c.set(true);
    }
}
