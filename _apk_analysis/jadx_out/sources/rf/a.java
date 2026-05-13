package rf;

import androidx.annotation.NonNull;
import okhttp3.OkHttpClient;

/* JADX INFO: compiled from: OkHttpClientStore.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f78901b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f78902a;

    @NonNull
    public OkHttpClient a() {
        if (this.f78902a == null) {
            this.f78902a = new OkHttpClient();
        }
        return this.f78902a;
    }
}
