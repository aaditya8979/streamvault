package u7;

import android.opengl.GLES20;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import u7.d;

/* JADX INFO: compiled from: ProjectionRenderer.java */
/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f85562j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f85563k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f85564l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f85565m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f85566n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f85567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f85568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public a f85569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.android.exoplayer2.util.b f85570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f85572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f85573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f85574h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f85575i;

    /* JADX INFO: compiled from: ProjectionRenderer.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FloatBuffer f85577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FloatBuffer f85578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f85579d;

        public a(d.b bVar) {
            this.f85576a = bVar.a();
            this.f85577b = GlUtil.e(bVar.f85560c);
            this.f85578c = GlUtil.e(bVar.f85561d);
            int i10 = bVar.f85559b;
            if (i10 == 1) {
                this.f85579d = 5;
            } else if (i10 != 2) {
                this.f85579d = 4;
            } else {
                this.f85579d = 6;
            }
        }
    }

    public static boolean c(d dVar) {
        d.a aVar = dVar.f85553a;
        d.a aVar2 = dVar.f85554b;
        return aVar.b() == 1 && aVar.a(0).f85558a == 0 && aVar2.b() == 1 && aVar2.a(0).f85558a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f85569c : this.f85568b;
        if (aVar == null) {
            return;
        }
        int i11 = this.f85567a;
        GLES20.glUniformMatrix3fv(this.f85572f, 1, false, i11 == 1 ? z10 ? f85564l : f85563k : i11 == 2 ? z10 ? f85566n : f85565m : f85562j, 0);
        GLES20.glUniformMatrix4fv(this.f85571e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f85575i, 0);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
        }
        GLES20.glVertexAttribPointer(this.f85573g, 3, 5126, false, 12, (Buffer) aVar.f85577b);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e11) {
            Log.e("ProjectionRenderer", "Failed to load position data", e11);
        }
        GLES20.glVertexAttribPointer(this.f85574h, 2, 5126, false, 8, (Buffer) aVar.f85578c);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e12) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e12);
        }
        GLES20.glDrawArrays(aVar.f85579d, 0, aVar.f85576a);
        try {
            GlUtil.b();
        } catch (GlUtil.GlException e13) {
            Log.e("ProjectionRenderer", "Failed to render", e13);
        }
    }

    public void b() {
        try {
            com.google.android.exoplayer2.util.b bVar = new com.google.android.exoplayer2.util.b("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f85570d = bVar;
            this.f85571e = bVar.j("uMvpMatrix");
            this.f85572f = this.f85570d.j("uTexMatrix");
            this.f85573g = this.f85570d.e("aPosition");
            this.f85574h = this.f85570d.e("aTexCoords");
            this.f85575i = this.f85570d.j("uTexture");
        } catch (GlUtil.GlException e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(d dVar) {
        if (c(dVar)) {
            this.f85567a = dVar.f85555c;
            a aVar = new a(dVar.f85553a.a(0));
            this.f85568b = aVar;
            if (!dVar.f85556d) {
                aVar = new a(dVar.f85554b.a(0));
            }
            this.f85569c = aVar;
        }
    }
}
