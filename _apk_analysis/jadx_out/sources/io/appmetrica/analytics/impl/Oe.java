package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* JADX INFO: loaded from: classes.dex */
public final class Oe implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f65709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f65710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PluginErrorDetails f65711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pe f65712d;

    public Oe(Pe pe2, String str, String str2, PluginErrorDetails pluginErrorDetails) {
        this.f65712d = pe2;
        this.f65709a = str;
        this.f65710b = str2;
        this.f65711c = pluginErrorDetails;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Sa) this.f65712d.f65751d.get()).getPluginExtension().reportError(this.f65709a, this.f65710b, this.f65711c);
    }
}
