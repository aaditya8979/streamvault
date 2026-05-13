package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.C5297a;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5297a extends Lambda implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5300d f68426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5297a(C5300d c5300d) {
        super(0);
        this.f68426a = c5300d;
    }

    public static final void a(C5300d c5300d) {
        ((C5319x) c5300d.f68432b).a("AndroidApiScreenshotCaptor");
    }

    @Override // sn.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Activity.ScreenCaptureCallback invoke() {
        final C5300d c5300d = this.f68426a;
        return new Activity.ScreenCaptureCallback() { // from class: oh.a
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                C5297a.a(c5300d);
            }
        };
    }
}
