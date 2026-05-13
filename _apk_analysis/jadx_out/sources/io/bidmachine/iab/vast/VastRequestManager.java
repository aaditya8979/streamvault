package io.bidmachine.iab.vast;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class VastRequestManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f69516a = new WeakHashMap();

    public static synchronized void a(VastRequest vastRequest) {
        if (vastRequest == null) {
            return;
        }
        f69516a.remove(vastRequest);
    }

    @Nullable
    public static synchronized VastRequest get(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f69516a.entrySet().iterator();
        while (it.hasNext()) {
            VastRequest vastRequest = (VastRequest) ((Map.Entry) it.next()).getKey();
            if (vastRequest.getId().equals(str)) {
                return vastRequest;
            }
        }
        return null;
    }

    public static synchronized void store(@Nullable VastRequest vastRequest) {
        if (vastRequest == null) {
            return;
        }
        f69516a.put(vastRequest, Boolean.TRUE);
    }
}
