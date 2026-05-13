package g0;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import bo.d0;
import j0.j;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ResourceUriMapper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"Lg0/f;", "Lg0/d;", "Landroid/net/Uri;", "data", "Lj0/j;", "options", "c", "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class f implements d<Uri, Uri> {
    public final boolean b(Uri data) {
        if (p.f(data.getScheme(), "android.resource")) {
            String authority = data.getAuthority();
            if (!(authority == null || d0.u0(authority)) && data.getPathSegments().size() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // g0.d
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Uri a(@NotNull Uri data, @NotNull j options) throws PackageManager.NameNotFoundException {
        if (!b(data)) {
            return null;
        }
        String authority = data.getAuthority();
        if (authority == null) {
            authority = "";
        }
        Resources resourcesForApplication = options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String().getPackageManager().getResourcesForApplication(authority);
        List<String> pathSegments = data.getPathSegments();
        int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        if (!(identifier != 0)) {
            throw new IllegalStateException(("Invalid android.resource URI: " + data).toString());
        }
        Uri uri = Uri.parse("android.resource://" + authority + '/' + identifier);
        p.j(uri, "parse(this)");
        return uri;
    }
}
