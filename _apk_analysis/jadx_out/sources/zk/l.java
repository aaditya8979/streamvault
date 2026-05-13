package zk;

import io.ktor.client.HttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HttpClientPlugin.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface l<TConfig, TPlugin> {
    void a(@NotNull TPlugin tplugin, @NotNull HttpClient httpClient);

    @NotNull
    TPlugin b(@NotNull sn.l<? super TConfig, bn.r> lVar);

    @NotNull
    kl.a<TPlugin> getKey();
}
