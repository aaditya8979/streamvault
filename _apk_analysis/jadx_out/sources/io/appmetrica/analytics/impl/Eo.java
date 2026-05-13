package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f65225a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f65225a = new WeakHashMap();
    }

    public final synchronized void a(@NotNull Object obj) {
        this.f65225a.put(obj, null);
        if (this.f65225a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(@NotNull Object obj) {
        this.f65225a.remove(obj);
        if (this.f65225a.isEmpty()) {
            updateState(false);
        }
    }
}
