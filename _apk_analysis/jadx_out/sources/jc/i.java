package jc;

import android.graphics.Bitmap;
import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: TKRenderView.java */
/* JADX INFO: loaded from: classes2.dex */
public class i implements zs.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zs.a f72396b;

    public i(@NonNull zs.a aVar) {
        this.f72396b = aVar;
    }

    @Override // zs.a
    public void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f72396b.a(i10, i11);
        if (i11 > i10) {
            this.f72396b.setScaleType(5);
        } else {
            this.f72396b.setScaleType(0);
        }
    }

    @Override // zs.a
    public Bitmap b() {
        return this.f72396b.b();
    }

    @Override // zs.a
    public void c(@NonNull xyz.doikki.videoplayer.player.a aVar) {
        this.f72396b.c(aVar);
    }

    @Override // zs.a
    public View getView() {
        return this.f72396b.getView();
    }

    @Override // zs.a
    public void release() {
        this.f72396b.release();
    }

    @Override // zs.a
    public void setScaleType(int i10) {
    }

    @Override // zs.a
    public void setVideoRotation(int i10) {
        this.f72396b.setVideoRotation(i10);
    }
}
