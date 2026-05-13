package u0;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: ContentDirectoryServiceController.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements u0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f85427c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final String[] f85428d = {"_id", "title", "_data", "mime_type", "_size"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p0.b f85429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f85430b;

    /* JADX INFO: compiled from: ContentDirectoryServiceController.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public b(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f85429a = p0.b.f76945b.a("ContentDirectoryService");
        Context applicationContext = context.getApplicationContext();
        p.j(applicationContext, "getApplicationContext(...)");
        this.f85430b = applicationContext;
    }
}
