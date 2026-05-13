package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4823h2 implements InterfaceC4969mk, ApplicationStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f66886a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f66887b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f66888c = ApplicationState.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f66889d = new CopyOnWriteArraySet();

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f66886a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f66887b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f66888c != applicationState) {
            this.f66888c = applicationState;
            Iterator it = this.f66889d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f66888c);
            }
        }
    }

    public final void a(int i10) {
        this.f66886a.remove(Integer.valueOf(i10));
        a();
    }

    public final void b(int i10) {
        this.f66887b.add(Integer.valueOf(i10));
        this.f66886a.remove(Integer.valueOf(i10));
        a();
    }

    public final void c(int i10) {
        this.f66886a.add(Integer.valueOf(i10));
        this.f66887b.remove(Integer.valueOf(i10));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f66888c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final void onCreate() {
        a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4969mk
    public final void onDestroy() {
        if (this.f66888c == ApplicationState.VISIBLE) {
            this.f66888c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f66889d.add(applicationStateObserver);
        }
        return this.f66888c;
    }
}
