package g0;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import j0.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ResourceIntMapper.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lg0/e;", "Lg0/d;", "", "Landroid/net/Uri;", "data", "Lj0/j;", "options", "c", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "b", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public final class e implements d<Integer, Uri> {
    @Override // g0.d
    public /* bridge */ /* synthetic */ Uri a(Integer num, j jVar) {
        return c(num.intValue(), jVar);
    }

    public final boolean b(@DrawableRes int data, Context context) {
        try {
            return context.getResources().getResourceEntryName(data) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    @Nullable
    public Uri c(@DrawableRes int data, @NotNull j options) {
        if (!b(data, options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String())) {
            return null;
        }
        Uri uri = Uri.parse("android.resource://" + options.getIo.bidmachine.ads.networks.gam_dynamic.GAMConfig.KEY_CONTEXT java.lang.String().getPackageName() + '/' + data);
        p.j(uri, "parse(this)");
        return uri;
    }
}
