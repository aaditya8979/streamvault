package io.bidmachine.rendering.internal.controller;

import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.utils.taskmanager.CancelableTask;
import tn.p;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends CancelableTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.rendering.internal.c f70223b;

    public d(io.bidmachine.rendering.internal.c cVar) {
        p.k(cVar, "adElement");
        this.f70223b = cVar;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.CancelableTask
    public void runTask() {
        try {
            this.f70223b.c();
        } catch (Throwable th2) {
            o.b(th2);
        }
    }
}
