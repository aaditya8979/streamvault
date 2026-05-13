package f0;

import android.net.Uri;
import j0.j;
import kotlin.Metadata;
import o0.i;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: UriKeyer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lf0/c;", "Lf0/b;", "Landroid/net/Uri;", "data", "Lj0/j;", "options", "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class c implements b<Uri> {
    @Override // f0.b
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String a(@NotNull Uri data, @NotNull j options) {
        if (!p.f(data.getScheme(), "android.resource")) {
            return data.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(data);
        sb2.append('-');
        sb2.append(i.l(options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String().getResources().getConfiguration()));
        return sb2.toString();
    }
}
