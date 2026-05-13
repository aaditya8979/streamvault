package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes5.dex */
public final class Ne implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f65646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pe f65648c;

    public Ne(Pe pe2, PluginErrorDetails pluginErrorDetails, String str) {
        this.f65648c = pe2;
        this.f65646a = pluginErrorDetails;
        this.f65647b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f65648c.f65751d.get()).getPluginExtension().reportError(this.f65646a, this.f65647b);
    }
}
