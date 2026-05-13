package com.fyber.inneractive.sdk.player.controller;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f17172a;

    public i(q qVar) {
        this.f17172a = qVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f17172a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureAvailable", IAlog.a(qVar));
        q.a(this.f17172a, surfaceTexture);
        x xVar = this.f17172a.f17185d;
        if (xVar != null) {
            z zVar = xVar.f17204a;
            zVar.getClass();
            IAlog.a("%s onTextureViewAvailable", IAlog.a(zVar));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        q qVar = this.f17172a;
        qVar.getClass();
        IAlog.a("%s onSurfaceTextureDestroyed", IAlog.a(qVar));
        this.f17172a.i();
        this.f17172a.a((Surface) null);
        q qVar2 = this.f17172a;
        qVar2.f17196o = true;
        com.fyber.inneractive.sdk.player.enums.b bVar = qVar2.f17186e;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle) {
            IAlog.a("%sReleasing surface texture", IAlog.a(qVar2));
            this.f17172a.f17192k = null;
            return true;
        }
        IAlog.a("%s caching surface texture", IAlog.a(qVar2));
        q qVar3 = this.f17172a;
        qVar3.f17192k = surfaceTexture;
        qVar3.f17190i.post(new h(this));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        q qVar = this.f17172a;
        if (qVar.f17186e == com.fyber.inneractive.sdk.player.enums.b.Paused) {
            int iB = qVar.b();
            int iC = qVar.c();
            if (iB <= 0 || iB > iC) {
                return;
            }
            qVar.a(iB - 1, false);
            qVar.a(iB, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Surface surface;
        com.fyber.inneractive.sdk.player.f fVar;
        q qVar;
        x xVar = this.f17172a.f17185d;
        if (xVar != null && (fVar = xVar.f17204a.f17207a) != null && (qVar = fVar.f18912a) != null) {
            qVar.f17190i.post(new n(qVar));
        }
        q qVar2 = this.f17172a;
        if (!qVar2.f17196o || (surface = qVar2.f17193l) == null) {
            return;
        }
        qVar2.a(surface);
        this.f17172a.f17196o = false;
    }
}
