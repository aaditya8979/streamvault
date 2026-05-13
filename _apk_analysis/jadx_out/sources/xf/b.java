package xf;

import android.content.Context;
import android.net.Uri;
import com.yandex.android.beacon.SendBeaconWorkerImpl;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import tn.i;

/* JADX INFO: compiled from: SendBeaconManager.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f86917b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SendBeaconWorkerImpl f86918a;

    /* JADX INFO: compiled from: SendBeaconManager.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(@NotNull Context context, @NotNull xf.a aVar) {
        this.f86918a = new SendBeaconWorkerImpl(context, aVar);
    }

    public final void a(@NotNull Uri uri, @NotNull Map<String, String> map, @Nullable JSONObject jSONObject) {
        this.f86918a.i(uri, map, jSONObject, true);
    }
}
