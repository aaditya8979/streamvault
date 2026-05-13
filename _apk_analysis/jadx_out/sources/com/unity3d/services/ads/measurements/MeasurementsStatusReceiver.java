package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MeasurementsStatusReceiver.kt */
/* JADX INFO: loaded from: classes12.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsStatusReceiver implements OutcomeReceiver {

    @NotNull
    private final IEventSender eventSender;

    public MeasurementsStatusReceiver(@NotNull IEventSender iEventSender) {
        p.k(iEventSender, "eventSender");
        this.eventSender = iEventSender;
    }

    public void onError(@NotNull Exception exc) {
        p.k(exc, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.NOT_AVAILABLE, MeasurementsErrors.ERROR_EXCEPTION, exc.toString());
    }

    public void onResult(int i10) {
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, MeasurementsEvents.AVAILABLE, Integer.valueOf(i10));
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(((Number) obj).intValue());
    }
}
