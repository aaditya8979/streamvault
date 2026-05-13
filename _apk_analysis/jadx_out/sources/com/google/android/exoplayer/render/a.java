package com.google.android.exoplayer.render;

import android.view.View;
import e4.u0;

/* JADX INFO: compiled from: IRender.java */
/* JADX INFO: loaded from: classes5.dex */
public interface a {

    /* JADX INFO: renamed from: com.google.android.exoplayer.render.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: IRender.java */
    public interface InterfaceC0287a {
        void a(b bVar);

        void b(b bVar, int i10, int i11, int i12);

        void c(b bVar, int i10, int i11);
    }

    /* JADX INFO: compiled from: IRender.java */
    public interface b {
        void a(u0 u0Var);
    }

    void a(int i10, int i11);

    void b(int i10, int i11);

    void c(int i10);

    void d(int i10);

    View getRenderView();

    int getResizeMode();

    void setPixelWidthHeightRatio(float f10);

    void setRenderCallback(InterfaceC0287a interfaceC0287a);
}
