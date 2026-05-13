package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes7.dex */
public final class Me implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f65595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Pe f65596b;

    public Me(Pe pe2, PluginErrorDetails pluginErrorDetails) {
        this.f65596b = pe2;
        this.f65595a = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f65596b.f65751d.get()).getPluginExtension().reportUnhandledException(this.f65595a);
    }
}
