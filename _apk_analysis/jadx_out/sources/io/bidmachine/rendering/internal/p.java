package io.bidmachine.rendering.internal;

import io.bidmachine.rendering.model.MethodParams;

/* JADX INFO: loaded from: classes2.dex */
public class p extends y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MethodParams f70514c;

    public p(MethodParams methodParams, io.bidmachine.rendering.internal.event.b bVar) {
        super(bVar);
        this.f70514c = methodParams;
    }

    @Override // io.bidmachine.rendering.internal.y
    public String r() {
        return this.f70514c.getName();
    }

    public MethodParams s() {
        return this.f70514c;
    }
}
