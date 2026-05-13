package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.w3c.dom.Node;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Node f83922a;

    public i(@NonNull Node node) {
        this.f83922a = node;
    }

    public final String a() {
        return sg.bigo.ads.core.f.a.e(this.f83922a, "type");
    }

    public final String b() {
        return sg.bigo.ads.core.f.a.b(this.f83922a);
    }

    public final int c() {
        return sg.bigo.ads.core.f.a.d(this.f83922a, "fileSize").intValue();
    }

    public final int d() {
        return sg.bigo.ads.core.f.a.d(this.f83922a, VastAttributes.BITRATE).intValue();
    }

    public final String e() {
        return sg.bigo.ads.core.f.a.e(this.f83922a, "md5");
    }
}
