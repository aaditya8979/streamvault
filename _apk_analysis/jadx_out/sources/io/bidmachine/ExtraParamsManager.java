package io.bidmachine;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import io.bidmachine.protobuf.Extras;
import io.bidmachine.utils.data.StructDataRetriever;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class ExtraParamsManager {

    @Nullable
    private static volatile ExtraParamsManager instance;

    @Nullable
    private Struct privateExtras;

    @NonNull
    private final AtomicBoolean isExtrasPrepared = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean needLoadFromStore = new AtomicBoolean(true);

    @NonNull
    private final Object loadFromStoreLock = new Object();

    @NonNull
    private final Object updateExtrasLock = new Object();

    @NonNull
    private final StructDataRetriever publicDataRetriever = new StructDataRetriever();

    @NonNull
    private final StructDataRetriever internalDataRetriever = new StructDataRetriever();

    private ExtraParamsManager() {
    }

    private void checkAndPrepareExtras(@NonNull Context context, @Nullable Extras extras) {
        synchronized (this.updateExtrasLock) {
            if (isExtrasPrepared()) {
                return;
            }
            setExtras(context, extras);
        }
    }

    @NonNull
    public static ExtraParamsManager get() {
        ExtraParamsManager extraParamsManager = instance;
        if (extraParamsManager == null) {
            synchronized (ExtraParamsManager.class) {
                extraParamsManager = instance;
                if (extraParamsManager == null) {
                    extraParamsManager = new ExtraParamsManager();
                    instance = extraParamsManager;
                }
            }
        }
        return extraParamsManager;
    }

    @NonNull
    public StructDataRetriever getInternalDataRetriever(@NonNull Context context) {
        loadFromStore(context);
        return this.internalDataRetriever;
    }

    @Nullable
    public Struct getPrivateStruct(@NonNull Context context) {
        loadFromStore(context);
        return this.privateExtras;
    }

    @Nullable
    public Object getPublic(@NonNull Context context, @NonNull String str) {
        loadFromStore(context);
        return this.publicDataRetriever.getObjectOrNull(str);
    }

    public boolean isExtrasPrepared() {
        return this.isExtrasPrepared.get();
    }

    @VisibleForTesting
    public void loadFromStore(@NonNull Context context) {
        if (isExtrasPrepared()) {
            return;
        }
        synchronized (this.loadFromStoreLock) {
            if (this.needLoadFromStore.compareAndSet(true, false)) {
                checkAndPrepareExtras(context, o2.getInitExtras(context));
            }
        }
    }

    public void setExtras(@NonNull Context context, @Nullable Extras extras) {
        this.isExtrasPrepared.set(true);
        this.needLoadFromStore.set(false);
        synchronized (this.updateExtrasLock) {
            if (extras == null) {
                this.publicDataRetriever.clear();
                this.internalDataRetriever.clear();
                this.privateExtras = null;
                o2.clearInitExtras(context);
                return;
            }
            this.publicDataRetriever.setStruct(extras.getPublic());
            this.internalDataRetriever.setStruct(extras.getInternal());
            this.privateExtras = extras.getPrivate();
            o2.storeInitExtras(context, extras);
        }
    }
}
