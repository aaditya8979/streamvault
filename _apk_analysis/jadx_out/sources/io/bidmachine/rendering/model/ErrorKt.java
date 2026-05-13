package io.bidmachine.rendering.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toError", "Lio/bidmachine/rendering/model/Error;", "", "bidmachine-android-rendering_d_2_5_2"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ErrorKt {
    @NotNull
    public static final Error toError(@NotNull Throwable th2) {
        p.k(th2, "<this>");
        return Error.INSTANCE.create(th2);
    }
}
