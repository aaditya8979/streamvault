package yads;

import android.net.Uri;
import java.util.Map;
import yads.mq0;
import yads.rq0;

/* JADX INFO: loaded from: classes7.dex */
public interface rq0 {
    static {
        new rq0() { // from class: bt.r9
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return rq0.lambda$static$0();
            }
        };
    }

    static /* synthetic */ mq0[] lambda$static$0() {
        return new mq0[0];
    }

    mq0[] createExtractors();

    default mq0[] createExtractors(Uri uri, Map map) {
        return createExtractors();
    }
}
