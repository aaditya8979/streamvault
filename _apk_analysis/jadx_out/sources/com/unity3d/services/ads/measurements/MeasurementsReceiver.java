package com.unity3d.services.ads.measurements;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: MeasurementsReceiver.kt */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class MeasurementsReceiver implements OutcomeReceiver {

    @NotNull
    private final MeasurementsEvents errorEvent;

    @NotNull
    private final IEventSender eventSender;

    @NotNull
    private final MeasurementsEvents successEvent;

    public MeasurementsReceiver(@NotNull IEventSender iEventSender, @NotNull MeasurementsEvents measurementsEvents, @NotNull MeasurementsEvents measurementsEvents2) {
        p.k(iEventSender, "eventSender");
        p.k(measurementsEvents, "successEvent");
        p.k(measurementsEvents2, "errorEvent");
        this.eventSender = iEventSender;
        this.successEvent = measurementsEvents;
        this.errorEvent = measurementsEvents2;
    }

    public void onError(@NotNull Exception exc) {
        p.k(exc, "error");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.errorEvent, exc.toString());
    }

    public void onResult(@NotNull Object obj) {
        p.k(obj, "p0");
        this.eventSender.sendEvent(WebViewEventCategory.MEASUREMENTS, this.successEvent, new Object[0]);
    }
}
