package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class Pe implements IPluginReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Se f65748a = new Se();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Te f65749b = new Te();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f65750c = C4696c4.l().g().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f65751d;

    public Pe(@NonNull Provider<Sa> provider) {
        this.f65751d = provider;
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, @Nullable String str) {
        Se se2 = this.f65748a;
        se2.f65877a.a(pluginErrorDetails);
        if (se2.f65879c.a((Collection<Object>) (pluginErrorDetails != null ? pluginErrorDetails.getStacktrace() : null)).f67631a) {
            this.f65749b.getClass();
            this.f65750c.execute(new Ne(this, pluginErrorDetails, str));
        }
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, @Nullable String str2, @Nullable PluginErrorDetails pluginErrorDetails) {
        this.f65748a.f65878b.a(str);
        this.f65749b.getClass();
        this.f65750c.execute(new Oe(this, str, str2, pluginErrorDetails));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
        this.f65748a.f65877a.a(pluginErrorDetails);
        this.f65749b.getClass();
        this.f65750c.execute(new Me(this, pluginErrorDetails));
    }
}
