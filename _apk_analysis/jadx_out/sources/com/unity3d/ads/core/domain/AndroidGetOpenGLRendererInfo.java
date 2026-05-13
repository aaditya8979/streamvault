package com.unity3d.ads.core.domain;

import android.opengl.GLES20;
import bo.c;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gl.EglCore;
import com.unity3d.ads.gl.OffscreenSurface;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidGetOpenGLRendererInfo.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidGetOpenGLRendererInfo implements GetOpenGLRendererInfo {

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetOpenGLRendererInfo(@NotNull SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetOpenGLRendererInfo
    @NotNull
    public ByteString invoke() {
        if (!this.sessionRepository.getFeatureFlags().getOpenglGpuEnabled()) {
            ByteString byteStringEmpty = ByteString.empty();
            p.j(byteStringEmpty, "{\n            ByteString.empty()\n        }");
            return byteStringEmpty;
        }
        EglCore eglCore = new EglCore(null, 2);
        OffscreenSurface offscreenSurface = new OffscreenSurface(eglCore, 1, 1);
        offscreenSurface.makeCurrent();
        String strGlGetString = GLES20.glGetString(7937);
        p.j(strGlGetString, "renderer");
        byte[] bytes = strGlGetString.getBytes(c.f5639b);
        p.j(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        offscreenSurface.release();
        eglCore.release();
        p.j(byteStringCopyFrom, "{\n            // We need…dererByteString\n        }");
        return byteStringCopyFrom;
    }
}
