package xyz.doikki.videoplayer.controller;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: compiled from: OrientationHelper.java */
/* JADX INFO: loaded from: classes12.dex */
public class a extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f87184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1103a f87185b;

    /* JADX INFO: renamed from: xyz.doikki.videoplayer.controller.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OrientationHelper.java */
    public interface InterfaceC1103a {
        void onOrientationChanged(int i10);
    }

    public a(Context context) {
        super(context);
    }

    public void a(InterfaceC1103a interfaceC1103a) {
        this.f87185b = interfaceC1103a;
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f87184a < 300) {
            return;
        }
        InterfaceC1103a interfaceC1103a = this.f87185b;
        if (interfaceC1103a != null) {
            interfaceC1103a.onOrientationChanged(i10);
        }
        this.f87184a = jCurrentTimeMillis;
    }
}
