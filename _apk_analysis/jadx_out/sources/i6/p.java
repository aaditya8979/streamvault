package i6;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ExtractorsFactory.java */
/* JADX INFO: loaded from: classes4.dex */
public interface p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f63916a = new p() { // from class: i6.o
        @Override // i6.p
        public final k[] createExtractors() {
            return p.lambda$static$0();
        }
    };

    static /* synthetic */ k[] lambda$static$0() {
        return new k[0];
    }

    k[] createExtractors();

    default k[] createExtractors(Uri uri, Map<String, List<String>> map) {
        return createExtractors();
    }
}
