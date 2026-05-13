package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes.dex */
public final class Pi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Revenue f65754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vm f65755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4766en f65756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4766en f65757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PublicLogger f65758e;

    public Pi(Revenue revenue, PublicLogger publicLogger) {
        this.f65758e = publicLogger;
        this.f65754a = revenue;
        this.f65755b = new Vm(30720, "revenue payload", publicLogger);
        this.f65756c = new C4766en(new Vm(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f65757d = new C4766en(new Ym(1000, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
