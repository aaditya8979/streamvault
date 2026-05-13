package io.bidmachine.rendering.internal.repository;

import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;

/* JADX INFO: loaded from: classes10.dex */
public interface a {

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.repository.a$a, reason: collision with other inner class name */
    public interface InterfaceC0835a {
        void onError(Error error);

        void onSuccess(Object obj);
    }

    void a(MediaSource mediaSource, InterfaceC0835a interfaceC0835a);

    void b(MediaSource mediaSource, InterfaceC0835a interfaceC0835a);

    void c(MediaSource mediaSource, InterfaceC0835a interfaceC0835a);
}
