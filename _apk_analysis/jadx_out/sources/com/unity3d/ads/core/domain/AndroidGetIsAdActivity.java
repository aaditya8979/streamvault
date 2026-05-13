package com.unity3d.ads.core.domain;

import bn.g;
import cn.x;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidGetIsAdActivity.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidGetIsAdActivity {

    @NotNull
    private final g activities$delegate;

    @NotNull
    private final SessionRepository sessionRepository;

    public AndroidGetIsAdActivity(@NotNull SessionRepository sessionRepository) {
        p.k(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
        this.activities$delegate = b.b(new sn.a<List<? extends ByteString>>() { // from class: com.unity3d.ads.core.domain.AndroidGetIsAdActivity$activities$2
            {
                super(0);
            }

            @Override // sn.a
            @NotNull
            public final List<? extends ByteString> invoke() {
                List<com.google.protobuf.ByteString> observableAndroidActivitiesList = this.this$0.sessionRepository.getNativeConfiguration().getObservableAndroidActivitiesList();
                p.j(observableAndroidActivitiesList, "sessionRepository.native…ableAndroidActivitiesList");
                ArrayList arrayList = new ArrayList(x.x(observableAndroidActivitiesList, 10));
                Iterator<T> it = observableAndroidActivitiesList.iterator();
                while (it.hasNext()) {
                    byte[] byteArray = ((com.google.protobuf.ByteString) it.next()).toByteArray();
                    arrayList.add(ByteString.of(Arrays.copyOf(byteArray, byteArray.length)));
                }
                return arrayList;
            }
        });
    }

    private final List<ByteString> getActivities() {
        return (List) this.activities$delegate.getValue();
    }

    public final boolean invoke(@NotNull String str) {
        p.k(str, "activityName");
        return getActivities().contains(ByteString.decodeHex(StringExtensionsKt.getSHA256Hash(str)));
    }
}
