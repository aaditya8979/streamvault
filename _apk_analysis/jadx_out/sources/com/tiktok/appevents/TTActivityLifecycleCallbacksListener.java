package com.tiktok.appevents;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import ve.b;

/* JADX INFO: loaded from: classes8.dex */
class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f53387d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f53388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53389c;

    public final void a(@NonNull long j10) {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }

    public final void b(@NonNull long j10) {
        try {
            b.a(Long.valueOf(j10)).put("latency", System.currentTimeMillis() - j10);
            throw null;
        } catch (Exception unused) {
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        b(this.f53388b);
        this.f53389c = System.currentTimeMillis();
        throw null;
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        if (!f53387d) {
            f53387d = false;
        } else {
            a(this.f53389c);
            this.f53388b = System.currentTimeMillis();
            throw null;
        }
    }

    @Override // com.tiktok.appevents.TTLifeCycleCallbacksAdapter, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        throw null;
    }
}
