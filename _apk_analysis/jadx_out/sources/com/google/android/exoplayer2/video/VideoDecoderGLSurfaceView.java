package com.google.android.exoplayer2.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.b;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import g6.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import t7.h;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22946b;

    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final float[] f22947l = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final float[] f22948m = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final float[] f22949n = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String[] f22950o = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final FloatBuffer f22951p = GlUtil.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final GLSurfaceView f22952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f22953c = new int[3];

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f22954d = new int[3];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f22955e = new int[3];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f22956f = new int[3];

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AtomicReference<i> f22957g = new AtomicReference<>();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final FloatBuffer[] f22958h = new FloatBuffer[3];

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public b f22959i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22960j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public i f22961k;

        public a(GLSurfaceView gLSurfaceView) {
            this.f22952b = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f22955e;
                this.f22956f[i10] = -1;
                iArr[i10] = -1;
            }
        }

        public void a(i iVar) {
            i andSet = this.f22957g.getAndSet(iVar);
            if (andSet != null) {
                andSet.l();
            }
            this.f22952b.requestRender();
        }

        public final void b() {
            try {
                GLES20.glGenTextures(3, this.f22953c, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f22959i.j(f22950o[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    GlUtil.a(3553, this.f22953c[i10]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            i andSet = this.f22957g.getAndSet(null);
            if (andSet == null && this.f22961k == null) {
                return;
            }
            if (andSet != null) {
                i iVar = this.f22961k;
                if (iVar != null) {
                    iVar.l();
                }
                this.f22961k = andSet;
            }
            i iVar2 = (i) s7.a.e(this.f22961k);
            float[] fArr = f22948m;
            int i10 = iVar2.f62133i;
            if (i10 == 1) {
                fArr = f22947l;
            } else if (i10 == 3) {
                fArr = f22949n;
            }
            GLES20.glUniformMatrix3fv(this.f22960j, 1, false, fArr, 0);
            int[] iArr = (int[]) s7.a.e(iVar2.f62132h);
            ByteBuffer[] byteBufferArr = (ByteBuffer[]) s7.a.e(iVar2.f62131g);
            int i11 = 0;
            while (i11 < 3) {
                int i12 = i11 == 0 ? iVar2.f62130f : (iVar2.f62130f + 1) / 2;
                GLES20.glActiveTexture(33984 + i11);
                GLES20.glBindTexture(3553, this.f22953c[i11]);
                GLES20.glPixelStorei(3317, 1);
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i12, 0, 6409, 5121, byteBufferArr[i11]);
                i11++;
            }
            int i13 = iVar2.f62129e;
            int i14 = (i13 + 1) / 2;
            int[] iArr2 = {i13, i14, i14};
            for (int i15 = 0; i15 < 3; i15++) {
                if (this.f22955e[i15] != iArr2[i15] || this.f22956f[i15] != iArr[i15]) {
                    s7.a.g(iArr[i15] != 0);
                    float f10 = iArr2[i15] / iArr[i15];
                    this.f22958h[i15] = GlUtil.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                    GLES20.glVertexAttribPointer(this.f22954d[i15], 2, 5126, false, 0, (Buffer) this.f22958h[i15]);
                    this.f22955e[i15] = iArr2[i15];
                    this.f22956f[i15] = iArr[i15];
                }
            }
            GLES20.glClear(16384);
            GLES20.glDrawArrays(5, 0, 4);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                b bVar = new b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f22959i = bVar;
                GLES20.glVertexAttribPointer(bVar.e("in_pos"), 2, 5126, false, 0, (Buffer) f22951p);
                this.f22954d[0] = this.f22959i.e("in_tc_y");
                this.f22954d[1] = this.f22959i.e("in_tc_u");
                this.f22954d[2] = this.f22959i.e("in_tc_v");
                this.f22960j = this.f22959i.j("mColorConversion");
                GlUtil.b();
                b();
                GlUtil.b();
            } catch (GlUtil.GlException e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f22946b = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch("com.google.android.exoplayer", this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Deprecated
    public h getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void setOutputBuffer(i iVar) {
        this.f22946b.a(iVar);
    }
}
