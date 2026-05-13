package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.InterfaceC4793fo;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class UserProfile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f68358a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LinkedList f68359a;

        private Builder() {
            this.f68359a = new LinkedList();
        }

        public /* synthetic */ Builder(int i10) {
            this();
        }

        public Builder apply(@NonNull UserProfileUpdate<? extends InterfaceC4793fo> userProfileUpdate) {
            this.f68359a.add(userProfileUpdate);
            return this;
        }

        @NonNull
        public UserProfile build() {
            return new UserProfile(this.f68359a, 0);
        }
    }

    private UserProfile(LinkedList linkedList) {
        this.f68358a = CollectionUtils.unmodifiableListCopy(linkedList);
    }

    public /* synthetic */ UserProfile(LinkedList linkedList, int i10) {
        this(linkedList);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(0);
    }

    @NonNull
    public List<UserProfileUpdate<? extends InterfaceC4793fo>> getUserProfileUpdates() {
        return this.f68358a;
    }
}
