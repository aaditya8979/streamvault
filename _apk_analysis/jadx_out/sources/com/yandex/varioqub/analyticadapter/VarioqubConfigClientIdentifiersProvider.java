package com.yandex.varioqub.analyticadapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/yandex/varioqub/analyticadapter/VarioqubConfigClientIdentifiersProvider;", "", "Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;", "callback", "Lbn/r;", "requestDeviceId", "requestUserId", "analytic-adapter_release"}, k = 1, mv = {1, 6, 0})
public interface VarioqubConfigClientIdentifiersProvider {
    void requestDeviceId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback);

    void requestUserId(@NotNull AdapterIdentifiersCallback adapterIdentifiersCallback);
}
