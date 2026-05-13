package com.inmobi.media;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3815vk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC3337ci f28383a;

    public C3815vk(GestureDetectorOnGestureListenerC3337ci gestureDetectorOnGestureListenerC3337ci) {
        tn.p.k(gestureDetectorOnGestureListenerC3337ci, "mListener");
        this.f28383a = gestureDetectorOnGestureListenerC3337ci;
    }

    public final void a(MotionEvent motionEvent) {
        tn.p.k(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f28383a.a(motionEvent.getX(), motionEvent.getY());
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f28383a.b(motionEvent.getX(), motionEvent.getY());
        }
    }
}
